package com.zb.model;

import lombok.Getter;
import lombok.Setter;

import java.io.Serializable;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 14:07
 */
@Getter
@Setter
public class TokenResult implements Serializable {

    private static final long serialVersionUID = -4242865174080706499L;
    private String tokenHead = "Bearer ";
    private String token;

    public TokenResult(String token) {
        this.token = token;
    }

}
