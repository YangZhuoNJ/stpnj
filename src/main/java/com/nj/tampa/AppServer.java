package com.nj.tampa;

/**
 * Created by admin on 2016/11/11.
 */

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@MapperScan(basePackages = "com.nj.tempa.mapper")
public class AppServer {

    public static void main(String[] args) {
        SpringApplication.run(AppServer.class, args);
    }
}
