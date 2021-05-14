// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.CapabilityUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Capability extends ApiResource implements HasId {
  /** The account for which the capability enables functionality. */
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** The identifier for the capability. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code capability}.
   */
  @SerializedName("object")
  String object;

  /** Whether the capability has been requested. */
  @SerializedName("requested")
  Boolean requested;

  /** Time at which the capability was requested. Measured in seconds since the Unix epoch. */
  @SerializedName("requested_at")
  Long requestedAt;

  @SerializedName("requirements")
  Requirements requirements;

  /**
   * The status of the capability. Can be {@code active}, {@code inactive}, {@code pending}, or
   * {@code unrequested}.
   */
  @SerializedName("status")
  String status;

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

  /** Updates an existing Account Capability. */
  public Capability update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing Account Capability. */
  public Capability update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/accounts/%s/capabilities/%s",
                ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Capability.class, options);
  }

  /** Updates an existing Account Capability. */
  public Capability update(CapabilityUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing Account Capability. */
  public Capability update(CapabilityUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/accounts/%s/capabilities/%s",
                ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Capability.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Date by which the fields in {@code currently_due} must be collected to keep the capability
     * enabled for the account. These fields may disable the capability sooner if the next threshold
     * is reached before they are collected.
     */
    @SerializedName("current_deadline")
    Long currentDeadline;

    /**
     * Fields that need to be collected to keep the capability enabled. If not collected by {@code
     * current_deadline}, these fields appear in {@code past_due} as well, and the capability is
     * disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * If the capability is disabled, this string describes why. Can be {@code
     * requirements.past_due}, {@code requirements.pending_verification}, {@code listed}, {@code
     * platform_paused}, {@code rejected.fraud}, {@code rejected.listed}, {@code
     * rejected.terms_of_service}, {@code rejected.other}, {@code under_review}, or {@code other}.
     *
     * <p>{@code rejected.unsupported_business} means that the account's business is not supported
     * by the capability. For example, payment methods may restrict the businesses they support in
     * their terms of service:
     *
     * <p>- <a href="https://stripe.com/afterpay-clearpay/legal#restricted-businesses">Afterpay
     * Clearpay's terms of service</a>
     *
     * <p>If you believe that the rejection is in error, please contact support@stripe.com for
     * assistance.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Account.Requirements.Errors> errors;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well, and {@code current_deadline} becomes
     * set.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by {@code current_deadline}. These fields need to be collected
     * to enable the capability on the account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields become required and move to {@code currently_due} or {@code past_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;
  }
}
