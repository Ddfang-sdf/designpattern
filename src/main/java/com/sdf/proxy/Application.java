package com.sdf.proxy;

public class Application {
    public static void main(String[] args) throws InterruptedException {
        PrinterProxy sdfang = new PrinterProxy("sdfang");
        System.out.println(sdfang.getPrinterName());
        sdfang.print("hhshhs");
    }
}
