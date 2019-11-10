package com.dev.HEasyInstant.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.NotNull;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.Order;
import com.dev.HEasyInstant.model.Room;
@Entity
@Table(name="addguest4")

public class AddGuest {

public  AddGuest(){}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int guestcode;
	private String guestname;  
    private String mobileno;
   
    @Column(nullable=false,unique=true)
    private int roomno;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "checked_In", nullable = true, updatable =false)
    @CreatedDate
    private Date checkedIn;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "checked_out", nullable =true ,updatable=true)
    @LastModifiedDate
    private Date checkedOut;
    private String gender;
	
	
	public int getGuestcode() {
		return guestcode;
	}
	public void setGuestcode(int guestcode) {
		this.guestcode = guestcode;
	}
	public String getGuestname() {
		return guestname;
	}
	public void setGuestname(String guestname) {
		this.guestname = guestname;
	}
	public String getMobileno() {
		return mobileno;
	}
	public void setMobileno(String mobileno) {
		this.mobileno = mobileno;
	}
	public int getRoomno() {
		return roomno;
	}
	public void setRoomno(int roomno) {
		this.roomno = roomno;
	}
	public Date getCheckedIn() {
		return checkedIn;
	}
	public void setCheckedIn(Date checkedIn) {
		this.checkedIn = checkedIn;
	}
	public Date getCheckedOut() {
		return checkedOut;
	}
	public void setCheckedOut(Date checkedOut) {
		this.checkedOut = checkedOut;
	}
	public String getGender() {
		return gender;
	}
	public void setGender(String gender) {
		this.gender = gender;
	}
	@OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "adg")
	
	private Order ord;

	public Order getOrd() {
		return ord;
	}
	public void setOrd(Order ord) {
		this.ord = ord;
	}
    
	
	public AddGuest(int guestcode, String guestname, String mobileno, int roomno, Date checkedIn, Date checkedOut,
			String gender) {
		super();
		this.guestcode = guestcode;
		this.guestname = guestname;
		this.mobileno = mobileno;
		this.roomno = roomno;
		this.checkedIn = checkedIn;
		this.checkedOut = checkedOut;
		this.gender = gender;
	}
	 


}
