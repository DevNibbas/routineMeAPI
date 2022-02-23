package com.boot.dbc.services;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.boot.dbc.entities.Task;
import com.boot.dbc.repository.Taskrepo;

@Service
public class TaskService {

	@Autowired
	Taskrepo taskrepo;
	
	public TaskService(Taskrepo taskrepo) {
		
	}
	public List<Task> SaveTasks(List<Task> tasks){
		return taskrepo.saveAll(tasks);
	}
	
	public List<Task> GetTasks() {
		
		return taskrepo.findAll();
	}
	

public Task GetTaskById(long t_id) {
		
	return taskrepo.findById(t_id).orElse(null);
	}

public String DeleteTask (long t_id) {
	
	 taskrepo.deleteById(t_id);
	 return "Task Removed! For"+t_id;
	}
public Task UpdateTask (Task task) {
	
	 Task ExistingTask=taskrepo.findById(task.getT_id()).orElse(null);
	 ExistingTask.setPriority(task.getPriority());
	 ExistingTask.setTitle(task.getTitle());
	 ExistingTask.setTimestamp(task.getTimestamp());
	 return taskrepo.save(ExistingTask);
	
	}
public Task PatchTask(Task task) {
	Task ExistingTask=taskrepo.findById(task.getT_id()).orElse(null);
    ExistingTask.setPriority(task.getPriority());
    ExistingTask.setTitle(task.getTitle());
    return taskrepo.save(ExistingTask);
}

	
}
