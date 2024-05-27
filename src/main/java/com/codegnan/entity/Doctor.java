package com.codegnan.entity;

import java.util.List;

import com.fasterxml.jackson.annotation.JsonIgnore;

import jakarta.persistence.CascadeType;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.Table;

@Entity
@Table(name="Doctor121")
public class Doctor {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int id;
	String name;
	String specialization;
	@OneToMany(mappedBy ="doctor", cascade = CascadeType.ALL)
	@JsonIgnore
	List<Patient> patients;
	public Doctor() {
		super();
		// TODO Auto-generated constructor stub
	}
//	public Doctor(int id, String name, String specialization,) {
//		super();
//		this.id = id;
//		this.name = name;
//		this.specialization = specialization;
//		
//	}
	public Doctor(String name, String specialization) {
		super();
		this.name = name;
		this.specialization = specialization;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getSpecialization() {
		return specialization;
	}
	public void setSpecialization(String specialization) {
		this.specialization = specialization;
	}
	public List<Patient> getPatients() {
		return patients;
	}
	public void setPatients(List<Patient> patients) {
		this.patients = patients;
	}
	@Override
	public String toString() {
		return "Doctor [id=" + id + ", name=" + name + ", specialization=" + specialization + ", patients=" + patients
				+ "]";
	}
	
	
	
}
