package com.sdf.abstractfactory.listfactory;

import com.sdf.abstractfactory.factory.Tray;

public class ListTray extends Tray {
    public ListTray(String caption) {
        super(caption);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<li>" + System.lineSeparator());
        stringBuilder.append(caption + System.lineSeparator());
        stringBuilder.append("<ul>" + System.lineSeparator());
        stringBuilder.append("<ul>" + System.lineSeparator());
        list.stream().forEach(item -> stringBuilder.append(item.makeHtml()));
        stringBuilder.append("</ul>" + System.lineSeparator());
        stringBuilder.append("</li>" + System.lineSeparator());
        return stringBuilder.toString();
    }
}
