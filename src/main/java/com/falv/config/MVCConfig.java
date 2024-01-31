package com.falv.config;

import org.mybatis.spring.SqlSessionFactoryBean;
import org.mybatis.spring.mapper.MapperScannerConfigurer;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.InterceptorRegistry;
import org.springframework.web.servlet.config.annotation.ViewControllerRegistry;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurer;

import javax.sql.DataSource;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;


@Configuration
public class MVCConfig implements WebMvcConfigurer {

    @Override
    public void addViewControllers(ViewControllerRegistry registry) {
        registry.addViewController("/").setViewName("index");
        registry.addViewController("/index.html").setViewName("index");
        registry.addViewController("/re").setViewName("re");
        registry.addViewController("/body/index").setViewName("body/index");
        registry.addViewController("/console/index").setViewName("console/index");

    }


//    @Bean
//    public MapperScannerConfigurer getMapperScannerConfigurer(){
//        MapperScannerConfigurer msc = new MapperScannerConfigurer();
//        msc.setBasePackage("com.falv");
//        return msc;
//    }

//    @Bean
//    public SqlSessionFactoryBean getSqlSessionFactoryBean(DataSource dataSource){
//        SqlSessionFactoryBean ssfb = new SqlSessionFactoryBean();
//        ssfb.setTypeAliasesPackage("com.falv");
//        ssfb.setDataSource(dataSource);
//        return ssfb;
//    }


    @Override
    public void addInterceptors(InterceptorRegistry registry) {
        List<String> excludeList;
        //这里一定要放行登录和注册 页面 和 相关请求
        excludeList= Arrays.asList(
                "/index.html","/",
                "/re","/tologin","/register",
                //释放静态资源
                "/assets/**","/html/**","/img/**","/css/**"
        );
        registry.addInterceptor(new LoginHandlerInterceptor())
                .addPathPatterns("/**")

                .excludePathPatterns(excludeList);
    }
}
