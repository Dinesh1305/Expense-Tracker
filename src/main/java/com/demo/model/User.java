package com.demo.model;

import java.util.List;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
@Entity
public class User {
	@Id
	@GeneratedValue
	private Integer id;
	
	@Column(unique=true,nullable=false)
	private String email;
	
	@Column(nullable=false)
	private String password;

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}
	
	@OneToMany
	private List<Income> income;
	
	
	@OneToMany
	private List<Expense> expense;

	@Override
	public String toString() {
		return "User [id=" + id + ", email=" + email + ", password=" + password + ", income=" + income + ", expense="
				+ expense + "]";
	}
	
}



