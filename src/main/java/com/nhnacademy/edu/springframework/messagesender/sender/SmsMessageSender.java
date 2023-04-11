package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.annotation.Bean;
import org.springframework.stereotype.Component;

@Component("smsMessageSender")
public class SmsMessageSender implements MessageSender {


    public SmsMessageSender() {
        System.out.println("Create SMS MessageSender");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private void init() {
        System.out.println("INIT method called in SmsMessageSender");
    }

    private void destroy() {
        System.out.println("DESTROY method called in SmsMessageSender");
    }
}
