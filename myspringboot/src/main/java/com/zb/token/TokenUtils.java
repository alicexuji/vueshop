package com.zb.token;

import com.zb.model.User;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class TokenUtils {

    private static final Map<String, User> TOKEN_MAP = new ConcurrentHashMap<>(10);

    public static void addToken(String key, User value) {
        TOKEN_MAP.putIfAbsent(key, value);
    }

    public static User getToken(String key) {
        return TOKEN_MAP.get(key);
    }

}
