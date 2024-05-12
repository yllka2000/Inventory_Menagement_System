package org.example.Dao;

import org.example.Entity.Product;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.List;

public class ProductDaoImpl implements ProductDao{
    private final SessionFactory sessionFactory;
    public ProductDaoImpl(SessionFactory sessionFactory){
        this.sessionFactory = sessionFactory;

    }
    @Override
    public void save(Product product) throws Exception {
        try {
            Session session= sessionFactory.openSession();
            Transaction transaction =session.beginTransaction();
            session.save(product);

            transaction.commit();

        } catch (Exception e) {
            throw new Exception(e.getMessage());
        }

    }

    @Override
    public List<Product> findAll() {
        Session session= sessionFactory.openSession();
        return session.createQuery("SELECT p FROM Product p", Product.class).getResultList();
    }

    @Override
    public List<Product>
    findlowStockProducts(Integer quantity) {
        Session session= sessionFactory.openSession();
        Query query= session.createQuery(
                "FROM Product p WHERE p.quantity < (:quantity)",Product.class);
        query.setParameter("quantity", quantity);
        return query.getResultList();

    }
}
