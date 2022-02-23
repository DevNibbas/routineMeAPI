package com.boot.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dbc.entities.Pointstable;
import com.boot.dbc.repository.Pointsrepo;

@Service
public class PointsService {
	
    @Autowired
	Pointsrepo pointsrepo;

	
	public List<Pointstable> getpoints()
	{
		return pointsrepo.findAll();
	}
    
}
