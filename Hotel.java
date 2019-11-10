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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.User;
import com.dev.HEasyInstant.model.License;

@Entity
@Table(name="hotel4")

public class Hotel {
public Hotel() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private	int hotel_id;
	private	String name;
    private String description;
   
    private int licence_id;
    private	String thumbnail_url;
    private	boolean status;
    private	boolean api_enabled;
	boolean api_key;
	private int parent_id;
	private int child_id;
	private String qr_code;
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
	private int updated_by;
	private int contact_id;
	private	int address_id;


    public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDescription() {
		return description;
	}
	public void setDescription(String description) {
		this.description = description;
	}
	public int getLicence_id() {
		return licence_id;
	}
	public void setLicence_id(int licence_id) {
		this.licence_id = licence_id;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
	public boolean isStatus() {
		return status;
	}
	public void setStatus(boolean status) {
		this.status = status;
	}
	public boolean isApi_enabled() {
		return api_enabled;
	}
	public void setApi_enabled(boolean api_enabled) {
		this.api_enabled = api_enabled;
	}
	public boolean isApi_key() {
		return api_key;
	}
	public void setApi_key(boolean api_key) {
		this.api_key = api_key;
	}
	public int getParent_id() {
		return parent_id;
	}
	public void setParent_id(int parent_id) {
		this.parent_id = parent_id;
	}
	public int getChild_id() {
		return child_id;
	}
	public void setChild_id(int child_id) {
		this.child_id = child_id;
	}
	public String getQr_code() {
		return qr_code;
	}
	public void setQr_code(String qr_code) {
		this.qr_code = qr_code;
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
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "hl")
	
	 private Set<User> us = new HashSet<>();
	
	public Set<User> getUs() {
		return us;
	}
	public void setUs(Set<User> us) {
		this.us = us;
	}
	@OneToOne(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "hl2")
	
	private License lish;
	
	public License getLish() {
		return lish;
	}
	public void setLish(License lish) {
		this.lish = lish;
	}
	public Hotel(int hotel_id, String name, String description, int licence_id, String thumbnail_url, boolean status,
			boolean api_enabled, boolean api_key, int parent_id, int child_id, String qr_code, Date created_date,
			int created_by, Date updated_date, int updated_by, int contact_id, int address_id) {
		super();
		this.hotel_id = hotel_id;
		this.name = name;
		this.description = description;
		this.licence_id = licence_id;
		this.thumbnail_url = thumbnail_url;
		this.status = status;
		this.api_enabled = api_enabled;
		this.api_key = api_key;
		this.parent_id = parent_id;
		this.child_id = child_id;
		this.qr_code = qr_code;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.contact_id = contact_id;
		this.address_id = address_id;
	}


}
