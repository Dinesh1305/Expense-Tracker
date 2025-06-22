package com.demo.model;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;

@Entity
public class Income {

	@Id
	private Integer id;
	
	@Column(nullable=false)
	private String category;
	

	
}
