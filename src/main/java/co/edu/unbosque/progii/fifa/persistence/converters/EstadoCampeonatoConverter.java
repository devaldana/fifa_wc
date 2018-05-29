package co.edu.unbosque.progii.fifa.persistence.converters;

import javax.persistence.AttributeConverter;
import javax.persistence.Converter;

import co.edu.unbosque.progii.fifa.enums.EstadoCampeonato;

@Converter(autoApply=true)
public class EstadoCampeonatoConverter implements AttributeConverter<EstadoCampeonato, Integer> {

	@Override
	public Integer convertToDatabaseColumn(EstadoCampeonato estado) {

		return estado.getId();
	}

	@Override
	public EstadoCampeonato convertToEntityAttribute(Integer idEstado) {

		return EstadoCampeonato.getById(idEstado);
	}
}