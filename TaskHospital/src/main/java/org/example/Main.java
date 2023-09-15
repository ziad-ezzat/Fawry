package org.example;

import org.example.Repos.DoctorRepo;
import org.example.Repos.DrugRepo;
import org.example.Repos.HospitalRepo;
import org.example.Repos.PatientRepo;
import org.example.entities.Doctor;
import org.example.entities.Drug;
import org.example.entities.Hospital;
import org.example.entities.Patient;

import java.util.ArrayList;
import java.util.List;

public class Main {
    public static void main(String[] args) {

        PatientRepo patientRepo = new PatientRepo();
        DoctorRepo doctorRepo = new DoctorRepo();
        DrugRepo drugRepo = new DrugRepo();
        HospitalRepo hospitalRepo = new HospitalRepo();

        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        Drug drug = new Drug();
        Hospital hospital = new Hospital();

//        doctor.setName("doctor2");
//        doctor.setDepartment("department2");
//
        patient.setName("patient2");
        patient.setAge(30);
//
        drug.setName("drug2");
        drug.setPrice(1005);
//
//        hospital.setName("hospital1");

        /*

        1. اسماء الدكاتره الي شغالين في المستشفي

        doctorRepo.insertDoctor(doctor);
        doctorRepo.addDoctorToHospital(doctor, hospitalRepo.getHospitals().get(2));

        Hospital hospital1 = hospitalRepo.getHospitals().get(2);

        List<Doctor> doctors =new ArrayList<>();

        doctors = hospitalRepo.getDoctors(hospital1);

        for (Doctor doctor1 : doctors) {
            System.out.println(doctor1.getName());
        }
        */

        /*

        2. اسماء المرضى الي عندهم الدكتور الي اسمه doctor1

        doctor = doctorRepo.getDoctors().get(6);

        patientRepo.insertPatient(patient);

        patientRepo.addPatientTODoctor(patient, doctor);

        List<Patient> patients =new ArrayList<>();

        patients = doctorRepo.getPatients(doctor);

        for (Patient patient1 : patients) {
            System.out.println(patient1.getName());
        }
         */

        /*

        3. اسماء الادويه الي عند المريض الي اسمه patient1

        patient = patientRepo.getPatients().get(2);

        drugRepo.insertDrug(drug);

        patientRepo.addDrugToPatient(patient, drug);

        List<Drug> drugs =new ArrayList<>();

        patientRepo.getDrugList(patient);
        */
    }
}

/* doctor
- insertDoctor => done
- getPatients => done
- getDoctors => done
   patient
- insertPatient => done
- getDoctor => done
- getDrugsList => done
- getPatients => done
- addPatientToDoctor => done
- addDrugToPatient => done
   drug
- insertDrug => done
   hospital
- insertHospital =>
- getHospitals =>
- getDoctors =>
- addDoctorToHospital =>
- addPatientToHospital =>
 */