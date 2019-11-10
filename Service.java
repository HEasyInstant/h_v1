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
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.ServiceItem;
import com.dev.HEasyInstant.model.User;
@Entity
@Table(name="service4")

public class Service {
	public Service() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int service_id;
	private String name;
	private String discription;
	private int deparment_id;
	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "created_date", nullable = true, updatable =false)
    @CreatedDate
    private Date avilability_time;
	private  String thambnail_url;

	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public String getDiscription() {
		return discription;
	}
	public void setDiscription(String discription) {
		this.discription = discription;
	}
	public int getDeparment_id() {
		return deparment_id;
	}
	public void setDeparment_id(int deparment_id) {
		this.deparment_id = deparment_id;
	}
	public Date getAvilability_time() {
		return avilability_time;
	}
	public void setAvilability_time(Date avilability_time) {
		this.avilability_time = avilability_time;
	}
	public String getThambnail_url() {
		return thambnail_url;
	}
	public void setThambnail_url(String thambnail_url) {
		this.thambnail_url = thambnail_url;
	}
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "ser1")
	
	
	 private Set<ServiceItem> seritem = new HashSet<>();
	
	public Set<ServiceItem> getSeritem() {
		return seritem;
	}
	public void setSeritem(Set<ServiceItem> seritem) {
		this.seritem = seritem;
	}
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id" ,referencedColumnName = "user_id",insertable=false,updatable=false)
   
    private User usss3;
   
	
	public Service(int service_id, String name, String discription, int deparment_id, Date avilability_time,
			String thambnail_url) {
		super();
		this.service_id = service_id;
		this.name = name;
		this.discription = discription;
		this.deparment_id = deparment_id;
		this.avilability_time = avilability_time;
		this.thambnail_url = thambnail_url;
	}
	
}
