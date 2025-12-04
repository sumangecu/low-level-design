package com.codeswallah.designpatterns.singleton;

public class Singleton01 {
    private static Singleton01 instance;
    private Singleton01() {}

    public static Singleton01 getInstance() {
        if (instance == null) {
            instance = new Singleton01();
        }
        return instance;
    }
}
