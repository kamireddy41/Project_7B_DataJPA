package com.telusko.DataJpaProject01;

import java.util.ArrayList;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ConfigurableApplicationContext;

import com.telusko.DataJpaProject01.entity.Vaccine;
import com.telusko.DataJpaProject01.service.VaccineServiceImpl;


@SpringBootApplication
public class DataJpaProject01Application {

	public static void main(String[] args) {
		ConfigurableApplicationContext container = SpringApplication.run(DataJpaProject01Application.class, args);
	
		VaccineServiceImpl service = container.getBean(VaccineServiceImpl.class);

		
		Vaccine v1=new Vaccine("CovidShield", "Astrazenica", 45454.4);

//		service.searchByGivenVaccineInfo(v1, true, "vaccineCompany").forEach(v->System.out.println(v));
		
		
//		System.out.println(service.searchVaccineById(3));
		
		ArrayList<Integer> ids=new ArrayList<>();
		ids.add(52);
	
		ids.add(53);
//		service.searchVaccinesByIds(list).forEach(v->System.out.println(v));
		
	//	service.searchVaccinesByVaccine(v1).forEach(v->System.out.println(v));
	//	String status=service.removeVaccineByIds(ids);
		String status=service.removeVaccineByIdsCrud(ids);
		System.out.println(status);
	}

}
