package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.ImportResource;

@Configuration
public class MainConfig {

    private final MessageSenderConfig messageSenderConfig;

    public MainConfig(MessageSenderConfig messageSenderConfig) {
        this.messageSenderConfig = messageSenderConfig;
    }

    @Bean
    public MessageSendService messageSendService() {
        return new MessageSendService(messageSenderConfig.smsMessageSender());
    }
}