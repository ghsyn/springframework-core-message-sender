package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("Email MessageSender initiated!!");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }

    private void init() {
        System.out.println("init method called in EmailMessageSender");
    }

    private void destroy() {
        System.out.println("destroy called in EmailMessageSender");
    }
}
