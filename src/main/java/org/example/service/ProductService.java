package org.example.service;

import org.example.Dto.ProductDto;
import org.example.Entity.Product;

import java.util.List;
import java.util.ListIterator;

public interface ProductService {
    void createProduct(ProductDto productDto) throws Exception;

    List<Product> notifyLowStock();

    List<Product> displayAllProducts();
}

