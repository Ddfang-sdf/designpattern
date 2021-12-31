package com.sdf.abstractfactory.listfactory;

import com.sdf.abstractfactory.factory.Page;
import javafx.scene.shape.Path;

public class ListPage extends Page {
    public ListPage(String title, String author) {
        super(title, author);
    }

    @Override
    public String makeHtml() {
        StringBuilder stringBuilder = new StringBuilder();
        stringBuilder.append("<html><head><title>" + title + "</title></head>" + System.lineSeparator());
        stringBuilder.append("<body>" + System.lineSeparator());
        stringBuilder.append("<h1>" + title + "</h1>" + System.lineSeparator());
        stringBuilder.append("<ul>" + System.lineSeparator());
        list.stream().forEach(item -> stringBuilder.append(item.makeHtml()));
        stringBuilder.append("</ul>" + System.lineSeparator());
        stringBuilder.append("<hr><address>" + author + "</address>" + System.lineSeparator());
        stringBuilder.append("</body></html>" + System.lineSeparator());
        return stringBuilder.toString();
    }
}
