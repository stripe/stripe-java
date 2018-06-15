package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Source extends ExternalAccount implements HasSourceTypeData {
  Long amount;
  String clientSecret;
  SourceCodeVerificationFlow codeVerification;
  Long created;
  String currency;
  String flow;
  Boolean livemode;
  SourceOwner owner;
  SourceReceiverFlow receiver;
  SourceRedirectFlow redirect;
  String statementDescriptor;
  String status;
  String type;
  String usage;

  // Type-specific properties
  @Getter(onMethod = @__({@Override})) @Setter(onMethod = @__({@Override}))
      Map<String, String> typeData;

  // APIResource methods

  public String getSourceInstanceURL()
      throws InvalidRequestException {
    return instanceURL(Source.class, this.getId());
  }

  public static Source create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return create(params, null);
  }

  public static Source create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, classURL(Source.class), params, Source.class, options);
  }

  /**
   * Source objects cannot be deleted. Calling this method will raise an
   * {@link InvalidRequestException}. Call {@link #detach} to detach the source from a
   * customer object.
   */
  @Override
  public DeletedExternalAccount delete(RequestOptions options) throws
      AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    throw new InvalidRequestException(
        "Source objects cannot be deleted. If you want to detach the source from a customer "
        + "object, use detach().",
         null, null, null, 0, null);
  }

  public Source detach()
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return detach(null, null);
  }

  public Source detach(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return detach(params, null);
  }

  /**
   * Detaches the source from its customer object.
   */
  public Source detach(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    if (this.getCustomer() != null) {
      String url = String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(),
          this.getId());
      return request(RequestMethod.DELETE, url, params, Source.class, options);
    } else {
      throw new InvalidRequestException(
          "This source object does not appear to be currently attached to a customer object.",
          null, null, null, 0, null);
    }
  }

  public static Source retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return retrieve(id, null);
  }

  public static Source retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.GET, instanceURL(Source.class, id), null, Source.class, options);
  }

  public SourceTransactionCollection sourceTransactions(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return sourceTransactions(params, null);
  }

  public SourceTransactionCollection sourceTransactions(Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    String url = instanceURL(Source.class, this.getId()) + "/source_transactions";
    return requestCollection(url, params, SourceTransactionCollection.class, options);
  }

  @Override
  public Source update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  @Override
  public Source update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getSourceInstanceURL(), params, Source.class, options);
  }

  @Override
  public Source verify(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return verify(params, null);
  }

  @Override
  public Source verify(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, String.format("%s/verify", this.getSourceInstanceURL()),
        params, Source.class, options);
  }
}
