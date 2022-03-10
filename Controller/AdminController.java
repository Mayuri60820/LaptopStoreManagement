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
import com.edu.LaptopStore.Entity.Admin;
import com.edu.LaptopStore.Services.AdminServices;
@RestController
@RequestMapping("api/adminRegistration")
public class AdminController {
private AdminServices adminServices;

public AdminController(AdminServices adminServices) {
	super();
	this.adminServices = adminServices;
}
@PostMapping
public ResponseEntity<Admin>SaveLaptop(@RequestBody Admin Admin)
{
	return new ResponseEntity<Admin>(adminServices.SaveLaptop(Admin),HttpStatus.CREATED);
}
@GetMapping("/AdminByFirstNameAndLastName")
public List<Admin>getAdminByUserNameAndPassword(@RequestParam("userName") String userName,@RequestParam("password") String password)
{
	return adminServices.getAdminByUserNameAndPassword(userName,password);

}

}
