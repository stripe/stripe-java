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
import java.util.HashMap;
import java.util.Map;

public class AlipayAccount extends APIResource implements PaymentSource {
    String id;
    String object;
    String status;
    Long created;
    String customer;
    Map<String, String> metadata;
    String username;
    String fingerprint;
    Boolean used;
    Boolean reusable;
    Integer paymentAmount;
    String paymentCurrency;

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

    public String getCustomer() {
        return customer;
    }

    public void setCustomer(String customer) {
        this.customer = customer;
    }

    public Map<String, String> getMetadata() {
        return metadata;
    }

    public void setMetadata(Map<String, String> metadata) {
        this.metadata = metadata;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFingerprint() {
        return fingerprint;
    }

    public void setFingerprint(String fingerprint) {
        this.fingerprint = fingerprint;
    }

    public Boolean getUsed() {
        return used;
    }

    public void setUsed(Boolean used) {
        this.used = used;
    }

    public Boolean getReusable() {
        return reusable;
    }

    public void setReusable(Boolean reusable) {
        this.reusable = reusable;
    }

    public Integer getPaymentAmount() {
        return paymentAmount;
    }

    public void setPaymentAmount(Integer paymentAmount) {
        this.paymentAmount = paymentAmount;
    }

    public String getPaymentCurrency() {
        return paymentCurrency;
    }

    public void setPaymentCurrency(String paymentCurrency) {
        this.paymentCurrency = paymentCurrency;
    }

    public String getInstanceURL() {
        if (this.getCustomer() != null) {
            return String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(), this.getId());
        } else {
            return null;
        }
    }

    public AlipayAccount update(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return update(params, (RequestOptions) null);
    }

    public AlipayAccount update(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, this.getInstanceURL(), params, AlipayAccount.class, options);
    }

    public DeletedAlipayAccount delete() throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return delete((RequestOptions) null);
    }

    public DeletedAlipayAccount delete(RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedAlipayAccount.class, options);
    }
}

