package com.sdf.adaprer.intrust;

//适配类，继承的方式
public class BannerPrint extends Print {

    private Banner banner;

    public BannerPrint(String str) {
        this.banner = new Banner(str);
    }

    @Override
    public void printWeak() {
        banner.printWithParen();
    }

    @Override
    public void printStrong() {
        banner.printWithAster();
    }
}
