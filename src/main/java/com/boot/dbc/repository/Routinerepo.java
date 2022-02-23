package com.boot.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.dbc.entities.Routine;

@Repository
public interface Routinerepo extends JpaRepository<Routine,Long>{

}
