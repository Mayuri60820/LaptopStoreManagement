package com.edu.LaptopStore.Controller;

import java.util.List;

import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.edu.LaptopStore.Entity.Customer;
import com.edu.LaptopStore.Services.CustomerServices;

@RestController
@RequestMapping("/api/customerTbl")
public class CustomerController {
	private CustomerServices customerServices;

	public CustomerController(CustomerServices customerServices) {
		super();
		this.customerServices = customerServices;
	}
	@PostMapping
	public ResponseEntity<Customer> SaveCustomer(@RequestBody Customer customer)
	{
		return new ResponseEntity<Customer>(customerServices.SaveCustomer(customer),HttpStatus.CREATED);
	}
	@GetMapping("/CustomerByEmailAndPassword")
	public List<Customer> getCustomerByEmailIdAndPassword(@RequestParam("emailId") String emailId,@RequestParam("password") String password)
	{
		return customerServices.getCustomerByEmailIdAndPassword(emailId,password);
		
	}

}
