package com.edu.LaptopStore.Controller;

import java.util.List;
import java.util.Optional;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.edu.LaptopStore.Entity.Laptop;
import com.edu.LaptopStore.Services.LaptopServices;

@RestController
@RequestMapping("api/laptopStoreDatabase")
public class LaptopController {
	private LaptopServices laptopServices;

	public LaptopController(LaptopServices laptopServices) {
		super();
		this.laptopServices = laptopServices;
	}
	@PostMapping
	public ResponseEntity<Laptop>SaveLaptop(@RequestBody Laptop laptop)
	{
		return new ResponseEntity<Laptop>(laptopServices.SaveLaptop(laptop),HttpStatus.CREATED);
	}

	/* @PostMapping("/bulkUser")
	    public String addUser(@RequestBody List<Laptop> laptop) {
	        if(laptop != null && !laptop.isEmpty()) {
	            laptopServices.insertAll(laptop);
	            return String.format("Added users.", laptop.size());
	        } else {
	            return REQUEST_NO_BODY;
	        }
	    }*/
	@GetMapping
	public List<Laptop>getLaptopAll()
	{
		return laptopServices.getLaptopAll();
	}
	@GetMapping("{id}")
	public Optional<Laptop> getLaptopByid(@PathVariable("id") long id)
	{
		return laptopServices.getLaptopByid(id);
	}
	@PutMapping("{id}")
	public ResponseEntity<Laptop> updateLaptop1(@PathVariable("id") long id, @RequestBody Laptop laptop){
		
		return new ResponseEntity<Laptop>(laptopServices.updateLaptop1(laptop, id),HttpStatus.OK);		
	}
	@GetMapping("/LaptopByName/{laptopName}")
    public List<Laptop> getLaptopByLaptopName(@PathVariable("laptopName") String laptopName)
     {
    	return laptopServices.getLaptopByLaptopName(laptopName);
     }
	@GetMapping("/LaptopByProcessor/{processor}")
    public List<Laptop> getLaptopByProcessor(@PathVariable("processor") String processor)
     {
    	return laptopServices.getLaptopByProcessor(processor);
     } 
	 @DeleteMapping("{id}")
	  public ResponseEntity<String> deleteLaptop(@PathVariable("id") long id){
	    	laptopServices.deleteLaptop(id);
	    	
	    	return new ResponseEntity<String>("Employee record deleted",HttpStatus.OK);  	
	    }
	 @PatchMapping("{id}")
		public ResponseEntity<Laptop> updateLaptopPartially(@PathVariable("id") long id, @RequestBody Laptop laptop){
			
			return new ResponseEntity<Laptop>(laptopServices.updateLaptopPartially(laptop, id),HttpStatus.OK);		
		}
	 
	@GetMapping("/LaptopByOrderBy")
	    public List<Laptop> getLaptopByOrderBy()
	    {
	    	return laptopServices.getLaptopByOrderBy();
	    }
	/*@GetMapping("/LaptopByRange")
	public List<Laptop> getLaptopByLaptopPrice()
	{
		return laptopServices.getLaptopByLaptopPrice();
	}*/

}
