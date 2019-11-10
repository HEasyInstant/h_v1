package com.dev.HEasyInstant.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

import com.dev.HEasyInstant.model.User;

@Entity
@Table(name="address4")

public class Address {
	
	public Address() {}
	 @Id
	 @GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int address_id;
     private int user_id;
	 private String addressline1;
	 private String addressline2;
	 private String city;
	 private String state;
	 private int pincode;
	 private String country;
	 private String address_belongs_to;


	
	 public int getAddress_id() {
		return address_id;
	}
	public void setAddress_id(int address_id) {
		this.address_id = address_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getAddressline1() {
		return addressline1;
	}
	public void setAddressline1(String addressline1) {
		this.addressline1 = addressline1;
	}
	public String getAddressline2() {
		return addressline2;
	}
	public void setAddressline2(String addressline2) {
		this.addressline2 = addressline2;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getState() {
		return state;
	}
	public void setState(String state) {
		this.state = state;
	}
	public int getPincode() {
		return pincode;
	}
	public void setPincode(int pincode) {
		this.pincode = pincode;
	}
	public String getCountry() {
		return country;
	}
	public void setCountry(String country) {
		this.country = country;
	}
	public String getAddress_belongs_to() {
		return address_belongs_to;
	}
	public void setAddress_belongs_to(String address_belongs_to) {
		this.address_belongs_to = address_belongs_to;
	}
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id" ,referencedColumnName = "user_id", insertable=false ,updatable=false)
	
	private User us2;
	
	public Address(int address_id, int user_id, String addressline1, String addressline2, String city, String state,
			int pincode, String country, String address_belongs_to) {
		super();
		this.address_id = address_id;
		this.user_id = user_id;
		this.addressline1 = addressline1;
		this.addressline2 = addressline2;
		this.city = city;
		this.state = state;
		this.pincode = pincode;
		this.country = country;
		this.address_belongs_to = address_belongs_to;
	}
	
	
}
