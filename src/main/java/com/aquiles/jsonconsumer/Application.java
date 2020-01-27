package com.aquiles.jsonconsumer;


import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application extends SpringApplication {
    private static final String QUEUE_NAME = "hello";

    public static void main(String[] args) throws Exception{
        SpringApplication.run(Application.class, args);
    }
}
