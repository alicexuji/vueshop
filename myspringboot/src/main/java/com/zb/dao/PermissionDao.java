package com.zb.dao;

import com.zb.model.Permission;

import java.util.List;


public interface PermissionDao {
    List<Permission> selectPermissionIdByRoleId(int roleId);
}
