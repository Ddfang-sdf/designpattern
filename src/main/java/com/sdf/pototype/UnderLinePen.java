package com.sdf.pototype;

import com.sdf.pototype.framework.Product;
import lombok.AllArgsConstructor;

@AllArgsConstructor
public class UnderLinePen implements Product {

    private char ulchar;
    @Override
    public void print(String string) {
        System.out.println("\"" + string + "\"");
        System.out.print(" ");
        for (int i = 0; i < string.length(); i++) {
            System.out.print(ulchar);
        }
        System.out.println("");

    }

    @Override
    public Product createClone() {
        try {
            return (Product) clone();
        } catch (CloneNotSupportedException e) {
            e.printStackTrace();
        }
        return null;
    }
}
