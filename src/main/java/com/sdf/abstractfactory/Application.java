package com.sdf.abstractfactory;

import com.sdf.abstractfactory.factory.Factory;
import com.sdf.abstractfactory.factory.Link;
import com.sdf.abstractfactory.factory.Page;
import com.sdf.abstractfactory.factory.Tray;
import com.sdf.abstractfactory.listfactory.ListFactory;

public class Application {

    private ListFactory listFactory;

    public static void main(String[] args) {
        Factory factory = Factory.getFactory("com.sdf.abstractfactory.listfactory.ListFactory");
        Link baidu = factory.createLink("baidu", "https://www.baidu.com");
        Link baidufanyi = factory.createLink("baidufanyi", "https://fanyi.baidu.com/");
        Link baidufanyi1 = factory.createLink("baidufanyi", "https://fanyi.baidu.com/");
        Tray trayBaidu = factory.createTray("baidufanyi");
        trayBaidu.add(baidu);
        trayBaidu.add(baidufanyi);
        trayBaidu.add(baidufanyi1);
        Page page = factory.createPage("baidu", "sdfang");
        page.add(trayBaidu);
        page.output();
    }
}
