package com.playhere.beans;


import java.sql.Time;
import java.time.LocalDateTime;
import java.util.UUID;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.Id;
import javax.persistence.OneToOne;

@Entity
public class GroundBooking {

	@Id
	@GeneratedValue
	private long id;
	private LocalDateTime datetime;
	private double price;
	@OneToOne
	private Users user;
	public GroundBooking() {
		super();
	}
	public GroundBooking(long id, LocalDateTime datetime, double price) {
		super();
		this.id = id;
		this.datetime = datetime;
		this.price = price;
	}
	@Override
	public String toString() {
		return "GroundBooking [id=" + id + ", datetime=" + datetime + ", price=" + price + "]";
	}
	
	
}
