package com.zb.model;

import lombok.Getter;
import lombok.Setter;

import java.util.List;

@Getter
@Setter
public class User extends BaseModel {
    private static final long serialVersionUID = -5038211278154152791L;
    private Integer id;

    private String username;

    private String password;

    private String mobile;

    private String email;

    private String sex;

    private String nickname;

    private String icon;

    private List<Role> roleList;

    private List<Permission> permissionList;

    @Override
    public String toString() {
        return "User{" +
                "id=" + id +
                ", username='" + username + '\'' +
                ", password='" + password + '\'' +
                ", mobile='" + mobile + '\'' +
                ", email='" + email + '\'' +
                ", sex='" + sex + '\'' +
                ", nickname='" + nickname + '\'' +
                '}';
    }
}