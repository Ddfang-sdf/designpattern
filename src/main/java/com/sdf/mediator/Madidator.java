package com.sdf.mediator;

import lombok.Data;

//仲裁者
@Data
public class Madidator {
    //顾客
    private Customer customer;
    //外卖员
    private Deliever deliever;
    //站点
    private Site site;

//    产生订单
    public void generateOrder(){
        site.response();//站点收到客户订单
    }
//    配送订单
    public void deliverOrder(){
        deliever.delieverOrder();
    }
//    结束订单
    public void endOrder(){
        customer.receiveOrder();
    }



}
