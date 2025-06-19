package com.bussiness.go.project.services.implementation;

import java.util.List;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import com.bussiness.go.project.entities.commons.BandejaFormatoModel;
import com.bussiness.go.project.repositories.IBandejaFormatoRepository;
import com.bussiness.go.project.services.IBandejaFormatoService;

@Repository
public class BandejaFormatoServiceImpl extends CommonServiceImpl<BandejaFormatoModel, IBandejaFormatoRepository, UUID> implements IBandejaFormatoService{

	@Autowired
	private IBandejaFormatoRepository iBandejaFormatoRepository;
	
	@Override
	public List<BandejaFormatoModel> listaFormatosPorEstadoConFiltro(String filtro, String estado, Integer limitQuery,
			Integer offsetQuery) {
		return iBandejaFormatoRepository.listaFormatosPorEstadoConFiltro(filtro, estado, limitQuery, offsetQuery);
	}

	@Override
	public List<BandejaFormatoModel> listaFormatosPorEstadoSinFiltro(String estado, Integer limitQuery,
			Integer offsetQuery) {
		return iBandejaFormatoRepository.listaFormatosPorEstadoSinFiltro(estado, limitQuery, offsetQuery);
	}

	@Override
	public List<BandejaFormatoModel> totalListaFormatosPorEstado(String estado) {
		return iBandejaFormatoRepository.totalListaFormatosPorEstado(estado);

	}
	
}
