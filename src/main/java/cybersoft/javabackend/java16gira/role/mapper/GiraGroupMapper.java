package cybersoft.javabackend.java16gira.role.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import cybersoft.javabackend.java16gira.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16gira.role.dto.GiraGroupWithRolesDTO;
import cybersoft.javabackend.java16gira.role.model.GiraGroup;

@Mapper
public interface GiraGroupMapper {
	GiraGroupMapper INSTANCE = Mappers.getMapper(GiraGroupMapper.class);
	GiraGroupDTO toDTO(GiraGroup modal);
	GiraGroup toModal(GiraGroupDTO dto);
	GiraGroupWithRolesDTO toDTOWithRole(GiraGroup modifiedGroup);
}
