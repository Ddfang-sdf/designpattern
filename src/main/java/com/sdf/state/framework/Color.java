package com.sdf.state.framework;

public enum Color {
    RED("red"),BLUE("blue"),BLACK("black"),GREEN("green");

    private Color(String name) {
        this.name = name;
    }

    private String name;
}
