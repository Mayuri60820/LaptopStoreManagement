package com.edu.LaptopStore.ServiceImpl;

import java.util.List;
import java.util.Optional;

import org.springframework.stereotype.Service;

import com.edu.LaptopStore.Entity.Laptop;
import com.edu.LaptopStore.Repository.LaptopRepository;
import com.edu.LaptopStore.Services.LaptopServices;
import com.edu.LaptopStore.Exception.ResourceNotFound;
//import com.edu.SpringBootExample.exception.ResourceNotFound;

@Service
public class LaptopServiceImpl implements LaptopServices{
private LaptopRepository laptopRepository;

	public LaptopServiceImpl(LaptopRepository laptopRepository) {
	super();
	this.laptopRepository = laptopRepository;
}

	@Override
	public Laptop SaveLaptop(Laptop laptop) {
		// TODO Auto-generated method stub
		return laptopRepository.save(laptop);
	}

	@Override
	public List<Laptop> getLaptopAll() {
		// TODO Auto-generated method stub
		return laptopRepository.findAll();
	}

	@Override
	public Optional<Laptop> getLaptopByid(long id) {
		// TODO Auto-generated method stub
		return laptopRepository.findById(id);
	}

	@Override
	public Laptop updateLaptop1(Laptop laptop, long id) {
		Laptop lapi = new Laptop();
		 try {
			   lapi = laptopRepository.findById(id).orElseThrow(
					 ()-> 		 new ResourceNotFound("Laptop","Id",id));
		} catch (ResourceNotFound e) {
			
			e.printStackTrace();
		}
		 lapi.setLaptopName(laptop.getLaptopName());
		 lapi.setLaptopCompanyName(laptop.getLaptopCompanyName());
		 lapi.setLaptopPrice(laptop.getLaptopPrice());
		 lapi.setLaptopDescription(laptop.getLaptopDescription());
		 
		 laptopRepository.save(lapi);
		return lapi;
	}


	@Override
	public List<Laptop> getLaptopByLaptopName(String laptopName) {
		// TODO Auto-generated method stub
		return laptopRepository.findLaptopByLaptopName(laptopName);
	}

	@Override
	public List<Laptop> getLaptopByOrderBy() {
	return laptopRepository.findLaptopOrderBy();
	}

	@Override
	public void deleteLaptop(long id) {
		laptopRepository.findById(id).orElseThrow(
				()->        new ResourceNotFound("Laptop","Id",id));
  
		laptopRepository.deleteById(id);
		
	}

	@Override
	public Laptop updateLaptopPartially(Laptop laptop, long id) {
		// TODO Auto-generated method stub
		Laptop lap = new Laptop();
		 try {
			   lap = laptopRepository.findById(id).orElseThrow(
					 ()-> 		 new ResourceNotFound("Laptop","Id",id));
		} catch (ResourceNotFound e) {
			
			e.printStackTrace();
		}
		 if(laptop.getLaptopName() !=null)
		 {
			 lap.setLaptopName(laptop.getLaptopName());
		 }
		 if(laptop.getLaptopCompanyName() !=null)
		 {
			 lap.setLaptopCompanyName(laptop.getLaptopCompanyName());
		 }
		 if(laptop.getLaptopPrice() !=null)
		 {
			 lap.setLaptopPrice(laptop.getLaptopPrice());
		 }
		 if(laptop.getProcessor() !=null)
		 {
			 lap.setProcessor(laptop.getProcessor());
		 }
		 if(laptop.getLaptopDescription() != null)
		 {
			lap.setLaptopDescription(laptop.getLaptopDescription()); 
		 }
		 
		 laptopRepository.save(lap);
		return lap;
	}

	@Override
	public List<Laptop> getLaptopByProcessor(String processor) {
		// TODO Auto-generated method stub
		return laptopRepository.findByProcessor(processor);
	}

	
	/*@Override
	public List<Laptop> SaveLaptopAll() {
		// TODO Auto-generated method stub
		return laptopRepository.saveAll();
	}*/

	

	

}
