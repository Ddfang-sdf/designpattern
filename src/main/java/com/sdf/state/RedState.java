package com.sdf.state;

import com.sdf.state.framework.Color;
import com.sdf.state.framework.Context;
import com.sdf.state.framework.State;

public class RedState extends State {

    @Override
    public void handlePush(Context context) {
        context.setState(new BlueState());
    }

    @Override
    public void handlePull(Context context) {
        context.setState(new BlackState());
    }

    @Override
    public Color getColor() {
        return Color.RED;
    }
}
