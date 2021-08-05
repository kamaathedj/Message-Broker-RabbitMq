//package com.kamaathedj.Messanging;
//
//import org.springframework.amqp.rabbit.annotation.RabbitListenerConfigurer;
//import org.springframework.amqp.rabbit.listener.RabbitListenerEndpointRegistrar;
//import org.springframework.context.annotation.Bean;
//import org.springframework.stereotype.Component;
//
//import java.util.concurrent.CountDownLatch;
//
//@Component
//public class Receiver  {
//    private  CountDownLatch countDownLatch = new CountDownLatch(1);
//
//    public void receiveMessage(String message){
//           System.out.println("Received <"+ message+ ">");
//           countDownLatch.countDown();
//
//    }
//    public CountDownLatch getLatch(){
//        return countDownLatch;
//    }
//
//
//}
