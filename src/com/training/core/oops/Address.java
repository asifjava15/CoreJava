/**
 * 
 */
package com.training.core.oops;

import java.util.Objects;

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

	@Override
	public int hashCode() {
		return Objects.hash(city, country, houseNumber, state, street, zip);
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		Address other = (Address) obj;
		return Objects.equals(city, other.city) && Objects.equals(country, other.country)
				&& Objects.equals(houseNumber, other.houseNumber) && Objects.equals(state, other.state)
				&& Objects.equals(street, other.street) && Objects.equals(zip, other.zip);
	}
}
