package org.example.Converter;

import org.example.Dto.ProductDto;
import org.example.Entity.Product;

public class ProductConverter {
    public static Product convertToEntity(ProductDto productDto){
        Product product =new Product();
        product.setModel(productDto.getModel());
        product.setDescription(productDto.getDescription());
        product.setPrice(productDto.getPrice());
        product.setQuantity(productDto.getQuantity());
        return product;

    }






}
