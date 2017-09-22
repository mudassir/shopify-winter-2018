package io.github.mudassir.shopifywinter18.model;

/**
 * @see <a href="https://help.shopify.com/api/reference/order#show">Shopify Order API reference</a>
 */
public class Customer {
	private long id;
	private String email;
	private boolean acceptsMarketing;
	private String createdAt;
	private String updatedAt;
	private String firstName;
	private String lastName;
	private int ordersCount;
	private String state;
	private float totalSpent;
	private long lastOrderId;
	private String note;
	private boolean verifiedEmail;
	private String multipassIdentifier;
	private boolean taxExempt;
	private String phone;
	private String tags;
	private String lastOrderName;
	private Address defaultAddress;

	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public boolean isAcceptsMarketing() {
		return acceptsMarketing;
	}

	public String getCreatedAt() {
		return createdAt;
	}

	public String getUpdatedAt() {
		return updatedAt;
	}

	public String getFirstName() {
		return firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public int getOrdersCount() {
		return ordersCount;
	}

	public String getState() {
		return state;
	}

	public float getTotalSpent() {
		return totalSpent;
	}

	public long getLastOrderId() {
		return lastOrderId;
	}

	public String getNote() {
		return note;
	}

	public boolean isVerifiedEmail() {
		return verifiedEmail;
	}

	public String getMultipassIdentifier() {
		return multipassIdentifier;
	}

	public boolean isTaxExempt() {
		return taxExempt;
	}

	public String getPhone() {
		return phone;
	}

	public String getTags() {
		return tags;
	}

	public String getLastOrderName() {
		return lastOrderName;
	}

	public Address getDefaultAddress() {
		return defaultAddress;
	}
}
