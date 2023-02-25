package com.abacus.servermanager;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@EnableEurekaServer
@SpringBootApplication
public class ServerManagerApplication {

    public static void main(String[] args) {
        SpringApplication.run(ServerManagerApplication.class, args);
    }

}
