package com.pelinhangisi.rabbitmqpublisher;

import org.springframework.amqp.rabbit.annotation.EnableRabbit;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
@EnableRabbit
public class RabbitMqPublisherApplication {

    public static void main(String[] args) {
        SpringApplication.run(RabbitMqPublisherApplication.class, args);
    }

}
