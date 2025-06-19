package com.bussiness.go.project.services.implementation;

import java.sql.SQLException;
import java.sql.Timestamp;
import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.UUID;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.stereotype.Service;

import com.bussiness.go.project.dto.BandejaFormatoDTO;
import com.bussiness.go.project.dto.DataTablesRequest;
import com.bussiness.go.project.dto.DataTablesResponse;
import com.bussiness.go.project.dto.FormatoDTO;
import com.bussiness.go.project.entities.commons.BandejaFormatoModel;
import com.bussiness.go.project.entities.commons.Formato;
import com.bussiness.go.project.repositories.IBandejaFormatoRepository;
import com.bussiness.go.project.repositories.IFormatoRepository;
import com.bussiness.go.project.services.IFormatoService;
import com.bussiness.go.project.utilities.ConstantesApp;
import com.bussiness.go.project.utilities.FunctionResponse;
import com.bussiness.go.project.utilities.MensajesApp;

@Service
public class FormatoServiceImpl extends CommonServiceImpl<Formato, IFormatoRepository, UUID> implements IFormatoService{

	@Autowired
	private IFormatoRepository iFormatoRepository;
	
	@Autowired
	private IBandejaFormatoRepository iBandejaFormatoRepository;
	
	@Override
	public FunctionResponse<FormatoDTO> guardarFormato(FormatoDTO formatoDTO) throws RuntimeException, SQLException {
		Formato formatoModel = new Formato();	
		Long datetime = System.currentTimeMillis();
		Timestamp timestamp = new Timestamp(datetime);
		Optional<Formato> formatoOptional = Optional.empty();
		if(formatoDTO.getViajeId() != null) {
			formatoOptional = iFormatoRepository.findById(formatoDTO.getViajeId());
			if (!formatoOptional.isPresent()) {
				throw new RuntimeException(MensajesApp.FORMATO_404);
			}
			formatoModel = formatoOptional.get();
		}else {			
			formatoModel.setFormatoEstado(ConstantesApp.ESTADO_REGISTRO_ACTIVO);
		}	
		formatoModel.setFormatoCantidadPersonasViaje(formatoDTO.getFormatoCantidadPersonasViaje());
		formatoModel.setFormatoComoOrganizoViajeCinco(formatoDTO.getFormatoComoOrganizoViajeCinco());
		formatoModel.setFormatoComoOrganizoViajeCuatro(formatoDTO.getFormatoComoOrganizoViajeCuatro());
		formatoModel.setFormatoComoOrganizoViajeDos(formatoDTO.getFormatoComoOrganizoViajeDos());
		formatoModel.setFormatoComoOrganizoViajeTres(formatoDTO.getFormatoComoOrganizoViajeTres());
		formatoModel.setFormatoComoOrganizoViajeUno(formatoDTO.getFormatoComoOrganizoViajeUno());
		formatoModel.setFormatoConQuienViaja(formatoDTO.getFormatoConQuienViaja());
		formatoModel.setFormatoConQuienViajaCual(formatoDTO.getFormatoConQuienViajaCual());
		formatoModel.setFormatoEdad(formatoDTO.getFormatoEdad());
		formatoModel.setFormatoHuboGastosDos(formatoDTO.getFormatoHuboGastosDos());
		formatoModel.setFormatoHuboGastosUno(formatoDTO.getFormatoHuboGastosUno());
		formatoModel.setFormatoMotivoViaje(formatoDTO.getFormatoMotivoViaje());
		formatoModel.setFormatoMotivoViajeCual(formatoDTO.getFormatoMotivoViajeCual());
		formatoModel.setFormatoNacionalidad(formatoDTO.getFormatoNacionalidad());
		formatoModel.setFormatoPagadoPorUstedEdadDos(formatoDTO.getFormatoPagadoPorUstedEdadDos());
		formatoModel.setFormatoPagadoPorUstedTipoMonedaUno(formatoDTO.getFormatoPagadoPorUstedTipoMonedaUno());
		formatoModel.setFormatoPagadoPorUstedValorDos(formatoDTO.getFormatoPagadoPorUstedValorDos());
		formatoModel.setFormatoPagadoPorUstedValorUno(formatoDTO.getFormatoPagadoPorUstedValorUno());
		formatoModel.setFormatoPaisNumNocheHotelUno(formatoDTO.getFormatoPaisNumNocheHotelUno());
		formatoModel.setFormatoPaisNumNocheOtraViviendaUno(formatoDTO.getFormatoPaisNumNocheOtraViviendaUno());
		formatoModel.setFormatoPaisNumNocheViviendaAlquilerUno(formatoDTO.getFormatoPaisNumNocheViviendaAlquilerUno());
		formatoModel.setFormatoPaisNumNocheViviendaFamiliarUno(formatoDTO.getFormatoPaisNumNocheViviendaFamiliarUno());
		formatoModel.setFormatoPaisNumNocheViviendaPropiaUno(formatoDTO.getFormatoPaisNumNocheViviendaPropiaUno());
		formatoModel.setFormatoPaisResidencia(formatoDTO.getFormatoPaisResidencia());
		formatoModel.setFormatoPaqueteTuristicoCinco(formatoDTO.getFormatoPaqueteTuristicoCinco());
		formatoModel.setFormatoPaqueteTuristicoCuatro(formatoDTO.getFormatoPaqueteTuristicoCuatro());
		formatoModel.setFormatoPaqueteTuristicoDos(formatoDTO.getFormatoPaqueteTuristicoDos());
		formatoModel.setFormatoPaqueteTuristicoNueve(formatoDTO.getFormatoPaqueteTuristicoNueve());
		formatoModel.setFormatoPaqueteTuristicoNueveCual(formatoDTO.getFormatoPaqueteTuristicoNueveCual());
		formatoModel.setFormatoPaqueteTuristicoOcho(formatoDTO.getFormatoPaqueteTuristicoOcho());
		formatoModel.setFormatoPaqueteTuristicoOchoCual(formatoDTO.getFormatoPaqueteTuristicoOchoCual());
		formatoModel.setFormatoPaqueteTuristicoSeis(formatoDTO.getFormatoPaqueteTuristicoSeis());
		formatoModel.setFormatoPaqueteTuristicoSiete(formatoDTO.getFormatoPaqueteTuristicoSiete());
		formatoModel.setFormatoPaqueteTuristicoTres(formatoDTO.getFormatoPaqueteTuristicoTres());
		formatoModel.setFormatoPaqueteTuristicoUno(formatoDTO.getFormatoPaqueteTuristicoUno());
		formatoModel.setFormatoparaCuantasPersonasDos(formatoDTO.getFormatoparaCuantasPersonasDos());
		formatoModel.setFormatoparaCuantasPersonasUno(formatoDTO.getFormatoparaCuantasPersonasUno());
		formatoModel.setFormatoSexo(formatoDTO.getFormatoSexo());
		formatoModel.setFormatoTercerosNoTipoMonedaDos(formatoDTO.getFormatoTercerosNoTipoMonedaDos());
		formatoModel.setFormatoTercerosNoTipoMonedaUno(formatoDTO.getFormatoTercerosNoTipoMonedaUno());
		formatoModel.setFormatoTercerosNoValorDos(formatoDTO.getFormatoTercerosNoValorDos());
		formatoModel.setFormatoTercerosNoValorUno(formatoDTO.getFormatoTercerosNoValorUno());
		formatoModel.setFormatoTercerosSiTipoMonedaDos(formatoDTO.getFormatoTercerosSiTipoMonedaDos());
		formatoModel.setFormatoTercerosSiTipoMonedaUno(formatoDTO.getFormatoTercerosSiTipoMonedaUno());
		formatoModel.setFormatoTercerosSiValorDos(formatoDTO.getFormatoTercerosSiValorDos());
		formatoModel.setFormatoTercerosSiValorUno(formatoDTO.getFormatoTercerosSiValorUno());			
		iFormatoRepository.save(formatoModel);
		return new FunctionResponse<>(HttpStatus.OK.value(), MensajesApp.USUARIO_SAVE_SUCCESS, null);	
	}

	@Override
	public FunctionResponse<FormatoDTO> consultarFormatoPorId(UUID viajId) {
		try {
			Optional<Formato> formatoOptional = iFormatoRepository.findById(viajId);
			if (!formatoOptional.isPresent()) {
				throw new Exception(MensajesApp.FORMATO_404);		
			}
			FormatoDTO formatoDTO = formatoOptional.get().toBO();				
			return new FunctionResponse<>(HttpStatus.OK.value(), MensajesApp.FORMATO_SUCCESS, formatoDTO);	
		} catch (Exception e) {
			return new FunctionResponse<>(HttpStatus.CONFLICT.value(), e.getMessage(), MensajesApp.ERROR_PETICION);
		}
	}

	@Override
	public FunctionResponse<FormatoDTO> eliminarFormatoPorId(UUID viajId) {
		try {
			Optional<Formato> formatoOptional = iFormatoRepository.findById(viajId);
			if (!formatoOptional.isPresent()) {
				throw new Exception(MensajesApp.FORMATO_404);
			}
			Formato formato = formatoOptional.get();
			formato.setFormatoEstado(ConstantesApp.ESTADO_REGISTRO_INACTIVO);
			iFormatoRepository.save(formato);
			FormatoDTO formatoDTO = formatoOptional.get().toBO();				
			return new FunctionResponse<>(HttpStatus.OK.value(), MensajesApp.FORMATO_DELETE_SUCCESS, formatoDTO);	
		} catch (Exception e) {
			return new FunctionResponse<>(HttpStatus.CONFLICT.value(), e.getMessage(), MensajesApp.ERROR_PETICION);
		}
	}

	@Override
	public DataTablesResponse listarTodosLosFormatos(DataTablesRequest dataTablesRequest) {
		try { 	
			DataTablesResponse dataTablesResponse = new DataTablesResponse();
			List<BandejaFormatoDTO> listaBandejaFormatoDTO = new ArrayList<>();
			List<String> listaStringBandejaFormatoDTO = new ArrayList<>();
			List<BandejaFormatoModel> listaFormatosBandejaSinFiltro = iBandejaFormatoRepository.totalListaFormatosPorEstado(ConstantesApp.ESTADO_REGISTRO_ACTIVO);
			List<BandejaFormatoModel> listaFormatosBandeja = new ArrayList<>();
			
			if(!dataTablesRequest.getSearch().getValue().isEmpty()) {
				listaFormatosBandeja = iBandejaFormatoRepository.listaFormatosPorEstadoConFiltro(dataTablesRequest.getSearch().getValue(), ConstantesApp.ESTADO_REGISTRO_ACTIVO, dataTablesRequest.getLength(), dataTablesRequest.getStart());
			}else {
				listaFormatosBandeja = iBandejaFormatoRepository.listaFormatosPorEstadoSinFiltro(ConstantesApp.ESTADO_REGISTRO_ACTIVO, dataTablesRequest.getLength(), dataTablesRequest.getStart());
			}		
			if(!listaFormatosBandeja.isEmpty()) {
				listaFormatosBandeja.forEach(bandejaFormato -> {
					BandejaFormatoDTO bandejaFormatoDTO = new BandejaFormatoDTO();
					bandejaFormatoDTO.setFormatoEdad(bandejaFormato.getFormatoEdad());
					bandejaFormatoDTO.setFormatoNacionalidad(bandejaFormato.getFormatoNacionalidad());
					bandejaFormatoDTO.setFormatoPaisResidencia(bandejaFormato.getFormatoPaisResidencia());
					bandejaFormatoDTO.setFormatoSexo(bandejaFormato.getFormatoSexo());
					bandejaFormatoDTO.setViajeId(bandejaFormato.getViajeId());
					listaBandejaFormatoDTO.add(bandejaFormatoDTO);
				});
			}	
			dataTablesResponse.setData(listaBandejaFormatoDTO);
			dataTablesResponse.setDraw(dataTablesRequest.getLength());
			if(!dataTablesRequest.getSearch().getValue().isEmpty()) {
				dataTablesResponse.setRecordsFiltered(listaFormatosBandeja.size());
			}else {
				dataTablesResponse.setRecordsFiltered(listaFormatosBandejaSinFiltro.size());
			}
			dataTablesResponse.setRecordsTotal(listaFormatosBandejaSinFiltro.size());
			return dataTablesResponse;
		} catch (Exception e) {
			return null;
		} 
	}
}
