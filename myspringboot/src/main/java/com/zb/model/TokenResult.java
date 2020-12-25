package com.zb.model;

import java.io.Serializable;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 14:07
 */
public class TokenResult implements Serializable {

    private static final long serialVersionUID = -4242865174080706499L;
    private String tokenHead = "Bearer ";
    private String token;

    public TokenResult(String token) {
        this.token = token;
    }

    public String getTokenHead() {
        return tokenHead;
    }

    public void setTokenHead(String tokenHead) {
        this.tokenHead = tokenHead;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }
}
