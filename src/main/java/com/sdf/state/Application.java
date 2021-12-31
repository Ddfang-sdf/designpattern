package com.sdf.state;

import com.sdf.state.framework.Context;

public class Application {
    public static void main(String[] args) {
        Context context = new Context(new RedState());
        for (int i = 0; i < 20; i++) {
            context.push();
        }
        for (int i = 0; i < 20; i++) {
            context.pull();
        }
    }
}
