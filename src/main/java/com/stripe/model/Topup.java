package com.stripe.model;

import com.stripe.exception.*;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class Topup extends APIResource implements MetadataStore<Topup>, HasId {
    String id;
    String object;
    Integer amount;
    ExpandableField<BalanceTransaction> balanceTransaction;
    Long created;
    String currency;
    String description;
    Long expectedAvailabilityDate;
    String failureCode;
    String failureMessage;
    Boolean livemode;
    Map<String, String> metadata;
    Source source;
    String statementDescriptor;
    String status;

    @Override
    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public String getObject() {
        return object;
    }

    public void setObject(String object) {
        this.object = object;
    }

    public Integer getAmount() {
        return amount;
    }

    public void setAmount(Integer amount) {
        this.amount = amount;
    }

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

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public Long getExpectedAvailabilityDate() {
        return expectedAvailabilityDate;
    }

    public void setExpectedAvailabilityDate(Long expectedAvailabilityDate) {
        this.expectedAvailabilityDate = expectedAvailabilityDate;
    }

    public String getFailureCode() {
        return failureCode;
    }

    public void setFailureCode(String failureCode) {
        this.failureCode = failureCode;
    }

    public String getFailureMessage() {
        return failureMessage;
    }

    public void setFailureMessage(String failureMessage) {
        this.failureMessage = failureMessage;
    }

    public Boolean getLivemode() {
        return livemode;
    }

    public void setLivemode(Boolean livemode) {
        this.livemode = livemode;
    }

    @Override
    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public Source getSource() {
        return source;
    }

    public void setSource(Source source) {
        this.source = source;
    }

    public String getStatementDescriptor() {
        return statementDescriptor;
    }

    public void setStatementDescriptor(String statementDescriptor) {
        this.statementDescriptor = statementDescriptor;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public static Topup create(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return create(params, null);
    }

    public static Topup create(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, classURL(Topup.class), params, Topup.class, options);
    }

    public static Topup retrieve(String id) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return retrieve(id, null);
    }

    public static Topup retrieve(String id, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return retrieve(id, null, options);
    }

    public static Topup retrieve(String id, Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.GET, instanceURL(Topup.class, id), params, Topup.class, options);
    }

    public static TopupCollection list(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return list(params, null);
    }

    public static TopupCollection list(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return requestCollection(classURL(Topup.class), params, TopupCollection.class, options);
    }

    @Override
    public Topup update(Map<String, Object> params) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return update(params, null);
    }

    @Override
    public Topup update(Map<String, Object> params, RequestOptions options) throws AuthenticationException, InvalidRequestException, APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, instanceURL(Topup.class, id), params, Topup.class, options);
    }
}
