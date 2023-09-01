package org.example.Repos;

import org.example.AppDatabase;
import org.example.entities.Drug;
import org.hibernate.Session;

public class DrugRepo {

    private final AppDatabase appDatabase;
    private Session session;

    public DrugRepo() {
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

    public void insertDrug(Drug drug) {
        openSession();
        try {
            session.beginTransaction();
            session.save(drug);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public Drug getDrug(Long id) {
        openSession();
        try {
            return session.createQuery("from Drug where id = :id", Drug.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } finally {
            closeSession();
        }
    }
}