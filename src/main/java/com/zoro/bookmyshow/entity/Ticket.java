package com.zoro.bookmyshow.entity;

import java.time.LocalDateTime;
import java.util.List;

import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.ManyToMany;
import jakarta.persistence.ManyToOne;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Ticket {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	int ticketId;
	
	LocalDateTime bookingTime;
	
	@ManyToOne
	Cart cart;
	
	@ManyToOne
	Movie movie;
	
	@ManyToOne
	Theatre theatre;
	
	@ManyToOne
	Screen screen;
	
	@ManyToMany
	List<Seat> seats;
	
	
}
