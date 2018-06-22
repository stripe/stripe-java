package com.stripe.model;

import com.stripe.exception.ApiConnectionException;
import com.stripe.exception.ApiException;
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

  public String getSourceInstanceUrl()
      throws InvalidRequestException {
    return instanceUrl(Source.class, this.getId());
  }

  // <editor-fold desc="create">
  /**
   * Create a source.
   */
  public static Source create(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return create(params, null);
  }

  /**
   * Create a source.
   */
  public static Source create(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, classUrl(Source.class), params, Source.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="delete">
  /**
   * Source objects cannot be deleted. Calling this method will raise an
   * {@link InvalidRequestException}. Call {@link #detach} to detach the source from a
   * customer object.
   */
  @Override
  public DeletedExternalAccount delete(RequestOptions options) throws
      AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    throw new InvalidRequestException(
        "Source objects cannot be deleted. If you want to detach the source from a customer "
        + "object, use detach().",
         null, null, null, 0, null);
  }
  // </editor-fold>

  // <editor-fold desc="detach">
  /**
   * Detach a source.
   */
  public Source detach()
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return detach(null, null);
  }

  /**
   * Detach a source.
   */
  public Source detach(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return detach(params, null);
  }

  /**
   * Detach a source.
   */
  public Source detach(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    if (this.getCustomer() != null) {
      String url = String.format("%s/%s/sources/%s", classUrl(Customer.class), this.getCustomer(),
          this.getId());
      return request(RequestMethod.DELETE, url, params, Source.class, options);
    } else {
      throw new InvalidRequestException(
          "This source object does not appear to be currently attached to a customer object.",
          null, null, null, 0, null);
    }
  }
  // </editor-fold>

  // <editor-fold desc="retrieve">
  /**
   * Retrieve a source.
   */
  public static Source retrieve(String id)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return retrieve(id, null);
  }

  /**
   * Retrieve a source.
   */
  public static Source retrieve(String id, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.GET, instanceUrl(Source.class, id), null, Source.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="sourceTransactions">
  /**
   * Retrieve a source's transactions.
   */
  public SourceTransactionCollection sourceTransactions(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return sourceTransactions(params, null);
  }

  /**
   * Retrieve a source's transactions.
   */
  public SourceTransactionCollection sourceTransactions(Map<String, Object> params,
      RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    String url = instanceUrl(Source.class, this.getId()) + "/source_transactions";
    return requestCollection(url, params, SourceTransactionCollection.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a source.
   */
  @Override
  public Source update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return update(params, null);
  }

  /**
   * Update a source.
   */
  @Override
  public Source update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, this.getSourceInstanceUrl(), params, Source.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="verify">
  /**
   * Verify a source.
   */
  @Override
  public Source verify(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return verify(params, null);
  }

  /**
   * Verify a source.
   */
  @Override
  public Source verify(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      ApiConnectionException, CardException, ApiException {
    return request(RequestMethod.POST, String.format("%s/verify", this.getSourceInstanceUrl()),
        params, Source.class, options);
  }
  // </editor-fold>
}
