package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;

public class EmailMessageSender implements MessageSender {

    public EmailMessageSender() {
        System.out.println("Create Email MessageSender");
    }

    @Override
    public void sendMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }

    private void init() {
        System.out.println("INIT method called in EmailMessageSender");
    }

    private void destroy() {
        System.out.println("DESTORY method called in EmailMessageSender");
    }
}
