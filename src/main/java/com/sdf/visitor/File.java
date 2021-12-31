package com.sdf.visitor;

import com.sdf.visitor.framework.Visitor;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class File extends Entry {

    private String name;
    private int size = 0;

    @Override
    public String getName() {
        return name;
    }

    @Override
    public int getSize() {
        return size;
    }

    @Override
    protected void printList(String s) {
        System.out.println(s + "/" + this);
    }

    @Override
    public void accept(Visitor visitor) {
        visitor.visit(this);
    }
}
