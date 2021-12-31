package com.sdf.abstractfactory.factory;

import java.util.ArrayList;
import java.util.List;

public abstract class Tray extends Item {

    protected List<Item> list = new ArrayList<>();

    public Tray(String caption) {
        super(caption);
    }

    public void add(Item item){
        list.add(item);
    }
}
