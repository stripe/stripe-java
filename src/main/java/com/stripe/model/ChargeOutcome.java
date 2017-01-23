package com.stripe.model;

public class ChargeOutcome extends StripeObject {
	protected String networkStatus;
	protected String reason;
	protected String riskLevel;
	protected String sellerMessage;
	protected String type;
	protected ChargeOutcomeRule rule;

	public String getNetworkStatus() {
		return networkStatus;
	}

	public String getReason() {
		return reason;
	}

	public String getRiskLevel() {
		return riskLevel;
	}

	public String getSellerMessage() {
		return sellerMessage;
	}

	public String getType() {
		return type;
	}

	public ChargeOutcomeRule getRule() {
		return rule;
	}

	public void setNetworkStatus(String networkStatus) {
		this.networkStatus = networkStatus;
	}

	public void setRiskLevel(String riskLevel) {
		this.riskLevel = riskLevel;
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

	public void setRule(ChargeOutcomeRule rule) {
		this.rule = rule;
	}
}
