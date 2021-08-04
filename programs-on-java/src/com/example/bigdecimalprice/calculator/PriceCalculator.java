package com.example.bigdecimalprice.calculator;

import java.math.BigDecimal;
import java.math.RoundingMode;

public class PriceCalculator {
	
	public static void main(String [] args) {
		
		
		
		getFinalProductPriceWithTaxAdded();
		
		//667.88
		
	}

	public static BigDecimal getFinalProductPriceWithTaxAdded() {
		BigDecimal productPrice = new BigDecimal(566);
		
		Double gstRate = 18.0;
		
		Double gstRateDecimalValue = (gstRate/100);
		
		BigDecimal gstAmount = productPrice.multiply(BigDecimal.valueOf(gstRateDecimalValue));
		
		productPrice = productPrice.add(gstAmount);
		productPrice = new BigDecimal(667.23);
		System.out.println(productPrice.setScale(2, RoundingMode.UP));
		return null;
	}
}
