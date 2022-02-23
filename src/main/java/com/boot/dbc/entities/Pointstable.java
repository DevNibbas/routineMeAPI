package com.boot.dbc.entities;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="pointstable")

public class Pointstable {

	@Id
	@Column(name="p_id")
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private long p_id;
	@Column(name="id")
	private int id;
	@Column(name="points")
	private long points;
	@Column(name = "timestamp")
	private Date timestamp;
	
	public Pointstable() {
		
	}
	public long getP_id() {
		return p_id;
	}
	public void setP_id(long p_id) {
		this.p_id = p_id;
	}
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public long getPoints() {
		return points;
	}
	public void setPoints(long points) {
		this.points = points;
	}
	public Date getTimestamp() {
		return timestamp;
	}
	public void setTimestamp(Date timestamp) {
		this.timestamp = timestamp;
	}
	
}
