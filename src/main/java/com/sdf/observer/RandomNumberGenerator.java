package com.sdf.observer;

import com.sdf.observer.framework.NumberGenerator;

import java.util.Random;

public class RandomNumberGenerator extends NumberGenerator {

    private Random random = new Random();
    private int number;
    @Override
    public int getNumber() {
        return number;
    }

    @Override
    public void generate() {
        number = random.nextInt(50);
        notifyObserver();
    }
}
