/**
 * @title:  跨域配置工具类.java
 * @author: JH
 * @creatAt: 2020/11/4 3:00
 * @modify: 
 * @description: 
 * @version: 1.0
 */
package com.jh.company.util;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.cors.CorsConfiguration;
import org.springframework.web.cors.UrlBasedCorsConfigurationSource;
import org.springframework.web.filter.CorsFilter;

/**
 * @description: 跨域配置工具类
 * @author: JH
 * @version: 1.0
 * @date: 2020/11/4 3:01
 */
@Configuration
public class CrosOriginUtils {
    
    @Bean
    public CorsFilter corsFilter() {
        //1. 添加cros配置信息
        CorsConfiguration corsConfig = new CorsConfiguration();
        //放行那些原始域
        corsConfig.addAllowedOrigin("*");
        //是否发送cookie信息
        corsConfig.setAllowCredentials(true);
        //放行那些原始域（请求方式）
        corsConfig.addAllowedMethod("*");
        //放行那些原始域（头部信息）
        corsConfig.addAllowedHeader("*");
        //暴露哪些头部信息（因为跨域访问默认不能获取全部头部信息）
        corsConfig.addExposedHeader("tokenq");
        
        //2. 添加映射路径
        UrlBasedCorsConfigurationSource configSource = new UrlBasedCorsConfigurationSource();
        configSource.registerCorsConfiguration("/**", corsConfig);
        
        //3. 返回新的CrosFilter
        return new CorsFilter(configSource);
    }
}
