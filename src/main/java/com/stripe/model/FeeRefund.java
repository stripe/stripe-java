package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;
import lombok.Getter;
import lombok.Setter;

import java.util.Map;

public class FeeRefund extends APIResource implements MetadataStore<ApplicationFee>, HasId {
	@Getter
	String id;
	@Getter @Setter
	String object;
	@Getter @Setter
	Long amount;
	ExpandableField<BalanceTransaction> balanceTransaction;
	@Getter @Setter
	String currency;
	@Getter @Setter
	Long created;
	ExpandableField<ApplicationFee> fee;
	@Getter @Setter
	Map<String, String> metadata;

	public String getBalanceTransaction() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getId();
	}

	public void setBalanceTransaction(String balanceTransactionID) {
		this.balanceTransaction = setExpandableFieldID(balanceTransactionID, this.balanceTransaction);
	}

	public BalanceTransaction getBalanceTransactionObject() {
		if (this.balanceTransaction == null) {
			return null;
		}
		return this.balanceTransaction.getExpanded();
	}

	public void setBalanceTransactionObject(BalanceTransaction c) {
		this.balanceTransaction = new ExpandableField<BalanceTransaction>(c.getId(), c);
	}

	public String getFee() {
		if (this.fee == null) {
			return null;
		}
		return this.fee.getId();
	}

	public void setFee(String feeID) {
		this.fee = setExpandableFieldID(feeID, this.fee);
	}

	public ApplicationFee getFeeObject() {
		if (this.fee == null) {
			return null;
		}
		return this.fee.getExpanded();
	}

	public void setFeeObject(ApplicationFee c) {
		this.fee = new ExpandableField<ApplicationFee>(c.getId(), c);
	}

	public FeeRefund update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	@Deprecated
	public FeeRefund update(Map<String, Object> params, String apiKey)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, RequestOptions.builder().setApiKey(apiKey).build());
	}

	public FeeRefund update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, this.getInstanceURL(), params, FeeRefund.class, options);
	}

	public String getInstanceURL() {
		if (this.fee != null) {
			return String.format("%s/%s/refunds/%s", classURL(ApplicationFee.class), this.fee, this.getId());
		}
		return null;
	}
}
