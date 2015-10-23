package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

public class Dispute extends APIResource implements HasId {
	String id;
	Boolean livemode;
	Integer amount;
	String charge;
	Long created;
	String currency;

	String reason;
	String status;

	/** 8/2014: Legacy (now use balanceTransactions) -- https://stripe.com/docs/upgrades#2014-08-20 */
	String balanceTransaction;
	List<BalanceTransaction> balanceTransactions;

	/** 12/2014: Legacy (now use evidenceSubObject) -- https://stripe.com/docs/upgrades */
	String evidence;
	EvidenceSubObject evidenceSubObject;

	EvidenceDetails evidenceDetails;
	/** 12/2014: Legacy (now use evidenceDetails.dueBy) -- https://stripe.com/docs/upgrades */
	Long evidenceDueBy;

	Boolean isChargeRefundable;
	Map<String, String> metadata;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

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
	public EvidenceSubObject getEvidenceSubObject() {
		return evidenceSubObject;
	}
	public void setEvidenceSubObject(EvidenceSubObject evidence) {
		this.evidenceSubObject = evidence;
	}
	/** 12/2014 Legacy (now use evidenceSubObject) */
	public String getEvidence() {
		return evidence;
	}
	/** 12/2014 Legacy (now use evidenceSubObject) */
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
	public EvidenceDetails getEvidenceDetails() {
		return evidenceDetails;
	}

	public void setEvidenceDetails(EvidenceDetails evidenceDetails) {
		this.evidenceDetails = evidenceDetails;
	}

	public static Dispute retrieve(String id) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return retrieve(id, (RequestOptions) null);
	}

	public static Dispute retrieve(String id, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return request(RequestMethod.GET, instanceURL(Dispute.class, id), null, Dispute.class, options);
	}

	public static DisputeCollection list(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, (RequestOptions) null);
	}

	public static DisputeCollection list(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return requestCollection(classURL(Dispute.class), params, DisputeCollection.class, options);
	}

	@Deprecated
	public static DisputeCollection all(Map<String, Object> params) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, (RequestOptions) null);
	}

	@Deprecated
	public static DisputeCollection all(Map<String, Object> params, RequestOptions options) throws AuthenticationException,
			InvalidRequestException, APIConnectionException, CardException,
			APIException {
		return list(params, options);
	}

	public Dispute update(Map<String, Object> params)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return update(params, (RequestOptions) null);
	}

	public Dispute update(Map<String, Object> params, RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, instanceURL(Dispute.class, this.getId()),
				params, Dispute.class, options);
	}

	public Dispute close()
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return close((RequestOptions) null);
	}

	public Dispute close(RequestOptions options)
			throws AuthenticationException, InvalidRequestException,
			APIConnectionException, CardException, APIException {
		return request(RequestMethod.POST, String.format("%s/close", instanceURL(Dispute.class, this.getId())),
				null, Dispute.class, options);
	}
}
