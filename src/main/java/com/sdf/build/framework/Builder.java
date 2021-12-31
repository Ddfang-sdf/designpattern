package com.sdf.build.framework;

import lombok.AllArgsConstructor;

public abstract class Builder<T> {
    public abstract Builder makeTitle(String title);

    public abstract Builder makeSting(String s);

    public abstract Builder makeItems(String[] items);

    public abstract T build();
}
