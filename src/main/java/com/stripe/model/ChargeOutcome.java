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

  /**
   * Returns the {@code rule} object, if expanded. If not expanded, use {@link #getRuleId()} to get
   * the ID.
   *
   * @return the {@code rule} ID
   * @deprecated In recent API versions, this attribute is no longer automatically expanded. Prefer
   *     using the {@link #getRuleId()} and {@link #getRuleObject()} methods instead.
   * @see <a href="https://stripe.com/docs/upgrades#2017-02-14">API version 2017-02-14</a>
   */
  @Deprecated
  public ChargeOutcomeRule getRule() {
    return (this.rule != null) ? this.rule.getExpanded() : null;
  }

  public String getRuleId() {
    return (this.rule != null) ? this.rule.getId() : null;
  }

  public ChargeOutcomeRule getRuleObject() {
    return (this.rule != null) ? this.rule.getExpanded() : null;
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
