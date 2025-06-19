package com.bussiness.go.project.entities.commons;

import java.util.UUID;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.Table;

import org.hibernate.annotations.GenericGenerator;

import com.bussiness.go.project.dto.FormatoDTO;

@Entity
@Table(name="viaje", schema="formularios")
public class Formato {

	@Id
	@GeneratedValue(generator = "UUID")
    @GenericGenerator(
            name = "UUID",
            strategy = "org.hibernate.id.UUIDGenerator"
    )
	@Column(name="viaje_id")
	private UUID viajeId;
	
	@Column(name="formato_pais_residencia")
	private String formatoPaisResidencia;
	
	@Column(name="formato_nacionalidad")
	private String formatoNacionalidad;
	
	@Column(name="formato_sexo")
	private String formatoSexo;
	
	@Column(name="formato_edad")
	private Integer formatoEdad;
	
	@Column(name="formato_con_quien_viaja")
	private String formatoConQuienViaja;
	
	@Column(name="formato_con_quien_viaja_cual")
	private String formatoConQuienViajaCual;
	
	@Column(name="formato_cantidad_personas_viaje")
	private String formatoCantidadPersonasViaje;
	
	@Column(name="formato_motivo_viaje")
	private String formatoMotivoViaje;
	
	@Column(name="formato_motivo_viaje_cual")
	private String formatoMotivoViajeCual;
	
	@Column(name="formato_como_organizo_viaje_uno")
	private String formatoComoOrganizoViajeUno;
	
	@Column(name="formato_como_organizo_viaje_dos")
	private String formatoComoOrganizoViajeDos;
	
	@Column(name="formato_como_organizo_viaje_tres")
	private String formatoComoOrganizoViajeTres;
	
	@Column(name="formato_como_organizo_viaje_cuatro")
	private String formatoComoOrganizoViajeCuatro;
	
	@Column(name="formato_como_organizo_viaje_cinco")
	private String formatoComoOrganizoViajeCinco;
	
	@Column(name="formato_paquete_turistico_uno")
	private String formatoPaqueteTuristicoUno;
	
	@Column(name="formato_paquete_turistico_dos")
	private String formatoPaqueteTuristicoDos;
	
	@Column(name="formato_paquete_turistico_tres")
	private String formatoPaqueteTuristicoTres;
	
	@Column(name="formato_paquete_turistico_cuatro")
	private String formatoPaqueteTuristicoCuatro;
	
	@Column(name="formato_paquete_turistico_cinco")
	private String formatoPaqueteTuristicoCinco;
	
	@Column(name="formato_paquete_turistico_seis")
	private String formatoPaqueteTuristicoSeis;
	
	@Column(name="formato_paquete_turistico_siete")
	private String formatoPaqueteTuristicoSiete;
	
	@Column(name="formato_paquete_turistico_ocho")
	private String formatoPaqueteTuristicoOcho;
	
	@Column(name="formato_paquete_turistico_nueve")
	private String formatoPaqueteTuristicoNueve;
	
	@Column(name="formato_paquete_turistico_ocho_cual")
	private String formatoPaqueteTuristicoOchoCual;
	
	@Column(name="formato_paquete_turistico_nueve_cual")
	private String formatoPaqueteTuristicoNueveCual;
	
	@Column(name="formato_pagado_por_usted_valor_uno")
	private Integer formatoPagadoPorUstedValorUno;
	
	@Column(name="formato_pagado_por_usted_tipo_moneda_uno")
	private String formatoPagadoPorUstedTipoMonedaUno;
	
	@Column(name="formato_terceros_no_valor_uno")
	private Integer formatoTercerosNoValorUno;
	
	@Column(name="formato_terceros_no_tipo_moneda_uno")
	private String formatoTercerosNoTipoMonedaUno;
	
	@Column(name="formato_terceros_si_valor_uno")
	private Integer formatoTercerosSiValorUno;
	
	@Column(name="formato_terceros_si_tipo_moneda_uno")
	private String formatoTercerosSiTipoMonedaUno;
	
	@Column(name="formato_para_cuantas_personas_uno")
	private Integer formatoparaCuantasPersonasUno;
	
	@Column(name="formato_pagado_por_usted_valor_dos")
	private Integer formatoPagadoPorUstedValorDos;
	
	@Column(name="formato_pagado_por_usted_edad_dos")
	private Integer formatoPagadoPorUstedEdadDos;
	
	@Column(name="formato_terceros_no_valor_dos")
	private Integer formatoTercerosNoValorDos;
	
	@Column(name="formato_terceros_no_tipo_moneda_dos")
	private String formatoTercerosNoTipoMonedaDos;
	
	@Column(name="formato_terceros_si_valor_dos")
	private Integer formatoTercerosSiValorDos;
	
	@Column(name="formato_terceros_si_tipo_moneda_dos")
	private String formatoTercerosSiTipoMonedaDos;
	
	@Column(name="formato_para_cuantas_personas_dos")
	private Integer formatoparaCuantasPersonasDos;
	
	@Column(name="formato_pais_num_noche_vivienda_propia_uno")
	private Integer formatoPaisNumNocheViviendaPropiaUno;
	
	@Column(name="formato_pais_num_noche_hotel_uno")
	private Integer formatoPaisNumNocheHotelUno;
	
	@Column(name="formato_pais_num_noche_vivienda_familiar_uno")
	private Integer formatoPaisNumNocheViviendaFamiliarUno;
	
	@Column(name="formato_pais_num_noche_alquiler_uno")
	private Integer formatoPaisNumNocheViviendaAlquilerUno;
	
	@Column(name="formato_pais_num_noche_otra_vivienda_uno")
	private Integer formatoPaisNumNocheOtraViviendaUno;
	
	@Column(name="formato_hubo_gastos_uno")
	private String formatoHuboGastosUno;
	
	@Column(name="formato_hubo_gastos_dos")
	private String formatoHuboGastosDos;
	
	@Column(name="formato_estado")
	private String formatoEstado;

	public Formato() {
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

	public FormatoDTO toBO() {
		FormatoDTO formatoDTO = new FormatoDTO();
		formatoDTO.setFormatoCantidadPersonasViaje(formatoCantidadPersonasViaje);
		formatoDTO.setFormatoComoOrganizoViajeCinco(formatoComoOrganizoViajeCinco);
		formatoDTO.setFormatoComoOrganizoViajeCuatro(formatoComoOrganizoViajeCuatro);
		formatoDTO.setFormatoComoOrganizoViajeDos(formatoComoOrganizoViajeDos);
		formatoDTO.setFormatoComoOrganizoViajeTres(formatoComoOrganizoViajeTres);
		formatoDTO.setFormatoComoOrganizoViajeUno(formatoComoOrganizoViajeUno);
		formatoDTO.setFormatoConQuienViaja(formatoConQuienViaja);
		formatoDTO.setFormatoConQuienViajaCual(formatoConQuienViajaCual);
		formatoDTO.setFormatoEdad(formatoEdad);
		formatoDTO.setFormatoHuboGastosDos(formatoHuboGastosDos);
		formatoDTO.setFormatoHuboGastosUno(formatoHuboGastosUno);
		formatoDTO.setFormatoMotivoViaje(formatoMotivoViaje);
		formatoDTO.setFormatoMotivoViajeCual(formatoMotivoViajeCual);
		formatoDTO.setFormatoNacionalidad(formatoNacionalidad);
		formatoDTO.setFormatoPagadoPorUstedEdadDos(formatoPagadoPorUstedEdadDos);
		formatoDTO.setFormatoPagadoPorUstedTipoMonedaUno(formatoPagadoPorUstedTipoMonedaUno);
		formatoDTO.setFormatoPagadoPorUstedValorDos(formatoPagadoPorUstedValorDos);
		formatoDTO.setFormatoPagadoPorUstedValorUno(formatoPagadoPorUstedValorUno);
		formatoDTO.setFormatoPaisNumNocheHotelUno(formatoPaisNumNocheHotelUno);
		formatoDTO.setFormatoPaisNumNocheOtraViviendaUno(formatoPaisNumNocheOtraViviendaUno);
		formatoDTO.setFormatoPaisNumNocheViviendaAlquilerUno(formatoPaisNumNocheViviendaAlquilerUno);
		formatoDTO.setFormatoPaisNumNocheViviendaFamiliarUno(formatoPaisNumNocheViviendaFamiliarUno);
		formatoDTO.setFormatoPaisNumNocheViviendaPropiaUno(formatoPaisNumNocheViviendaPropiaUno);
		formatoDTO.setFormatoPaisResidencia(formatoPaisResidencia);
		formatoDTO.setFormatoPaqueteTuristicoCinco(formatoPaqueteTuristicoCinco);
		formatoDTO.setFormatoPaqueteTuristicoCuatro(formatoPaqueteTuristicoCuatro);
		formatoDTO.setFormatoPaqueteTuristicoDos(formatoPaqueteTuristicoDos);
		formatoDTO.setFormatoPaqueteTuristicoNueve(formatoPaqueteTuristicoNueve);
		formatoDTO.setFormatoPaqueteTuristicoNueveCual(formatoPaqueteTuristicoNueveCual);
		formatoDTO.setFormatoPaqueteTuristicoOcho(formatoPaqueteTuristicoOcho);
		formatoDTO.setFormatoPaqueteTuristicoOchoCual(formatoPaqueteTuristicoOchoCual);
		formatoDTO.setFormatoPaqueteTuristicoSeis(formatoPaqueteTuristicoSeis);
		formatoDTO.setFormatoPaqueteTuristicoSiete(formatoPaqueteTuristicoSiete);
		formatoDTO.setFormatoPaqueteTuristicoTres(formatoPaqueteTuristicoTres);
		formatoDTO.setFormatoPaqueteTuristicoUno(formatoPaqueteTuristicoUno);
		formatoDTO.setFormatoparaCuantasPersonasDos(formatoparaCuantasPersonasDos);
		formatoDTO.setFormatoparaCuantasPersonasUno(formatoparaCuantasPersonasUno);
		formatoDTO.setFormatoSexo(formatoSexo);
		formatoDTO.setFormatoTercerosNoTipoMonedaDos(formatoTercerosNoTipoMonedaDos);
		formatoDTO.setFormatoTercerosNoTipoMonedaUno(formatoTercerosNoTipoMonedaUno);
		formatoDTO.setFormatoTercerosNoValorDos(formatoTercerosNoValorDos);
		formatoDTO.setFormatoTercerosNoValorUno(formatoTercerosNoValorUno);
		formatoDTO.setFormatoTercerosSiTipoMonedaDos(formatoTercerosSiTipoMonedaDos);
		formatoDTO.setFormatoTercerosSiTipoMonedaUno(formatoTercerosSiTipoMonedaUno);
		formatoDTO.setFormatoTercerosSiValorDos(formatoTercerosSiValorDos);
		formatoDTO.setFormatoTercerosSiValorUno(formatoTercerosSiValorUno);
		formatoDTO.setViajeId(viajeId);
		formatoDTO.setFormatoEstado(formatoEstado);
		return formatoDTO;
	} 
}
