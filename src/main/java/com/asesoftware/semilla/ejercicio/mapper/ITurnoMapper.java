package com.asesoftware.semilla.ejercicio.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.asesoftware.semilla.ejercicio.dto.TurnoDTO;
import com.asesoftware.semilla.ejercicio.entity.TurnoEntity;


@Mapper(componentModel = "spring")
public interface ITurnoMapper {
	
	public TurnoEntity dtoToEntity(TurnoDTO turnoDTO);
	
	public TurnoDTO entityToDto(TurnoEntity turnoEntity);
	
	public List<TurnoDTO> listEntityToDto(List<TurnoEntity> turnoEntity);
	
	public List<TurnoEntity> listDtoToEntity(List<TurnoDTO> turnoDTO);

}
