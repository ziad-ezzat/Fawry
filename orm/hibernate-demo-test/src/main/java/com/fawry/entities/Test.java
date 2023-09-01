package com.fawry.entities;

import lombok.Data;

import javax.persistence.*;

@Entity
@Table(name = "Test")
@Data
public class Test {

	@Id
	@SequenceGenerator(name = "ID_GENERATOR", sequenceName = "CREATE_ID_SEQUNCE", allocationSize = 1)
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "ID_GENERATOR")
	@Column(name = "id")
	private int id;

	@Column(name = "name")
	private String name;

}
