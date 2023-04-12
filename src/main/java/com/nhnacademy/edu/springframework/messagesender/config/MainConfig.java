package com.nhnacademy.edu.springframework.messagesender.config;

import com.nhnacademy.edu.springframework.messagesender.sender.EmailMessageSender;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSendService;
import com.nhnacademy.edu.springframework.messagesender.sender.MessageSender;
import com.nhnacademy.edu.springframework.messagesender.sender.SmsMessageSender;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.context.annotation.*;

@Configuration
@ComponentScan(basePackages = {"com.nhnacademy.edu.springframework.messagesender.sender", "com.nhnacademy.edu.springframework.messagesender.aop"})
@PropertySource(value = "classpath:/name.properties", encoding = "UTF-8")
@EnableAspectJAutoProxy(proxyTargetClass = true)
public class MainConfig {

}