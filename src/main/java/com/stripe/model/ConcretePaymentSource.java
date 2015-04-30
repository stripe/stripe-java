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

/**
 * ConcretePaymentSource is a PaymentSource that is used as a catch-all for
 * payment sources that are returned from the Stripe API but do not have a
 * full PaymentSource implementation.
 *
 * This class only provides the common subset of methods that are shared among
 * all PaymentSources. For instance, the PaymentSource AlipayAccount exposes
 * additional methods for getting the account's username that would not be
 * available if those sources had to be represented as a ConcretePaymentSource.
 */
public class ConcretePaymentSource extends APIResource implements PaymentSource {
    String id;
    String object;
    String status;
    String customer;

    @Override
    public String getId() {
        return id;
    }

    @Override
    public void setId(String id) {
        this.id = id;
    }

    @Override
    public String getObject() {
        return object;
    }

    @Override
    public void setObject(String object) {
        this.object = object;
    }

    @Override
    public String getStatus() {
        return status;
    }

    @Override
    public void setStatus(String status) {
        this.status = status;
    }

    @Override
    public String getCustomer() {
        return customer;
    }

    @Override
    public void setCustomer(String customer) {
        this.customer = customer;
    }

    @Override
    public String getInstanceURL() {
        if (this.getCustomer() != null) {
            return String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(), this.getId());
        } else {
            return null;
        }
    }

    @Override
    public PaymentSource update(Map<String, Object> params) throws
            AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return update(params, null);
    }

    @Override
    public PaymentSource update(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.POST, this.getInstanceURL(), params, ConcretePaymentSource.class, options);
    }

    @Override
    public DeletedConcretePaymentSource delete() throws AuthenticationException,
            InvalidRequestException, APIConnectionException,
            CardException, APIException {
        return delete(null);
    }

    @Override
    public DeletedConcretePaymentSource delete(RequestOptions options) throws
            AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedConcretePaymentSource.class, options);
    }
}

