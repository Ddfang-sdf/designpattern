package com.sdf.singleton;

public class ServerConfig {
    private static volatile ServerConfig instance;

    private ServerConfig(){}

    public static ServerConfig getInstance() {
        if (null == instance){
            synchronized (ServerConfig.class){
                if (null == instance){
                    instance = new ServerConfig();
                }
            }
        }
        return instance;
    }


}
