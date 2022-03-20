package cybersoft.javabackend.java16gira.role.repository;

import java.util.UUID;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;
import cybersoft.javabackend.java16gira.role.model.*;

@Repository
public interface GiraGroupReponsitory extends JpaRepository<GiraGroup, UUID> {

}
