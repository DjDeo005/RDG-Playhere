package com.playhere.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.playhere.beans.Ground;
import com.playhere.beans.Newground;
import com.playhere.dao.GroundDao;

@Service
public class GroundServiceImpl implements GroundService{

	@Autowired
	GroundDao groundDao;

	@Override
	public List<Newground> displayAll() {
		return groundDao.findAll();
	}


}
