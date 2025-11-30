package com.telusko.DataJpaProject01.repo;

import org.springframework.data.jpa.repository.JpaRepository;

import com.telusko.DataJpaProject01.entity.Vaccine;



public interface IVaccineRepo extends JpaRepository<Vaccine, Integer>
{

}
