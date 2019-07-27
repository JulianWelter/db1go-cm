package br.com.newbietrader.dto;

import java.math.BigDecimal;

public class StockvalueDTO {
	private BigDecimal start;
	private BigDecimal end;
	public BigDecimal getStatr() {
		return start;
	}
	public void setStart(BigDecimal start) {
		this.start = start;
	}
	public BigDecimal getEnd() {
		return end;
	}
	public void setEnd(BigDecimal end) {
		this.end = end;
	}
	
}
