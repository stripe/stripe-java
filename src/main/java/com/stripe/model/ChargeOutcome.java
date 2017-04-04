package com.stripe.model;

import com.stripe.net.APIResource;

public class ChargeOutcome extends APIResource {
	protected String networkStatus;
	protected String reason;
	protected String riskLevel;
	protected ExpandableField<ChargeOutcomeRule> rule;
	protected String sellerMessage;
	protected String type;

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

	@Deprecated
	public ChargeOutcomeRule getRule() {
		if (this.rule == null) {
			return null;
		}
		return this.rule.getExpanded();
	}

	public String getRuleId() {
		if (this.rule == null) {
			return null;
		}
		return this.rule.getId();
	}

	public ChargeOutcomeRule getRuleObject() {
		if (this.rule == null) {
			return null;
		}
		return this.rule.getExpanded();
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

	@Deprecated
	public void setRule(ChargeOutcomeRule rule) {
		this.rule = new ExpandableField<ChargeOutcomeRule>(rule.getId(), rule);
	}

	public void setRuleId(String ruleId) {
		this.rule = setExpandableFieldID(ruleId, this.rule);
	}

	public void setRuleObject(ChargeOutcomeRule rule) {
		this.rule = new ExpandableField<ChargeOutcomeRule>(rule.getId(), rule);
	}
}
