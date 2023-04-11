package com.nhnacademy.edu.springframework.messagesender.singleton;

public class Singleton_DCL {
    private static Singleton_DCL instance;

    public Singleton_DCL() {

    }

    public static Singleton_DCL getInstance() {
        if (instance == null) {
            synchronized (Singleton_DCL.class) {
                if (instance == null) {
                    instance = new Singleton_DCL();
                }
            }
        }
        return instance;
    }
}
