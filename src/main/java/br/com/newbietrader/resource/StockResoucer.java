package br.com.newbietrader.resource;
import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.service.StockService;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;

@Produces(MediaType.APPLICATION_JSON)
@Path("/stocks")
public class StockResoucer {
	@Inject
	private StockService stockService;
	
	@GET
    public List<StockDTO> findAll() {
        return stockService.findAll();    
        }
}