package br.com.newbietrader.service;
import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.List;
import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockvalueDTO;
import br.com.newbietrader.repository.StockRepository;
@ApplicationScoped
public class StockService {
	@Inject
	private StockRepository stockRepository;
	
	public List<StockDTO> findAll(){
		return  stockRepository.findAll();
	}
	
}
