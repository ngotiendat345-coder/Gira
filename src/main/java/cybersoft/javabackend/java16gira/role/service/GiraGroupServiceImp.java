package cybersoft.javabackend.java16gira.role.service;

import java.util.List;
import java.util.UUID;
import java.util.stream.Collectors;

import javax.persistence.EntityNotFoundException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16gira.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16gira.role.dto.GiraGroupWithRolesDTO;
import cybersoft.javabackend.java16gira.role.mapper.GiraGroupMapper;
import cybersoft.javabackend.java16gira.role.model.GiraGroup;
import cybersoft.javabackend.java16gira.role.model.GiraRole;
import cybersoft.javabackend.java16gira.role.repository.GiraGroupReponsitory;
import cybersoft.javabackend.java16gira.role.repository.GiraRoleRepository;

@Service
public class GiraGroupServiceImp implements GiraGroupService {
	@Override
	public GiraGroupWithRolesDTO removeRole(String groupId, String roleId) {
		// TODO Auto-generated method stub
		return null;
	}

	@Autowired
	private GiraGroupReponsitory repository;
	@Autowired
	private GiraRoleRepository roleReponsitory;
	@Override
	public List<GiraGroupDTO> findAllDto() {
		// TODO Auto-generated method stub
		List<GiraGroup> groups = repository.findAll();
		List<GiraGroupDTO> dtos = groups.stream()
				.map(t -> GiraGroupMapper.INSTANCE.toDTO(t))
				.collect(Collectors.toList());
		return dtos;
	}

	@Override
	public GiraGroupWithRolesDTO addRole(String groupId, String roleId) {
		GiraGroup group;
		GiraRole role;
		try {
			role = roleReponsitory.getById(UUID.fromString(roleId));
			group = repository.getById(UUID.fromString(groupId));
		} catch(EntityNotFoundException ex) {
			return null;
		}
		group.addRole(role);
		GiraGroup modifiedGroup = repository.save(group);
		GiraGroupWithRolesDTO dto = GiraGroupMapper.INSTANCE.toDTOWithRole(modifiedGroup);
		return dto;
	}

	@Override
	public GiraGroupDTO createNewGroup(GiraGroupDTO dto) {
		// TODO Auto-generated method stub
		GiraGroup group = GiraGroupMapper.INSTANCE.toModal(dto);
		GiraGroup newGroup = repository.save(group);
		
		return GiraGroupMapper.INSTANCE.toDTO(newGroup);
	}
	
}
