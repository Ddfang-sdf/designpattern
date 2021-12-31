package com.sdf.bridge.function;

import com.sdf.bridge.impl.DisplayImpl;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class Display {

    private DisplayImpl impl;//桥接的桥梁，将功能层次结构和实现层次结构桥接起来

    public void open(){
        impl.rawOpen();
    }

    public void print(){
        impl.rawPrint();
    }

    public void close(){
        impl.rawclose();
    }

    public void display(){
        open();
        print();
        close();
    }
}
