package com.caito.gestionusuarios.dtos;

import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

@AllArgsConstructor
@NoArgsConstructor
@Data
public class PermissionsListDTO {

    private Long permissionId;
    private String name;
}
