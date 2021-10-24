package com.learnToCode.currencyexchangeservice.model;

import java.math.BigDecimal;

public final class ExchangeValue {
	
	private long id;
	private String form;
	private String to;
	private BigDecimal  conversionMultiple;
	public ExchangeValue() {
		super();
		
	}
	public ExchangeValue(long id, String form, String to, BigDecimal conversionMultiple) {
		super();
		this.id = id;
		this.form = form;
		this.to = to;
		this.conversionMultiple = conversionMultiple;
	}
	public long getId() {
		return id;
	}
	public void setId(long id) {
		this.id = id;
	}
	public String getForm() {
		return form;
	}
	public void setForm(String form) {
		this.form = form;
	}
	public String getTo() {
		return to;
	}
	public void setTo(String to) {
		this.to = to;
	}
	public BigDecimal getConversionMultiple() {
		return conversionMultiple;
	}
	public void setConversionMultiple(BigDecimal conversionMultiple) {
		this.conversionMultiple = conversionMultiple;
	}
	
	

}
