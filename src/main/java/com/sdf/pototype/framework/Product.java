package com.sdf.pototype.framework;

public interface Product extends Cloneable {
    void print(String string);
    Product createClone();
}
