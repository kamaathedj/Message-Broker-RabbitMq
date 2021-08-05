package com.kamaathedj.Messanging.controller;

import com.kamaathedj.Messanging.model.Message;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

@Component
public class Consumer {
    @RabbitListener(queues = "queue.all")
    public void getMessage(Message message){
        System.out.println("queue all "+message);
    }
    @RabbitListener(queues = "queue.A")
    public void getMessageFromA(Message message){
        System.out.println("queue A "+message);
    }
    @RabbitListener(queues = "queue.B")
    public void getMessageFromB(Message message){
        System.out.println("queue B "+message);
    }
}
