package com.telusko.DataJpaProject01.entity;


import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;

@Entity
@Table(name="VaccineInfo")
public class Vaccine 
{

	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Integer id;
	
	private String vaccineName;
	
	private String vaccineCompany;
	
	private Double vaccineCost;

	public Vaccine(String vaccineName, String vaccineCompany, Double vaccineCost) {
		super();
		this.vaccineName = vaccineName;
		this.vaccineCompany = vaccineCompany;
		this.vaccineCost = vaccineCost;
	}

	public Vaccine() {
		super();
		// TODO Auto-generated constructor stub
	}

	public Integer getId() {
		return id;
	}

	public void setId(Integer id) {
		this.id = id;
	}

	public String getVaccineName() {
		return vaccineName;
	}

	public void setVaccineName(String vaccineName) {
		this.vaccineName = vaccineName;
	}

	public String getVaccineCompany() {
		return vaccineCompany;
	}

	public void setVaccineCompany(String vaccineCompany) {
		this.vaccineCompany = vaccineCompany;
	}

	public Double getVaccineCost() {
		return vaccineCost;
	}

	public void setVaccineCost(Double vaccineCost) {
		this.vaccineCost = vaccineCost;
	}

	@Override
	public String toString() {
		return "Vaccine [id=" + id + ", vaccineName=" + vaccineName + ", vaccineCompany=" + vaccineCompany
				+ ", vaccineCost=" + vaccineCost + "]";
	}
	
	
}
