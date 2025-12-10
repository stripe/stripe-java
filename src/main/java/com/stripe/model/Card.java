// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.param.CardUpdateOnAccountParams;
import com.stripe.param.CardUpdateOnCustomerParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * You can store multiple cards on a customer in order to charge the customer later. You can also
 * store multiple debit cards on a recipient in order to transfer to those cards later.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/sources/cards">Card payments with Sources</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Card extends ApiResource
    implements MetadataStore<Card>, ExternalAccount, PaymentSource {
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** City/District/Suburb/Town/Village. */
  @SerializedName("address_city")
  String addressCity;

  /** Billing address country, if provided when creating card. */
  @SerializedName("address_country")
  String addressCountry;

  /** Address line 1 (Street address/PO Box/Company name). */
  @SerializedName("address_line1")
  String addressLine1;

  /**
   * If {@code address_line1} was provided, results of the check: {@code pass}, {@code fail}, {@code
   * unavailable}, or {@code unchecked}.
   */
  @SerializedName("address_line1_check")
  String addressLine1Check;

  /** Address line 2 (Apartment/Suite/Unit/Building). */
  @SerializedName("address_line2")
  String addressLine2;

  /** State/County/Province/Region. */
  @SerializedName("address_state")
  String addressState;

  /** ZIP or postal code. */
  @SerializedName("address_zip")
  String addressZip;

  /**
   * If {@code address_zip} was provided, results of the check: {@code pass}, {@code fail}, {@code
   * unavailable}, or {@code unchecked}.
   */
  @SerializedName("address_zip_check")
  String addressZipCheck;

  /**
   * This field indicates whether this payment method can be shown again to its customer in a
   * checkout flow. Stripe products such as Checkout and Elements use this field to determine
   * whether a payment method can be shown as a saved payment method in a checkout flow. The field
   * defaults to “unspecified”.
   *
   * <p>One of {@code always}, {@code limited}, or {@code unspecified}.
   */
  @SerializedName("allow_redisplay")
  String allowRedisplay;

  /**
   * A set of available payout methods for this card. Only values from this set should be passed as
   * the {@code method} when creating a payout.
   */
  @SerializedName("available_payout_methods")
  List<String> availablePayoutMethods;

  /**
   * Card brand. Can be {@code American Express}, {@code Cartes Bancaires}, {@code Diners Club},
   * {@code Discover}, {@code Eftpos Australia}, {@code Girocard}, {@code JCB}, {@code MasterCard},
   * {@code UnionPay}, {@code Visa}, or {@code Unknown}.
   */
  @SerializedName("brand")
  String brand;

  /**
   * Two-letter ISO code representing the country of the card. You could use this attribute to get a
   * sense of the international breakdown of cards you've collected.
   */
  @SerializedName("country")
  String country;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO code for
   * currency</a> in lowercase. Must be a <a href="https://docs.stripe.com/currencies">supported
   * currency</a>. Only applicable on accounts (not customers or recipients). The card can be used
   * as a transfer destination for funds in this currency. This property is only available when
   * returned as an <a href="https://stripe.com/api/external_account_cards/object">External
   * Account</a> where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-is_controller">controller.is_controller</a>
   * is {@code true}.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The customer that this card belongs to. This attribute will not be in the card object if the
   * card belongs to an account or recipient instead.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /**
   * If a CVC was provided, results of the check: {@code pass}, {@code fail}, {@code unavailable},
   * or {@code unchecked}. A result of unchecked indicates that CVC was provided but hasn't been
   * checked yet. Checks are typically performed when attaching a card to a Customer object, or when
   * creating a charge. For more details, see <a
   * href="https://support.stripe.com/questions/check-if-a-card-is-valid-without-a-charge">Check if
   * a card is valid without a charge</a>.
   */
  @SerializedName("cvc_check")
  String cvcCheck;

  /**
   * Whether this card is the default external account for its currency. This property is only
   * available for accounts where <a
   * href="https://stripe.com/api/accounts/object#account_object-controller-requirement_collection">controller.requirement_collection</a>
   * is {@code application}, which includes Custom accounts.
   */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * A high-level description of the type of cards issued in this range. (For internal use only and
   * not typically available in standard API requests.)
   */
  @SerializedName("description")
  String description;

  /** (For tokenized numbers only.) The last four digits of the device account number. */
  @SerializedName("dynamic_last4")
  String dynamicLast4;

  /** Two-digit number representing the card's expiration month. */
  @SerializedName("exp_month")
  Long expMonth;

  /** Four-digit number representing the card's expiration year. */
  @SerializedName("exp_year")
  Long expYear;

  /**
   * Uniquely identifies this particular card number. You can use this attribute to check whether
   * two customers who’ve signed up with you are using the same card number, for example. For
   * payment methods that tokenize card information (Apple Pay, Google Pay), the tokenized number
   * might be provided instead of the underlying card number.
   *
   * <p><em>As of May 1, 2021, card fingerprint in India for Connect changed to allow two
   * fingerprints for the same card---one for India and one for the rest of the world.</em>
   */
  @SerializedName("fingerprint")
  String fingerprint;

  /**
   * Card funding type. Can be {@code credit}, {@code debit}, {@code prepaid}, or {@code unknown}.
   */
  @SerializedName("funding")
  String funding;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Issuer identification number of the card. (For internal use only and not typically available in
   * standard API requests.)
   */
  @SerializedName("iin")
  String iin;

  /**
   * The name of the card's issuing bank. (For internal use only and not typically available in
   * standard API requests.)
   */
  @SerializedName("issuer")
  String issuer;

  /** The last four digits of the card. */
  @SerializedName("last4")
  String last4;

  /**
   * Set of <a href="https://docs.stripe.com/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /** Cardholder name. */
  @SerializedName("name")
  String name;

  @SerializedName("networks")
  Networks networks;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code card}.
   */
  @SerializedName("object")
  String object;

  /**
   * Status of a card based on the card issuer.
   *
   * <p>One of {@code regulated}, or {@code unregulated}.
   */
  @SerializedName("regulated_status")
  String regulatedStatus;

  /**
   * For external accounts that are cards, possible values are {@code new} and {@code errored}. If a
   * payout fails, the status is set to {@code errored} and <a
   * href="https://stripe.com/docs/payouts#payout-schedule">scheduled payouts</a> are stopped until
   * account details are updated.
   */
  @SerializedName("status")
  String status;

  /**
   * If the card number is tokenized, this is the method that was used. Can be {@code android_pay}
   * (includes Google Pay), {@code apple_pay}, {@code masterpass}, {@code visa_checkout}, or null.
   */
  @SerializedName("tokenization_method")
  String tokenizationMethod;

  /** Get ID of expandable {@code account} object. */
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String id) {
    this.account = ApiResource.setExpandableFieldId(id, this.account);
  }

  /** Get expanded {@code account}. */
  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account expandableObject) {
    this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code customer} object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded {@code customer}. */
  public Customer getCustomerObject() {
    return (this.customer != null) ? this.customer.getExpanded() : null;
  }

  public void setCustomerObject(Customer expandableObject) {
    this.customer = new ExpandableField<Customer>(expandableObject.getId(), expandableObject);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  @Override
  public Card update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  @Override
  public Card update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "/v1/accounts/%s/external_accounts/%s",
              ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId()));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "/v1/customers/%s/sources/%s",
              ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, url, params, options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  public Card update(CardUpdateOnAccountParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  public Card update(CardUpdateOnAccountParams params, RequestOptions options)
      throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "/v1/accounts/%s/external_accounts/%s",
              ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  public Card update(CardUpdateOnCustomerParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * If you need to update only some card details, like the billing address or expiration date, you
   * can do so without having to re-enter the full card details. Stripe also works directly with
   * card networks so that your customers can <a
   * href="https://stripe.com/docs/saving-cards#automatic-card-updates">continue using your
   * service</a> without interruption.
   *
   * <p>Updates a specified card for a given customer.
   */
  public Card update(CardUpdateOnCustomerParams params, RequestOptions options)
      throws StripeException {
    String url;
    if (this.getCustomer() != null) {
      url =
          String.format(
              "/v1/customers/%s/sources/%s",
              ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public Card delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public Card delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public Card delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public Card delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url;
    if (this.getAccount() != null) {
      url =
          String.format(
              "/v1/accounts/%s/external_accounts/%s",
              ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId()));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "/v1/customers/%s/sources/%s",
              ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.DELETE, url, params, options);
    return getResponseGetter().request(request, Card.class);
  }

  /**
   * For more details about Networks, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Networks extends StripeObject {
    /**
     * The preferred network for co-branded cards. Can be {@code cartes_bancaires}, {@code
     * mastercard}, {@code visa} or {@code invalid_preference} if requested network is not valid for
     * the card.
     */
    @SerializedName("preferred")
    String preferred;
  }
}
