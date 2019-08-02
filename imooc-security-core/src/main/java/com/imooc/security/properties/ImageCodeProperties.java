package com.imooc.security.properties;

import lombok.Data;

@Data
public class ImageCodeProperties {
    private int width = 67; //宽
    private int height =30;  //长
    private int length =4;  //验证码长度
    private int expireTime = 60; //验证码过期时间
    private String url; //需要验证码验证路径
}
