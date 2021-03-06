package com.myspace.deliveryproject;

/**
 * This class was automatically generated by the data modeler tool.
 */

public class Order implements java.io.Serializable {

	static final long serialVersionUID = 1L;

	@org.kie.api.definition.type.Label("Count")
	private java.lang.Integer count;
	@org.kie.api.definition.type.Label("Item")
	private java.lang.String item;
	@org.kie.api.definition.type.Label("Price")
	private java.lang.Double price;

	@org.kie.api.definition.type.Label(value = "Mode")
	private java.lang.String mode;

	public Order() {
	}

	public java.lang.Integer getCount() {
		return this.count;
	}

	public void setCount(java.lang.Integer count) {
		this.count = count;
	}

	public java.lang.String getItem() {
		return this.item;
	}

	public void setItem(java.lang.String item) {
		this.item = item;
	}

	public java.lang.Double getPrice() {
		return this.price;
	}

	public void setPrice(java.lang.Double price) {
		this.price = price;
	}

	public java.lang.String getMode() {
		return this.mode;
	}

	public void setMode(java.lang.String mode) {
		this.mode = mode;
	}

	public Order(java.lang.Integer count, java.lang.String item,
			java.lang.Double price, java.lang.String mode) {
		this.count = count;
		this.item = item;
		this.price = price;
		this.mode = mode;
	}

}