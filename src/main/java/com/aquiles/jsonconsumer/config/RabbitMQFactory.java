package com.aquiles.jsonconsumer.config;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.Connection;
import com.rabbitmq.client.ConnectionFactory;
import org.springframework.stereotype.Service;

@Service
public class RabbitMQFactory {

    private ConnectionFactory factory;

    public Channel getConnection() throws Exception{
        factory.setHost("localhost");
        factory.setUsername("guest");
        factory.setPassword("guest");
        try (Connection connection = factory.newConnection(); Channel channel = connection.createChannel()){
            return channel;
        }
    }

}
