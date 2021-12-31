package com.sdf.templatemethod;

import com.sdf.templatemethod.drawboard.CharDisplay;
import com.sdf.templatemethod.drawboard.StringDisplay;
import com.sdf.templatemethod.template.AbstractDisplay;

public class Application {
    public static void main(String[] args) {
        AbstractDisplay display = new CharDisplay('a');
        display.display();
        AbstractDisplay display1 = new StringDisplay("sdfang");
        display1.display();
    }
}
