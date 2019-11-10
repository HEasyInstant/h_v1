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
import javax.persistence.OneToMany;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;

import org.springframework.data.annotation.CreatedDate;
import org.springframework.data.annotation.LastModifiedDate;
import org.springframework.format.annotation.DateTimeFormat;

import com.dev.HEasyInstant.model.AddGuest;
import com.dev.HEasyInstant.model.Item;
@Entity
@Table(name="order4")

public class Order {
	public Order() {}
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int orderid; private String guestname;  
    private String mobileno;
    private String order_status;
  
	private int hotel_id;
   @Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "created_at", nullable = true, updatable =true)
    @CreatedDate
    private Date createdAt;

	@Temporal(TemporalType.TIMESTAMP)
    @DateTimeFormat(style = "yyyy-MM-dd")
    @Column(name = "updated_at", nullable =true ,updatable=true)
    @LastModifiedDate
    private Date updatedAt;
    @Column(nullable=true)
    private int guestcode;

	
	public int getOrderid() {
		return orderid;
	}
	public void setOrderid(int orderid) {
		this.orderid = orderid;
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
	public String getOrder_status() {
		return order_status;
	}
	public void setOrder_status(String order_status) {
		this.order_status = order_status;
	}
	public int getHotel_id() {
		return hotel_id;
	}
	public void setHotel_id(int hotel_id) {
		this.hotel_id = hotel_id;
	}
	public Date getCreatedAt() {
		return createdAt;
	}
	public void setCreatedAt(Date createdAt) {
		this.createdAt = createdAt;
	}
	public Date getUpdatedAt() {
		return updatedAt;
	}
	public void setUpdatedAt(Date updatedAt) {
		this.updatedAt = updatedAt;
	}
	public int getGuestcode() {
		return guestcode;
	}
	public void setGuestcode(int guestcode) {
		this.guestcode = guestcode;
	}
	
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "guestcode" ,referencedColumnName = "guestcode", insertable=false ,updatable=false)
	
	private AddGuest adg;
	
	
	@OneToMany(cascade = CascadeType.ALL,
            fetch = FetchType.LAZY,
            mappedBy = "od")

	   private Set<Item> item = new HashSet<>();
	
		public Set<Item> getItem() {
			return item;
		}
		public void setItem(Set<Item> item) {
			this.item = item;
		}
	

	
	public Order(int orderid, String guestname, String mobileno, String order_status, int hotel_id, Date createdAt,
			Date updatedAt, int guestcode) {
		super();
		this.orderid = orderid;
		this.guestname = guestname;
		this.mobileno = mobileno;
		this.order_status = order_status;
		this.hotel_id = hotel_id;
		this.createdAt = createdAt;
		this.updatedAt = updatedAt;
		this.guestcode = guestcode;
	}

}
