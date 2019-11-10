package com.dev.Stayoh.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="room4")
public class Room {
	public Room() {}
    @Id
	int roomno;
	int hotel_id;
	String discription;
	String type;
	String floor;
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getFloor() {
		return floor;
	}
	public void setFloor(String floor) {
		this.floor = floor;
	}
	
	
	public Room(int roomno, int hotel_id, String discription, String type, String floor) {
		super();
		this.roomno = roomno;
		this.hotel_id = hotel_id;
		this.discription = discription;
		this.type = type;
		this.floor = floor;
	}
}
