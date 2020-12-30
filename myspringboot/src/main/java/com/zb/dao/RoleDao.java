package com.zb.dao;

import com.zb.model.Role;

import java.util.List;


public interface RoleDao {
    List<Role> selectRoleByUserId(int userId);
}
