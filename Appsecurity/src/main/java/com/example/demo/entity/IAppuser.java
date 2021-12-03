package com.example.demo.entity;

import org.springframework.data.jpa.repository.JpaRepository;

public interface IAppuser extends JpaRepository<AppUser, Long>{

	public AppUser findByUsername(String username);

}
