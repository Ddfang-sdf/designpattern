package com.sdf.facade;

import java.io.IOException;
import java.io.Writer;

public class HtmlWriter {
    private Writer writer;

    public HtmlWriter(Writer writer) {
        this.writer = writer;
    }

    public void title(String title) throws IOException {
        writer.write("<html><head>" +
                "<title>" + title + "</title>" +
                "</head>" +
                "<body>" + System.lineSeparator() +
                "<h1>" + title + "</h1>");
    }

    public void paragraph(String msg) throws IOException {
        writer.write("<p>" + msg + "</p>" + System.lineSeparator());
    }

    public void link(String href, String caption) throws IOException {
        paragraph("<a href=\"" + href + "\">" + caption + "</a>");
    }

    public void mailto(String mailaddr,String username) throws IOException {
        link("mailto:" + mailaddr,username);
    }

    public void close() throws IOException {
        writer.write("</body></html>" + System.lineSeparator());
        writer.close();
    }
}
