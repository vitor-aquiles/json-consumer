package com.aquiles.jsonconsumer.config;

import com.rabbitmq.client.Channel;
import com.rabbitmq.client.DeliverCallback;
import org.springframework.beans.factory.annotation.Autowired;

public class RabbitMQReceiver {

    private static final String QUEUE_NAME = "hello";

    @Autowired
    private RabbitMQFactory factory;

    public void receive(){
        try (Channel channel = factory.getConnection()){
            channel.queueDeclare(QUEUE_NAME, false, false, false, null);
            System.out.println(" [*] Waiting for messages. To exit press CTRL+C");
            DeliverCallback deliverCallback = (consumerTag, delivery) -> {
                String message = new String(delivery.getBody(), "UTF-8");
                System.out.println(" [x] Received '" + message + "'");
            };
            channel.basicConsume(QUEUE_NAME, true, deliverCallback, consumerTag -> { });
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}