package com.edu.LaptopStore.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.LaptopStore.Entity.Customer;
import com.edu.LaptopStore.Repository.CustomerRepository;
import com.edu.LaptopStore.Services.CustomerServices;
@Service
public class CustomerImpl implements CustomerServices {
	private CustomerRepository customerRepository;
	

	public CustomerImpl(CustomerRepository customerRepository) {
		super();
		this.customerRepository = customerRepository;
	}


	@Override
	public Customer SaveCustomer(Customer customer) {
		// TODO Auto-generated method stub
		return customerRepository.save(customer);
	}


	@Override
	public List<Customer> getCustomerByEmailIdAndPassword(String emailId, String password) {
		// TODO Auto-generated method stub
		return customerRepository.FindCustomerByemailIdAndpassword(emailId, password);
	}

}
