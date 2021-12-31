package com.sdf.factorymethod.framework;

public abstract class Factory<P extends Product> {



    abstract protected P createProduct(String owner);
    abstract protected P registProduct(P product);
    public P create(String owner){
        return registProduct(createProduct(owner));
    }

}
