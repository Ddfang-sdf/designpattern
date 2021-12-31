package com.sdf.abstractfactory.factory;

import java.io.FileWriter;
import java.io.IOException;
import java.io.Writer;
import java.util.ArrayList;
import java.util.List;

public abstract class Page {

    protected String title;
    protected String author;
    protected List<Item> list = new ArrayList<>();

    public Page(String title, String author) {
        this.title = title;
        this.author = author;
    }

    public void add(Item item){
        list.add(item);
    }

    public void output(){
        Writer writer = null;
        try {
            writer = new FileWriter(title + ".html");
            writer.write(makeHtml());
        } catch (IOException e) {
            e.printStackTrace();
        }finally {
            writeCloseGracefully(writer);
        }
    }

    public abstract String makeHtml();

    public void writeCloseGracefully(Writer writer){
        if (writer == null)
            return;
        try {
            writer.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
