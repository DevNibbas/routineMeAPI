package com.boot.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.dbc.entities.Pointstable;

@Repository
public interface Pointsrepo extends JpaRepository<Pointstable,Long> {

}
