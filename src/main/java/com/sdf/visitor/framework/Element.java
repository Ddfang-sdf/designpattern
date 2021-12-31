package com.sdf.visitor.framework;

public abstract class Element {
    public abstract void accept(Visitor visitor);
}
