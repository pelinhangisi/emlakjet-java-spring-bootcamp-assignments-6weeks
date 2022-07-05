package com.pelinhangisi.advertisementservice;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class AdvertisementServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(AdvertisementServiceApplication.class, args);
    }

}
