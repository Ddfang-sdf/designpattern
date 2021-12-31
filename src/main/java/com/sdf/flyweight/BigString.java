package com.sdf.flyweight;

import java.util.Arrays;

public class BigString {
    private BigChar[] bigChars;

    public BigString(String string) {
        this.bigChars = new BigChar[string.length()];
        BigCharFactory instance = BigCharFactory.getInstance();
        for (int i = 0; i < bigChars.length; i++) {
            bigChars[i] = instance.getBigChar(string.charAt(i));
        }
    }

    public void print(){
        Arrays.stream(bigChars).forEach(bigChar -> bigChar.print());
    }
}
