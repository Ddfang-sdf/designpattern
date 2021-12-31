package com.sdf.facade;


import org.junit.Test;

import java.io.FileInputStream;
import java.io.IOException;
import java.util.Properties;
import java.util.SplittableRandom;

public class DataBase {
    private DataBase(){

    }
    public static Properties getProperties(String fileName){
        fileName += ".txt";
        Properties properties = new Properties();
        try {
            properties.load(new FileInputStream("D:\\work-space\\study\\designpattern\\src\\main\\java\\com\\sdf\\facade\\"+fileName));
        } catch (IOException e) {
            e.printStackTrace();
        }
        return properties;
    }

}
