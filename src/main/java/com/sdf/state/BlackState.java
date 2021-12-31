package com.sdf.state;

import com.sdf.state.framework.Color;
import com.sdf.state.framework.Context;
import com.sdf.state.framework.State;

public class BlackState extends State {

    @Override
    public void handlePush(Context context) {
        context.setState(new RedState());
    }

    @Override
    public void handlePull(Context context) {
        context.setState(new GreenState());
    }

    @Override
    public Color getColor() {
        return Color.BLACK;
    }
}
