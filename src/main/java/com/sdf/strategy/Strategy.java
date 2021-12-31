package com.sdf.strategy;

public interface Strategy {
    Hand nextHand();
    void study(boolean win);
}
