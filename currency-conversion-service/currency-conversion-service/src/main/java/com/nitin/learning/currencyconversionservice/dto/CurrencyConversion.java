package com.nitin.learning.currencyconversionservice.dto;

import java.math.BigDecimal;

public class CurrencyConversion {

	private Long id;
	private String from;
	private String to;
	private BigDecimal conversionMutiple;
	private BigDecimal quantity;
	private BigDecimal totalConversionValue;
	private int port;

	public CurrencyConversion()
	{
		
	}
	public CurrencyConversion(Long id, String from, String to, BigDecimal conversionMutiple, BigDecimal quantity,
			BigDecimal totalConversionValue, int port) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutiple = conversionMutiple;
		this.quantity = quantity;
		this.totalConversionValue = totalConversionValue;
		this.port = port;
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

	public BigDecimal getConversionMutiple() {
		return conversionMutiple;
	}

	public void setConversionMutiple(BigDecimal conversionMutiple) {
		this.conversionMutiple = conversionMutiple;
	}

	public BigDecimal getQuantity() {
		return quantity;
	}

	public void setQuantity(BigDecimal quantity) {
		this.quantity = quantity;
	}

	public BigDecimal getTotalConversionValue() {
		return totalConversionValue;
	}

	public void setTotalConversionValue(BigDecimal totalConversionValue) {
		this.totalConversionValue = totalConversionValue;
	}

	public int getPort() {
		return port;
	}

	public void setPort(int port) {
		this.port = port;
	}
}
