package cybersoft.javabackend.java16gira.role.service;

import java.util.List;

import cybersoft.javabackend.java16gira.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16gira.role.model.GiraRole;

public interface GiraRoleService {
	List<GiraRole> findAllEntity();
	List<GiraRoleDTO> findAllDto();
	GiraRole save(GiraRoleDTO dto);
}
