package com.infiniteskills.data.entities;

import java.time.LocalDate;
import java.time.LocalDateTime;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

@Entity
@Table(name="finances_user")
public class User {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="USER_ID")
	private Long userId;
	@Column(name="FIRST_NAME")
	private String firstName;
	@Column(name="LAST_NAME")
	private String lastNamge;
	@Column(name="BIRTH_DATE")
	private LocalDate birthDate;
	@Column(name="EMAIL_ADDRESS")
	private String emailAddress;
	@Column(name="LAST_UPDATED_BY")
	private String lastUpdatedBy;
	@Column(name="LAST_UPDATED_DATE")
	private LocalDateTime lastUpdatedDate;
	@Column(name="CREATED_BY")
	private String createdBy;
	@Column(name="CREATED_DATE")
	private LocalDateTime createdDate;
	@Column(name="USER_ADDRESS_LINE_1")
	private String userAddressLine1;
	@Column(name="USER_ADDRESS_LINE_2")
	private String userAddressLine2;
	@Column(name="CITY")
	private String city;
	@Column(name="STATE")
	private String state;
	@Column(name="ZIP_CODE")
	private String zipCode;
	
	public Long getUserId() {
		return userId;
	}
	public void setUserId(Long userId) {
		this.userId = userId;
	}
	public String getFirstName() {
		return firstName;
	}
	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}
	public String getLastNamge() {
		return lastNamge;
	}
	public void setLastNamge(String lastNamge) {
		this.lastNamge = lastNamge;
	}
	public LocalDate getBirthDate() {
		return birthDate;
	}
	public void setBirthDate(LocalDate birthDate) {
		this.birthDate = birthDate;
	}
	public String getEmailAddress() {
		return emailAddress;
	}
	public void setEmailAddress(String emailAddress) {
		this.emailAddress = emailAddress;
	}
	public String getLastUpdatedBy() {
		return lastUpdatedBy;
	}
	public void setLastUpdatedBy(String lastUpdatedBy) {
		this.lastUpdatedBy = lastUpdatedBy;
	}
	public LocalDateTime getLastUpdatedDate() {
		return lastUpdatedDate;
	}
	public void setLastUpdatedDate(LocalDateTime lastUpdatedDate) {
		this.lastUpdatedDate = lastUpdatedDate;
	}
	public String getCreatedBy() {
		return createdBy;
	}
	public void setCreatedBy(String createdBy) {
		this.createdBy = createdBy;
	}
	public LocalDateTime getCreatedDate() {
		return createdDate;
	}
	public void setCreatedDate(LocalDateTime createdDate) {
		this.createdDate = createdDate;
	}
	public String getUserAddressLine1() {
		return userAddressLine1;
	}
	public void setUserAddressLine1(String userAddressLine1) {
		this.userAddressLine1 = userAddressLine1;
	}
	public String getUserAddressLine2() {
		return userAddressLine2;
	}
	public void setUserAddressLine2(String userAddressLine2) {
		this.userAddressLine2 = userAddressLine2;
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
	public String getZipCode() {
		return zipCode;
	}
	public void setZipCode(String zipCode) {
		this.zipCode = zipCode;
	}
	
	
	

}
