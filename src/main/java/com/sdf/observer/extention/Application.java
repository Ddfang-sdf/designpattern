package com.sdf.observer.extention;

public class Application {
    public static void main(String[] args) {
        MyObserver myObserver = new MyObserver("嘿咻！");
        myObserver.addObserver(new MySubject1());
        myObserver.addObserver(new MySubject2());
        myObserver.activity();
    }
}
