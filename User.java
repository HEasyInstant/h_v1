package com.dev.HEasyInstant.model;

import java.util.Date;
import java.util.HashSet;
import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.Address;
import com.dev.HEasyInstant.model.Contact;
import com.dev.HEasyInstant.model.Role;
import com.dev.HEasyInstant.model.Service;
import com.dev.HEasyInstant.model.Hotel;



@Entity
@Table(name="user4")

public class User {
	public User() {}
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int user_id;
	private int hotel_id;
	private String fname;
	private String lname;
	private	String fullname;
	private boolean status;
	private String user_name;
	private String password;
	private int role_id;
	private int contact_id;
	private int address_id;
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "created_date", nullable = true, updatable =false)
    @CreatedDate
    private Date created_date;
	int created_by;
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "updated_date", nullable = true, updatable =false)
    @CreatedDate
    private Date updated_date;
	int updated_by;


	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getFname() {
		return fname;
	}
	public void setFname(String fname) {
		this.fname = fname;
	}
	public String getLname() {
		return lname;
	}
	public void setLname(String lname) {
		this.lname = lname;
	}
	public String getFullname() {
		return fullname;
	}
	public void setFullname(String fullname) {
		this.fullname = fullname;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public String getUser_name() {
		return user_name;
	}
	public void setUser_name(String user_name) {
		this.user_name = user_name;
	}
	public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
	}
	public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public Date getCreated_date() {
		return created_date;
	}
	public void setCreated_date(Date created_date) {
		this.created_date = created_date;
	}
	public int getCreated_by() {
		return created_by;
	}
	public void setCreated_by(int created_by) {
		this.created_by = created_by;
	}
	public Date getUpdated_date() {
		return updated_date;
	}
	public void setUpdated_date(Date updated_date) {
		this.updated_date = updated_date;
	}
	public int getUpdated_by() {
		return updated_by;
	}
	public void setUpdated_by(int updated_by) {
		this.updated_by = updated_by;
	}
	@OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "us2")
	private Address adss;
	
	public Address getAdss() {
		return adss;
	}
	public void setAdss(Address adss) {
		this.adss = adss;
	}
	
	@OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "us1")
	
	private Contact cont;

	public Contact getCont() {
		return cont;
	}
	public void setCont(Contact cont) {
		this.cont = cont;
	}
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "u")
	
	private Set<Role> r1= new HashSet<>();
	
	public Set<Role> getR1() {
		return r1;
	}
	public void setR1(Set<Role> r1) {
		this.r1 = r1;
	}
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "usss3")
	
	 private Set<Service> serv= new HashSet<>();
	
	public Set<Service> getServ() {
		return serv;
	}
	public void setServ(Set<Service> serv) {
		this.serv = serv;
	}
	
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "hotel_id" ,referencedColumnName = "hotel_id",insertable=false,updatable=false)
   
    private Hotel hl;
   
	
	
	public User(int user_id, int hotel_id, String fname, String lname, String fullname, boolean status,
			String user_name, String password, int role_id, int contact_id, int address_id, Date created_date,
			int created_by, Date updated_date, int updated_by) {
		super();
		this.user_id = user_id;
		this.hotel_id = hotel_id;
		this.fname = fname;
		this.lname = lname;
		this.fullname = fullname;
		this.status = status;
		this.user_name = user_name;
		this.password = password;
		this.role_id = role_id;
		this.contact_id = contact_id;
		this.address_id = address_id;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
	}
	
	
}
