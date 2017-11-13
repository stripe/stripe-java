package com.stripe.model;

import com.stripe.net.APIResource;
import lombok.Getter;
import lombok.Setter;

public class ChargeOutcome extends APIResource {
	@Getter @Setter
	protected String networkStatus;
	@Getter @Setter
	protected String reason;
	@Getter @Setter
	protected String riskLevel;
	protected ExpandableField<ChargeOutcomeRule> rule;
	@Getter @Setter
	protected String sellerMessage;
	@Getter @Setter
	protected String type;

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
