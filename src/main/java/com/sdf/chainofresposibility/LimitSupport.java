package com.sdf.chainofresposibility;


import com.sdf.chainofresposibility.framework.Support;
import com.sdf.chainofresposibility.framework.Trouble;

public class LimitSupport extends Support {
    private int limit;

    public LimitSupport(String name,int limit) {
        super(name);
        this.limit = limit;
    }


    @Override
    public boolean resolve(Trouble trouble) {

        return trouble.getNumber() < limit;
    }
}
