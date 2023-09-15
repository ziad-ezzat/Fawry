package com.example.spring.data.repository.entity;

import lombok.Data;

import javax.persistence.*;
import java.io.Serializable;

@Data
@Entity
@Table(name = "CUSTOMERS")
public class Customer implements Serializable {
	private static final long serialVersionUID = 1L;

	@Id
	@SequenceGenerator(name = "CUSTOMER_SEQ_GENERATOR", sequenceName = "CUSTOMER_SEQ")
	@GeneratedValue(strategy = GenerationType.SEQUENCE, generator = "CUSTOMER_SEQ_GENERATOR")
	private long id;

	@Column(name = "EMAIL")
	private String email;

	@Column(name = "MOBILE_NUMBER")
	private String mobile;

	@Column(name = "NAME")
	private String name;


}
