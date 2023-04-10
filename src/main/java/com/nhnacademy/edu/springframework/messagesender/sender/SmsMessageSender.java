package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;

public class SmsMessageSender implements MessageSender {

    public SmsMessageSender() {
        System.out.println("SMS MessageSender initiated!!");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private void init() {
        System.out.println("init method called in SmsMessageSender");
    }
}
