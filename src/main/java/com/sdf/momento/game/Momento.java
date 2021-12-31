package com.sdf.momento.game;

import java.util.ArrayList;
import java.util.List;

public class Momento {
    private int money;
    private ArrayList<String> fruits;

    public Momento(int money, ArrayList<String> fruits) {
        this.money = money;
        this.fruits = fruits;
    }

    void saveMoney(int money){
        this.money = money;
    }

    void saveFruits(String fruit){
        fruits.add(fruit);
    }

    public int getMoney() {
        return money;
    }

    public ArrayList<String> getFruits() {
        return (ArrayList<String>) fruits.clone();
    }
}
