package com.zb.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class RolePermission {
    private Integer id;

    private String roleId;

    private String permissionId;

}