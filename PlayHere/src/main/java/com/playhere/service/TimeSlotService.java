package com.playhere.service;

import java.util.List;

import com.playhere.beans.TimeSlot;

public interface TimeSlotService {

	void addTimeSlot(TimeSlot t);



	List<TimeSlot> findAll();



	

}
