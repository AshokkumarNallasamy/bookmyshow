package com.zoro.bookmyshow.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Theatre {
	@Id
	int theatreId;
	String theatreName;
	@OneToMany
	List<Screen> screens;
	@OneToMany
	List<Movie> movies;
	
}
