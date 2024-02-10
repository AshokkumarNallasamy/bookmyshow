package com.zoro.bookmyshow.entity;

import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.OneToMany;
import jakarta.persistence.OneToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Screen {
	@Id
	int screenId;
	String screenName;
	@OneToOne
	Movie movie;
	
	@OneToMany
	List<Seat> seats;
	
	@OneToOne
	Theatre theatre;
}
