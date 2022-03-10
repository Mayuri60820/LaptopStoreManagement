package com.edu.LaptopStore.Services;

import java.util.List;
import java.util.Optional;

import com.edu.LaptopStore.Entity.Laptop;

public interface LaptopServices {

	Laptop SaveLaptop(Laptop laptop);

	List<Laptop> getLaptopAll();

	Optional<Laptop> getLaptopByid(long id);

	Laptop updateLaptop1(Laptop laptop, long id);

	List<Laptop> getLaptopByLaptopName(String laptopName);

	void deleteLaptop(long id);

	Laptop updateLaptopPartially(Laptop laptop, long id);

	//List<Laptop> SaveLaptopAll();

	//void insertAll(List<Laptop> laptop);

	List<Laptop> getLaptopByOrderBy();

	List<Laptop> getLaptopByProcessor(String processor);

	//List<Laptop> getLaptopByLaptopPrice();

	

	
	
	
}
