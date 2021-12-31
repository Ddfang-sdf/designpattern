package com.sdf.build;

import com.sdf.build.framework.Builder;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class Director {
    private Builder<String> builder;

    public String construct() {
        return (String) builder
                .makeTitle("Greeting")
                .makeSting("早上至下午")
                .makeItems(new String[]{"早上好！", "下午好！"})
                .makeSting("晚上")
                .makeItems(new String[]{"晚上好", "晚安", "再见"})
                .build();
    }
}
