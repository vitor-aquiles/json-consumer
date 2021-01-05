package com.aquiles.jsonconsumer;


import com.aquiles.jsonconsumer.config.RabbitMQReceiver;
import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class Application extends SpringApplication {

    public static void main(String[] args) throws Exception{
        RabbitMQReceiver receiver = new RabbitMQReceiver();
        receiver.receive();
        SpringApplication.run(Application.class, args);

    }
}
