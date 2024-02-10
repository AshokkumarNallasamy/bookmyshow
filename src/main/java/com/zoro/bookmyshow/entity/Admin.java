package com.zoro.bookmyshow.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Admin {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int adminId;
	String adminName;
	String adminPassword;
	@OneToMany
	List<TheatreAdmin> theatreAdmins;
	@OneToMany
	List<User> users;
	@OneToMany
	List<Movie> movies;
	
	
	
}
