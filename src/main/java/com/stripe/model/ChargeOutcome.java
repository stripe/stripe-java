package com.stripe.model;

import com.stripe.net.ApiResource;

import lombok.AccessLevel;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ChargeOutcome extends ApiResource {
  protected String networkStatus;
  protected String reason;
  protected String riskLevel;
  @Getter(AccessLevel.NONE) @Setter(AccessLevel.NONE)
      protected ExpandableField<ChargeOutcomeRule> rule;
  protected String sellerMessage;
  protected String type;

  // <editor-fold desc="rule">
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

  @Deprecated
  public void setRule(ChargeOutcomeRule rule) {
    this.rule = new ExpandableField<ChargeOutcomeRule>(rule.getId(), rule);
  }

  public String getRuleId() {
    return (this.rule != null) ? this.rule.getId() : null;
  }

  public void setRuleId(String ruleId) {
    this.rule = setExpandableFieldId(ruleId, this.rule);
  }

  public ChargeOutcomeRule getRuleObject() {
    return (this.rule != null) ? this.rule.getExpanded() : null;
  }

  public void setRuleObject(ChargeOutcomeRule rule) {
    this.rule = new ExpandableField<ChargeOutcomeRule>(rule.getId(), rule);
  }
  // </editor-fold>
}
