package com.sdf.facade;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Properties;

public class PageMaker {
    private PageMaker() {

    }

    public static void makeWelcomePage(String mailaddr, String filename) {
        Properties properties = DataBase.getProperties("database");
        String username = properties.getProperty(mailaddr);
        try {
            HtmlWriter htmlWriter = new HtmlWriter(new FileWriter(filename));
            htmlWriter.title("Welcome to " + username + "'s page!");
            htmlWriter.paragraph("等着你的邮件！");
            htmlWriter.mailto(mailaddr,username);
            htmlWriter.close();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
