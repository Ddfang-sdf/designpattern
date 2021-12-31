package com.sdf.state.framework;

public abstract class State {
    public abstract void handlePush(Context context);
    public abstract void handlePull(Context context);
    public abstract Color getColor();
}
