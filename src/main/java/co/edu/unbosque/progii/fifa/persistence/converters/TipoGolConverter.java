package co.edu.unbosque.progii.fifa.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import co.edu.unbosque.progii.fifa.enums.TipoGol;

@Converter(autoApply=true)
public class TipoGolConverter implements AttributeConverter<TipoGol, Integer>{

	@Override
	public Integer convertToDatabaseColumn(TipoGol tipoGol) {

		return tipoGol.getId();
	}

	@Override
	public TipoGol convertToEntityAttribute(Integer idTipoGol) {

		return TipoGol.getById(idTipoGol);
	}

}
