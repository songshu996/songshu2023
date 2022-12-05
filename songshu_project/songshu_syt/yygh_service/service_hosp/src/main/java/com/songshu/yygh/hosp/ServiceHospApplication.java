package com.songshu.yygh.hosp;

import com.songshu.yygh.confg.Swagger2Config;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.ComponentScan;


@SpringBootApplication
@ComponentScan(basePackages = "com.songshu")
public class ServiceHospApplication {

    public static void main(String[] args) {
        Class<Swagger2Config> swagger2ConfigClass = Swagger2Config.class;
        SpringApplication.run(ServiceHospApplication.class, args);
    }
}
