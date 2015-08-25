package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Collections;
import java.util.Map;

public class BitcoinReceiver extends ExternalAccount implements HasId {
    String status;
    Long created;
    String currency;
    Integer amount;
    Integer amountReceived;
    Integer bitcoinAmount;
    Integer bitcoinAmountReceived;
    Boolean filled;
    Boolean active;
    Boolean rejectTransactions;
    String description;
    String inboundAddress;
    String refundAddress;
    String bitcoinUri;
    String email;
    String payment;
    BitcoinTransactionCollection transactions;
    Map<String, String> metadata;

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public Long getCreated() {
        return created;
    }

    public void setCreated(Long created) {
        this.created = created;
    }

    public String getCurrency() {
        return currency;
    }

    public void setCurrency(String currency) {
        this.currency = currency;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

    public Integer getAmountReceived() {
        return amountReceived;
    }

    public void setAmountReceived(Integer amountReceived) {
        this.amountReceived = amountReceived;
    }

    public Integer getBitcoinAmount() {
        return bitcoinAmount;
    }

    public void setBitcoinAmount(Integer bitcoinAmount) {
        this.bitcoinAmount = bitcoinAmount;
    }

    public Integer getBitcoinAmountReceived() {
        return bitcoinAmountReceived;
    }

    public void setBitcoinAmountReceived(Integer bitcoinAmountReceived) {
        this.bitcoinAmountReceived = bitcoinAmountReceived;
    }

    public Boolean getFilled() {
        return filled;
    }

    public void setFilled(Boolean filled) {
        this.filled = filled;
    }

    public Boolean getActive() {
        return active;
    }

    public void setActive(Boolean active) {
        this.active = active;
    }

    public Boolean getRejectTransactions() {
        return rejectTransactions;
    }

    public void setRejectTransactions(Boolean rejectTransactions) {
        this.rejectTransactions = rejectTransactions;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getInboundAddress() {
        return inboundAddress;
    }

    public void setInboundAddress(String inboundAddress) {
        this.inboundAddress = inboundAddress;
    }

    public String getRefundAddress() {
        return refundAddress;
    }

    public void setRefundAddress(String refundAddress) {
        this.refundAddress = refundAddress;
    }

    public String getBitcoinUri() {
        return bitcoinUri;
    }

    public void setBitcoinUri(String bitcoinUri) {
        this.bitcoinUri = bitcoinUri;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getPayment() {
        return payment;
    }

    public void setPayment(String payment) {
        this.payment = payment;
    }

    public BitcoinTransactionCollection getTransactions() {
        return transactions;
    }

    public void setTransactions(BitcoinTransactionCollection transactions) {
        this.transactions = transactions;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public static BitcoinReceiver create(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return create(params, (RequestOptions) null);
    }

    public static BitcoinReceiver retrieve(String id) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return retrieve(id, (RequestOptions) null);
    }

    public static BitcoinReceiverCollection all(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return all(params, (RequestOptions) null);
    }

    public static BitcoinReceiver create(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, String.format("%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers"), params, BitcoinReceiver.class, options);
    }

    public static BitcoinReceiver retrieve(String id, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.GET, String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", id), null, BitcoinReceiver.class, options);
    }

    public static BitcoinReceiverCollection all(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.GET, String.format("%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers"), params, BitcoinReceiverCollection.class, options);
    }

    @Override
    public String getInstanceURL() {
        String result = super.getInstanceURL();
        if (result == null) {
            return String.format("%s/%s/%s", Stripe.getApiBase(), "v1/bitcoin/receivers", this.getId());
        } else {
            return result;
        }
    }

    @Override
    public BitcoinReceiver update(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return update(params, (RequestOptions) null);
    }

    @Override
    public BitcoinReceiver update(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, this.getInstanceURL(), params, BitcoinReceiver.class, options);
    }

    @Override
    public DeletedBitcoinReceiver delete() throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return delete((RequestOptions) null);
    }

    @Override
    public DeletedBitcoinReceiver delete(RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedBitcoinReceiver.class, options);
    }
}
