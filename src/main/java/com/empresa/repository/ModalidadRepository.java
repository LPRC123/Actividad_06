package com.empresa.repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadRepository extends JpaRepository<Modalidad, Integer>  {

	public List<Modalidad> findByidModalidad(int idModalidad);
	
	@Query("Select d from Modalidad d where"
				
	+ "( :#{#fil.idModalidad} is 0 or d.idModalidad = :#{#fil.idModalidad} ) and "
	+ "( :#{#fil.nombre} is '' or d.nombre like :#{#fil.nombre} ) and "
	+ "( :#{#fil.numHombres} is 0  or d.numHombres.numHombres = :#{#fil.numHombres} )and "
	+ "( :#{#fil.numMujeres} is 0 or d.numMujeres.numMujeres = :#{#fil.numMujeres} ) and "
	+ "( :#{#fil.edadMaxima} is 0  or d.edadMaxima.edadMaxima = :#{#fil.edadMaxima} )and "
	+ "( :#{#fil.edadMinima} is 0  or d.edadMinima.edadMinima = :#{#fil.edadMinima} )and "
	+ "( :#{#fil.sede} is '' or d.sede like :#{#fil.sede} )")
	
			
	public List<Modalidad>listaPorFiltro(@Param("fil")FiltroModalidad filtro);
}
