package com.sdf.decorator;

import lombok.AllArgsConstructor;

@AllArgsConstructor
public class StringDisplay extends Display {

    private String str;

    @Override
    public int getColunms() {
        return str.getBytes().length;
    }

    @Override
    public int getRows() {
        return 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? str : null;
    }
}
