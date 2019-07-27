package br.com.newbietrader.codec;

import org.bson.codecs.Codec;
import org.bson.codecs.configuration.CodecProvider;
import org.bson.codecs.configuration.CodecRegistry;

import br.com.newbietrader.dto.StockDTO;
import br.com.newbietrader.dto.StockvalueDTO;

public class StockDTOCodecProvider implements CodecProvider{
	@Override
    public <T> Codec<T> get(Class<T> clazz, CodecRegistry registry) {
        if (clazz == StockDTO.class) {
            return (Codec<T>) new StockDTOCodec();
        }
        if (clazz == StockvalueDTO.class) {
            return (Codec<T>) new StockValueDTOCodec();
        }
        return null;
    }

}
