package com.sdf.flyweight;

import java.util.HashMap;
import java.util.Map;

public class BigCharFactory {
    private Map<String, BigChar> pool = new HashMap();
    private static BigCharFactory instance = new BigCharFactory();

    private BigCharFactory() {
    }

    public static BigCharFactory getInstance() {
        return instance;
    }

    public synchronized BigChar getBigChar(char charname) {
        BigChar bigChar = pool.get("" + charname);
        if (bigChar == null){
            bigChar = new BigChar(charname);
            pool.put(""+charname,bigChar);
        }
        return bigChar;

    }
}
