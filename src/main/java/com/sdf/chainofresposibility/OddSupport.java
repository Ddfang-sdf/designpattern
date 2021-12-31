package com.sdf.chainofresposibility;

import com.sdf.chainofresposibility.framework.Support;
import com.sdf.chainofresposibility.framework.Trouble;

public class OddSupport extends Support {


    public OddSupport(String name) {
        super(name);
    }

    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNumber()%2 != 0;
    }
}
