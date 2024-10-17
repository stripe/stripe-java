// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.AccountNoticeListParams;
import com.stripe.param.AccountNoticeRetrieveParams;
import com.stripe.param.AccountNoticeUpdateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A notice to a Connected account. Notice can be sent by Stripe on your behalf or you can opt to
 * send the notices yourself.
 *
 * <p>See the <a
 * href="https://stripe.com/docs/issuing/compliance-us/issuing-regulated-customer-notices">guide to
 * send notices</a> to your connected accounts.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class AccountNotice extends ApiResource implements HasId, MetadataStore<AccountNotice> {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** When present, the deadline for sending the notice to meet the relevant regulations. */
  @SerializedName("deadline")
  Long deadline;

  /** Information about the email when sent. */
  @SerializedName("email")
  Email email;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Information about objects related to the notice. */
  @SerializedName("linked_objects")
  LinkedObjects linkedObjects;

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
   * <p>Equal to {@code account_notice}.
   */
  @SerializedName("object")
  String object;

  /**
   * Reason the notice is being sent. The reason determines what copy the notice must contain. See
   * the <a
   * href="https://stripe.com/docs/issuing/compliance-us/issuing-regulated-customer-notices">regulated
   * customer notices</a> guide. All reasons might not apply to your integration, and Stripe might
   * add new reasons in the future, so we recommend an internal warning when you receive an unknown
   * reason.
   *
   * <p>One of {@code issuing.account_closed_for_inactivity}, {@code
   * issuing.account_closed_for_not_providing_business_model_clarification}, {@code
   * issuing.account_closed_for_not_providing_url_clarification}, {@code
   * issuing.account_closed_for_not_providing_use_case_clarification}, {@code
   * issuing.account_closed_for_terms_of_service_violation}, {@code
   * issuing.application_rejected_for_failure_to_verify}, {@code
   * issuing.credit_application_rejected}, {@code issuing.credit_increase_application_rejected},
   * {@code issuing.credit_limit_decreased}, {@code issuing.credit_line_closed}, {@code
   * issuing.dispute_lost}, {@code issuing.dispute_submitted}, or {@code issuing.dispute_won}.
   */
  @SerializedName("reason")
  String reason;

  /**
   * Date when the notice was sent. When absent, you must send the notice, update the content of the
   * email and date when it was sent.
   */
  @SerializedName("sent_at")
  Long sentAt;

  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public static AccountNoticeCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public static AccountNoticeCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_notices";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountNoticeCollection.class);
  }

  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public static AccountNoticeCollection list(AccountNoticeListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Retrieves a list of {@code AccountNotice} objects. The objects are sorted in descending order
   * by creation date, with the most-recently-created object appearing first.
   */
  public static AccountNoticeCollection list(AccountNoticeListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/account_notices";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountNoticeCollection.class);
  }

  /** Retrieves an {@code AccountNotice} object. */
  public static AccountNotice retrieve(String accountNotice) throws StripeException {
    return retrieve(accountNotice, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an {@code AccountNotice} object. */
  public static AccountNotice retrieve(String accountNotice, RequestOptions options)
      throws StripeException {
    return retrieve(accountNotice, (Map<String, Object>) null, options);
  }

  /** Retrieves an {@code AccountNotice} object. */
  public static AccountNotice retrieve(
      String accountNotice, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(accountNotice));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, AccountNotice.class);
  }

  /** Retrieves an {@code AccountNotice} object. */
  public static AccountNotice retrieve(
      String accountNotice, AccountNoticeRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(accountNotice));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, AccountNotice.class);
  }

  /** Updates an {@code AccountNotice} object. */
  @Override
  public AccountNotice update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an {@code AccountNotice} object. */
  @Override
  public AccountNotice update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, AccountNotice.class);
  }

  /** Updates an {@code AccountNotice} object. */
  public AccountNotice update(AccountNoticeUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an {@code AccountNotice} object. */
  public AccountNotice update(AccountNoticeUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/account_notices/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, AccountNotice.class);
  }

  /**
   * For more details about Email, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Email extends StripeObject {
    /**
     * Content of the email in plain text. The copy must match exactly the language that Stripe
     * Compliance has approved for use.
     */
    @SerializedName("plain_text")
    String plainText;

    /** Email address of the recipient. */
    @SerializedName("recipient")
    String recipient;

    /** Subject of the email. */
    @SerializedName("subject")
    String subject;
  }

  /**
   * For more details about LinkedObjects, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class LinkedObjects extends StripeObject {
    /** Associated <a href="https://stripe.com/docs/api/capabilities">Capability.</a> */
    @SerializedName("capability")
    String capability;

    /**
     * Associated <a href="https://stripe.com/docs/api/issuing/credit_underwriting_record">Credit
     * Underwriting Record.</a>
     */
    @SerializedName("issuing_credit_underwriting_record")
    String issuingCreditUnderwritingRecord;

    /** Associated <a href="https://stripe.com/docs/api/issuing/disputes">Issuing Dispute.</a> */
    @SerializedName("issuing_dispute")
    String issuingDispute;
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(email, responseGetter);
    trySetResponseGetter(linkedObjects, responseGetter);
  }
}
