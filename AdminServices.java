package com.edu.LaptopStore.Services;

import java.util.List;

import com.edu.LaptopStore.Entity.Admin;

public interface AdminServices {

	Admin SaveLaptop(Admin admin);

	List<Admin> getAdminByUserNameAndPassword(String userName, String password);


}
