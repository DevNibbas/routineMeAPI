package com.boot.dbc.entities;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="groceries")
public class Grocery {

	@Id
	@Column(name="g_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long g_id;
	
	@Column(name="title")
	private String title;
	
	public Grocery() {
		
	}

	public long getG_id() {
		return g_id;
	}

	public void setG_id(long g_id) {
		this.g_id = g_id;
	}

	public String getTitle() {
		return title;
	}

	public void setTitle(String title) {
		this.title = title;
	}
	
	
}
