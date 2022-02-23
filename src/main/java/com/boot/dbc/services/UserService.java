package com.boot.dbc.services;

import java.util.List;

import com.boot.dbc.entities.Users;

import com.boot.dbc.repository.Userrepo;


import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;



@Service
public class UserService {
    
    @Autowired 
    Userrepo userrepo;
    

    public UserService(Userrepo userrepo) {
      
    }

    public  List<Users> getusers(){
        return userrepo.findAll();
    }

	
    
}
