package com.boot.dbc.controllers;

import java.util.List;

import com.boot.dbc.entities.Grocery;
import com.boot.dbc.entities.Pointstable;
import com.boot.dbc.entities.Routine;
import com.boot.dbc.entities.Task;
import com.boot.dbc.entities.Users;
import com.boot.dbc.services.GroceryService;
import com.boot.dbc.services.PointsService;
import com.boot.dbc.services.RoutineService;
import com.boot.dbc.services.TaskService;
import com.boot.dbc.services.UserService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class Homecontroller {

    @Autowired
     UserService userService;
    @Autowired
    TaskService taskService;
    @Autowired
    PointsService pointsService;
    @Autowired
    GroceryService groceryService;
    @Autowired
    RoutineService routineService;

    @GetMapping("sayhello")
    public String sayHello(){
        return "Hello User";

    }
    @GetMapping("getusers")
    public List<Users> getusers(){
        return userService.getusers();
        
    }

	/*
	 * @GetMapping("gettasks") public List<Task> gettasks(){ return
	 * (taskService).gettasks(); }
	 */
    @GetMapping("getpoints")
    public List<Pointstable> getpoints(){
    	return (pointsService).getpoints();
    }
    @GetMapping("getgrocery")
    public List<Grocery> getgrocery(){
    	return (groceryService).getgrocery();
    }
    @GetMapping("getroutine")
    public List<Routine> getroutine(){
    	 return (routineService).getroutine();
    }
}
