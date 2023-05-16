package com.cairiton.bookservice.response;

import java.io.Serializable;



public class Cambio implements Serializable {
	

	private static final long serialVersionUID = 1L;
	
	

	
	private Long id;
	
	private String from;
	
	private String to;
	
	
	private Double conversionFactor;
	
	
	private Double converterValue;
	
	
	private String environment;
	
	public Cambio() {}

	public Cambio(Long id, String from, String to, Double conversionFactor, Double converterValue,
			String environment) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionFactor = conversionFactor;
		this.converterValue = converterValue;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public Double getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(Double conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public Double getConverterValue() {
		return converterValue;
	}

	public void setConverterValue(Double converterValue) {
		this.converterValue = converterValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
