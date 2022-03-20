package cybersoft.javabackend.java16gira.role.service;

import java.util.List;

import cybersoft.javabackend.java16gira.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16gira.role.dto.GiraGroupWithRolesDTO;

public interface GiraGroupService {
	List<GiraGroupDTO> findAllDto();
	GiraGroupDTO createNewGroup(GiraGroupDTO dto);
	GiraGroupWithRolesDTO addRole(String groupId, String roleId);
	GiraGroupWithRolesDTO removeRole(String groupId, String roleId);
}
