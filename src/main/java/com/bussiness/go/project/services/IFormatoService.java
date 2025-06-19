package com.bussiness.go.project.services;

import java.sql.SQLException;
import java.util.UUID;

import com.bussiness.go.project.dto.DataTablesRequest;
import com.bussiness.go.project.dto.DataTablesResponse;
import com.bussiness.go.project.dto.FormatoDTO;
import com.bussiness.go.project.entities.commons.Formato;
import com.bussiness.go.project.utilities.FunctionResponse;

public interface IFormatoService extends CommonService<Formato, UUID>{

	FunctionResponse<FormatoDTO> guardarFormato(FormatoDTO formatoDTO) throws RuntimeException, SQLException;
	
	public FunctionResponse<FormatoDTO> consultarFormatoPorId(UUID viajId);
	
	public FunctionResponse<FormatoDTO> eliminarFormatoPorId(UUID viajId);
	
	DataTablesResponse listarTodosLosFormatos(DataTablesRequest dataTablesRequest);
}
