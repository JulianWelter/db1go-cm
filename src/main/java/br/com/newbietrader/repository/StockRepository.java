package br.com.newbietrader.repository;

import java.math.BigDecimal;
import java.time.LocalDate;
import java.util.LinkedList;
import java.util.List;

import javax.enterprise.context.ApplicationScoped;
import javax.inject.Inject;

import org.bson.Document;

import com.mongodb.MongoClient;
import com.mongodb.client.MongoCollection;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockvalueDTO;
import java.time.ZoneId;


@ApplicationScoped
public class StockRepository {
	@Inject
	private MongoClient mongoClient;

	public List<StockDTO> findAll() {
		MongoCollection<StockDTO> collection = getColletion();
		List<StockDTO> result = new LinkedList<StockDTO>();
		for (StockDTO dto : collection.find()) {
			result.add(dto);
			/*
;			StockDTO dto= new StockDTO();
			dto.setName(doc.getString("name"));
//			DATE
			dto.setDate(LocalDate.parse(doc.getString("date")));
//			dto.setDate(doc.getDate("date").toInstant().atZone(ZoneId.systemDefault()).toLocalDate());
			
		
//			VALUE
			StockvalueDTO value= new StockvalueDTO();
			Document doc2 = new Document();
			doc2.get("value", Document.class);
			BigDecimal start =new BigDecimal(doc2.getString("start"));
			BigDecimal end =new BigDecimal(doc2.getString("end"));
//			value.setEnd(BigDecimal.valueOf(doc2.getDouble("end")));
//			value.setStart(BigDecimal.valueOf(doc2.getDouble("start")));

			value.setStart(start);
			value.setEnd(end);
			dto.setValue(value);
			result.add(dto);*/
		}
		return result;
	}
	private MongoCollection<StockDTO> getColletion() {
		return mongoClient.getDatabase("db1go").getCollection("stocks", StockDTO.class);
	}
}
