package com.dev.HEasyInstant.model;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.ManyToOne;
import javax.persistence.Table;

import com.dev.HEasyInstant.model.Service;

@Entity
@Table(name="serviceitem4")
public class ServiceItem {
	
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private int serviceitem_id;
	private String name;
	private String discription;
	private String tag;
	private int service_id;
	private float item_stax;
	private float item_ctax;
	private float item_price;
	private String thumbnail_url;
	
	public int getServiceitem_id() {
		return serviceitem_id;
	}
	public void setServiceitem_id(int serviceitem_id) {
		this.serviceitem_id = serviceitem_id;
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
	public String getTag() {
		return tag;
	}
	public void setTag(String tag) {
		this.tag = tag;
	}
	public int getService_id() {
		return service_id;
	}
	public void setService_id(int service_id) {
		this.service_id = service_id;
	}
	public float getItem_stax() {
		return item_stax;
	}
	public void setItem_stax(float item_stax) {
		this.item_stax = item_stax;
	}
	public float getItem_ctax() {
		return item_ctax;
	}
	public void setItem_ctax(float item_ctax) {
		this.item_ctax = item_ctax;
	}
	public float getItem_price() {
		return item_price;
	}
	public void setItem_price(float item_price) {
		this.item_price = item_price;
	}
	public String getThumbnail_url() {
		return thumbnail_url;
	}
	public void setThumbnail_url(String thumbnail_url) {
		this.thumbnail_url = thumbnail_url;
	}
  @ManyToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "service_id" ,referencedColumnName = "service_id",insertable=false,updatable=false)
   
    private Service ser1;
   
	public ServiceItem(int serviceitem_id, String name, String discription, String tag, int service_id, float item_stax,
			float item_ctax, float item_price, String thumbnail_url) {
		super();
		this.serviceitem_id = serviceitem_id;
		this.name = name;
		this.discription = discription;
		this.tag = tag;
		this.service_id = service_id;
		this.item_stax = item_stax;
		this.item_ctax = item_ctax;
		this.item_price = item_price;
		this.thumbnail_url = thumbnail_url;
	}

}
