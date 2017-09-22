package io.github.mudassir.shopifywinter18.model;

/**
 * @see <a href="https://help.shopify.com/api/reference/order#show">Shopify Order API reference</a>
 */
public class Address {
	private long id;
	private long customerId;
	private String firstName;
	private String lastName;
	private String company;
	private String address1;
	private String address2;
	private String city;
	private String province;
	private String country;
	private String zip;
	private String phone;
	private String name;
	private String provinceCode;
	private String countryCode;
	private boolean bool;

	public long getId() {
		return id;
	}

	public long getCustomerId() {
		return customerId;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public String getCompany() {
		return company;
	}

	public String getAddress1() {
		return address1;
	}

	public String getAddress2() {
		return address2;
	}

	public String getCity() {
		return city;
	}

	public String getProvince() {
		return province;
	}

	public String getCountry() {
		return country;
	}

	public String getZip() {
		return zip;
	}

	public String getPhone() {
		return phone;
	}

	public String getName() {
		return name;
	}

	public String getProvinceCode() {
		return provinceCode;
	}

	public String getCountryCode() {
		return countryCode;
	}

	public boolean isBool() {
		return bool;
	}
}
