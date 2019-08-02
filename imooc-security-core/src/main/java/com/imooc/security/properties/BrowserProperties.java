package com.imooc.security.properties;

import lombok.Data;

@Data
public class BrowserProperties {
    private String loginPage="/imooc-signIn.html";
    private LoginType loginType =LoginType.JSON;
    private int rememberMeSeconds = 3600;
}
