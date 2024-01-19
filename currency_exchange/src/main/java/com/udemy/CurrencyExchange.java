package com.udemy;

import java.math.BigDecimal;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class CurrencyExchange {
	@Id
	private Long id;
	
	@Column(name = "currency_to")
	private String to;
	
	@Column(name = "currency_from")
	private String from;
	
	private BigDecimal exchangeValue;
	private String environment;

	public CurrencyExchange(){};

	public CurrencyExchange(Long id, String to, String from, BigDecimal exchangeValue, String environment) {
		super();
		this.id = id;
		this.to = to;
		this.from = from;
		this.exchangeValue = exchangeValue;
		this.environment = environment;
	}

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getTo() {
		return to;
	}

	public void setTo(String to) {
		this.to = to;
	}

	public String getFrom() {
		return from;
	}

	public void setFrom(String from) {
		this.from = from;
	}

	public BigDecimal getexchangeValue() {
		return exchangeValue;
	}

	public void setexchangeValue(BigDecimal exchangeValue) {
		this.exchangeValue = exchangeValue;
	}

	public String getEnvironment() {
		return environment;
	}

	public void setEnvironment(String environment) {
		this.environment = environment;
	}

	@Override
	public String toString() {
		return "CurrencyExchange [id=" + id + ", to=" + to + ", from=" + from + ", exchangeValue=" + exchangeValue
				+ ", environment=" + environment + "]";
	}

}
