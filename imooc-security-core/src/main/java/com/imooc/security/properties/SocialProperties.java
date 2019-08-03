package com.imooc.security.properties;

import lombok.Data;

@Data
public class SocialProperties {

    /**
     * 社交登录功能拦截的url
     */
    private String filterProcessesUrl = "/auth";


    private QQProperties qq = new QQProperties();
}
