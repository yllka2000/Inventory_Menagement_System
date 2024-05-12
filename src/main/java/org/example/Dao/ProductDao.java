package org.example.Dao;

import org.example.Entity.Product;

import java.util.List;

public interface ProductDao {
    void save(Product product) throws Exception;
    List<Product> findAll();
    List<Product> findlowStockProducts(Integer quantity);

}
