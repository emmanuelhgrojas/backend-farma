package com.bussiness.go.project.services;

import java.io.IOException;

public interface IFuncionesGeneralesService {

	public Boolean eliminarArchivo(String pathArchivo) throws IOException;
	
	public String encodeFileToBase64Binary(String nombreArchivo);
}
