package com.boot.dbc.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.boot.dbc.entities.Task;

@Repository
public interface Taskrepo extends JpaRepository<Task,Long> {

}
