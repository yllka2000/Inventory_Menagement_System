package org.example.validator;

import org.example.Dto.ProductDto;

public class ProductValidator {
    public static void validateProduct(ProductDto productDto) {
        if (productDto.getModel().isBlank()){
            throw new IllegalArgumentException("Ju lutem modeli"+
            "i produktit eshte i nevojshem");

        }

        if (productDto.getPrice() <= 0D){
            throw new IllegalArgumentException("Ju lutem cmimi"+
                    "i produktit nuk mund te jete0 ose me vlera"+ "negative");
        }

    }
}
