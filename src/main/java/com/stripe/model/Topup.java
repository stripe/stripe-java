// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.TopupCancelParams;
import com.stripe.param.TopupCreateParams;
import com.stripe.param.TopupListParams;
import com.stripe.param.TopupRetrieveParams;
import com.stripe.param.TopupUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * To top up your Stripe balance, you create a top-up object. You can retrieve individual top-ups,
 * as well as list all top-ups. Top-ups are identified by a unique, random ID.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/connect/top-ups">Topping up your platform
 * account</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Topup extends ApiResource implements MetadataStore<Topup>, BalanceTransactionSource {
  /** Amount transferred. */
  @SerializedName("amount")
  Long amount;

  /**
   * ID of the balance transaction that describes the impact of this top-up on your account balance.
   * May not be specified depending on status of top-up.
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * Date the funds are expected to arrive in your Stripe account for payouts. This factors in
   * delays like weekends or bank holidays. May not be specified depending on status of top-up.
   */
  @SerializedName("expected_availability_date")
  Long expectedAvailabilityDate;

  /**
   * Error code explaining reason for top-up failure if available (see <a
   * href="https://stripe.com/docs/api#errors">the errors section</a> for a list of codes).
   */
  @SerializedName("failure_code")
  String failureCode;

  /** Message to user further explaining reason for top-up failure if available. */
  @SerializedName("failure_message")
  String failureMessage;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code topup}.
   */
  @SerializedName("object")
  String object;

  /**
   * For most Stripe users, the source of every top-up is a bank account. This hash is then the <a
   * href="https://stripe.com/docs/api#source_object">source object</a> describing that bank
   * account.
   */
  @SerializedName("source")
  Source source;

  /**
   * Extra information about a top-up. This will appear on your source's bank statement. It must
   * contain at least one letter.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * The status of the top-up is either {@code canceled}, {@code failed}, {@code pending}, {@code
   * reversed}, or {@code succeeded}.
   *
   * <p>One of {@code canceled}, {@code failed}, {@code pending}, {@code reversed}, or {@code
   * succeeded}.
   */
  @SerializedName("status")
  String status;

  /** A string that identifies this top-up as part of a group. */
  @SerializedName("transfer_group")
  String transferGroup;

  /** Get ID of expandable {@code balanceTransaction} object. */
  public String getBalanceTransaction() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getId() : null;
  }

  public void setBalanceTransaction(String id) {
    this.balanceTransaction = ApiResource.setExpandableFieldId(id, this.balanceTransaction);
  }

  /** Get expanded {@code balanceTransaction}. */
  public BalanceTransaction getBalanceTransactionObject() {
    return (this.balanceTransaction != null) ? this.balanceTransaction.getExpanded() : null;
  }

  public void setBalanceTransactionObject(BalanceTransaction expandableObject) {
    this.balanceTransaction =
        new ExpandableField<BalanceTransaction>(expandableObject.getId(), expandableObject);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/topups/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(TopupCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /** Cancels a top-up. Only pending top-ups can be canceled. */
  public Topup cancel(TopupCancelParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/topups/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Top up the balance of an account. */
  public static Topup create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Top up the balance of an account. */
  public static Topup create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/topups";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Top up the balance of an account. */
  public static Topup create(TopupCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Top up the balance of an account. */
  public static Topup create(TopupCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/topups";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/topups";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            TopupCollection.class,
            options,
            ApiMode.V1);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(TopupListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of top-ups. */
  public static TopupCollection list(TopupListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/topups";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            TopupCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup) throws StripeException {
    return retrieve(topup, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup, RequestOptions options) throws StripeException {
    return retrieve(topup, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(topup));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Topup.class,
            options,
            ApiMode.V1);
  }

  /**
   * Retrieves the details of a top-up that has previously been created. Supply the unique top-up ID
   * that was returned from your previous request, and Stripe will return the corresponding top-up
   * information.
   */
  public static Topup retrieve(String topup, TopupRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(topup));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  @Override
  public Topup update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  @Override
  public Topup update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Topup.class,
            options,
            ApiMode.V1);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(TopupUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the metadata of a top-up. Other top-up details are not editable by design. */
  public Topup update(TopupUpdateParams params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/topups/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Topup.class,
            options,
            ApiMode.V1);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
    trySetResponseGetter(source, responseGetter);
  }
}
