package br.com.newbietrader.codec;

import java.time.LocalDate;

import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.CollectibleCodec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

import com.mongodb.MongoClient;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockvalueDTO;

public class StockDTOCodec implements CollectibleCodec<StockDTO>{
	 private final Codec<Document> documentCodec;

	    public StockDTOCodec() {
	        this.documentCodec = MongoClient.getDefaultCodecRegistry().get(Document.class);
	    }

	@Override
	public void encode(BsonWriter writer, StockDTO dto, EncoderContext encoderContext) {
        Document doc = new Document();
        doc.put("name", dto.getName());
        doc.put("date", dto.getDate());
        doc.put("value", dto.getValue());

        documentCodec.encode(writer, doc, encoderContext);
	}

	@Override
	public Class<StockDTO> getEncoderClass() {
		// TODO Auto-generated method stub
		return StockDTO.class;
	}

	@Override
	public StockDTO decode(BsonReader reader, DecoderContext decoderContext) {
		Document doc = documentCodec.decode(reader, decoderContext);
        StockDTO dto = new StockDTO();
        dto.setName(doc.getString("name"));
        dto.setDate(LocalDate.parse(doc.getString("date")));
        dto.setValue(doc.get("value", StockvalueDTO.class));
        return dto;
	}

	@Override
	public StockDTO generateIdIfAbsentFromDocument(StockDTO document) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public boolean documentHasId(StockDTO document) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public BsonValue getDocumentId(StockDTO document) {
		// TODO Auto-generated method stub
		return null;
	}

}
