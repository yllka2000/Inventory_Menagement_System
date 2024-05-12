package org.example.service;

import org.example.Converter.ProductConverter;
import org.example.Dao.ProductDao;
import org.example.Dao.ProductDaoImpl;
import org.example.Dto.ProductDto;
import org.example.Entity.Product;
import org.example.config.HibernateConfig;
import org.example.validator.ProductValidator;
import org.hibernate.SessionFactory;

import java.util.List;

public class ProductServiceImpl implements ProductService{
    private final Integer quantity = 5;

    private final SessionFactory sessionFactory = HibernateConfig.getSessionFactory();
    @Override
    public void createProduct(ProductDto productDto) throws Exception {;
        ProductValidator.validateProduct(productDto);
        Product product= ProductConverter.convertToEntity(productDto);

        ProductDao productDao = new ProductDaoImpl(sessionFactory);
        productDao.save(product);
    }


    @Override
    public List<Product> notifyLowStock(){
        ProductDao productDao=new ProductDaoImpl(sessionFactory);
        return productDao.findlowStockProducts(quantity);

    }

    @Override
    public List<Product> displayAllProducts() {
        ProductDao productDao=new ProductDaoImpl(sessionFactory);
        return productDao.findAll();
    }

}


