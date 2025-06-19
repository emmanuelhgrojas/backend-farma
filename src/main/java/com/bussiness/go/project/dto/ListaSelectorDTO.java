package com.bussiness.go.project.dto;

import com.bussiness.go.project.entities.commons.ListaSelector;

public class ListaSelectorDTO {

	private String label;
	private String value;
	
	public ListaSelectorDTO() {
	}

	public ListaSelectorDTO(String label, String value) {
		this.label = label;
		this.value = value;
	}

	public String getLabel() {
		return label;
	}

	public void setLabel(String label) {
		this.label = label;
	}

	public String getValue() {
		return value;
	}

	public void setValue(String value) {
		this.value = value;
	}
	
	public ListaSelector toBO() {
		ListaSelector  listaSelector = new ListaSelector();
		listaSelector.setLabel(label);
		listaSelector.setValue(value);
		return listaSelector;
	}
}
