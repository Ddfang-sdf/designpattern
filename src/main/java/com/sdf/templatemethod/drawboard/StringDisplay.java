package com.sdf.templatemethod.drawboard;

import com.sdf.templatemethod.template.AbstractDisplay;

public class StringDisplay extends AbstractDisplay {


    private String str;

    public StringDisplay(String str) {
        this.str = str;
    }

    @Override
    protected void open() {
        printLine();
    }

    @Override
    protected void print() {
        System.out.println("|"+str+"|");
    }

    @Override
    protected void close() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("*");
        }
        System.out.println("+");
    }
}
