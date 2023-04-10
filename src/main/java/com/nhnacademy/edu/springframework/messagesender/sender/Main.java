package com.nhnacademy.edu.springframework.messagesender.sender;

import com.nhnacademy.edu.springframework.messagesender.User;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class Main {
    public static void main(String[] args) {
        try (ClassPathXmlApplicationContext context = new ClassPathXmlApplicationContext("beans.xml")) {

            System.out.println("-----------------------------");

            MessageSender smsMessageSender1 = context.getBean("smsMessageSender", MessageSender.class);
            System.out.println("sms1 - " + smsMessageSender1.hashCode());
            MessageSender smsMessageSender2 = context.getBean("smsMessageSender", MessageSender.class);
            System.out.println("sms2 - " + smsMessageSender2.hashCode());
            MessageSender smsMessageSender3 = context.getBean("smsMessageSender", MessageSender.class);
            System.out.println("sms3 - " + smsMessageSender3.hashCode());

            System.out.println("-----------------------------");

            MessageSender emailMessageSender1 = context.getBean("emailMessageSender", MessageSender.class);
            System.out.println("email1 - " + emailMessageSender1.hashCode());
            MessageSender emailMessageSender2 = context.getBean("emailMessageSender", MessageSender.class);
            System.out.println("email2 - " + emailMessageSender2.hashCode());
            MessageSender emailMessageSender3 = context.getBean("emailMessageSender", MessageSender.class);
            System.out.println("email3 - " + emailMessageSender3.hashCode());
        }
    }
}
