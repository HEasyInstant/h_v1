package com.dev.HEasyInstant.model;

import java.util.Date;

import javax.persistence.CascadeType;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.Role;
@Entity
@Table(name="user_previlege4")

public class Previlege {
	public Previlege() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	@Column(name="previlege_id")
	private int previlegeid;
	private int role_id ;
    private String name;
    private String discription;
    private  boolean action;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "created_date", nullable = true, updatable =false)
    @CreatedDate
    private Date created_date;
    private int created_by;
    @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "updated_date", nullable = true, updatable =false)
    @CreatedDate
    private Date updated_date;
    private int updated_by;
 
	
    public int getPrevilegeid() {
		return previlegeid;
	}
	public void setPrevilegeid(int previlegeid) {
		this.previlegeid = previlegeid;
	}
	public int getRole_id() {
		return role_id;
	}
	public void setRole_id(int role_id) {
		this.role_id = role_id;
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
	public boolean isAction() {
		return action;
	}
	public void setAction(boolean action) {
		this.action = action;
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
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "role_id" ,referencedColumnName = "role_id",insertable=false,updatable=false)
   
   private Role r;
   
	
	public Previlege(int role_id, String name, String discription, boolean action, Date created_date, int created_by,
			Date updated_date, int updated_by, int previlegeid) {
		super();
		this.role_id = role_id;
		this.name = name;
		this.discription = discription;
		this.action = action;
		this.created_date = created_date;
		this.created_by = created_by;
		this.updated_date = updated_date;
		this.updated_by = updated_by;
		this.previlegeid = previlegeid;
	}	   

}
