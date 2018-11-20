package com.orion.bootueurekaserver;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.server.EnableEurekaServer;

@SpringBootApplication
@EnableEurekaServer
public class BootuEurekaServerApplication {

    public static void main(String[] args) {
        SpringApplication.run(BootuEurekaServerApplication.class, args);
    }
}
