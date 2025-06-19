package com.bussiness.go.project.controllers;

import java.util.UUID;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import com.bussiness.go.project.dto.DataTablesRequest;
import com.bussiness.go.project.dto.DataTablesResponse;
import com.bussiness.go.project.dto.FormatoDTO;
import com.bussiness.go.project.services.IFormatoService;
import com.bussiness.go.project.utilities.ApiResponse;
import com.bussiness.go.project.utilities.FunctionResponse;
import com.bussiness.go.project.utilities.MensajesApp;

import io.swagger.v3.oas.annotations.Operation;

@RestController
@CrossOrigin(origins = "*", methods = { RequestMethod.GET, RequestMethod.POST, RequestMethod.PUT, RequestMethod.DELETE }, maxAge = 3600)
@RequestMapping("/formato")
public class FormatoController {

	public static final Logger LOGGER = LoggerFactory.getLogger(FormatoController.class);
	
	@Autowired
	private IFormatoService iFormatoService;
	
	
	/**
	 * Devuelve el UsuarioDTO consultado por el ID recibido como parametro
	 * 
	 * @param viajId
	 * @author Ingeniero Emmanuel Gamboa R.
	 * @return
	 */
	@Operation(summary = "Consultar el FormatoDTO", description = "Devuelve el FormatoDTO consultado por el ID recibido como parametro")
	@GetMapping("/{viajId}")
	public ApiResponse<FormatoDTO> consultarUsuarioPorId(@PathVariable UUID viajId) {
		try {
			FunctionResponse<FormatoDTO> functionResponse = iFormatoService.consultarFormatoPorId(viajId);
			return new ApiResponse<>(functionResponse.getStatus(), functionResponse.getMessage(), functionResponse.getResult());	
		} catch (Exception e) {
			return new ApiResponse<>(HttpStatus.CONFLICT.value(), e.getMessage(), MensajesApp.ERROR_PETICION);
		}
	}
	
	/**
	 * Guarda el formato
	 * @return
	 */
	@Operation(summary = "Guarda el formato", description = "Guarda el formato")
	@PostMapping("/guardar")
	@ResponseBody
	public ApiResponse<FormatoDTO> guardarFormato(@RequestBody FormatoDTO formatoDTO){
		try {
			if(formatoDTO != null) {
				FunctionResponse<FormatoDTO> functionResponse = iFormatoService.guardarFormato(formatoDTO);
				if(functionResponse != null) {
					return new ApiResponse<>(functionResponse.getStatus(), functionResponse.getMessage(), functionResponse.getResult());
				}				
				return new ApiResponse<>(HttpStatus.OK.value(), MensajesApp.USUARIO_SAVE_SUCCESS, null);
			}
			return new ApiResponse<>(HttpStatus.CONFLICT.value(), MensajesApp.HTTP_400, null);	
		} catch (Exception e) {
			return new ApiResponse<>(HttpStatus.CONFLICT.value(), e.getMessage(), null);
		}
	}
	
	
	/**
	 * Elimina el FormatoDTO consultado por el ID recibido como parametro
	 * 
	 * @param usuaId
	 * @author Ingeniero Emmanuel Gamboa R.
	 * @return
	 */
	@Operation(summary = "Eliminar el FormatoDTO", description = "Elimina el FormatoDTO consultado por el ID recibido como parametro")
	@DeleteMapping("/{viajId}")
	public ApiResponse<FormatoDTO> eliminarFormatoId(@PathVariable UUID viajId) {
		try {
			FunctionResponse<FormatoDTO> functionResponse = iFormatoService.eliminarFormatoPorId(viajId);
			if(functionResponse != null) {
				return new ApiResponse<>(functionResponse.getStatus(), functionResponse.getMessage(), functionResponse.getResult());
			}	
			return new ApiResponse<>(HttpStatus.OK.value(), MensajesApp.FORMATO_DELETE_SUCCESS, null);
		} catch (Exception e) {
			return new ApiResponse<>(HttpStatus.CONFLICT.value(), e.getMessage(), MensajesApp.ERROR_PETICION);
		}
	}
	
	/**
	 * Devuelve la lista de todos los formatos activos
	 * @author Ingeniero Emmanuel Gamboa R.
	 * @return
	 */
	@Operation(summary = "Listar todos los formatos", description = "Consultar todos los formatos registrados en el sistema")
	@PostMapping("/")
	@ResponseBody
	public DataTablesResponse listarTodosLosFormatos(@RequestBody DataTablesRequest dataTablesRequest){
		return iFormatoService.listarTodosLosFormatos(dataTablesRequest);
	}
	
	
	
	
	
	
	
}
