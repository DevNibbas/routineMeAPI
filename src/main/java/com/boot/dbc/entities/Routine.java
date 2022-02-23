package com.boot.dbc.entities;

import java.sql.Time;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="routines")
public class Routine {
	
@Id
@Column(name="r_id")
@GeneratedValue(strategy = GenerationType.IDENTITY)
private long r_id;

@Column(name="t_id")
private long t_id;

@Column(name="title")
private String title;

@Column(name="starttime")
private Time starttime;

@Column(name="endtime")
private Time endtime;

@Column(name="priority")
private String priority;

@Column(name="frequency")
private long frequency;

public Routine() {
	super();
}

public long getR_id() {
	return r_id;
}

public void setR_id(long r_id) {
	this.r_id = r_id;
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

public Time getStarttime() {
	return starttime;
}

public void setStarttime(Time starttime) {
	this.starttime = starttime;
}

public Time getEndtime() {
	return endtime;
}

public void setEndtime(Time endtime) {
	this.endtime = endtime;
}

public String getPriority() {
	return priority;
}

public void setPriority(String priority) {
	this.priority = priority;
}

public long getFrequency() {
	return frequency;
}

public void setFrequency(long frequency) {
	this.frequency = frequency;
}

}
