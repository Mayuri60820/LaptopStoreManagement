package com.edu.LaptopStore.ServiceImpl;

import java.util.List;

import org.springframework.stereotype.Service;

import com.edu.LaptopStore.Entity.Admin;
import com.edu.LaptopStore.Entity.Parts;
import com.edu.LaptopStore.Repository.AdminRepository;
import com.edu.LaptopStore.Services.AdminServices;
@Service
public class AdminImpl implements AdminServices {
	private AdminRepository AdminRepository;

	public AdminImpl(AdminRepository adminRepository) {
		super();
		AdminRepository = adminRepository;
	}

	@Override
	public Admin SaveLaptop(Admin admin) {
		// TODO Auto-generated method stub
		return AdminRepository.save(admin);
	}

	@Override
	public List<Admin> getAdminByUserNameAndPassword(String userName, String password) {
		// TODO Auto-generated method stub
		Admin admin=new Admin();
		return AdminRepository.findAdminByUserNameAndPassword(userName,password);
	}
	

}
