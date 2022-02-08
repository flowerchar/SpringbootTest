package com.flowerchar;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@MapperScan("com.flowerchar.mapper")
@SpringBootApplication
public class SampleWebsiteApplication {

    public static void main(String[] args) {
        SpringApplication.run(SampleWebsiteApplication.class, args);
    }

}
