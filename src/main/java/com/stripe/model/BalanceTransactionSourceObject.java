package com.stripe.model;

public class BalanceTransactionSourceObject extends StripeObject implements HasId {
	
	String id;
	
	transient Charge charge;
	
	transient Transfer transfer;
	
	transient Refund refund;
	
	// TODO support other expandable properties/types (?)

	@Override
	public String getId() {
		return id;
	}
	
	public void setId(String id) {
		this.id = id;
	}

	public Charge getCharge() {
		return charge;
	}

	public void setCharge(Charge charge) {
		this.charge = charge;
	}

	public Transfer getTransfer() {
		return transfer;
	}

	public void setTransfer(Transfer transfer) {
		this.transfer = transfer;
	}

	public Refund getRefund() {
		return refund;
	}

	public void setRefund(Refund refund) {
		this.refund = refund;
	}

}
