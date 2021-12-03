package com.example.demo.services;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.AppUser;

public interface IAccountService {
		public  AppUser   saveUser(AppUser u);
		public  AppRole  saveRole(AppRole r);
		public AppUser findUserByUsername(String username);  
		public void addRoleToUser(String username,String role);
}

