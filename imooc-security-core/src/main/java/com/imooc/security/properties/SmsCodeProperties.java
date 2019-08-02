package com.imooc.security.properties;

import lombok.Data;

@Data
public class SmsCodeProperties {

    /**
     * 验证码长度
     */
    private int length = 6;
    /**
     * 过期时间
     */
    private int expireTime = 60;
    /**
     * 要拦截的url，多个url用逗号隔开，ant pattern
     */
    private String url;

}
