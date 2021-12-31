package com.sdf.build;

import com.sdf.build.framework.Builder;

import java.util.Arrays;

public class TextBuild extends Builder<String> {

    private StringBuilder stringBuilder = new StringBuilder();

    @Override
    public Builder makeTitle(String title) {
        stringBuilder.append("=============================" + System.lineSeparator());
        stringBuilder.append("[" + title + "]" + System.lineSeparator());
        stringBuilder.append(System.lineSeparator());
        return this;
    }

    @Override
    public Builder makeSting(String s) {
        stringBuilder.append("#" + s + System.lineSeparator());
        return this;
    }

    @Override
    public Builder makeItems(String[] items) {
        Arrays.stream(items).forEach(item -> stringBuilder.append(" `" + item + System.lineSeparator()));
        return this;
    }

    @Override
    public String build() {
        return stringBuilder.toString();
    }
}
