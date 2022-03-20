package cybersoft.javabackend.java16gira.role.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import cybersoft.javabackend.java16gira.role.dto.GiraGroupDTO;
import cybersoft.javabackend.java16gira.role.dto.GiraRoleDTO;
import cybersoft.javabackend.java16gira.role.mapper.GiraGroupMapper;
import cybersoft.javabackend.java16gira.role.mapper.GiraRoleMapper;
import cybersoft.javabackend.java16gira.role.model.GiraGroup;
import cybersoft.javabackend.java16gira.role.model.GiraRole;
import cybersoft.javabackend.java16gira.role.repository.GiraRoleRepository;

@Service
public class GiraRoleServiceImpl implements GiraRoleService {
	@Autowired
	private GiraRoleRepository repository;

	@Override
	public List<GiraRole> findAllEntity() {
		return repository.findAll();
	}

	@Override
	public GiraRole save(GiraRoleDTO dto) {
		// map dto to entity
		GiraRole role = GiraRoleMapper.INSTANCE.mapToEntity(dto);
		return repository.save(role);
	}

	@Override
	public List<GiraRoleDTO> findAllDto() {
		// TODO Auto-generated method stub
		List<GiraRole> groups = repository.findAll();
		List<GiraRoleDTO> dtos = groups.stream()
				.map(t -> GiraRoleMapper.INSTANCE.toDTO(t))
				.collect(Collectors.toList());
		return dtos;
	}

}
