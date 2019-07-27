package br.com.newbietrader.codec;

import java.math.BigDecimal;


import org.bson.BsonReader;
import org.bson.BsonValue;
import org.bson.BsonWriter;
import org.bson.Document;
import org.bson.codecs.Codec;
import org.bson.codecs.CollectibleCodec;
import org.bson.codecs.DecoderContext;
import org.bson.codecs.EncoderContext;

import com.mongodb.MongoClient;

import br.com.newbietrader.dto.StockvalueDTO;

public class StockValueDTOCodec implements CollectibleCodec<StockvalueDTO>{
	 private final Codec<Document> documentCodec;

	    public StockValueDTOCodec() {
	        this.documentCodec = MongoClient.getDefaultCodecRegistry().get(Document.class);
	    }
		@Override
		public void encode(BsonWriter writer, StockvalueDTO valueDTO, EncoderContext encoderContext) {
	        Document doc = new Document();
	        doc.put("start", valueDTO.getStatr());
	        doc.put("end", valueDTO.getEnd());

	        documentCodec.encode(writer, doc, encoderContext);
		}

		@Override
		public Class<StockvalueDTO> getEncoderClass() {
			// TODO Auto-generated method stub
			return StockvalueDTO.class;
		}

		@Override
		public StockvalueDTO decode(BsonReader reader, DecoderContext decoderContext) {
			Document doc = documentCodec.decode(reader, decoderContext);
	        StockvalueDTO valueDTO = new StockvalueDTO();
	        valueDTO.setEnd(BigDecimal.valueOf(doc.getDouble("end")));
			valueDTO.setStart(BigDecimal.valueOf(doc.getDouble("start")));

	        return valueDTO;
		}
		@Override
		public StockvalueDTO generateIdIfAbsentFromDocument(StockvalueDTO document) {
			// TODO Auto-generated method stub
			return null;
		}
		@Override
		public boolean documentHasId(StockvalueDTO document) {
			// TODO Auto-generated method stub
			return false;
		}
		@Override
		public BsonValue getDocumentId(StockvalueDTO document) {
			// TODO Auto-generated method stub
			return null;
		}

}
