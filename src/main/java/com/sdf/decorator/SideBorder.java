package com.sdf.decorator;

public class SideBorder extends Border {

    private char aChar;

    public SideBorder(Display display, char aChar) {
        super(display);
        this.aChar = aChar;
    }

    @Override
    public int getColunms() {
        return 1 + display.getColunms() + 1;
    }

    @Override
    public int getRows() {
        return display.getRows();
    }

    @Override
    public String getRowText(int row) {
        return aChar + display.getRowText(row) + aChar;
    }
}
