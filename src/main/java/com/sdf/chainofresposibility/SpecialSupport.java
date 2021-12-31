package com.sdf.chainofresposibility;

import com.sdf.chainofresposibility.framework.Support;
import com.sdf.chainofresposibility.framework.Trouble;
import lombok.AllArgsConstructor;

public class SpecialSupport extends Support {

    private int number;

    public SpecialSupport(String name,int number) {
        super(name);
        this.number = number;
    }


    @Override
    public boolean resolve(Trouble trouble) {
        return trouble.getNumber() == number;
    }
}
