package com.sdf.abstractfactory.listfactory;

import com.sdf.abstractfactory.factory.Factory;
import com.sdf.abstractfactory.factory.Link;
import com.sdf.abstractfactory.factory.Page;
import com.sdf.abstractfactory.factory.Tray;

public class ListFactory extends Factory {
    @Override
    public Link createLink(String caption, String url) {
        return new ListLink(caption,url);
    }

    @Override
    public Tray createTray(String caption) {
        return new ListTray(caption);
    }

    @Override
    public Page createPage(String title, String author) {
        return new ListPage(title,author);
    }
}
