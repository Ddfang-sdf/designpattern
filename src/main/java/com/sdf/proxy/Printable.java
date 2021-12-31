package com.sdf.proxy;

public interface Printable {
    void setPrinterName(String printerName);
    String getPrinterName();
    void print(String string) throws InterruptedException;
}
