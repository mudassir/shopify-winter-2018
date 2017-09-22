package io.github.mudassir.shopifywinter18.model;

/**
 * @see <a href="https://help.shopify.com/api/reference/order#show">Shopify Order API reference</a>
 */
public class Orders {
	private Order[] orders;

	public Order[] getOrders() {
		return orders;
	}
}
