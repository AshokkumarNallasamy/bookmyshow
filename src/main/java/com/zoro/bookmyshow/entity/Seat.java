package com.zoro.bookmyshow.entity;

import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import lombok.Getter;
import lombok.Setter;

@Entity
@Getter
@Setter
public class Seat {
	@Id
	int seatId;
	String seatType;
	double seatCost;
}
