package com.sdf.adaprer.inherit;

import com.sdf.adaprer.inherit.api.Print;

public class Application {
    public static void main(String[] args) {
        Print print = new BannerPrint("sdfang");
        print.printStrong();
        print.printWeak();
    }
}
