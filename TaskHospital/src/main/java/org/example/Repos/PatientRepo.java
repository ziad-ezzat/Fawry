package org.example.Repos;

import org.example.AppDatabase;
import org.example.entities.Doctor;
import org.example.entities.Drug;
import org.example.entities.Patient;
import org.hibernate.Session;

import java.util.List;

public class PatientRepo {

    private final AppDatabase appDatabase;
    private Session session;

    public PatientRepo() {
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

    public void insertPatient(Patient patient) {
        openSession();
        try {
            session.beginTransaction();
            session.save(patient);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public Doctor getDoctor(Patient patient) {
        openSession();
        try {
            return session.createQuery("from Doctor where id = :id", Doctor.class)
                    .setParameter("id", patient.getDoctor().getId())
                    .getSingleResult();
        } finally {
            closeSession();
        }
    }

    public List<Patient> getPatients() {
        openSession();
        try {
            return session.createQuery("from Patient", Patient.class).list();
        } finally {
            closeSession();
        }
    }

    public void addPatientTODoctor(Patient patient, Doctor doctor) {
        openSession();
        try {
            session.beginTransaction();
            patient.setDoctor(doctor);
            session.update(patient);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public void addDrugToPatient(Patient patient, Drug drug) {
        openSession();
        try {
            session.beginTransaction();
            if (patient.getDrugList() == null) {
                patient.setDrugList(List.of(drug));
            } else
            {
                patient.getDrugList().add(drug);
            }
            session.update(patient);
            session.getTransaction().commit();
        } catch (Exception e) {
            session.getTransaction().rollback();
        } finally {
            closeSession();
        }
    }

    public void getDrugList(Patient patient) {
        openSession();
        try {
            patient.getDrugList()
                    .stream()
                    .map(drug -> drug.getName() + " " + drug.getPrice())
                    .forEach(System.out::println);
        } finally {
            closeSession();
        }
    }
}