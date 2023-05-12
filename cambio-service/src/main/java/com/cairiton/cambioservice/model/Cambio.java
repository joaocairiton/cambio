package com.cairiton.cambioservice.model;

import java.io.Serializable;
import java.math.BigDecimal;

public class Cambio implements Serializable {
	private static final long serialVersionUID = 1L;
	
	

	private Long id;
	
	private String from;
	
	private String to;
	
	private BigDecimal conversionFactor;
	
	private BigDecimal converterValue;
	
	private String environment;
	
	public Cambio() {}

	public Cambio(Long id, String from, String to, BigDecimal conversionFactor, BigDecimal converterValue,
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

	public BigDecimal getConversionFactor() {
		return conversionFactor;
	}

	public void setConversionFactor(BigDecimal conversionFactor) {
		this.conversionFactor = conversionFactor;
	}

	public BigDecimal getConverterValue() {
		return converterValue;
	}

	public void setConverterValue(BigDecimal converterValue) {
		this.converterValue = converterValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}
	
	
	

}
