package com.bussiness.go.project.services;

import java.util.UUID;

import com.bussiness.go.project.dto.CiudadDTO;
import com.bussiness.go.project.entities.commons.Ciudad;

public interface ICiudadService extends CommonService<Ciudad, UUID>{

	public CiudadDTO buscarInformacionCiudad(UUID ciudadId) throws RuntimeException;
}
