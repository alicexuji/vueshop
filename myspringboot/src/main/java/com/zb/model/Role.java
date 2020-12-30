package com.zb.model;

import lombok.Getter;
import lombok.Setter;
import java.io.Serializable;
import java.util.Date;
import java.util.List;

@Getter
@Setter
public class Role implements Serializable {
    private Integer id;

    private String rolename;

    private String description;

    private String status;

    private Date createTime;

    private Date updateTime;

    private List<Permission> permissionList;
}