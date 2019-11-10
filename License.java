package com.dev.HEasyInstant.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.Hotel;

@Entity
@Table(name="license4")

public class License {
	public License() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int  licence_id;
	private String name;
	private int cost;
	private String discription;
	private String allowed_option;
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


	public int getLicence_id() {
		return licence_id;
	}
	public void setLicence_id(int licence_id) {
		this.licence_id = licence_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getCost() {
		return cost;
	}
	public void setCost(int cost) {
		this.cost = cost;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public String getAllowed_option() {
		return allowed_option;
	}
	public void setAllowed_option(String allowed_option) {
		this.allowed_option = allowed_option;
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
    @OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "hotel_id" ,referencedColumnName = "hotel_id", insertable=false ,updatable=false)
	
	private Hotel hl2;
	
	public License(int licence_id, String name, int cost, String discription, String allowed_option, Date created_date,
			int created_by, Date updated_date) {
		super();
		this.licence_id = licence_id;
		this.name = name;
		this.cost = cost;
		this.discription = discription;
		this.allowed_option = allowed_option;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
	}

}
