package com.zhangtao.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartServer2 {
    public static void main(String[] args) {
        System.out.println("eureka服务2已启动");
        SpringApplication.run(StartServer2.class);
    }
}
