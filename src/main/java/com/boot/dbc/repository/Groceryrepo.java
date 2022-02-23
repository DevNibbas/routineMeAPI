package com.boot.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.dbc.entities.Grocery;

@Repository
public interface Groceryrepo extends JpaRepository<Grocery,Long>{ 

}
