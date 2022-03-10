package com.edu.LaptopStore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;

import com.edu.LaptopStore.Entity.Customer;

public interface CustomerRepository extends JpaRepository<Customer,Long> {
	@Query("Select c from Customer c Where c.emailId=:email And c.password=:password")
	List<Customer> FindCustomerByemailIdAndpassword(@Param("email") String emailId,@Param("password") String password);

}
