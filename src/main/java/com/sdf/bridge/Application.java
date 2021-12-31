package com.sdf.bridge;

import com.sdf.bridge.function.CountDisplay;
import com.sdf.bridge.function.Display;
import com.sdf.bridge.impl.StringDisplayImpl;

public class Application {
    public static void main(String[] args) {
        Display display = new Display(new StringDisplayImpl("hello china!"));
        CountDisplay countDisplay = new CountDisplay(new StringDisplayImpl("hello sdfang"));
        display.display();
        countDisplay.multiDisplay(5);
        countDisplay.display();
    }
}
