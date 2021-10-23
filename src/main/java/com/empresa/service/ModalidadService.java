package com.empresa.service;

import java.util.List;

import org.springframework.data.repository.query.Param;

import com.empresa.entity.FiltroModalidad;
import com.empresa.entity.Modalidad;

public interface ModalidadService {

	public Modalidad insertaActualizaModalidad(Modalidad obj);
	public List<Modalidad> listaModalidad();
	
	
	public List<Modalidad> listaModalidadPoridModalidad(int idModalidad);
	
	public abstract List<Modalidad>listaModalidadPorFiltro(FiltroModalidad filtro);
 
}
