package com.example.stockxbid.uniquehashcode;

import java.io.Serializable;
import java.sql.Timestamp;

public class OrderNumber implements Serializable {

	/**
	 * 
	 */
	private static final long serialVersionUID = 8259330332570932370L;

	private Integer quantity;
	private Long shoppingCartItemId;
	private Long shoppingCartId;
	private Long customerId;
	private Long userId;
	//private Timestamp timeStamp;

	public OrderNumber() {
	}

	public OrderNumber(Integer quantity, Long shoppingCartItemId, Long shoppingCartId, Long customerId, Long userId,
			Timestamp timeStamp) {
		super();
		this.quantity = quantity;
		this.shoppingCartItemId = shoppingCartItemId;
		this.shoppingCartId = shoppingCartId;
		this.customerId = customerId;
		this.userId = userId;
	//	this.timeStamp = timeStamp;
	}

	public void setQuantity(Integer quantity) {
		this.quantity = quantity;
	}

	public void setShoppingCartItemId(Long shoppingCartItemId) {
		this.shoppingCartItemId = shoppingCartItemId;
	}

	public void setShoppingCartId(Long shoppingCartId) {
		this.shoppingCartId = shoppingCartId;
	}

	public void setCustomerId(Long customerId) {
		this.customerId = customerId;
	}

	public void setUserId(Long userId) {
		this.userId = userId;
	}

//	public void setTimeStamp(Timestamp timeStamp) {
//		this.timeStamp = timeStamp;
//	}


	@Override
	public int hashCode() {
		final int prime = 31;
		int result = 1;
		result = prime * result + ((customerId == null) ? 0 : customerId.hashCode());
		result = prime * result + ((quantity == null) ? 0 : quantity.hashCode());
		result = prime * result + ((shoppingCartId == null) ? 0 : shoppingCartId.hashCode());
		result = prime * result + ((shoppingCartItemId == null) ? 0 : shoppingCartItemId.hashCode());
	//	result = prime * result + ((timeStamp == null) ? 0 : timeStamp.hashCode());
		result = prime * result + ((userId == null) ? 0 : userId.hashCode());
		return result;
	}

	@Override
	public boolean equals(Object obj) {
		if (this == obj)
			return true;
		if (obj == null)
			return false;
		if (getClass() != obj.getClass())
			return false;
		OrderNumber other = (OrderNumber) obj;
		if (customerId == null) {
			if (other.customerId != null)
				return false;
		} else if (!customerId.equals(other.customerId))
			return false;
		if (quantity == null) {
			if (other.quantity != null)
				return false;
		} else if (!quantity.equals(other.quantity))
			return false;
		if (shoppingCartId == null) {
			if (other.shoppingCartId != null)
				return false;
		} else if (!shoppingCartId.equals(other.shoppingCartId))
			return false;
		if (shoppingCartItemId == null) {
			if (other.shoppingCartItemId != null)
				return false;
		} else if (!shoppingCartItemId.equals(other.shoppingCartItemId))
			return false;
	
		if (userId == null) {
			if (other.userId != null)
				return false;
		} else if (!userId.equals(other.userId))
			return false;
		return true;
	}

}
