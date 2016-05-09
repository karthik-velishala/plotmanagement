package com.fissionlabs.model;

import java.util.Set;

import javax.persistence.CascadeType;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.OneToMany;
import javax.persistence.Table;

import com.fasterxml.jackson.annotation.JsonIgnore;

@Entity
@Table(name = "owner")
public class Owner {
	@Id
	@GeneratedValue(strategy = GenerationType.IDENTITY)
	private Integer owner_Id;

	public Owner(Integer owner_Id, String firstName, String lastName,
			String country, String dob, String gender, String contactNo,
			String email) {
		super();
		this.owner_Id = owner_Id;
		this.firstName = firstName;
		this.lastName = lastName;
		this.country = country;
		this.dob = dob;
		this.gender = gender;
		this.contactNo = contactNo;
		this.email = email;
	}

	public Owner() {
	}

	private String firstName;
	private String lastName;

	private String country;
	private String dob;
	private String gender;
	private String contactNo;
	private String email;

	@OneToMany(mappedBy = "owner", cascade = CascadeType.REMOVE)
	@JsonIgnore
	private Set<Property> property;

	public Set<Property> getProperty() {
		return property;
	}

	public void setProperty(Set<Property> property) {
		this.property = property;
	}

	public Integer getOwner_Id() {
		return owner_Id;
	}

	public void setOwner_Id(Integer owner_Id) {
		this.owner_Id = owner_Id;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getDob() {
		return dob;
	}

	public void setDob(String dob) {
		this.dob = dob;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getContactNo() {
		return contactNo;
	}

	public void setContactNo(String contactNo) {
		this.contactNo = contactNo;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}
}
