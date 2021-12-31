package com.sdf.factorymethod.idcard;

import com.sdf.factorymethod.framework.Product;
import lombok.AllArgsConstructor;
import lombok.Data;

@Data
@AllArgsConstructor
public class IdCard extends Product {

    private String owner;


    @Override
    public void use() {
        System.out.println(owner);
    }
}
