package com.around.me.authentication.core.support;

import org.springframework.boot.context.properties.ConfigurationProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.stereotype.Component;

import java.util.HashMap;

@Component
@EnableConfigurationProperties
@ConfigurationProperties(prefix = "jwt")
public class JwtTokenKey {

    private HashMap<String, String> token;

    public String getTokenKey(String name) {
        return token.get(name);
    }

    public void setTokenKey(HashMap<String, String> token) {
        this.token = token;
    }
}
