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
public class TheatreAdmin {
	@Id
	int theatreAdminId;
	String theatreAdminName;
	String theatreAdminPassword;
	
	@OneToMany
	List<Theatre> theatres;
}
