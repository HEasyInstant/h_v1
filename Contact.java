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
@Table(name="contact4")

public class Contact {
	public Contact() {}
    @Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
    private int contact_id;
    private int user_id;
    private String primary_mobile;
    private String secondary_mobile;
    private String primar_landline;
    private String secondary_landline;
    private String fax_number;
    private String primary_email;
    private String secondary_email;
    private String contact_belongs_to;

	
	 public int getContact_id() {
		return contact_id;
	}
	public void setContact_id(int contact_id) {
		this.contact_id = contact_id;
	}
	public int getUser_id() {
		return user_id;
	}
	public void setUser_id(int user_id) {
		this.user_id = user_id;
	}
	public String getPrimary_mobile() {
		return primary_mobile;
	}
	public void setPrimary_mobile(String primary_mobile) {
		this.primary_mobile = primary_mobile;
	}
	public String getSecondary_mobile() {
		return secondary_mobile;
	}
	public void setSecondary_mobile(String secondary_mobile) {
		this.secondary_mobile = secondary_mobile;
	}
	public String getPrimar_landline() {
		return primar_landline;
	}
	public void setPrimar_landline(String primar_landline) {
		this.primar_landline = primar_landline;
	}
	public String getSecondary_landline() {
		return secondary_landline;
	}
	public void setSecondary_landline(String secondary_landline) {
		this.secondary_landline = secondary_landline;
	}
	public String getFax_number() {
		return fax_number;
	}
	public void setFax_number(String fax_number) {
		this.fax_number = fax_number;
	}
	public String getPrimary_email() {
		return primary_email;
	}
	public void setPrimary_email(String primary_email) {
		this.primary_email = primary_email;
	}
	public String getSecondary_email() {
		return secondary_email;
	}
	public void setSecondary_email(String secondary_email) {
		this.secondary_email = secondary_email;
	}
	public String getContact_belongs_to() {
		return contact_belongs_to;
	}
	public void setContact_belongs_to(String contact_belongs_to) {
		this.contact_belongs_to = contact_belongs_to;
	}
	@OneToOne(cascade= CascadeType.ALL)
    @JoinColumn(name = "user_id" ,referencedColumnName = "user_id", insertable=false ,updatable=false)
	
	private User us1;
	
	
	public Contact(int contact_id, int user_id, String primary_mobile, String secondary_mobile, String primar_landline,
			String secondary_landline, String fax_number, String primary_email, String secondary_email,
			String contact_belongs_to) {
		super();
		this.contact_id = contact_id;
		this.user_id = user_id;
		this.primary_mobile = primary_mobile;
		this.secondary_mobile = secondary_mobile;
		this.primar_landline = primar_landline;
		this.secondary_landline = secondary_landline;
		this.fax_number = fax_number;
		this.primary_email = primary_email;
		this.secondary_email = secondary_email;
		this.contact_belongs_to = contact_belongs_to;
	}
	

}
