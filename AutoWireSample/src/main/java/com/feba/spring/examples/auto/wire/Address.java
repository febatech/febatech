package com.feba.spring.examples.auto.wire;

import org.springframework.beans.factory.annotation.Required;

public class Address {
	
	
	
	private String streetName;
	private String area;
	private String buildingName;
	private String city;
	private String state;
	private String country;
	
	private long areaCode;

	/**
	 * @return the streetName
	 */
	
	public String getStreetName() {
		return streetName;
	}

	/**
	 * @return the area
	 */
	public String getArea() {
		return area;
	}

	/**
	 * @return the buildingName
	 */
	public String getBuildingName() {
		return buildingName;
	}

	/**
	 * @return the city
	 */
	public String getCity() {
		return city;
	}

	/**
	 * @return the state
	 */
	public String getState() {
		return state;
	}

	/**
	 * @return the country
	 */
	public String getCountry() {
		return country;
	}

	/**
	 * @return the areaCode
	 */
	public long getAreaCode() {
		return areaCode;
	}

	/**
	 * @param streetName the streetName to set
	 */
	@Required
	public void setStreetName(String streetName) {
		this.streetName = streetName;
	}

	/**
	 * @param area the area to set
	 */
	public void setArea(String area) {
		this.area = area;
	}

	/**
	 * @param buildingName the buildingName to set
	 */
	public void setBuildingName(String buildingName) {
		this.buildingName = buildingName;
	}

	/**
	 * @param city the city to set
	 */
	@Required
	public void setCity(String city) {
		this.city = city;
	}

	/**
	 * @param state the state to set
	 */
	public void setState(String state) {
		this.state = state;
	}

	/**
	 * @param country the country to set
	 */
	public void setCountry(String country) {
		this.country = country;
	}

	/**
	 * @param areaCode the areaCode to set
	 */
	public void setAreaCode(long areaCode) {
		this.areaCode = areaCode;
	}
	
	
	

}
