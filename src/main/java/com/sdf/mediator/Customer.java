package com.sdf.mediator;

public class Customer extends Consign{

    public Customer(Madidator madidator) {
        super(madidator);
    }

    public void requestOrder(){
        System.out.println("顾客下单！");
        madidator.generateOrder();
    }

    public void receiveOrder(){
        System.out.println("顾客收到订单了！");
    }
}
