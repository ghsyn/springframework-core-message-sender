package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;

public class MessageSendService {
    private MessageSender messageSender;

    public MessageSendService() {
    }

    public void setMessageSender(MessageSender messageSender) {
        System.out.println("setMessageSender invoked!");
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("siyeonkim@nhndooray.com", "010-1234-5678");
        messageSender.sendMessage(user, "hello");
    }
}