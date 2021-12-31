package com.sdf.chainofresposibility;

import com.sdf.chainofresposibility.framework.Support;
import com.sdf.chainofresposibility.framework.Trouble;

public class Application {
    public static void main(String[] args) {
        Support support = new LimitSupport("bob", 200);
        support.setNext(
                new SpecialSupport("tom", 33)
        ).setNext(
                new LimitSupport("tim",350)
        ).setNext(
                new OddSupport("alice")
        );

        for (int i = 0; i < 500; i += 33) {
            support.support(new Trouble(i));
        }
    }
}
