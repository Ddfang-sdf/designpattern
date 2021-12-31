package com.sdf.bridge.impl;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringDisplayImpl extends DisplayImpl {

    private String str;

    @Override
    public void rawOpen() {
        printLine();
    }

    @Override
    public void rawPrint() {
        System.out.println("|" + str + "|");
    }

    @Override
    public void rawclose() {
        printLine();
    }

    private void printLine(){
        System.out.print("+");
        for (int i = 0; i < str.length(); i++) {
            System.out.print("-");
        }
        System.out.println("+");
    }
}
