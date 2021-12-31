package com.sdf.proxy;

public class PrinterProxy implements Printable {

    private String name;
    private Printer proxyTarget;

    public PrinterProxy(String name) {
        this.name = name;
    }

    @Override
    public synchronized void setPrinterName(String printerName) {
        if (proxyTarget != null){
            proxyTarget.setPrinterName(printerName);
        }
        this.name = printerName;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) throws InterruptedException {
        if (proxyTarget == null){
            getProxyTarget();
        }
        proxyTarget.print(string);
    }

    private synchronized void getProxyTarget() throws InterruptedException {
        proxyTarget = new Printer(name);
    }
}
