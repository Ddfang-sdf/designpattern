package com.sdf.singleton;

public class Application {
    public static void main(String[] args) {
        ServerConfig instance1 = ServerConfig.getInstance();
        ServerConfig instance2 = ServerConfig.getInstance();
        System.out.println(instance1 == instance2);
    }
}
