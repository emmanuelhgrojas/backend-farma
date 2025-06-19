package com.bussiness.go.project.dto;

import java.util.UUID;

import javax.persistence.Column;

import com.bussiness.go.project.entities.commons.Formato;

public class FormatoDTO {

	private UUID viajeId;
	private String formatoPaisResidencia;
	private String formatoNacionalidad;
	private String formatoSexo;
	private Integer formatoEdad;
	private String formatoConQuienViaja;
	private String formatoConQuienViajaCual;
	private String formatoCantidadPersonasViaje;
	private String formatoMotivoViaje;
	private String formatoMotivoViajeCual;
	private String formatoComoOrganizoViajeUno;
	private String formatoComoOrganizoViajeDos;
	private String formatoComoOrganizoViajeTres;
	private String formatoComoOrganizoViajeCuatro;
	private String formatoComoOrganizoViajeCinco;
	private String formatoPaqueteTuristicoUno;
	private String formatoPaqueteTuristicoDos;
	private String formatoPaqueteTuristicoTres;
	private String formatoPaqueteTuristicoCuatro;
	private String formatoPaqueteTuristicoCinco;
	private String formatoPaqueteTuristicoSeis;
	private String formatoPaqueteTuristicoSiete;
	private String formatoPaqueteTuristicoOcho;
	private String formatoPaqueteTuristicoNueve;
	private String formatoPaqueteTuristicoOchoCual;
	private String formatoPaqueteTuristicoNueveCual;
	private Integer formatoPagadoPorUstedValorUno;
	private String formatoPagadoPorUstedTipoMonedaUno;
	private Integer formatoTercerosNoValorUno;
	private String formatoTercerosNoTipoMonedaUno;
	private Integer formatoTercerosSiValorUno;
	private String formatoTercerosSiTipoMonedaUno;
	private Integer formatoparaCuantasPersonasUno;
	private Integer formatoPagadoPorUstedValorDos;
	private Integer formatoPagadoPorUstedEdadDos;
	private Integer formatoTercerosNoValorDos;
	private String formatoTercerosNoTipoMonedaDos;
	private Integer formatoTercerosSiValorDos;
	private String formatoTercerosSiTipoMonedaDos;
	private Integer formatoparaCuantasPersonasDos;
	private Integer formatoPaisNumNocheViviendaPropiaUno;
	private Integer formatoPaisNumNocheHotelUno;
	private Integer formatoPaisNumNocheViviendaFamiliarUno;
	private Integer formatoPaisNumNocheViviendaAlquilerUno;
	private Integer formatoPaisNumNocheOtraViviendaUno;
	private String formatoHuboGastosUno;
	private String formatoHuboGastosDos;
	private String formatoEstado;
	
	public FormatoDTO() {
	}	

	public FormatoDTO(UUID viajeId, String formatoPaisResidencia, String formatoNacionalidad, String formatoSexo,
			Integer formatoEdad, String formatoConQuienViaja, String formatoConQuienViajaCual,
			String formatoCantidadPersonasViaje, String formatoMotivoViaje, String formatoMotivoViajeCual,
			String formatoComoOrganizoViajeUno, String formatoComoOrganizoViajeDos, String formatoComoOrganizoViajeTres,
			String formatoComoOrganizoViajeCuatro, String formatoComoOrganizoViajeCinco,
			String formatoPaqueteTuristicoUno, String formatoPaqueteTuristicoDos, String formatoPaqueteTuristicoTres,
			String formatoPaqueteTuristicoCuatro, String formatoPaqueteTuristicoCinco,
			String formatoPaqueteTuristicoSeis, String formatoPaqueteTuristicoSiete, String formatoPaqueteTuristicoOcho,
			String formatoPaqueteTuristicoNueve, String formatoPaqueteTuristicoOchoCual,
			String formatoPaqueteTuristicoNueveCual, Integer formatoPagadoPorUstedValorUno,
			String formatoPagadoPorUstedTipoMonedaUno, Integer formatoTercerosNoValorUno,
			String formatoTercerosNoTipoMonedaUno, Integer formatoTercerosSiValorUno,
			String formatoTercerosSiTipoMonedaUno, Integer formatoparaCuantasPersonasUno,
			Integer formatoPagadoPorUstedValorDos, Integer formatoPagadoPorUstedEdadDos,
			Integer formatoTercerosNoValorDos, String formatoTercerosNoTipoMonedaDos, Integer formatoTercerosSiValorDos,
			String formatoTercerosSiTipoMonedaDos, Integer formatoparaCuantasPersonasDos,
			Integer formatoPaisNumNocheViviendaPropiaUno, Integer formatoPaisNumNocheHotelUno,
			Integer formatoPaisNumNocheViviendaFamiliarUno, Integer formatoPaisNumNocheViviendaAlquilerUno,
			Integer formatoPaisNumNocheOtraViviendaUno, String formatoHuboGastosUno, String formatoHuboGastosDos,
			String formatoEstado) {
		this.viajeId = viajeId;
		this.formatoPaisResidencia = formatoPaisResidencia;
		this.formatoNacionalidad = formatoNacionalidad;
		this.formatoSexo = formatoSexo;
		this.formatoEdad = formatoEdad;
		this.formatoConQuienViaja = formatoConQuienViaja;
		this.formatoConQuienViajaCual = formatoConQuienViajaCual;
		this.formatoCantidadPersonasViaje = formatoCantidadPersonasViaje;
		this.formatoMotivoViaje = formatoMotivoViaje;
		this.formatoMotivoViajeCual = formatoMotivoViajeCual;
		this.formatoComoOrganizoViajeUno = formatoComoOrganizoViajeUno;
		this.formatoComoOrganizoViajeDos = formatoComoOrganizoViajeDos;
		this.formatoComoOrganizoViajeTres = formatoComoOrganizoViajeTres;
		this.formatoComoOrganizoViajeCuatro = formatoComoOrganizoViajeCuatro;
		this.formatoComoOrganizoViajeCinco = formatoComoOrganizoViajeCinco;
		this.formatoPaqueteTuristicoUno = formatoPaqueteTuristicoUno;
		this.formatoPaqueteTuristicoDos = formatoPaqueteTuristicoDos;
		this.formatoPaqueteTuristicoTres = formatoPaqueteTuristicoTres;
		this.formatoPaqueteTuristicoCuatro = formatoPaqueteTuristicoCuatro;
		this.formatoPaqueteTuristicoCinco = formatoPaqueteTuristicoCinco;
		this.formatoPaqueteTuristicoSeis = formatoPaqueteTuristicoSeis;
		this.formatoPaqueteTuristicoSiete = formatoPaqueteTuristicoSiete;
		this.formatoPaqueteTuristicoOcho = formatoPaqueteTuristicoOcho;
		this.formatoPaqueteTuristicoNueve = formatoPaqueteTuristicoNueve;
		this.formatoPaqueteTuristicoOchoCual = formatoPaqueteTuristicoOchoCual;
		this.formatoPaqueteTuristicoNueveCual = formatoPaqueteTuristicoNueveCual;
		this.formatoPagadoPorUstedValorUno = formatoPagadoPorUstedValorUno;
		this.formatoPagadoPorUstedTipoMonedaUno = formatoPagadoPorUstedTipoMonedaUno;
		this.formatoTercerosNoValorUno = formatoTercerosNoValorUno;
		this.formatoTercerosNoTipoMonedaUno = formatoTercerosNoTipoMonedaUno;
		this.formatoTercerosSiValorUno = formatoTercerosSiValorUno;
		this.formatoTercerosSiTipoMonedaUno = formatoTercerosSiTipoMonedaUno;
		this.formatoparaCuantasPersonasUno = formatoparaCuantasPersonasUno;
		this.formatoPagadoPorUstedValorDos = formatoPagadoPorUstedValorDos;
		this.formatoPagadoPorUstedEdadDos = formatoPagadoPorUstedEdadDos;
		this.formatoTercerosNoValorDos = formatoTercerosNoValorDos;
		this.formatoTercerosNoTipoMonedaDos = formatoTercerosNoTipoMonedaDos;
		this.formatoTercerosSiValorDos = formatoTercerosSiValorDos;
		this.formatoTercerosSiTipoMonedaDos = formatoTercerosSiTipoMonedaDos;
		this.formatoparaCuantasPersonasDos = formatoparaCuantasPersonasDos;
		this.formatoPaisNumNocheViviendaPropiaUno = formatoPaisNumNocheViviendaPropiaUno;
		this.formatoPaisNumNocheHotelUno = formatoPaisNumNocheHotelUno;
		this.formatoPaisNumNocheViviendaFamiliarUno = formatoPaisNumNocheViviendaFamiliarUno;
		this.formatoPaisNumNocheViviendaAlquilerUno = formatoPaisNumNocheViviendaAlquilerUno;
		this.formatoPaisNumNocheOtraViviendaUno = formatoPaisNumNocheOtraViviendaUno;
		this.formatoHuboGastosUno = formatoHuboGastosUno;
		this.formatoHuboGastosDos = formatoHuboGastosDos;
		this.formatoEstado = formatoEstado;
	}

	public UUID getViajeId() {
		return viajeId;
	}

	public void setViajeId(UUID viajeId) {
		this.viajeId = viajeId;
	}

	public String getFormatoPaisResidencia() {
		return formatoPaisResidencia;
	}

	public void setFormatoPaisResidencia(String formatoPaisResidencia) {
		this.formatoPaisResidencia = formatoPaisResidencia;
	}

	public String getFormatoNacionalidad() {
		return formatoNacionalidad;
	}

	public void setFormatoNacionalidad(String formatoNacionalidad) {
		this.formatoNacionalidad = formatoNacionalidad;
	}

	public String getFormatoSexo() {
		return formatoSexo;
	}

	public void setFormatoSexo(String formatoSexo) {
		this.formatoSexo = formatoSexo;
	}

	public Integer getFormatoEdad() {
		return formatoEdad;
	}

	public void setFormatoEdad(Integer formatoEdad) {
		this.formatoEdad = formatoEdad;
	}

	public String getFormatoConQuienViaja() {
		return formatoConQuienViaja;
	}

	public void setFormatoConQuienViaja(String formatoConQuienViaja) {
		this.formatoConQuienViaja = formatoConQuienViaja;
	}

	public String getFormatoConQuienViajaCual() {
		return formatoConQuienViajaCual;
	}

	public void setFormatoConQuienViajaCual(String formatoConQuienViajaCual) {
		this.formatoConQuienViajaCual = formatoConQuienViajaCual;
	}

	public String getFormatoCantidadPersonasViaje() {
		return formatoCantidadPersonasViaje;
	}

	public void setFormatoCantidadPersonasViaje(String formatoCantidadPersonasViaje) {
		this.formatoCantidadPersonasViaje = formatoCantidadPersonasViaje;
	}

	public String getFormatoMotivoViaje() {
		return formatoMotivoViaje;
	}

	public void setFormatoMotivoViaje(String formatoMotivoViaje) {
		this.formatoMotivoViaje = formatoMotivoViaje;
	}

	public String getFormatoMotivoViajeCual() {
		return formatoMotivoViajeCual;
	}

	public void setFormatoMotivoViajeCual(String formatoMotivoViajeCual) {
		this.formatoMotivoViajeCual = formatoMotivoViajeCual;
	}

	public String getFormatoComoOrganizoViajeUno() {
		return formatoComoOrganizoViajeUno;
	}

	public void setFormatoComoOrganizoViajeUno(String formatoComoOrganizoViajeUno) {
		this.formatoComoOrganizoViajeUno = formatoComoOrganizoViajeUno;
	}

	public String getFormatoComoOrganizoViajeDos() {
		return formatoComoOrganizoViajeDos;
	}

	public void setFormatoComoOrganizoViajeDos(String formatoComoOrganizoViajeDos) {
		this.formatoComoOrganizoViajeDos = formatoComoOrganizoViajeDos;
	}

	public String getFormatoComoOrganizoViajeTres() {
		return formatoComoOrganizoViajeTres;
	}

	public void setFormatoComoOrganizoViajeTres(String formatoComoOrganizoViajeTres) {
		this.formatoComoOrganizoViajeTres = formatoComoOrganizoViajeTres;
	}

	public String getFormatoComoOrganizoViajeCuatro() {
		return formatoComoOrganizoViajeCuatro;
	}

	public void setFormatoComoOrganizoViajeCuatro(String formatoComoOrganizoViajeCuatro) {
		this.formatoComoOrganizoViajeCuatro = formatoComoOrganizoViajeCuatro;
	}

	public String getFormatoComoOrganizoViajeCinco() {
		return formatoComoOrganizoViajeCinco;
	}

	public void setFormatoComoOrganizoViajeCinco(String formatoComoOrganizoViajeCinco) {
		this.formatoComoOrganizoViajeCinco = formatoComoOrganizoViajeCinco;
	}

	public String getFormatoPaqueteTuristicoUno() {
		return formatoPaqueteTuristicoUno;
	}

	public void setFormatoPaqueteTuristicoUno(String formatoPaqueteTuristicoUno) {
		this.formatoPaqueteTuristicoUno = formatoPaqueteTuristicoUno;
	}

	public String getFormatoPaqueteTuristicoDos() {
		return formatoPaqueteTuristicoDos;
	}

	public void setFormatoPaqueteTuristicoDos(String formatoPaqueteTuristicoDos) {
		this.formatoPaqueteTuristicoDos = formatoPaqueteTuristicoDos;
	}

	public String getFormatoPaqueteTuristicoTres() {
		return formatoPaqueteTuristicoTres;
	}

	public void setFormatoPaqueteTuristicoTres(String formatoPaqueteTuristicoTres) {
		this.formatoPaqueteTuristicoTres = formatoPaqueteTuristicoTres;
	}

	public String getFormatoPaqueteTuristicoCuatro() {
		return formatoPaqueteTuristicoCuatro;
	}

	public void setFormatoPaqueteTuristicoCuatro(String formatoPaqueteTuristicoCuatro) {
		this.formatoPaqueteTuristicoCuatro = formatoPaqueteTuristicoCuatro;
	}

	public String getFormatoPaqueteTuristicoCinco() {
		return formatoPaqueteTuristicoCinco;
	}

	public void setFormatoPaqueteTuristicoCinco(String formatoPaqueteTuristicoCinco) {
		this.formatoPaqueteTuristicoCinco = formatoPaqueteTuristicoCinco;
	}

	public String getFormatoPaqueteTuristicoSeis() {
		return formatoPaqueteTuristicoSeis;
	}

	public void setFormatoPaqueteTuristicoSeis(String formatoPaqueteTuristicoSeis) {
		this.formatoPaqueteTuristicoSeis = formatoPaqueteTuristicoSeis;
	}

	public String getFormatoPaqueteTuristicoSiete() {
		return formatoPaqueteTuristicoSiete;
	}

	public void setFormatoPaqueteTuristicoSiete(String formatoPaqueteTuristicoSiete) {
		this.formatoPaqueteTuristicoSiete = formatoPaqueteTuristicoSiete;
	}

	public String getFormatoPaqueteTuristicoOcho() {
		return formatoPaqueteTuristicoOcho;
	}

	public void setFormatoPaqueteTuristicoOcho(String formatoPaqueteTuristicoOcho) {
		this.formatoPaqueteTuristicoOcho = formatoPaqueteTuristicoOcho;
	}

	public String getFormatoPaqueteTuristicoNueve() {
		return formatoPaqueteTuristicoNueve;
	}

	public void setFormatoPaqueteTuristicoNueve(String formatoPaqueteTuristicoNueve) {
		this.formatoPaqueteTuristicoNueve = formatoPaqueteTuristicoNueve;
	}

	public String getFormatoPaqueteTuristicoOchoCual() {
		return formatoPaqueteTuristicoOchoCual;
	}

	public void setFormatoPaqueteTuristicoOchoCual(String formatoPaqueteTuristicoOchoCual) {
		this.formatoPaqueteTuristicoOchoCual = formatoPaqueteTuristicoOchoCual;
	}

	public String getFormatoPaqueteTuristicoNueveCual() {
		return formatoPaqueteTuristicoNueveCual;
	}

	public void setFormatoPaqueteTuristicoNueveCual(String formatoPaqueteTuristicoNueveCual) {
		this.formatoPaqueteTuristicoNueveCual = formatoPaqueteTuristicoNueveCual;
	}

	public Integer getFormatoPagadoPorUstedValorUno() {
		return formatoPagadoPorUstedValorUno;
	}

	public void setFormatoPagadoPorUstedValorUno(Integer formatoPagadoPorUstedValorUno) {
		this.formatoPagadoPorUstedValorUno = formatoPagadoPorUstedValorUno;
	}

	public String getFormatoPagadoPorUstedTipoMonedaUno() {
		return formatoPagadoPorUstedTipoMonedaUno;
	}

	public void setFormatoPagadoPorUstedTipoMonedaUno(String formatoPagadoPorUstedTipoMonedaUno) {
		this.formatoPagadoPorUstedTipoMonedaUno = formatoPagadoPorUstedTipoMonedaUno;
	}

	public Integer getFormatoTercerosNoValorUno() {
		return formatoTercerosNoValorUno;
	}

	public void setFormatoTercerosNoValorUno(Integer formatoTercerosNoValorUno) {
		this.formatoTercerosNoValorUno = formatoTercerosNoValorUno;
	}

	public String getFormatoTercerosNoTipoMonedaUno() {
		return formatoTercerosNoTipoMonedaUno;
	}

	public void setFormatoTercerosNoTipoMonedaUno(String formatoTercerosNoTipoMonedaUno) {
		this.formatoTercerosNoTipoMonedaUno = formatoTercerosNoTipoMonedaUno;
	}

	public Integer getFormatoTercerosSiValorUno() {
		return formatoTercerosSiValorUno;
	}

	public void setFormatoTercerosSiValorUno(Integer formatoTercerosSiValorUno) {
		this.formatoTercerosSiValorUno = formatoTercerosSiValorUno;
	}

	public String getFormatoTercerosSiTipoMonedaUno() {
		return formatoTercerosSiTipoMonedaUno;
	}

	public void setFormatoTercerosSiTipoMonedaUno(String formatoTercerosSiTipoMonedaUno) {
		this.formatoTercerosSiTipoMonedaUno = formatoTercerosSiTipoMonedaUno;
	}

	public Integer getFormatoparaCuantasPersonasUno() {
		return formatoparaCuantasPersonasUno;
	}

	public void setFormatoparaCuantasPersonasUno(Integer formatoparaCuantasPersonasUno) {
		this.formatoparaCuantasPersonasUno = formatoparaCuantasPersonasUno;
	}

	public Integer getFormatoPagadoPorUstedValorDos() {
		return formatoPagadoPorUstedValorDos;
	}

	public void setFormatoPagadoPorUstedValorDos(Integer formatoPagadoPorUstedValorDos) {
		this.formatoPagadoPorUstedValorDos = formatoPagadoPorUstedValorDos;
	}

	public Integer getFormatoPagadoPorUstedEdadDos() {
		return formatoPagadoPorUstedEdadDos;
	}

	public void setFormatoPagadoPorUstedEdadDos(Integer formatoPagadoPorUstedEdadDos) {
		this.formatoPagadoPorUstedEdadDos = formatoPagadoPorUstedEdadDos;
	}

	public Integer getFormatoTercerosNoValorDos() {
		return formatoTercerosNoValorDos;
	}

	public void setFormatoTercerosNoValorDos(Integer formatoTercerosNoValorDos) {
		this.formatoTercerosNoValorDos = formatoTercerosNoValorDos;
	}

	public String getFormatoTercerosNoTipoMonedaDos() {
		return formatoTercerosNoTipoMonedaDos;
	}

	public void setFormatoTercerosNoTipoMonedaDos(String formatoTercerosNoTipoMonedaDos) {
		this.formatoTercerosNoTipoMonedaDos = formatoTercerosNoTipoMonedaDos;
	}

	public Integer getFormatoTercerosSiValorDos() {
		return formatoTercerosSiValorDos;
	}

	public void setFormatoTercerosSiValorDos(Integer formatoTercerosSiValorDos) {
		this.formatoTercerosSiValorDos = formatoTercerosSiValorDos;
	}

	public String getFormatoTercerosSiTipoMonedaDos() {
		return formatoTercerosSiTipoMonedaDos;
	}

	public void setFormatoTercerosSiTipoMonedaDos(String formatoTercerosSiTipoMonedaDos) {
		this.formatoTercerosSiTipoMonedaDos = formatoTercerosSiTipoMonedaDos;
	}

	public Integer getFormatoparaCuantasPersonasDos() {
		return formatoparaCuantasPersonasDos;
	}

	public void setFormatoparaCuantasPersonasDos(Integer formatoparaCuantasPersonasDos) {
		this.formatoparaCuantasPersonasDos = formatoparaCuantasPersonasDos;
	}

	public Integer getFormatoPaisNumNocheViviendaPropiaUno() {
		return formatoPaisNumNocheViviendaPropiaUno;
	}

	public void setFormatoPaisNumNocheViviendaPropiaUno(Integer formatoPaisNumNocheViviendaPropiaUno) {
		this.formatoPaisNumNocheViviendaPropiaUno = formatoPaisNumNocheViviendaPropiaUno;
	}

	public Integer getFormatoPaisNumNocheHotelUno() {
		return formatoPaisNumNocheHotelUno;
	}

	public void setFormatoPaisNumNocheHotelUno(Integer formatoPaisNumNocheHotelUno) {
		this.formatoPaisNumNocheHotelUno = formatoPaisNumNocheHotelUno;
	}

	public Integer getFormatoPaisNumNocheViviendaFamiliarUno() {
		return formatoPaisNumNocheViviendaFamiliarUno;
	}

	public void setFormatoPaisNumNocheViviendaFamiliarUno(Integer formatoPaisNumNocheViviendaFamiliarUno) {
		this.formatoPaisNumNocheViviendaFamiliarUno = formatoPaisNumNocheViviendaFamiliarUno;
	}

	public Integer getFormatoPaisNumNocheViviendaAlquilerUno() {
		return formatoPaisNumNocheViviendaAlquilerUno;
	}

	public void setFormatoPaisNumNocheViviendaAlquilerUno(Integer formatoPaisNumNocheViviendaAlquilerUno) {
		this.formatoPaisNumNocheViviendaAlquilerUno = formatoPaisNumNocheViviendaAlquilerUno;
	}

	public Integer getFormatoPaisNumNocheOtraViviendaUno() {
		return formatoPaisNumNocheOtraViviendaUno;
	}

	public void setFormatoPaisNumNocheOtraViviendaUno(Integer formatoPaisNumNocheOtraViviendaUno) {
		this.formatoPaisNumNocheOtraViviendaUno = formatoPaisNumNocheOtraViviendaUno;
	}

	public String getFormatoHuboGastosUno() {
		return formatoHuboGastosUno;
	}

	public void setFormatoHuboGastosUno(String formatoHuboGastosUno) {
		this.formatoHuboGastosUno = formatoHuboGastosUno;
	}

	public String getFormatoHuboGastosDos() {
		return formatoHuboGastosDos;
	}

	public void setFormatoHuboGastosDos(String formatoHuboGastosDos) {
		this.formatoHuboGastosDos = formatoHuboGastosDos;
	}	
	
	public String getFormatoEstado() {
		return formatoEstado;
	}

	public void setFormatoEstado(String formatoEstado) {
		this.formatoEstado = formatoEstado;
	}

	public Formato toBO() {
		Formato formato = new Formato();
		formato.setFormatoCantidadPersonasViaje(formatoCantidadPersonasViaje);
		formato.setFormatoComoOrganizoViajeCinco(formatoComoOrganizoViajeCinco);
		formato.setFormatoComoOrganizoViajeCuatro(formatoComoOrganizoViajeCuatro);
		formato.setFormatoComoOrganizoViajeDos(formatoComoOrganizoViajeDos);
		formato.setFormatoComoOrganizoViajeTres(formatoComoOrganizoViajeTres);
		formato.setFormatoComoOrganizoViajeUno(formatoComoOrganizoViajeUno);
		formato.setFormatoConQuienViaja(formatoConQuienViaja);
		formato.setFormatoConQuienViajaCual(formatoConQuienViajaCual);
		formato.setFormatoEdad(formatoEdad);
		formato.setFormatoHuboGastosDos(formatoHuboGastosDos);
		formato.setFormatoHuboGastosUno(formatoHuboGastosUno);
		formato.setFormatoMotivoViaje(formatoMotivoViaje);
		formato.setFormatoMotivoViajeCual(formatoMotivoViajeCual);
		formato.setFormatoNacionalidad(formatoNacionalidad);
		formato.setFormatoPagadoPorUstedEdadDos(formatoPagadoPorUstedEdadDos);
		formato.setFormatoPagadoPorUstedTipoMonedaUno(formatoPagadoPorUstedTipoMonedaUno);
		formato.setFormatoPagadoPorUstedValorDos(formatoPagadoPorUstedValorDos);
		formato.setFormatoPagadoPorUstedValorUno(formatoPagadoPorUstedValorUno);
		formato.setFormatoPaisNumNocheHotelUno(formatoPaisNumNocheHotelUno);
		formato.setFormatoPaisNumNocheOtraViviendaUno(formatoPaisNumNocheOtraViviendaUno);
		formato.setFormatoPaisNumNocheViviendaAlquilerUno(formatoPaisNumNocheViviendaAlquilerUno);
		formato.setFormatoPaisNumNocheViviendaFamiliarUno(formatoPaisNumNocheViviendaFamiliarUno);
		formato.setFormatoPaisNumNocheViviendaPropiaUno(formatoPaisNumNocheViviendaPropiaUno);
		formato.setFormatoPaisResidencia(formatoPaisResidencia);
		formato.setFormatoPaqueteTuristicoCinco(formatoPaqueteTuristicoCinco);
		formato.setFormatoPaqueteTuristicoCuatro(formatoPaqueteTuristicoCuatro);
		formato.setFormatoPaqueteTuristicoDos(formatoPaqueteTuristicoDos);
		formato.setFormatoPaqueteTuristicoNueve(formatoPaqueteTuristicoNueve);
		formato.setFormatoPaqueteTuristicoNueveCual(formatoPaqueteTuristicoNueveCual);
		formato.setFormatoPaqueteTuristicoOcho(formatoPaqueteTuristicoOcho);
		formato.setFormatoPaqueteTuristicoOchoCual(formatoPaqueteTuristicoOchoCual);
		formato.setFormatoPaqueteTuristicoSeis(formatoPaqueteTuristicoSeis);
		formato.setFormatoPaqueteTuristicoSiete(formatoPaqueteTuristicoSiete);
		formato.setFormatoPaqueteTuristicoTres(formatoPaqueteTuristicoTres);
		formato.setFormatoPaqueteTuristicoUno(formatoPaqueteTuristicoUno);
		formato.setFormatoparaCuantasPersonasDos(formatoparaCuantasPersonasDos);
		formato.setFormatoparaCuantasPersonasUno(formatoparaCuantasPersonasUno);
		formato.setFormatoSexo(formatoSexo);
		formato.setFormatoTercerosNoTipoMonedaDos(formatoTercerosNoTipoMonedaDos);
		formato.setFormatoTercerosNoTipoMonedaUno(formatoTercerosNoTipoMonedaUno);
		formato.setFormatoTercerosNoValorDos(formatoTercerosNoValorDos);
		formato.setFormatoTercerosNoValorUno(formatoTercerosNoValorUno);
		formato.setFormatoTercerosSiTipoMonedaDos(formatoTercerosSiTipoMonedaDos);
		formato.setFormatoTercerosSiTipoMonedaUno(formatoTercerosSiTipoMonedaUno);
		formato.setFormatoTercerosSiValorDos(formatoTercerosSiValorDos);
		formato.setFormatoTercerosSiValorUno(formatoTercerosSiValorUno);
		formato.setViajeId(viajeId);
		formato.setFormatoEstado(formatoEstado);
		return formato;
	} 
}
