package org.example.Repos;

import org.example.AppDatabase;
import org.example.entities.Doctor;
import org.example.entities.Hospital;
import org.example.entities.Patient;
import org.hibernate.Session;

import java.util.List;

public class HospitalRepo {

    private final AppDatabase appDatabase;
    private Session session;

    public HospitalRepo() {
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

    public void insertHospital(Hospital hospital) {
        openSession();
        try {
            session.beginTransaction();
            session.save(hospital);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public List<Hospital> getHospitals() {
        openSession();
        try {
            return session.createQuery("from Hospital", Hospital.class).list();
        } finally {
            closeSession();
        }
    }

    public List<Doctor> getDoctors(Hospital hospital) {
        openSession();
        try {
            return session.createQuery("from Doctor where hospital = :hospital", Doctor.class)
                    .setParameter("hospital", hospital)
                    .list();
        } finally {
            closeSession();
        }
    }

    public void addPatient(Hospital hospital, Patient patient) {
        openSession();
        try {
            session.beginTransaction();
            if (hospital.getPatientList() == null) {
                hospital.setPatientList(List.of(patient));
            }
            else
                hospital.getPatientList().add(patient);
            session.save(hospital);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }
}
