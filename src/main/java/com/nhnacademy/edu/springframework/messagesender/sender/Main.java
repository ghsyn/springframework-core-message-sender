package com.nhnacademy.edu.springframework.messagesender.sender;

import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Main {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context =
                new AnnotationConfigApplicationContext("com.nhnacademy.edu.springframework.messagesender.config");

        MessageSendService messageSendService = context.getBean("messageSendService", MessageSendService.class);
        messageSendService.doSendMessage();
        context.getBean("smsMessageSender", SmsMessageSender.class).init();

        context.close();
    }
}