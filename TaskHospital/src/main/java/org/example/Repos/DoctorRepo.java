package org.example.Repos;

import org.example.AppDatabase;
import org.example.entities.Doctor;
import org.example.entities.Patient;
import org.hibernate.Session;

import java.util.List;

public class DoctorRepo {

    private final AppDatabase appDatabase;
    private Session session;

    public DoctorRepo() {
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

    public void insertDoctor(Doctor doctor) {
        openSession();
        try {
            session.beginTransaction();
            session.save(doctor);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public List<Patient> getPatients(Doctor doctor) {
        openSession();
        try {
            return session.createQuery("from Patient where doctor = :doctor", Patient.class)
                    .setParameter("doctor", doctor)
                    .list();
        } finally {
            closeSession();
        }
    }

    public List<Doctor> getDoctors() {
        openSession();
        try {
            return session.createQuery("from Doctor", Doctor.class).list();
        } finally {
            closeSession();
        }
    }

    public Doctor getDoctor(Long id) {
        openSession();
        try {
            return session.createQuery("from Doctor where id = :id", Doctor.class)
                    .setParameter("id", id)
                    .getSingleResult();
        } finally {
            closeSession();
        }
    }
}