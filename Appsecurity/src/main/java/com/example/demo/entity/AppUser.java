package com.example.demo.entity;

import java.util.ArrayList;
import java.util.List;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.ManyToMany;
import javax.persistence.Transient;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonIgnore;
import com.fasterxml.jackson.annotation.JsonManagedReference;

@Entity
public class AppUser {

	@Id
	@GeneratedValue
	long id;
	String username,password;
	
	@JsonIgnore
	@Transient
	String repassword;
	
	//@JsonManagedReference
	@ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
	List<AppRole> roles=new ArrayList<>();

	

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	
	public  String getPassword() {
		return password;
	}

	public void setPassword(String password) {
		this.password = password;
	}

	public List<AppRole> getRoles() {
		return roles;
	}

	public void setRoles(List<AppRole> roles) {
		this.roles = roles;
	}

	public AppUser() {
		super();
		// TODO Auto-generated constructor stub
	}

	public AppUser(long id, String username, String password) {
		super();
		this.id = id;
		this.username = username;
		this.password = password;
	}

	public AppUser( String username, String password, List<AppRole> roles) {
		super();
		
		this.username = username;
		this.password = password;
		this.roles = roles;
	}

	protected String getRepassword() {
		return repassword;
	}

	protected void setRepassword(String repassword) {
		this.repassword = repassword;
	}
	
}
