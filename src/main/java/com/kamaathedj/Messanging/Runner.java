//package com.kamaathedj.Messanging;
//
//import org.springframework.amqp.rabbit.core.RabbitTemplate;
//import org.springframework.boot.CommandLineRunner;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.TimeUnit;
//@Component
//public class Runner implements CommandLineRunner {
//    private final RabbitTemplate rabbitTemplate;
//    private final Receiver receiver;
//
//    public Runner(RabbitTemplate rabbitTemplate, Receiver receiver) {
//        this.rabbitTemplate = rabbitTemplate;
//        this.receiver = receiver;
//    }
//
//    @Override
//    public void run(String... args) throws Exception {
//        System.out.println("sending message");
//
//        rabbitTemplate.convertAndSend(MessagingApplication.topicExchangeName,"foo.bar.baz","Hello from rabbitmq");
//        receiver.getLatch().await(10000, TimeUnit.MILLISECONDS);
//
//    }
//}
