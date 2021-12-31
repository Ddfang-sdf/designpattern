package com.sdf.observer;

import com.sdf.observer.framework.NumberGenerator;

public class Application {
    public static void main(String[] args) {
        NumberGenerator generator = new RandomNumberGenerator();
        generator.addObserver(new DigitObserver());
        generator.addObserver(new GraphObserver());
        for (int i = 0; i < 20; i++) {
            generator.generate();
        }
    }
}
