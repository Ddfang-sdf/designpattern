package com.sdf.proxy;

public class Printer implements Printable {

    private String name;

    public Printer(String name) throws InterruptedException {
        heavyJobs(name);
        this.name = name;
    }

    @Override
    public void setPrinterName(String printerName) {
        this.name = printerName;
    }

    @Override
    public String getPrinterName() {
        return name;
    }

    @Override
    public void print(String string) {
        System.out.println("===" + name + "===");
        System.out.println(string);
    }

    private void heavyJobs(String name) throws InterruptedException {
        System.out.println("正在生成" + name + "实例！");
        for (int i = 0; i < 5; i++) {
            Thread.sleep(1000);
            System.out.print("·");
        }
        System.out.println("");
    }
}
