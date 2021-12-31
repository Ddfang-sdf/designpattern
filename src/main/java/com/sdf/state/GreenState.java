package com.sdf.state;

import com.sdf.state.framework.Color;
import com.sdf.state.framework.Context;
import com.sdf.state.framework.State;

public class GreenState extends State {

    @Override
    public void handlePush(Context context) {
        context.setState(new BlackState());
    }

    @Override
    public void handlePull(Context context) {
        context.setState(new BlueState());
    }

    @Override
    public Color getColor() {
        return Color.GREEN;
    }
}
