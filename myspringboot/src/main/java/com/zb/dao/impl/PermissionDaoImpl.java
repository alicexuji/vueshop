package com.zb.dao.impl;

import com.zb.dao.PermissionDao;
import com.zb.mapper.PermissionMapper;
import com.zb.model.Permission;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.List;


@Component
public class PermissionDaoImpl implements PermissionDao {
    @Autowired
    private PermissionMapper permissionMapper;

    @Override
    public List<Permission> selectPermissionIdByRoleId(int roleId) {
        return permissionMapper.selectPermissionIdByRoleId(roleId);
    }
}
