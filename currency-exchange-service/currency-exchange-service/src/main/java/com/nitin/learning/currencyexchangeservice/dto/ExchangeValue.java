package com.nitin.learning.currencyexchangeservice.dto;

import java.math.BigDecimal;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;

@Entity
public class ExchangeValue {

	@Id
	@GeneratedValue
	private Long id;
	@Column(name="currency_from")
	private String from;
	@Column(name="currency_to")
	private String to;
	private BigDecimal conversionMutiple;
	private Integer port;
	
	
	public ExchangeValue()
	{
		
	}
	
	public ExchangeValue(Long id, String from, String to, BigDecimal conversionMutiple) {
		super();
		this.id = id;
		this.from = from;
		this.to = to;
		this.conversionMutiple = conversionMutiple;
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

	public Integer getPort() {
		return port;
	}

	public void setPort(Integer port) {
		this.port = port;
	}

}
