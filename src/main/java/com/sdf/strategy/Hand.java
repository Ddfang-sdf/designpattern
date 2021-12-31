package com.sdf.strategy;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Hand {
    public static final int HANDVALUE_GUU = 0;
    public static final int HANDVALUE_CHO = 1;
    public static final int HANDVALUE_PAA = 2;
    public static final Hand[] hands = {
            new Hand(HANDVALUE_GUU),
            new Hand(HANDVALUE_CHO),
            new Hand(HANDVALUE_PAA),
    };

    private int handValue;

    private static final String[] name = {
            "石头","剪刀","布"
    };

    public static Hand getInstance(int handValue){
        return hands[handValue];
    }

    public boolean isStrongerThan(Hand hand){
        return fight(hand) == 1;
    }

    private int fight(Hand hand) {
        return (this.handValue + 1) % 3 == hand.handValue ? 1 :
                this.handValue == hand.handValue ? 0 : -1;
    }

    @Override
    public String toString() {
        return name[handValue];
    }
}
