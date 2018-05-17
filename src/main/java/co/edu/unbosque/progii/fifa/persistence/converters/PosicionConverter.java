package co.edu.unbosque.progii.fifa.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import co.edu.unbosque.progii.fifa.enums.Posicion;

@Converter(autoApply=true)
public class PosicionConverter implements AttributeConverter<Posicion, Integer>{

	@Override
	public Integer convertToDatabaseColumn(Posicion posicion) {
		
		return posicion.getId();
	}

	@Override
	public Posicion convertToEntityAttribute(Integer idPosicion) {
		
		return Posicion.getById(idPosicion);
	}

}
