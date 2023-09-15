package org.example.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.List;

@Data
@Entity
@Table(name = "doctor")
public class Doctor {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(name = "department")
    private String department;

    @OneToMany(mappedBy = "doctor")
    private List<Patient> patientList;

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;

}
