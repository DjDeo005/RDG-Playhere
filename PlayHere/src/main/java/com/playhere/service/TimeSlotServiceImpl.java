package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.TimeSlot;
import com.playhere.dao.TimeSlotDao;

@Service
public class TimeSlotServiceImpl implements TimeSlotService{

	@Autowired 
	TimeSlotDao timeSlotDao;

	@Override
	public void addTimeSlot(TimeSlot t) {
		timeSlotDao.save(t);		
	}



	@Override
	public List<TimeSlot> findAll() {
		return timeSlotDao.findAll();
	}



	
	
}
