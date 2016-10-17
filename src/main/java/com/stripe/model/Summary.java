package com.stripe.model;

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

	public Integer getAdjustmentCount() {
		return adjustmentCount;
	}

	public void setAdjustmentCount(Integer adjustmentCount) {
		this.adjustmentCount = adjustmentCount;
	}

	public Long getAdjustmentGross() {
		return adjustmentGross;
	}

	public void setAdjustmentGross(Long adjustmentGross) {
		this.adjustmentGross = adjustmentGross;
	}

	public Integer getChargeCount() {
		return chargeCount;
	}

	public void setChargeCount(Integer chargeCount) {
		this.chargeCount = chargeCount;
	}

	public Long getChargeFees() {
		return chargeFees;
	}

	public void setChargeFees(Long chargeFees) {
		this.chargeFees = chargeFees;
	}

	public Long getChargeGross() {
		return chargeGross;
	}

	public void setChargeGross(Long chargeGross) {
		this.chargeGross = chargeGross;
	}

	public Long getNet() {
		return net;
	}

	public void set(Long net) {
		this.net = net;
	}

	public Integer getRefundCount() {
		return refundCount;
	}

	public void setRefundCount(Integer refundCount) {
		this.refundCount = refundCount;
	}

	public Long getRefundFees() {
		return refundFees;
	}

	public void setRefundFees(Long refundFees) {
		this.refundFees = refundFees;
	}

	public Long getRefundGross() {
		return refundGross;
	}

	public void setRefundGross(Long refundGross) {
		this.refundGross = refundGross;
	}

	public Integer getValidationCount() {
		return validationCount;
	}

	public void setValidationCount(Integer validationCount) {
		this.validationCount = validationCount;
	}

	public Long getValidationFees() {
		return validationFees;
	}

	public void setValidationFees(Long validationFees) {
		this.validationFees = validationFees;
	}
}
