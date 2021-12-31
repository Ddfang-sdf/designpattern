package com.sdf.adaprer.inherit;

import com.sdf.adaprer.inherit.api.Print;

//适配类，继承的方式
public class BannerPrint extends Banner implements Print {
    public BannerPrint(String str) {
        super(str);
    }

    @Override
    public void printWeak() {
        printWithParen();
    }

    @Override
    public void printStrong() {
        printWithAster();
    }
}
