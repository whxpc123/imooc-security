package com.imooc.security;

import org.springframework.boot.context.properties.EnableConfigurationProperties;
import com.imooc.security.properties.SecurityProperties;
import org.springframework.context.annotation.Configuration;

@Configuration
@EnableConfigurationProperties(SecurityProperties.class)
public class SecurityConfig {

}
