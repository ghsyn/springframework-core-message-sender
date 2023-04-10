package com.nhnacademy.edu.springframework.messagesender;

public class Main {
    public static void main(String[] args) {
        User user = new User("siyeonkim@nhndooray.com", "010-1234-5678");

        Main main =  new Main();
        main.sendSmsMessage(user, "hello");
        main.sendEmailMessage(user, "hello");
    }

    private void sendSmsMessage(User user, String message) {
        System.out.println("SMS Message Sent to " + user.getPhoneNumber() + " : " + message);
    }

    private void sendEmailMessage(User user, String message) {
        System.out.println("Email Message Sent to " + user.getEmail() + " : " + message);
    }
}