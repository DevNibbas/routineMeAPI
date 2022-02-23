package com.boot.dbc.repository;

import com.boot.dbc.entities.Users;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface Userrepo extends JpaRepository<Users,Long> {
    
}
