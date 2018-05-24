package com.visa.innovation.paymentservice.soa.model;

public class UserDetailsSOA {

	private String firstName;
	private String lastName;
	private String street1;
	private String street2;
	private String city;
	private String state;
	private String postalCode;
	private String country;
	private String email;

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

	public String getStreet1() {
		return street1;
	}

	public void setStreet1(String street1) {
		this.street1 = street1;
	}

	public String getStreet2() {
		return street2;
	}

	public void setStreet2(String street2) {
		this.street2 = street2;
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

	public String getPostalCode() {
		return postalCode;
	}

	public void setPostalCode(String postalCode) {
		this.postalCode = postalCode;
	}

	public String getCountry() {
		return country;
	}

	public void setCountry(String country) {
		this.country = country;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public static class Builder {
		private String firstName;
		private String lastName;
		private String street1;
		private String street2;
		private String city;
		private String state;
		private String postalCode;
		private String country;
		private String email;

		public Builder firstName(String firstName) {
			this.firstName = firstName;
			return this;
		}

		public Builder lastName(String lastName) {
			this.lastName = lastName;
			return this;
		}

		public Builder street1(String street1) {
			this.street1 = street1;
			return this;
		}

		public Builder street2(String street2) {
			this.street2 = street2;
			return this;
		}

		public Builder city(String city) {
			this.city = city;
			return this;
		}

		public Builder state(String state) {
			this.state = state;
			return this;
		}

		public Builder postalCode(String postalCode) {
			this.postalCode = postalCode;
			return this;
		}

		public Builder country(String country) {
			this.country = country;
			return this;
		}

		public Builder email(String email) {
			this.email = email;
			return this;
		}

		public UserDetailsSOA build() {
			return new UserDetailsSOA(this);
		}
	}

	private UserDetailsSOA(Builder builder) {
		this.firstName = builder.firstName;
		this.lastName = builder.lastName;
		this.street1 = builder.street1;
		this.street2 = builder.street2;
		this.city = builder.city;
		this.state = builder.state;
		this.postalCode = builder.postalCode;
		this.country = builder.country;
		this.email = builder.email;
	}

	@Override
	public String toString() {
		return "UserDetailsSOA [firstName=" + firstName + ", lastName=" + lastName + ", street1=" + street1
				+ ", street2=" + street2 + ", city=" + city + ", state=" + state + ", postalCode=" + postalCode
				+ ", country=" + country + ", email=" + email + "]";
	}
	
}
