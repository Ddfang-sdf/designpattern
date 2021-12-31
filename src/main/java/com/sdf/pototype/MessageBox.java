package com.sdf.pototype;

import com.sdf.pototype.framework.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class MessageBox implements Product {

    private char ch;

    @Override
    public void print(String string) {
        for (int i = 0; i < string.length() + 4; i++) {
            System.out.print(ch);
        }
        System.out.println("");
        System.out.println(ch +" "+ string +" "+ ch);
        for (int i = 0; i < string.length() + 4; i++) {
            System.out.print(ch);
        }
        System.out.println("");

    }

    @Override
    public Product createClone() {
        Object clone = null;
        try {
            clone = clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return (Product) clone;
    }
}
