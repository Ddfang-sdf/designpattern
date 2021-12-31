package com.sdf.observer.extention;

import java.util.Observable;
import java.util.Observer;

public class MySubject2 implements Observer {

    @Override
    public void update(Observable o, Object arg) {
        System.out.println("我正在观察：" + o + "动作~~是："  + arg);
    }
}
