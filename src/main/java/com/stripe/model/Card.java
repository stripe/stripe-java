package com.stripe.model;

import com.stripe.exception.APIConnectionException;
import com.stripe.exception.APIException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.CardException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.net.RequestOptions;

import java.util.List;
import java.util.Map;

import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = true)
public class Card extends ExternalAccount {
  String addressCity;
  String addressCountry;
  String addressLine1;
  String addressLine1Check;
  String addressLine2;
  String addressState;
  String addressZip;
  String addressZipCheck;
  List<String> availablePayoutMethods;
  String brand;
  String country;
  String currency;
  String cvcCheck;
  Boolean defaultForCurrency;
  String dynamicLast4;
  Integer expMonth;
  Integer expYear;
  String fingerprint;
  String funding;
  String last4;
  String name;
  String recipient;
  String status;
  ThreeDSecure threeDSecure;
  String tokenizationMethod;

  // Please note that these field are for internal use only and are not typically returned
  // as part of standard API requests.
  String description;
  String iin;
  String issuer;

  /**
   * The {@code type} attribute.
   *
   * @deprecated Prefer using the {@code brand} attribute instead.
   * @see <a href="https://stripe.com/docs/upgrades#2014-06-13">API version 2014-06-13</a>
   */
  @Deprecated
  String type;

  // <editor-fold desc="delete">
  /**
   * Delete a card.
   */
  @Override
  public DeletedCard delete()
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return delete((RequestOptions) null);
  }

  /**
   * Delete a card.
   */
  @Override
  public DeletedCard delete(RequestOptions options)
      throws AuthenticationException, InvalidRequestException, APIConnectionException,
      CardException, APIException {
    return request(RequestMethod.DELETE, this.getInstanceURL(), null, DeletedCard.class, options);
  }
  // </editor-fold>

  // <editor-fold desc="update">
  /**
   * Update a card.
   */
  @Override
  public Card update(Map<String, Object> params)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Update a card.
   */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options)
      throws AuthenticationException, InvalidRequestException,
      APIConnectionException, CardException, APIException {
    return request(RequestMethod.POST, this.getInstanceURL(), params, Card.class, options);
  }
  // </editor-fold>

  @Override
  protected String getInstanceURL() {
    String result = super.getInstanceURL();
    if (result != null) {
      return result;
    } else if (this.getRecipient() != null) {
      return String.format("%s/%s/cards/%s", classURL(Recipient.class), this.getRecipient(),
          this.getId());
    } else {
      return null;
    }
  }
}
