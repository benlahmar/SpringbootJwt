package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;

import com.fasterxml.jackson.annotation.JsonBackReference;

@Entity
public class AppRole {

	@Id
	@GeneratedValue
	long id;
	String role;
	
	//@JsonBackReference
	@ManyToMany(mappedBy = "roles")
	List<AppUser> users=new ArrayList<>();

	protected long getId() {
		return id;
	}

	protected void setId(long id) {
		this.id = id;
	}

	public String getRole() {
		return role;
	}

	public void setRole(String role) {
		this.role = role;
	}

	public List<AppUser> getUsers() {
		return users;
	}

	public void setUsers(List<AppUser> users) {
		this.users = users;
	}

	public AppRole() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppRole(long id, String role) {
		super();
		this.id = id;
		this.role = role;
		
	}

	public AppRole(String role) {
		super();
		this.role = role;
	}
	
}
