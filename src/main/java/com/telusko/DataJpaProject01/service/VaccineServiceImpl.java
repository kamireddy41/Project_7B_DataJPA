package com.telusko.DataJpaProject01.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.domain.Example;
import org.springframework.data.domain.Sort;
import org.springframework.data.domain.Sort.Direction;
import org.springframework.stereotype.Service;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.repo.IVaccineRepo;

@Service
public class VaccineServiceImpl implements IVaccineService 
{
	@Autowired
	private IVaccineRepo repo;

	@Override
	public List<Vaccine> searchByGivenVaccineInfo(Vaccine Obj, Boolean status, String... param) {
		Sort sort=Sort.by(status?Direction.ASC:Direction.DESC, param);
		
		Example<Vaccine> example=Example.of(Obj);
		return repo.findAll(example=Example.of(Obj), sort);
		
	}

	@Override
	public Vaccine searchVaccineById(Integer id) {
		
		return repo.getReferenceById(id);
	}

	@Override
	public List<Vaccine> searchVaccinesByIds(Iterable<Integer> ids) {
		  
		
		List<Vaccine> list = repo.findAllById(ids);
		return list;
	}

	@Override
	public List<Vaccine> searchVaccinesByVaccine(Vaccine vaccine) 
	{
		Example<Vaccine> example=Example.of(vaccine);
		List<Vaccine> exm = repo.findAll(example);
		return exm;
	}

	@Override
	public String removeVaccineByIds(Iterable<Integer> ids) {
	    List<Vaccine> list = repo.findAllById(ids);
	    if(list.size()!=0)
	    {
	    	repo.deleteAllByIdInBatch(ids);
	    	return "Records deleted for the given ids";
	    }
	    return "Fail to delete the records";
		
		
	}

	@Override
	public String removeVaccineByIdsCrud(List<Integer> ids) {
		
		List<Vaccine> list = repo.findAllById(ids);
		if(list.size()==ids.size())
		{
			repo.deleteAllById(ids);
	    	return "Records deleted for the given ids";
		}
	    return "Fail to delete the records";
	}

   
	
}
