package com.zhangtao.sc;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class StartServer3 {
    public static void main(String[] args) {
        System.out.println("eureka服务3已启动");
        SpringApplication.run(StartServer3.class);
    }
}
