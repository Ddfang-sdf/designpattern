package com.sdf.momento;

import com.sdf.momento.game.Gamer;
import com.sdf.momento.game.Momento;

public class Application {
    public static void main(String[] args) {
        Gamer gamer = new Gamer(100);
        Momento momento = gamer.createMomento();
        for (int i = 0; i < 100; i++) {
            gamer.bet();
            System.out.println("gamer现在的状态为：[" + gamer + "]");
            if (gamer.getMoney() > momento.getMoney()){
                momento = gamer.createMomento();
            }
            if (gamer.getMoney() <= momento.getMoney() >> 2){
                gamer.restore(momento);
            }
            if (gamer.getMoney() <= 0) break;
        }
        System.out.println("game over");
    }
}
