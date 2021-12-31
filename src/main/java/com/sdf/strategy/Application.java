package com.sdf.strategy;

public class Application {
    public static void main(String[] args) {
        Player player1 = new Player("sdfang",new ProbStrategy(96));
        Player player2 = new Player("libo",new WinningStrategy(97));
        for (int i = 0; i < 1000; i++) {
            Hand hand1 = player1.nextHand();
            Hand hand2 = player2.nextHand();
            if (hand1.isStrongerThan(hand2)){
                System.out.println("winner:" + player1);
                player1.win();
                player2.lose();
            }
            if (hand2.isStrongerThan(hand1)){
                System.out.println("winner:" + player2);
                player1.lose();
                player2.win();
            }else {
                System.out.println("even···");
                player1.even();
                player2.even();
            }

        }
        System.out.println("total result:");
        System.out.println(player1);
        System.out.println(player2);
    }
}
