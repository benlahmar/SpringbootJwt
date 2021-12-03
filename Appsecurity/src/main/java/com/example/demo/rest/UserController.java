package com.example.demo.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.AppUser;
import com.example.demo.services.IAccountService;

@RestController
public class UserController {
@Autowired
private IAccountService accountService;


	@PostMapping("/users")
	public AppUser signUp(@RequestBody RegistrationForm data) {
		String username=data.getUsername();
		AppUser user=accountService.findUserByUsername(username);
		if(user!=null)
			throw new RuntimeException("This user already exists, Try with an other  username");
		String password=data.getPassword();	
		String repassword=data.getRepassword();
		if(!password.equals(repassword))
			throw new RuntimeException("You must confirm your password");
		AppUser  u=new  AppUser();	
		u.setUsername(username);  
		u.setPassword(password);
		accountService.saveUser(u);  
		accountService.addRoleToUser(username, "USER");  
		return (u);
	}


	@GetMapping("/load")
	public String load()
	{
//		accountService.saveRole(new AppRole("USER"));  
//		accountService.saveRole(new AppRole("ADMIN"));  
//		accountService.saveUser(new AppUser("user","1234", null));  
//		accountService.saveUser(new AppUser("admin","1234", null));

		accountService.addRoleToUser("user", "USER");  
		accountService.addRoleToUser("admin", "USER");  
		accountService.addRoleToUser("admin", "ADMIN");
		return "ok";

	}
}
