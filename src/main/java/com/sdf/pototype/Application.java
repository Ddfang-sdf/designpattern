package com.sdf.pototype;

import com.sdf.pototype.framework.Manager;
import com.sdf.pototype.framework.Product;

public class Application {

    public static void main(String[] args) {
        Manager<Product> manager = new Manager<>();
        manager.regist("msgBox",new MessageBox('*'));
        manager.regist("undPen",new UnderLinePen('~'));

        manager.getProduct("msgBox").print("sdfang");
        manager.getProduct("undPen").print("sdfang");
    }
}
