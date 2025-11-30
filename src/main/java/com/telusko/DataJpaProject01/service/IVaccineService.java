package com.telusko.DataJpaProject01.service;

import java.util.List;

import com.telusko.DataJpaProject01.entity.Vaccine;

public interface IVaccineService 
{
	 public List<Vaccine> searchByGivenVaccineInfo(Vaccine Obj, Boolean status, String...param);
      
	 public Vaccine searchVaccineById(Integer id);
	 
	 public List<Vaccine> searchVaccinesByIds(Iterable<Integer> ids);
	 
	 public List<Vaccine> searchVaccinesByVaccine(Vaccine vaccine);
	 
	 public String removeVaccineByIds(Iterable<Integer> ids);
	 
	 public String removeVaccineByIdsCrud(List<Integer> ids);
	 
}