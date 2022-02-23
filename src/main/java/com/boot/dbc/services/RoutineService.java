package com.boot.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dbc.entities.Routine;
import com.boot.dbc.repository.Routinerepo;

@Service
public class RoutineService {

	@Autowired
	Routinerepo routinerepo;
	
	public List<Routine> getroutine(){
		return routinerepo.findAll();
	}
}
