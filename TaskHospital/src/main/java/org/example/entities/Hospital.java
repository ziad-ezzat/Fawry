package org.example.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "hospital")
public class Hospital {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column()
    private String name;

    @OneToMany(mappedBy = "hospital")
    private List<Doctor> doctorList;

    @OneToMany(mappedBy = "hospital")
    private List<Patient> patientList;
}
