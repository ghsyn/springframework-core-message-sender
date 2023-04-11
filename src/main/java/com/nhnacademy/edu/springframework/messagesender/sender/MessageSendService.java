package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import com.nhnacademy.edu.springframework.messagesender.annotation.SMS;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.PropertySource;
import org.springframework.stereotype.Component;

@Component("messageSendService")
public class MessageSendService {

    @Value("${name}")
    private String name;

    private final MessageSender messageSender;

    @Autowired
    public MessageSendService(@Qualifier("smsMessageSender") MessageSender messageSender) {
        this.messageSender = messageSender;
    }

    public void doSendMessage() {
        User user = new User("siyeonkim@nhndooray.com", "010-1234-5678");
        messageSender.sendMessage(user, "hello " + name);
    }
}