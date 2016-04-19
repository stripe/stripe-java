package com.stripe.model;

public class Summary extends StripeObject {
	Integer adjustmentCount;
	Integer adjustmentGross;
	Integer chargeCount;
	Integer chargeFees;
	Integer chargeGross;
	Integer net;
	Integer refundCount;
	Integer refundFees;
	Integer refundGross;
	Integer validationCount;
	Integer validationFees;

	public Integer getAdjustmentCount() {
		return adjustmentCount;
	}

	public void setAdjustmentCount(Integer adjustmentCount) {
		this.adjustmentCount = adjustmentCount;
	}

	public Integer getAdjustmentGross() {
		return adjustmentGross;
	}

	public void setAdjustmentGross(Integer adjustmentGross) {
		this.adjustmentGross = adjustmentGross;
	}

	public Integer getChargeCount() {
		return chargeCount;
	}

	public void setChargeCount(Integer chargeCount) {
		this.chargeCount = chargeCount;
	}

	public Integer getChargeFees() {
		return chargeFees;
	}

	public void setChargeFees(Integer chargeFees) {
		this.chargeFees = chargeFees;
	}

	public Integer getChargeGross() {
		return chargeGross;
	}

	public void setChargeGross(Integer chargeGross) {
		this.chargeGross = chargeGross;
	}

	public Integer getNet() {
		return net;
	}

	public void set(Integer net) {
		this.net = net;
	}

	public Integer getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(Integer refundCount) {
		this.refundCount = refundCount;
	}

	public Integer getRefundFees() {
		return refundFees;
	}

	public void setRefundFees(Integer refundFees) {
		this.refundFees = refundFees;
	}

	public Integer getRefundGross() {
		return refundGross;
	}

	public void setRefundGross(Integer refundGross) {
		this.refundGross = refundGross;
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
}
