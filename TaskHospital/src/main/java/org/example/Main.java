package org.example;

import org.example.Repos.DoctorRepo;
import org.example.Repos.DrugRepo;
import org.example.Repos.PatientRepo;
import org.example.entities.Doctor;
import org.example.entities.Drug;
import org.example.entities.Patient;

public class Main {
    public static void main(String[] args) {

        PatientRepo patientRepo = new PatientRepo();
        DoctorRepo doctorRepo = new DoctorRepo();
        DrugRepo drugRepo = new DrugRepo();

        Doctor doctor = new Doctor();
        Patient patient = new Patient();
        Drug drug = new Drug();
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
 */