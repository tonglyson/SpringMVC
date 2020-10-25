package com.java.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.context.annotation.Configuration;
import org.springframework.web.servlet.config.annotation.EnableWebMvc;
import org.springframework.web.servlet.config.annotation.WebMvcConfigurerAdapter;
import org.springframework.web.servlet.view.InternalResourceViewResolver;


@Configuration
@ComponentScan({"com.java"})
public class WebConfig extends WebMvcConfigurerAdapter {
//    @Bean
//        public InternalResourceViewResolver internalResourceViewResolver(){
//            InternalResourceViewResolver vr = new InternalResourceViewResolver();
//            vr.setSuffix(".jsp");
//            return vr;
//        }
}
