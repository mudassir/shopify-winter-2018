package io.github.mudassir.shopifywinter18.model;

/**
 * @see <a href="https://help.shopify.com/api/reference/order#show">Shopify Order API reference</a>
 */
public class LineItem {
	private long id;
	private String variantId;
	private String title;
	private int quantity;
	private float price;
	private int grams;
	private String sku;
	private String variantTitle;
	private String vendor;
	private String fulfillmentService;
	private long productId;
	private boolean requiresShipping;
	private boolean taxable;
	private boolean giftCard;
	private String name;
	private String variantInvetoryManagement;
	private String[] properties;
	private boolean productExists;
	private int fulfillableQuantity;
	private float totalDiscount;
	private String fulfillmentStatus;
	private String[] taxLines;

	public long getId() {
		return id;
	}

	public String getVariantId() {
		return variantId;
	}

	public String getTitle() {
		return title;
	}

	public int getQuantity() {
		return quantity;
	}

	public float getPrice() {
		return price;
	}

	public int getGrams() {
		return grams;
	}

	public String getSku() {
		return sku;
	}

	public String getVariantTitle() {
		return variantTitle;
	}

	public String getVendor() {
		return vendor;
	}

	public String getFulfillmentService() {
		return fulfillmentService;
	}

	public long getProductId() {
		return productId;
	}

	public boolean isRequiresShipping() {
		return requiresShipping;
	}

	public boolean isTaxable() {
		return taxable;
	}

	public boolean isGiftCard() {
		return giftCard;
	}

	public String getName() {
		return name;
	}

	public String getVariantInvetoryManagement() {
		return variantInvetoryManagement;
	}

	public String[] getProperties() {
		return properties;
	}

	public boolean isProductExists() {
		return productExists;
	}

	public int getFulfillableQuantity() {
		return fulfillableQuantity;
	}

	public float getTotalDiscount() {
		return totalDiscount;
	}

	public String getFulfillmentStatus() {
		return fulfillmentStatus;
	}

	public String[] getTaxLines() {
		return taxLines;
	}
}
