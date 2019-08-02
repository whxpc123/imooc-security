package com.imooc.security.web.config;


import com.imooc.security.web.filter.TimeFilter;
import com.imooc.security.web.interceptor.TimeInterceptor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.web.servlet.FilterRegistrationBean;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;

import java.util.Arrays;
import java.util.List;

//@Configuration
public class WebConfig extends WebMvcConfigurerAdapter {

    @Autowired
    private TimeInterceptor timeInterceptor;


    @Override
    public void addInterceptors(InterceptorRegistry registry){
        registry.addInterceptor(timeInterceptor);
    }

    @Bean
    public FilterRegistrationBean timeFilter(){
        FilterRegistrationBean filterRegistration = new FilterRegistrationBean();
        /** 注册过滤器 */
        TimeFilter timeFilter = new TimeFilter();
        filterRegistration.setFilter(timeFilter);
        /** 拦截的路径 */
        List<String> list = Arrays.asList("/user", "/*");
        filterRegistration.setUrlPatterns(list);
        return filterRegistration;

    }
}
