package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.ElapsedTimeLog;
import org.springframework.stereotype.Component;

@Component("smsMessageSender")
public class SmsMessageSender implements MessageSender {


    public SmsMessageSender() {
        System.out.println("Create SMS MessageSender");
    }

    @Override
    @ElapsedTimeLog
    public void sendMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    @ElapsedTimeLog
    void init() {
        System.out.println("INIT method called in SmsMessageSender");
    }

    private void destroy() {
        System.out.println("DESTROY method called in SmsMessageSender");
    }
}
