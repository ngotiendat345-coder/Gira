package cybersoft.javabackend.java16gira.role.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import cybersoft.javabackend.java16gira.role.model.GiraRole;

@Repository
public interface GiraRoleRepository extends JpaRepository<GiraRole, UUID> {
	
}
