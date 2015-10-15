package com.stripe.model;

import com.stripe.Stripe;
import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

public class ExternalAccountCollection extends StripeCollectionAPIResource<ExternalAccount> {
    public ExternalAccountCollection list(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return list(params, (RequestOptions) null);
    }

    public ExternalAccountCollection list(Map<String, Object> params,
            RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
        return requestCollection(url, params, ExternalAccountCollection.class, options);
    }

	@Deprecated
    public ExternalAccountCollection all(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return list(params, (RequestOptions) null);
    }

	@Deprecated
    public ExternalAccountCollection all(Map<String, Object> params,
            RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return list(params, options);
    }

    public ExternalAccount retrieve(String id) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        return retrieve(id, (RequestOptions) null);
    }

    public ExternalAccount retrieve(String id, RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s/%s", Stripe.getApiBase(), this.getURL(), id);
        return request(RequestMethod.GET, url, null, ExternalAccount.class, options);
    }

    public ExternalAccount create(Map<String, Object> params)
            throws AuthenticationException, InvalidRequestException,
            APIConnectionException, CardException, APIException {
        return create(params, (RequestOptions) null);
    }

    public ExternalAccount create(Map<String, Object> params,
            RequestOptions options) throws AuthenticationException,
            InvalidRequestException, APIConnectionException, CardException,
            APIException {
        String url = String.format("%s%s", Stripe.getApiBase(), this.getURL());
        return request(RequestMethod.POST, url, params, ExternalAccount.class, options);
    }
}
