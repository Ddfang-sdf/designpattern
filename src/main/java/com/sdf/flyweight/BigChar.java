package com.sdf.flyweight;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

public class BigChar {
    private char charname;
    private String fontData;

    public BigChar(char charname) {
        this.charname = charname;
        try {
            BufferedReader bufferedReader = new BufferedReader(new FileReader("D:\\work-space\\study\\designpattern\\src\\main\\resources\\fonts\\big" + charname + ".txt"));
            StringBuilder stringBuilder = new StringBuilder();
            String line;
            while ((line = bufferedReader.readLine()) != null){
                stringBuilder.append(line);
                stringBuilder.append(System.lineSeparator());
            }
            bufferedReader.close();
            this.fontData = stringBuilder.toString();
        } catch (IOException e) {
            this.fontData = charname + "?";
        }
    }

    public void print(){
        System.out.println(fontData);
    }

}
