package com.asesoftware.semilla.ejercicio.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.asesoftware.semilla.ejercicio.dto.ComercioDTO;
import com.asesoftware.semilla.ejercicio.entity.ComercioEntity;


@Mapper(componentModel = "spring")
public interface IComercioMapper {
	
	public ComercioEntity dtoToEntity(ComercioDTO comercioDTO);
	
	public ComercioDTO entityToDto(ComercioEntity comercioEntity);
	
	public List<ComercioDTO> listEntityToDto(List<ComercioEntity> comercioEntity);
	
	public List<ComercioEntity> listdtoToEntity(List<ComercioDTO> comercioDTO);

}
