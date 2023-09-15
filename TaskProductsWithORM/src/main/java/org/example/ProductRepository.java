package org.example;

import org.hibernate.Session;

import java.util.List;

public class ProductRepository {

    private final AppDatabase appDatabase;
    private Session session;

    public ProductRepository() {
        appDatabase = new AppDatabase();
    }

    private void openSession() {
        session = appDatabase.openSession();
    }

    private void closeSession() {
        if (session != null) {
            session.close();
        }
    }

    public List<Product> findProducts() {
        openSession();
        try {
            return session.createQuery("select p from Product p", Product.class).list();
        } finally {
            closeSession();
        }
    }

    public void addProduct(Product product) {
        openSession();
        try {
            session.beginTransaction();
            session.save(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public void deleteProduct(int id) {
        openSession();
        try {
            session.beginTransaction();
            Product product = session.get(Product.class, id);
            session.delete(product);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }
}
