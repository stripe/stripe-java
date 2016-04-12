package com.stripe.model;

public class ChargeOutcome extends StripeObject {
	protected String networkStatus;
	protected String reason;
	protected String sellerMessage;
	protected String type;

	public String getNetworkStatus() {
		return networkStatus;
	}

	public String getReason() {
		return reason;
	}

	public String getSellerMessage() {
		return sellerMessage;
	}

	public String getType() {
		return type;
	}

	public void setNetworkStatus(String networkStatus) {
		this.networkStatus = networkStatus;
	}

	public void setReason(String reason) {
		this.reason = reason;
	}

	public void setSellerMessage(String sellerMessage) {
		this.sellerMessage = sellerMessage;
	}

	public void setType(String type) {
		this.type = type;
	}
}
