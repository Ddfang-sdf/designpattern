package com.sdf.build;

public class Application {
    public static void main(String[] args) {
        System.out.println(new Director(new HtmlBuilder()).construct());
        System.out.println(new Director(new TextBuild()).construct());
    }
}
