package com.around.me.authentication;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.client.circuitbreaker.EnableCircuitBreaker;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.hystrix.EnableHystrix;
import org.springframework.data.jpa.repository.config.EnableJpaRepositories;

@EnableEurekaClient // eureka client
@EnableCircuitBreaker // hystrix
@EnableHystrix // hystrix
@EnableJpaRepositories
@SpringBootApplication
public class AroundMeAuthenticationApplication {

    public static void main(String[] args) {
        SpringApplication.run(AroundMeAuthenticationApplication.class, args);
    }

}
