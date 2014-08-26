package com.stripe.model;

import java.util.List;
import java.util.Map;

public class Dispute extends StripeObject {
	String charge;
	Integer amount;
	String status;
	String currency;
	Long created;
	Boolean livemode;
	String evidence;
	Long evidenceDueBy;
	String reason;
	/** 1/2014: Legacy (now use balanceTransactions) -- https://stripe.com/docs/upgrades#2014-08-20 */
	String balanceTransaction;
	List<BalanceTransaction> balanceTransactions;
	Boolean isChargeRefundable;
	Map<String, String> metadata;

	public Integer getAmount() {
		return amount;
	}
	public void setAmount(Integer amount) {
		this.amount = amount;
	}
	public String getCurrency() {
		return currency;
	}
	public void setCurrency(String currency) {
		this.currency = currency;
	}
	public Long getCreated() {
		return created;
	}
	public void setCreated(Long created) {
		this.created = created;
	}
	public String getCharge() {
		return charge;
	}
	public void setCharge(String charge) {
		this.charge = charge;
	}
	public Boolean getLivemode() {
		return livemode;
	}
	public void setLivemode(Boolean livemode) {
		this.livemode = livemode;
	}
	public String getStatus() {
		return status;
	}
	public void setStatus(String status) {
		this.status = status;
	}
	public String getEvidence() {
		return evidence;
	}
	public void setEvidence(String evidence) {
		this.evidence = evidence;
	}
	public Long getEvidenceDueBy() {
		return evidenceDueBy;
	}
	public void setEvidenceDueBy(Long evidenceDueBy) {
		this.evidenceDueBy = evidenceDueBy;
	}
	public String getReason() {
		return reason;
	}
	public void setReason(String reason) {
		this.reason = reason;
	}
	public String getBalanceTransaction() {
		return balanceTransaction;
	}
	public void setBalanceTransaction(String balanceTransaction) {
		this.balanceTransaction = balanceTransaction;
	}
	public List<BalanceTransaction> getBalanceTransactions() {
		return balanceTransactions;
	}
	public void setBalanceTransactions(List<BalanceTransaction> balanceTransactions) {
		this.balanceTransactions = balanceTransactions;
	}
	public boolean getIsChargeRefundable() {
		return isChargeRefundable;
	}
	public void setIsChargeRefundable(Boolean isChargeRefundable) {
		this.isChargeRefundable = isChargeRefundable;
	}
	public Map<String, String> getMetadata() {
		return metadata;
	}
	public void setMetadata(Map<String, String> metadata) {
		this.metadata = metadata;
	}
}
