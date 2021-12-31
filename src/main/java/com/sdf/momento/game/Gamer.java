package com.sdf.momento.game;

import java.sql.PseudoColumnUsage;
import java.util.ArrayList;
import java.util.List;
import java.util.Random;

public class Gamer {
    private int money;
    private ArrayList<String> fruits = new ArrayList<>();
    private Random random = new Random();
    private static final String[] fruitsNames = {"苹果", "葡萄", "香蕉", "橘子"};

    public Gamer(int money) {
        this.money = money;
    }

    public int getMoney() {
        return money;
    }

    public void bet() {
        int i = random.nextInt(6) + 1;
        if (i == 1) {
            money += 100;
            System.out.println("所持有的金钱增加了！");
        }
        if (i == 2) {
            money = money >> 1;
            System.out.println("所持有的金钱减半了！");
        } else if (i == 6) {
            String fruit = getFruit();
            fruits.add(fruit);
            System.out.println("获得了水果（" + fruit + "）");
        }
    }

    private String getFruit() {
        String prefix = random.nextBoolean() ? "好吃的" : "";
        return prefix + fruitsNames[random.nextInt(fruitsNames.length)];
    }

    public Momento createMomento(){
        return new Momento(money,fruits);
    }

    public void restore(Momento momento){
        this.money = momento.getMoney();
        this.fruits = momento.getFruits();
    }

    @Override
    public String toString() {
        return
                "[money=" + money +
                        ", fruits=" + fruits + "]";

    }
}
