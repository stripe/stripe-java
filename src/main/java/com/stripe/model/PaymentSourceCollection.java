package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class PaymentSourceCollection extends StripeCollectionAPIResource<PaymentSource> {
    public PaymentSourceCollection all(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return all(params, (RequestOptions) null);
    }

    public PaymentSourceCollection all(Map<String, Object> params,
            RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
        return request(RequestMethod.GET, url, params, PaymentSourceCollection.class, options);
    }

    public PaymentSource retrieve(String id) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return retrieve(id, (RequestOptions) null);
    }

    public PaymentSource retrieve(String id, RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
        return request(RequestMethod.GET, url, null, PaymentSource.class, options);
    }

    public PaymentSource create(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return create(params, (RequestOptions) null);
    }

    public PaymentSource create(Map<String, Object> params,
            RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
        return request(RequestMethod.POST, url, params, PaymentSource.class, options);
    }
}
