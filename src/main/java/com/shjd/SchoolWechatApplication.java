package com.shjd;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import tk.mybatis.spring.annotation.MapperScan;

@SpringBootApplication
@MapperScan("com.shjd.mapper")
public class SchoolWechatApplication {

    public static void main(String[] args) {
        SpringApplication.run(SchoolWechatApplication.class, args);
    }
}
