package com.kamaathedj.Messanging.controller;

import com.kamaathedj.Messanging.model.Message;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.TopicExchange;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class MessageController {

    @Autowired
    private RabbitTemplate rabbitTemplate;

    @Autowired
    private FanoutExchange exchange;

    @PostMapping("/post")
    public String getPost(@RequestBody Message message){
        rabbitTemplate.convertAndSend(exchange.getName(),"",message);
        return "Message sent successfully";
    }
}
