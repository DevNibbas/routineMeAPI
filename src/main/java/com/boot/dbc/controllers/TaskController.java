package com.boot.dbc.controllers;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PatchMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.boot.dbc.entities.Task;
import com.boot.dbc.services.TaskService;

@RestController
public class TaskController {

	@Autowired
	private TaskService taskService;
	
   //add singular post 
	@PostMapping("/tasks")
	public List<Task> AddTasks(@RequestBody List<Task> tasks) {
		return taskService.SaveTasks(tasks);
	}

	@GetMapping("/tasks")
	public List<Task> AllTasks() {
		return taskService.GetTasks();
	}

	@GetMapping("/task/{t_id}")
	public Task FindById(@PathVariable long t_id) {
		return taskService.GetTaskById(t_id);
	}

	
	  @PutMapping("/task/{t_id}") 
	  public Task UpdateTask(@RequestBody Task
	 task,@PathVariable long t_id)
	  { return taskService.UpdateTask(task); }
	 

	/*
	 * @PutMapping("/task") public Task UpdateTask(@RequestBody Task task) { return
	 * taskService.UpdateTask(task); }
	 */
//?
	@PatchMapping("/task/{t_id}")
	public Task ChangeTask(@RequestBody Task task, @PathVariable long t_id) {
		return taskService.PatchTask(task);
	}

	@DeleteMapping("/task/{t_id}")
	public String DeleteTask(@PathVariable long t_id) {
		return taskService.DeleteTask(t_id);
	}
}
