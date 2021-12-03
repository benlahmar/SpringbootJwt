package com.example.demo.services;

import javax.transaction.Transactional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.bcrypt.BCryptPasswordEncoder;
import org.springframework.stereotype.Service;

import com.example.demo.entity.AppRole;
import com.example.demo.entity.AppUser;
import com.example.demo.entity.IAppuser;
import com.example.demo.entity.IRole;

@Service
//@Transactional
public class AccountServiceImpl implements IAccountService {

	@Autowired
	IRole roleRepository;
	
	@Autowired
	IAppuser userRepository;
	
	@Autowired
	private BCryptPasswordEncoder bCryptPasswordEncoder;

	@Override
	public AppUser saveUser(AppUser u) {
		u.setPassword(bCryptPasswordEncoder.encode(u.getPassword()));  
		return userRepository.save(u);
	}

	@Override
	public AppRole saveRole(AppRole r) {
		return roleRepository.save(r);
	}

	@Override
	public AppUser findUserByUsername(String username) {
		return userRepository.findByUsername(username);
	}

	@Override
	public void addRoleToUser(String username, String rolename) {
			AppUser user=userRepository.findByUsername(username);  
			AppRole role=roleRepository.findByRole(rolename);  
			user.getRoles().add(role);
			userRepository.save(user);
		
	}

}
