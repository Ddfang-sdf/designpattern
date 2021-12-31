package com.sdf.chainofresposibility.framework;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Trouble {
    private int number;

    @Override
    public String toString() {
        return "[Trouble=" + number + "]";
    }
}
