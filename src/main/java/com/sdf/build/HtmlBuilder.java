package com.sdf.build;

import com.sdf.build.framework.Builder;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Arrays;

public class HtmlBuilder extends Builder<String> {

    private String filename;
    private PrintWriter writer;

    @Override
    public Builder makeTitle(String title) {
        filename = title + ".html";
        try {
            writer = new PrintWriter(new FileWriter(filename));
        } catch (IOException e) {
            e.printStackTrace();
        }
        writer.println("<html><head><title>" + title + "</title></head><body>");
        writer.println("<h1>" + title + "</h1>");
        return this;
    }

    @Override
    public Builder makeSting(String s) {
        writer.println("<p>" + s + "</p>");
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        writer.println("<ul>");
        Arrays.stream(items).forEach(item -> writer.println("<li>" + item + "</li>"));
        writer.println("</ul>");
        return this;
    }

    @Override
    public String build() {
        writer.println("</body></html>");
        writer.close();
        return filename;
    }
}
