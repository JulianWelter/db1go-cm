package br.com.newbietrader.entity;

import java.math.BigDecimal;

public class StockValue {
	BigDecimal start;
	BigDecimal end;
	public void setStart(BigDecimal start) {
		this.start = start;
	}
	public void setEnd(BigDecimal end) {
		this.end = end;
	}
	public BigDecimal getStart() {
		return start;
	}
	public BigDecimal getEnd() {
		return end;
	}
}
