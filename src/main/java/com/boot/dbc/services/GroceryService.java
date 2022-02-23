package com.boot.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dbc.entities.Grocery;
import com.boot.dbc.repository.Groceryrepo;

@Service
public class GroceryService {

	@Autowired
	Groceryrepo groceryrepo;
	
	public List<Grocery> getgrocery(){
		return groceryrepo.findAll();
	}
	
}
