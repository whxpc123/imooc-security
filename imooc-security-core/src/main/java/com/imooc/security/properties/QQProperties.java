package com.imooc.security.properties;

import lombok.Data;
import org.springframework.boot.autoconfigure.social.SocialProperties;

@Data
public class QQProperties extends SocialProperties {

    private String providerId = "qq"; //服务提供商id

}
