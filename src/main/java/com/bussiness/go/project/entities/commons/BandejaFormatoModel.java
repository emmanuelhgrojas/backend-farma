package com.bussiness.go.project.entities.commons;

import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.Id;

import com.bussiness.go.project.dto.BandejaFormatoDTO;

@Entity
public class BandejaFormatoModel {

	@Id
	private UUID viajeId;
	private String formatoPaisResidencia;
	private String formatoNacionalidad;
	private String formatoSexo;
	private Integer formatoEdad;
	
	public BandejaFormatoModel() {
	}

	public BandejaFormatoModel(UUID viajeId, String formatoPaisResidencia, String formatoNacionalidad,
			String formatoSexo, Integer formatoEdad) {
		this.viajeId = viajeId;
		this.formatoPaisResidencia = formatoPaisResidencia;
		this.formatoNacionalidad = formatoNacionalidad;
		this.formatoSexo = formatoSexo;
		this.formatoEdad = formatoEdad;
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
	
	public BandejaFormatoDTO toBO() {
		BandejaFormatoDTO bandejaFormatoDTO = new BandejaFormatoDTO();
		bandejaFormatoDTO.setFormatoEdad(formatoEdad);
		bandejaFormatoDTO.setFormatoNacionalidad(formatoNacionalidad);
		bandejaFormatoDTO.setFormatoPaisResidencia(formatoPaisResidencia);
		bandejaFormatoDTO.setFormatoSexo(formatoSexo);
		bandejaFormatoDTO.setViajeId(viajeId);		
		return bandejaFormatoDTO;
	}
}
