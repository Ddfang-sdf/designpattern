package com.sdf.factorymethod.idcard;

import com.sdf.factorymethod.framework.Factory;
import com.sdf.factorymethod.framework.Product;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.ArrayList;

@Data
@NoArgsConstructor
public class IdCardFactory extends Factory<IdCard> {

    private ArrayList<String> owners = new ArrayList<>();

    @Override
    protected IdCard createProduct(String owner) {
        return new IdCard(owner);
    }

    @Override
    protected IdCard registProduct(IdCard idCard) {
        owners.add(idCard.getOwner());
        return idCard;
    }

}
