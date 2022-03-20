package cybersoft.javabackend.java16gira.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16gira.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16gira.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16gira.role.model.GiraGroup;
import cybersoft.javabackend.java16gira.role.model.GiraRole;

@Mapper
public interface GiraRoleMapper {
	GiraRoleMapper INSTANCE = Mappers.getMapper(GiraRoleMapper.class);
	GiraRoleDTO toDTO(GiraRole modal);
	GiraRole mapToEntity(GiraRoleDTO dto);
}
