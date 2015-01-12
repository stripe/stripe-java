package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;


public class BitcoinTransactionCollection extends StripeCollectionAPIResource<BitcoinTransaction> {
    public BitcoinTransactionCollection all(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return all(params, (RequestOptions) null);
    }

    public BitcoinTransactionCollection all(Map<String, Object> params, RequestOptions options)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
        return request(RequestMethod.GET, url, params, BitcoinTransactionCollection.class, options);
    }
}
