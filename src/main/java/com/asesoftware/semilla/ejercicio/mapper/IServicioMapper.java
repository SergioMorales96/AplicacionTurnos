package com.asesoftware.semilla.ejercicio.mapper;

import java.util.List;
import org.mapstruct.Mapper;
import com.asesoftware.semilla.ejercicio.dto.ServicioDTO;
import com.asesoftware.semilla.ejercicio.entity.ServicioEntity;

@Mapper(componentModel = "spring")
public interface IServicioMapper {
	
	public ServicioEntity dtoToEntity(ServicioDTO servicioDTO);
	
	public ServicioDTO entityTODto(ServicioEntity servicioEntity);
	
	public List<ServicioDTO> listEntityToDto(List<ServicioEntity> servicioEntity);
	
	public List<ServicioEntity> listdtoToEntity(List<ServicioDTO> servicioDTO);

}
