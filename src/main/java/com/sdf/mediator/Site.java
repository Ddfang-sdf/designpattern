package com.sdf.mediator;

public class Site extends Consign{

    public Site(Madidator madidator) {
        super(madidator);
    }

    public void response(){
        System.out.println("站点收到订单！");
        verityOrder();
    }

    public void verityOrder(){
        System.out.println("站点验证订单！");
        assign();
    }

    public void assign(){
        System.out.println("站点指派配送员配送订单！");
        madidator.deliverOrder();
    }
}
