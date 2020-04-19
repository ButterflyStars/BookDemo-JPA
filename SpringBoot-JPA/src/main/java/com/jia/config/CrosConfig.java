package com.jia.config;

import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.CorsRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

/**
 * Created with IntelliJ IDEA.
 * 跨域配置
 * @Author: ButterflyStars
 * @DateTime: 2020/4/16 2:05
 * Description: No Description
 */
@Configuration
public class CrosConfig implements WebMvcConfigurer {
    @Override
    public void addCorsMappings(CorsRegistry registry) {
        registry.addMapping("/**")      //允许跨域访问的路径
        .allowedOrigins("*")        //允许跨域访问的源
        .allowedMethods("GET","POST", "PUT", "OPTIONS","DELETE")     // 允许请求方法
        .allowCredentials(true)     // 是否发送cookie
        .maxAge(5000)       // 最大间隔时间
        .allowedHeaders("*");       // 允许头部设置
    }
}
