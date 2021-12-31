package com.sdf.observer.framework;

import java.util.ArrayList;
import java.util.List;

public abstract class NumberGenerator {
    private List<Observer> list = new ArrayList<>();

    public void addObserver(Observer observer){
        list.add(observer);
    }

    public void delObserver(Observer observer){
        list.remove(observer);
    }

    public void notifyObserver(){
        list.stream().forEach(observer -> observer.update(this));
    }

    public abstract int getNumber();
    public abstract void generate();

}
