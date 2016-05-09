package com.fissionlabs.model;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.JoinColumn;
import javax.persistence.OneToOne;
import javax.persistence.Table;

@Entity
@Table(name="property_address")
public class PropertyAddress {
	@Id
	@GeneratedValue(strategy=GenerationType.IDENTITY)
	@Column(name="property_address_id")
	private Integer propertyAddressId;
	private String city;
	private String areaName;
	private String Country;
	private Integer pincode;
	private String streetName;
	@OneToOne
	@JoinColumn(name="property_id")
	private Property property;;
	
	public Property getProperty() {
		return property;
	}
	public void setProperty(Property property) {
		this.property = property;
	}
	public String getStreetName() {
		return streetName;
	}
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}
	public Integer getPropertyAddressId() {
		return propertyAddressId;
	}
	public void setPropertyAddressId(Integer propertyAddressId) {
		this.propertyAddressId = propertyAddressId;
	}
	public String getCity() {
		return city;
	}
	public void setCity(String city) {
		this.city = city;
	}
	public String getAreaName() {
		return areaName;
	}
	public void setAreaName(String areaName) {
		this.areaName = areaName;
	}
	public String getCountry() {
		return Country;
	}
	public void setCountry(String country) {
		Country = country;
	}
	public Integer getPincode() {
		return pincode;
	}
	public void setPincode(Integer pincode) {
		this.pincode = pincode;
	}
	
	
	

}
