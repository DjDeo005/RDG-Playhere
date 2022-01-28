package com.playhere.dao;

import org.springframework.data.jpa.repository.JpaRepository;

import com.playhere.beans.TimeSlot;

public interface TimeSlotDao extends JpaRepository<TimeSlot, Long>{

}
