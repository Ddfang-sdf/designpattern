package com.sdf.decorator;

public class FullBorder extends Border {

    protected FullBorder(Display display) {
        super(display);
    }

    @Override
    public int getColunms() {
        return 1 + display.getColunms() + 1;
    }

    @Override
    public int getRows() {
        return 1 + display.getRows() + 1;
    }

    @Override
    public String getRowText(int row) {
        return row == 0 ? "+" + makeLine('-',display.getColunms()) + "+" :
                row == (display.getRows() + 1) ? "+" + makeLine('-',display.getColunms()) + "+" :
                    "|" + display.getRowText(row -1) + "|";
    }

    private String makeLine(char c,int row){
        StringBuilder builder = new StringBuilder();
        for (int i = 0; i < row; i++) {
            builder.append(c);
        }
        return builder.toString();
    }
}
