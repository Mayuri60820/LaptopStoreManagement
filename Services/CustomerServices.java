package com.edu.LaptopStore.Services;

import java.util.List;

import com.edu.LaptopStore.Entity.Customer;

public interface CustomerServices {

	Customer SaveCustomer(Customer customer);

	List<Customer> getCustomerByEmailIdAndPassword(String emailId, String password);

}
