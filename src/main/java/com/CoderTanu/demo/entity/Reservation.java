package com.CoderTanu.demo.entity;

import java.util.Date;

import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import jakarta.persistence.Table;


@Table(name="reservations")
@Entity
public class Reservation {
	
	
	@Id
	@GeneratedValue(strategy=GenerationType.AUTO)
	@Column(name="reseravation_id")
	private long id;
	
	@Column(name="room_id")
	private long roomId;
	
	@Column(name="guest_id")
	private long guestId;
	
	@Column(name="res_date")
	private Date reservationDate;

	public long getId() {
		return id;
	}

	public void setId(long id) {
		this.id = id;
	}

	public long getRoomId() {
		return roomId;
	}

	public void setRoomId(long roomId) {
		this.roomId = roomId;
	}

	public long getGuestId() {
		return guestId;
	}

	public void setGuestId(long guestId) {
		this.guestId = guestId;
	}

	public Date getReservationDate() {
		return reservationDate;
	}

	public void setReservationDate(Date reservationDate) {
		this.reservationDate = reservationDate;
	}

	@Override
	public String toString() {
		return "Reservation [id=" + id + ", roomId=" + roomId + ", guestId=" + guestId + ", reservationDate="
				+ reservationDate + "]";
	}
	
	
	
	
	

}
