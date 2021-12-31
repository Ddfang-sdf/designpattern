package com.sdf.pototype.framework;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;

public class Manager<P extends Product> {

    private Map<String,P> context = new HashMap<>();

    public void regist(String key,P p){
        context.put(key,p);
    }

    public P getProduct(String key){
        if (context.containsKey(key)) {
            return (P) context.get(key).createClone();
        }
        return null;
    }


}
