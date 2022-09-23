package com.example.web2_userservice1;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;

@SpringBootApplication
@EnableDiscoveryClient
public class Web2Userservice1Application {

    public static void main(String[] args) {
        SpringApplication.run(Web2Userservice1Application.class, args);
    }

}
