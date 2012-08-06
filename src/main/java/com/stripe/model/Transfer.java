package com.stripe.model;

import java.util.List;
import java.util.Map;

import com.stripe.exception.StripeException;
import com.stripe.net.APIResource;

public class Transfer extends APIResource {
	String id;
	String status;
	Long date;
	Summary summary;
	String description;
	Integer amount;
	List<String> otherTransfers;

	public String getId() {
		return id;
	}

	public void setId(String id) {
		this.id = id;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public Long getDate() {
		return date;
	}

	public void setDate(Long date) {
		this.date = date;
	}

	public Summary getSummary() {
		return summary;
	}

	public void setSummary(Summary summary) {
		this.summary = summary;
	}

	public String getDescription() {
		return description;
	}

	public void setDescription(String description) {
		this.description = description;
	}

	public Integer getAmount() {
		return amount;
	}

	public void setAmount(Integer amount) {
		this.amount = amount;
	}

	public List<String> getOtherTransfers() {
		return otherTransfers;
	}

	public void setOtherTransfers(List<String> otherTransfers) {
		this.otherTransfers = otherTransfers;
	}

	public static Transfer retrieve(String id) throws StripeException {
		return retrieve(id, null);
	}

	public static TransferCollection all(Map<String, Object> params) throws StripeException {
		return all(params, null);
	}

	public TransferTransactionCollection transactions(Map<String, Object> params) throws StripeException {
		return transactions(params, null);
	}
	
	public static Transfer retrieve(String id, String apiKey) throws StripeException {
		return request(RequestMethod.GET, instanceURL(Transfer.class, id), null, Transfer.class, apiKey);
	}

	public static TransferCollection all(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.GET, classURL(Transfer.class), params, TransferCollection.class, apiKey);
	}

	public TransferTransactionCollection transactions(Map<String, Object> params, String apiKey) throws StripeException {
		return request(RequestMethod.GET,
			       String.format("%s/transactions", instanceURL(Transfer.class, this.getId())),
			       params, TransferTransactionCollection.class, apiKey);
	}
	
}
