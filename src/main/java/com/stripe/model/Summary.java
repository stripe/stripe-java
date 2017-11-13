package com.stripe.model;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class Summary extends StripeObject {
	Integer adjustmentCount;
	Long adjustmentGross;
	Integer chargeCount;
	Long chargeFees;
	Long chargeGross;
	Long net;
	Integer refundCount;
	Long refundFees;
	Long refundGross;
	Integer validationCount;
	Long validationFees;

	public void set(Long net) {
		this.net = net;
	}
}
