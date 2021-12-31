package com.sdf.abstractfactory.factory;

public abstract class Link extends Item{
    protected String url;
    public Link(String url,String caption) {
        super(caption);
    }
}
