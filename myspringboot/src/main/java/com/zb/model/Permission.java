package com.zb.model;

import java.io.Serializable;
import java.util.Date;
import lombok.Getter;
import lombok.Setter;

@Setter
@Getter
public class Permission implements Serializable {
    private Integer id;

    private String permissionname;

    private String resourcetype;

    private String url;

    private String permission;

    private String status;

    private Date createTime;

    private Date updateTime;
}