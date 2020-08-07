package com.onetoonemapping.model;

import java.util.Date;

import javax.persistence.Entity;
import javax.persistence.FetchType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;
import javax.persistence.Temporal;
import javax.persistence.TemporalType;
import javax.validation.constraints.Size;

import com.fasterxml.jackson.annotation.JsonBackReference;
import com.fasterxml.jackson.annotation.JsonFormat;

@Entity
@Table(name = "user_profiles")
public class UserProfile {
	@Id
	public int id;
	
	@Size(max=100)
	public String address1;
	
	@Size(max=100)
	public String address2;
	
	@Size(max=100)
	public String city;
	
	@Size(max=100)
	public String country;
	
//	@Size(max=100)
	@Temporal(TemporalType.TIMESTAMP)
	@JsonFormat(shape = JsonFormat.Shape.STRING, pattern = "yyyy-mm-dd")
	public Date dateOfBirth;
	
	@Size(max=10)
	public String gender;
	
	@Size(max=15)
	public String phoneNumber;
	
	@Size(max=100)
	public String state;
	
	@Size(max=100)
	public String street;
	
	@Size(max=32)
	public String zip_code;
	
	@OneToOne(fetch = FetchType.LAZY,optional = false)
	@JoinColumn(name="user_id",nullable = false)
	@JsonBackReference
	private User user;
	
	

	public UserProfile() {

	}
	
	

	public UserProfile(int id,  String address1,  String address2,
			 String city,  String country,  Date dateOfBirth,
			 String gender,  String phoneNumber,  String state,
			 String street, String zip_code, User user) {
		super();
		this.id = id;
		this.address1 = address1;
		this.address2 = address2;
		this.city = city;
		this.country = country;
		this.dateOfBirth = dateOfBirth;
		this.gender = gender;
		this.phoneNumber = phoneNumber;
		this.state = state;
		this.street = street;
		this.zip_code = zip_code;
		this.user = user;
	}



	public int getId() {
		return id;
	}

	public void setId(int id) {
		this.id = id;
	}

	public String getAddress1() {
		return address1;
	}

	public void setAddress1(String address1) {
		this.address1 = address1;
	}

	public String getAddress2() {
		return address2;
	}

	public void setAddress2(String address2) {
		this.address2 = address2;
	}

	public String getCity() {
		return city;
	}

	public void setCity(String city) {
		this.city = city;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public Date getDateOfBirth() {
		return dateOfBirth;
	}

	public void setDateOfBirth(Date dateOfBirth) {
		this.dateOfBirth = dateOfBirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getPhoneNumber() {
		return phoneNumber;
	}

	public void setPhoneNumber(String phoneNumber) {
		this.phoneNumber = phoneNumber;
	}

	public String getState() {
		return state;
	}

	public void setState(String state) {
		this.state = state;
	}

	public String getStreet() {
		return street;
	}

	public void setStreet(String street) {
		this.street = street;
	}

	public String getZip_code() {
		return zip_code;
	}

	public void setZip_code(String zip_code) {
		this.zip_code = zip_code;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	
	
	

}
