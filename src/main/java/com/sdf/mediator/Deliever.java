package com.sdf.mediator;

public class Deliever extends Consign{

    public Deliever(Madidator madidator) {
        super(madidator);
    }

    //配送订单
    public void delieverOrder() {
        System.out.println("Deliever接单 ,开始配送！");
        System.out.println("====================》 ========》");
        madidator.endOrder();
    }
}
