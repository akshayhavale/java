package com.example.stockxbid.uniquehashcode;

import java.sql.Timestamp;

public class OrderNumber {

	private Long orderId;
	private Long orderProductId;
	private Long userId;
	private Timestamp timestamp;

	public OrderNumber(Long orderId, Long orderProductId, Long userId, Timestamp timestamp) {
		super();
		this.orderId = orderId;
		this.orderProductId = orderProductId;
		this.userId = userId;
		this.timestamp = timestamp;
	}

	public Long getOrderId() {
		return orderId;
	}

	public void setOrderId(Long orderId) {
		this.orderId = orderId;
	}

	public Long getOrderProductId() {
		return orderProductId;
	}

	public void setOrderProductId(Long orderProductId) {
		this.orderProductId = orderProductId;
	}

	public Long getUserId() {
		return userId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

	public Timestamp getTimestamp() {
		return timestamp;
	}

	public void setTimestamp(Timestamp timestamp) {
		this.timestamp = timestamp;
	}

}
