package com.kamaathedj.Messanging.config;

import org.springframework.amqp.core.Binding;
import org.springframework.amqp.core.BindingBuilder;
import org.springframework.amqp.core.FanoutExchange;
import org.springframework.amqp.core.Queue;
import org.springframework.amqp.rabbit.connection.ConnectionFactory;
import org.springframework.amqp.rabbit.core.RabbitTemplate;
import org.springframework.amqp.support.converter.Jackson2JsonMessageConverter;
import org.springframework.amqp.support.converter.MessageConverter;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class RabbitMqConfig {
    @Bean
    Queue QueueA(){
        return new Queue("queue.A");
    }
    @Bean
    Queue QueueB(){
        return new Queue("queue.B");
    }
    @Bean
    Queue QueueAll(){
        return new Queue("queue.all");
    }
    @Bean
    FanoutExchange exchange(){
        return new FanoutExchange("exchange.fanout");
    }
    @Bean
    Binding BindingA(Queue QueueA,FanoutExchange exchange){
        return BindingBuilder.bind(QueueA).to(exchange);
    }
    @Bean
    Binding BindingB(Queue QueueB,FanoutExchange exchange){
        return BindingBuilder.bind(QueueB).to(exchange);
    }
    @Bean
    Binding BindingAll(Queue QueueAll,FanoutExchange exchange){
        return BindingBuilder.bind(QueueAll).to(exchange);
    }

    @Bean
    MessageConverter messageConverter(){
        return new Jackson2JsonMessageConverter();
    }

    @Bean
    RabbitTemplate rabbitTemplate(ConnectionFactory connectionFactory){
        RabbitTemplate rabbitTemplate = new RabbitTemplate(connectionFactory);
        rabbitTemplate.setMessageConverter(messageConverter());
        return rabbitTemplate;
    }

}
