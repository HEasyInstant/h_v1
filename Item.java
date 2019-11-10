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

import com.dev.HEasyInstant.model.Order;
@Entity
@Table(name="item4")

public class Item {
	

	public Item() {}
	@Id  
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	 private int itemid;
	private String itemname;
	 private int qantity;
	 @Temporal(TemporalType.TIMESTAMP)
	 @DateTimeFormat(style = "yyyy-MM-dd")
	 @Column(name = "created_at", nullable = true, updatable = true)
    @CreatedDate
    private Date createdAt;
	 
	 @Column(nullable=true)
	 private int orderid;
	
	 public int getItemid() {
		return itemid;
	}

	public void setItemid(int itemid) {
		this.itemid = itemid;
	}

	public String getItemname() {
		return itemname;
	}

	public void setItemname(String itemname) {
		this.itemname = itemname;
	}

	public int getQantity() {
		return qantity;
	}

	public void setQantity(int qantity) {
		this.qantity = qantity;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}

	public int getOrderid() {
		return orderid;
	}

	public void setOrderid(int orderid) {
		this.orderid = orderid;
	}
	@ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "orderid" ,referencedColumnName = "orderid", insertable=false ,updatable=false)
   
    private Order od;

	public Item(int itemid, String itemname, int qantity, Date createdAt, int orderid) {
		super();
		this.itemid = itemid;
		this.itemname = itemname;
		this.qantity = qantity;
		this.createdAt = createdAt;
		this.orderid = orderid;
	}
	

}
