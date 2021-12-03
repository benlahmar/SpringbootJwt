package com.example.demo.entity;


import org.springframework.data.jpa.repository.JpaRepository;

public interface IRole extends JpaRepository<AppRole, Long>{

	public AppRole findByRole(String rolename);

}
