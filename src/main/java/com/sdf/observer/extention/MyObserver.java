package com.sdf.observer.extention;

import lombok.AllArgsConstructor;

import java.util.Observable;
@AllArgsConstructor
public class MyObserver extends Observable {
    private String action;

    public void activity(){
        setChanged();
        notifyObservers(action);
    }
}
