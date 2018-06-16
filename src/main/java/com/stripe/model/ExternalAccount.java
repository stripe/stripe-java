package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.APIResource;
import com.stripe.net.RequestOptions;

import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ExternalAccount extends APIResource implements HasId, MetadataStore<ExternalAccount> {
  @Getter(onMethod = @__({@Override})) String id;
  String object;
  String account;
  String customer;
  @Getter(onMethod = @__({@Override})) Map<String, String> metadata;

  // <editor-fold desc="delete">
  public DeletedExternalAccount delete() throws AuthenticationException,
      InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return delete(null);
  }

  public DeletedExternalAccount delete(RequestOptions options) throws
      AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedExternalAccount.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  @Override
  public ExternalAccount update(Map<String, Object> params) throws
      AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, null);
  }

  @Override
  public ExternalAccount update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, ExternalAccount.class,
        options);
  }
  // </editor-fold>

  // <editor-fold desc="verify">
  public ExternalAccount verify(Map<String, Object> params) throws
      AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return verify(params, null);
  }

  /**
   * Verifies a bank account.
   *
   * @param params request parameters
   * @param options request options
   * @return the verified bank account
   */
  public ExternalAccount verify(Map<String, Object> params, RequestOptions options) throws
      AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    if (this.getCustomer() != null) {
      return request(RequestMethod.POST, String.format("%s/verify", this.getInstanceURL()), params,
          ExternalAccount.class, options);
    } else {
      throw new InvalidRequestException(
          "Only customer bank accounts can be verified in this manner.",
          null, null, null, 0, null);
    }
  }
  // </editor-fold>

  protected String getInstanceURL() {
    // TODO: Replace with subresourceURL
    if (this.getCustomer() != null) {
      return String.format("%s/%s/sources/%s", classURL(Customer.class), this.getCustomer(),
          this.getId());
    } else if (this.getAccount() != null) {
      return String.format("%s/%s/external_accounts/%s", classURL(Account.class), this.getAccount(),
          this.getId());
    } else {
      return null;
    }
  }
}
