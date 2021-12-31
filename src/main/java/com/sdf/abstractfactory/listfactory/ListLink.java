package com.sdf.abstractfactory.listfactory;

import com.sdf.abstractfactory.factory.Link;

public class ListLink extends Link {
    public ListLink(String url, String caption) {
        super(url, caption);
    }

    @Override
    public String makeHtml() {
        return "<li><a href=\"" + url + "\">" + caption + "</a></li>" + System.lineSeparator();
    }
}
