package com.sdf.factorymethod;

import com.sdf.factorymethod.framework.Factory;
import com.sdf.factorymethod.idcard.IdCard;
import com.sdf.factorymethod.idcard.IdCardFactory;

public class Application {

    public static void main(String[] args) {
        Factory<IdCard> factory = new IdCardFactory();
        IdCard sdfang0 = factory.create("sdfang0");
        IdCard sdfang1 = factory.create("sdfang1");
        IdCard sdfang2 = factory.create("sdfang2");
        sdfang0.use();
        sdfang1.use();
        sdfang2.use();
    }
}
