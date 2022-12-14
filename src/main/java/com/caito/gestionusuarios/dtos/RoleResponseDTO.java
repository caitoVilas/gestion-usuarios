package com.caito.gestionusuarios.dtos;


import com.caito.gestionusuarios.entity.Permission;
import io.swagger.v3.oas.annotations.media.Schema;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Set;


@AllArgsConstructor
@NoArgsConstructor
@Data
@Schema(name = "RoleResponseDTO", description = "Modelo que representa un rol para una respuesta")
public class RoleResponseDTO {

    @Schema(name = "roleId", example = "1")
    private Long roleId;
    @Schema(name = "name", example = "ADMIN")
    private String name;
    private Set<PermissionResponseDTO> permissions;
}
