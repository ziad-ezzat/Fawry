package org.example.entities;

import lombok.Data;

import javax.persistence.*;
import java.util.ArrayList;
import java.util.List;

@Data
@Entity
@Table(name = "patient")
public class Patient {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long id;

    @Column(name = "patient_name")
    private String name;

    @Column(name = "age")
    private Integer age;

    @ManyToOne
    @JoinColumn(name = "doctor_id")
    private Doctor doctor;

    @ManyToMany(fetch = FetchType.EAGER)
    @JoinTable(
            name = "patient_drug",
            joinColumns = @JoinColumn(name = "patient_id"),
            inverseJoinColumns = @JoinColumn(name = "drug_id")
    )
    List<Drug> drugList =new ArrayList<>();

    @ManyToOne
    @JoinColumn(name = "hospital_id")
    private Hospital hospital;
}