package com.boot.dbc.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="tasks")
public class Task {
    
	@Id
	@Column(name="t_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long t_id;
	
	@Column(name="title")
	private String title;
	
	@Column(name="timestamp")
	private Time timestamp;

	@Column(name="priority")
	private String priority;
	
	
	



	public Task() {
		super();
	}


	


	public long getT_id() {
		return t_id;
	}


	public void setT_id(long t_id) {
		this.t_id = t_id;
	}


	public String getTitle() {
		return title;
	}


	public void setTitle(String title) {
		this.title = title;
	}


	public Time getTimestamp() {
		return timestamp;
	}


	public void setTimestamp(Time timestamp) {
		this.timestamp = timestamp;
	}
	public String getPriority() {
		return priority;
	}

	public void setPriority(String priority) {
		this.priority = priority;
	}


}
