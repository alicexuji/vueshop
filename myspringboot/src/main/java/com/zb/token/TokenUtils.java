package com.zb.token;

import com.zb.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

/**
 * @Author: zhenwei.xu
 * @Date: 2020/12/7 17:42
 */
public class TokenUtils {

    private static final Map<String, User> TOKEN_MAP = new ConcurrentHashMap<>(10);

    public static void addToken(String key, User value) {
        TOKEN_MAP.putIfAbsent(key, value);
    }

    public static User getToken(String key) {
        return TOKEN_MAP.get(key);
    }

}
