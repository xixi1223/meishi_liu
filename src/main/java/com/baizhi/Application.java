package com.baizhi;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

/**
 * Created by XIXI on 2019/10/31.
 */
@SpringBootApplication
@MapperScan("com.baizhi.dao")
//extends SpringBootServletInitializer
public class Application  {
    public static void main(String[] args) {
        SpringApplication.run(Application.class,args);
    }

    /*@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        return builder.sources(Application.class);
    }*/
}
