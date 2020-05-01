package com.lovelybear;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication(scanBasePackages={"com.lovelybear"})
@MapperScan("com.lovelybear.dao")
public class BearApiApplication {

    public static void main(String[] args) {
        SpringApplication.run(BearApiApplication.class, args);
    }

}
