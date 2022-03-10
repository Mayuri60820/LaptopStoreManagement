package com.edu.LaptopStore.Repository;

import java.util.List;

import org.springframework.data.jpa.repository.JpaRepository;

import com.edu.LaptopStore.Entity.Admin;

public interface AdminRepository extends JpaRepository<Admin,Integer> {

	List<Admin> findAdminByUserNameAndPassword(String userName, String password);

	

}
