package io.github.mudassir.shopifywinter18.model;

import java.util.Date;

/**
 * @see <a href="https://help.shopify.com/api/reference/order#show">Shopify Order API reference</a>
 */
public class Order {
	private long id;
	private String email;
	private String closedAt;
	private Date createdAt;
	private Date updatedAt;
	private int number;
	private String note;
	private String token;
	private String gateway;
	private boolean test;
	private float totalPrice;
	private float subtotalPrice;
	private int totalWeight;
	private float totalTax;
	private boolean taxesIncluded;
	private String currency;
	private String financialStatus;
	private boolean confirmed;
	private float totalDiscounts;
	private float totalLineItemsPrice;
	private String cartToken;
	private boolean buyerAcceptsMarketing;
	private String name;
	private String referringSite;
	private String landingSite;
	private String cancelledAt;
	private String cancelReason;
	private float totalPriceUsd;
	private String checkoutToken;
	private String reference;
	private long userId;
	private String locationId;
	private String sourceIdentifier;
	private String sourceUrl;
	private Date processedAt;
	private String deviceId;
	private String phone;
	private String customerLocale;
	private long appId;
	private String browserIp;
	private String landingSiteRef;
	private int orderNumber;
	private String[] discountCodes;
	private String[] noteAttributes;
	private String[] paymentGatewayNames;
	private String processingMethod;
	private String checkoutId;
	private String sourceName;
	private String fulfillmentStatus;
	private String[] taxLines;
	private String tag;
	private String contactEmail;
	private String orderStatusUrl;
	private LineItem[] lineItems;
	private String[] shippingLines;
	private Address billingAddress;
	private Address shippingAddress;
	private String[] fulfillments;
	private String[] refunds;
	private Customer customer;

	public long getId() {
		return id;
	}

	public String getEmail() {
		return email;
	}

	public String getClosedAt() {
		return closedAt;
	}

	public Date getCreatedAt() {
		return createdAt;
	}

	public Date getUpdatedAt() {
		return updatedAt;
	}

	public int getNumber() {
		return number;
	}

	public String getNote() {
		return note;
	}

	public String getToken() {
		return token;
	}

	public String getGateway() {
		return gateway;
	}

	public boolean isTest() {
		return test;
	}

	public float getTotalPrice() {
		return totalPrice;
	}

	public float getSubtotalPrice() {
		return subtotalPrice;
	}

	public int getTotalWeight() {
		return totalWeight;
	}

	public float getTotalTax() {
		return totalTax;
	}

	public boolean isTaxesIncluded() {
		return taxesIncluded;
	}

	public String getCurrency() {
		return currency;
	}

	public String getFinancialStatus() {
		return financialStatus;
	}

	public boolean isConfirmed() {
		return confirmed;
	}

	public float getTotalDiscounts() {
		return totalDiscounts;
	}

	public float getTotalLineItemsPrice() {
		return totalLineItemsPrice;
	}

	public String getCartToken() {
		return cartToken;
	}

	public boolean isBuyerAcceptsMarketing() {
		return buyerAcceptsMarketing;
	}

	public String getName() {
		return name;
	}

	public String getReferringSite() {
		return referringSite;
	}

	public String getLandingSite() {
		return landingSite;
	}

	public String getCancelledAt() {
		return cancelledAt;
	}

	public String getCancelReason() {
		return cancelReason;
	}

	public float getTotalPriceUsd() {
		return totalPriceUsd;
	}

	public String getCheckoutToken() {
		return checkoutToken;
	}

	public String getReference() {
		return reference;
	}

	public long getUserId() {
		return userId;
	}

	public String getLocationId() {
		return locationId;
	}

	public String getSourceIdentifier() {
		return sourceIdentifier;
	}

	public String getSourceUrl() {
		return sourceUrl;
	}

	public Date getProcessedAt() {
		return processedAt;
	}

	public String getDeviceId() {
		return deviceId;
	}

	public String getPhone() {
		return phone;
	}

	public String getCustomerLocale() {
		return customerLocale;
	}

	public long getAppId() {
		return appId;
	}

	public String getBrowserIp() {
		return browserIp;
	}

	public String getLandingSiteRef() {
		return landingSiteRef;
	}

	public int getOrderNumber() {
		return orderNumber;
	}

	public String[] getDiscountCodes() {
		return discountCodes;
	}

	public String[] getNoteAttributes() {
		return noteAttributes;
	}

	public String[] getPaymentGatewayNames() {
		return paymentGatewayNames;
	}

	public String getProcessingMethod() {
		return processingMethod;
	}

	public String getCheckoutId() {
		return checkoutId;
	}

	public String getSourceName() {
		return sourceName;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public String[] getTaxLines() {
		return taxLines;
	}

	public String getTag() {
		return tag;
	}

	public String getContactEmail() {
		return contactEmail;
	}

	public String getOrderStatusUrl() {
		return orderStatusUrl;
	}

	public LineItem[] getLineItems() {
		return lineItems;
	}

	public String[] getShippingLines() {
		return shippingLines;
	}

	public Address getBillingAddress() {
		return billingAddress;
	}

	public Address getShippingAddress() {
		return shippingAddress;
	}

	public String[] getFulfillments() {
		return fulfillments;
	}

	public String[] getRefunds() {
		return refunds;
	}

	public Customer getCustomer() {
		return customer;
	}
}
