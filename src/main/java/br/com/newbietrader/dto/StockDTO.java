package br.com.newbietrader.dto;

import java.time.LocalDate;

public class StockDTO {
	private String name;
	private LocalDate date;
	private StockvalueDTO value;
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public LocalDate getDate() {
		return date;
	}
	public void setDate(LocalDate date) {
		this.date = date;
	}
	public StockvalueDTO getValue() {
		return value;
	}
	public void setValue(StockvalueDTO value) {
		this.value = value;
	}
	@Override
	public String toString() {
		
		return name + " - " + value;
	}
}
