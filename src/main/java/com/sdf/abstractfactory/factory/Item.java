package com.sdf.abstractfactory.factory;

import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public abstract class Item {
    protected String caption;
    public abstract String makeHtml();
}
