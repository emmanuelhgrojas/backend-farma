package com.bussiness.go.project.services;

import java.util.List;
import java.util.UUID;

import com.bussiness.go.project.entities.commons.BandejaUsuarioModel;

public interface IBandejaUsuarioService extends CommonService<BandejaUsuarioModel, UUID> {

	public List<BandejaUsuarioModel> listaUsuariosPorEstadoConFiltro(String filtro, String estado, Integer limitQuery, Integer offsetQuery);
	
	public List<BandejaUsuarioModel> listaUsuariosPorEstadoSinFiltro(String estado, Integer limitQuery, Integer offsetQuery);
	
	public List<BandejaUsuarioModel> totalListaUsuariosPorEstado(String estado);
}
