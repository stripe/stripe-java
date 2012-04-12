package com.stripe.model;

public class Summary extends StripeObject {
	Integer chargeFees;
	Integer net;
	Integer refundGross;
	Integer adjustmentGross;
	Integer refundFees;
	Integer validationCount;
	Integer validationFees;
	Integer refundCount;
	Integer adjustmentCount;
	Integer chargeCount;
	Integer chargeGross;

	public Integer getChargeFees() {
		return chargeFees;
	}

	public void setChargeFees(Integer chargeFees) {
		this.chargeFees = chargeFees;
	}

	public Integer getNet() {
		return net;
	}

	public void set(Integer net) {
		this.net = net;
	}

	public Integer getRefundGross() {
		return refundGross;
	}

	public void setRefundGross(Integer refundGross) {
		this.refundGross = refundGross;
	}

	public Integer getAdjustmentGross() {
		return adjustmentGross;
	}

	public void setAdjustmentGross(Integer adjustmentGross) {
		this.adjustmentGross = adjustmentGross;
	}

	public Integer getRefundFees() {
		return refundFees;
	}

	public void setRefundFees(Integer refundFees) {
		this.refundFees = refundFees;
	}

	public Integer getValidationCount() {
		return validationCount;
	}

	public void setValidationCount(Integer validationCount) {
		this.validationCount = validationCount;
	}

	public Integer getValidationFees() {
		return validationFees;
	}

	public void setValidationFees(Integer validationFees) {
		this.validationFees = validationFees;
	}

	public Integer getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(Integer refundCount) {
		this.refundCount = refundCount;
	}

	public Integer getAdjustmentCount() {
		return adjustmentCount;
	}

	public void setAdjustmentCount(Integer adjustmentCount) {
		this.adjustmentCount = adjustmentCount;
	}

	public Integer getChargeCount() {
		return chargeCount;
	}

	public void setChargeCount(Integer chargeCount) {
		this.chargeCount = chargeCount;
	}

	public Integer getChargeGross() {
		return chargeGross;
	}

	public void setChargeGross(Integer chargeGross) {
		this.chargeGross = chargeGross;
	}
}
