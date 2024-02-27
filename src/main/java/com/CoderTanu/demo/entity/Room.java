package com.CoderTanu.demo.entity;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Entity
@Table(name="room")
public class Room {
	
	@Id
	@Column(name="room_id")
	@GeneratedValue(strategy=GenerationType.AUTO)
	private Long id;
	
	@Column(name="name")
	private String name;
	
	@Column(name="room_number")
	private String roomNumber;
	
	@Column(name="bed_Info")
	private String bedInfo;

	public Long getId() {
		return id;
	}

	public void setId(Long id) {
		this.id = id;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getRoomNumber() {
		return roomNumber;
	}

	public void setRoom_number(String roomNumber) {
		this.roomNumber = roomNumber;
	}

	public String getBedInfo() {
		return bedInfo;
	}

	public void setBedInfo(String bedInfo) {
		this.bedInfo = bedInfo;
	}

	@Override
	public String toString() {
		return "Room [id=" + id + ", name=" + name + ", roomNumber=" + roomNumber + ", bedInfo=" + bedInfo + "]";
	}
	
	

}
