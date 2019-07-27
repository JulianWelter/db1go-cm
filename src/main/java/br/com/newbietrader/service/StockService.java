package br.com.newbietrader.service;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockvalueDTO;
@ApplicationScoped
public class StockService {
	private List<StockDTO> datebase= new ArrayList<>();
	
	public StockService() {
		StockvalueDTO valueDTO = new StockvalueDTO();
		valueDTO.setStart(BigDecimal.ONE);
		valueDTO.setEnd(BigDecimal.TEN);
		
		StockDTO dto = new StockDTO();
		dto.setDate(LocalDate.now());
		dto.setName("PETR4");
		dto.setValue(valueDTO);
		datebase.add(dto);
	}
	
	public List<StockDTO> findAll(){
		return  datebase;
	}
	
}
