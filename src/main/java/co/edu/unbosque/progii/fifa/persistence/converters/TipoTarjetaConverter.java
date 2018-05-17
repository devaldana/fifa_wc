package co.edu.unbosque.progii.fifa.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import co.edu.unbosque.progii.fifa.enums.TipoTarjeta;

@Converter(autoApply=true)
public class TipoTarjetaConverter implements AttributeConverter<TipoTarjeta, Integer>{

	@Override
	public Integer convertToDatabaseColumn(TipoTarjeta tipoTarjeta) {

		return tipoTarjeta.getId();
	}

	@Override
	public TipoTarjeta convertToEntityAttribute(Integer idTipoTarjeta) {

		return TipoTarjeta.getById(idTipoTarjeta);
	}
}