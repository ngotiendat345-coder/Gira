package cybersoft.javabackend.java16gira.role.dto;

import java.util.UUID;

import javax.validation.constraints.NotBlank;
import javax.validation.constraints.Size;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class GiraGroupDTO {
	private UUID id;
	@Size(min = 5, max = 32, message = "Role Group must be 5 characters.")
	private String code;
	
	@NotBlank(message = "Description must be not blank.")
	private String description;
}
