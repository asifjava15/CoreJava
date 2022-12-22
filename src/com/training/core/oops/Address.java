/**
 * 
 */
package com.training.core.oops;

/**
 * @author Asif_
 *
 */
public class Address {
	private String houseNumber;
	private String street;
	private String city;
	private String state;
	private String country;
	private Integer zip;

	public Address(String houseNumber, String street, String city, String state, String country, int zip) {
		this.houseNumber = houseNumber;
		this.street = street;
		this.city = city;
		this.state = state;
		this.country = country;
		this.zip = zip;
	}

	@Override
	public String toString() {
		return "Address [houseNumber=" + houseNumber + ", street=" + street + ", city=" + city + ", state=" + state
				+ ", country=" + country + ", zip=" + zip + "]";
	}
}
