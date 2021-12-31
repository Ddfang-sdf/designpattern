package com.sdf.adaprer.intrust;

import lombok.AllArgsConstructor;
import lombok.Data;

//打印字符串
@Data
@AllArgsConstructor
public class Banner {
    private String str;

    public void printWithAster(){
        System.out.println("*" + str + "*");
    }

    public void printWithParen(){
        System.out.println("(" + str + ")");
    }

}
