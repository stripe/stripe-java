// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.CapabilityUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * This is an object representing a capability for a Stripe account.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/connect/account-capabilities">Account
 * capabilities</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Capability extends ApiResource implements HasId {
  /** The account for which the capability enables functionality. */
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  @SerializedName("future_requirements")
  FutureRequirements futureRequirements;

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

  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options, ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }

  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(CapabilityUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates an existing Account Capability. Request or remove a capability by updating its {@code
   * requested} parameter.
   */
  public Capability update(CapabilityUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/accounts/%s/capabilities/%s",
            ApiResource.urlEncodeId(this.getAccount()), ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options,
            ApiMode.V1);
    return getResponseGetter().request(request, Capability.class);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureRequirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Capability.FutureRequirements.Alternative> alternatives;

    /**
     * Date on which {@code future_requirements} merges with the main {@code requirements} hash and
     * {@code future_requirements} becomes empty. After the transition, {@code currently_due}
     * requirements may immediately become {@code past_due}, but the account may also be given a
     * grace period depending on the capability's enablement state prior to transitioning.
     */
    @SerializedName("current_deadline")
    Long currentDeadline;

    /**
     * Fields that need to be collected to keep the capability enabled. If not collected by {@code
     * future_requirements[current_deadline]}, these fields will transition to the main {@code
     * requirements} hash.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * This is typed as a string for consistency with {@code requirements.disabled_reason}, but it
     * safe to assume {@code future_requirements.disabled_reason} is empty because fields in {@code
     * future_requirements} will never disable the account.
     *
     * <p>One of {@code other}, {@code paused.inactivity}, {@code pending.onboarding}, {@code
     * pending.review}, {@code platform_disabled}, {@code platform_paused}, {@code
     * rejected.inactivity}, {@code rejected.other}, {@code rejected.unsupported_business}, or
     * {@code requirements.fields_needed}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Capability.FutureRequirements.Errors> errors;

    /**
     * Fields that need to be collected assuming all volume thresholds are reached. As they become
     * required, they appear in {@code currently_due} as well.
     */
    @SerializedName("eventually_due")
    List<String> eventuallyDue;

    /**
     * Fields that weren't collected by {@code requirements.current_deadline}. These fields need to
     * be collected to enable the capability on the account. New fields will never appear here;
     * {@code future_requirements.past_due} will always be a subset of {@code
     * requirements.past_due}.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that might become required depending on the results of verification or review. It's an
     * empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due} or {@code currently_due}. Fields might appear in {@code
     * eventually_due} or {@code currently_due} and in {@code pending_verification} if verification
     * fails but another verification is still pending.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code
       * invalid_address_highway_contract_box}, {@code invalid_address_private_mailbox}, {@code
       * invalid_business_profile_name}, {@code invalid_business_profile_name_denylisted}, {@code
       * invalid_company_name_denylisted}, {@code invalid_dob_age_over_maximum}, {@code
       * invalid_dob_age_under_18}, {@code invalid_dob_age_under_minimum}, {@code
       * invalid_product_description_length}, {@code invalid_product_description_url_match}, {@code
       * invalid_representative_country}, {@code invalid_statement_descriptor_business_mismatch},
       * {@code invalid_statement_descriptor_denylisted}, {@code
       * invalid_statement_descriptor_length}, {@code
       * invalid_statement_descriptor_prefix_denylisted}, {@code
       * invalid_statement_descriptor_prefix_mismatch}, {@code invalid_street_address}, {@code
       * invalid_tax_id}, {@code invalid_tax_id_format}, {@code invalid_tos_acceptance}, {@code
       * invalid_url_denylisted}, {@code invalid_url_format}, {@code invalid_url_length}, {@code
       * invalid_url_web_presence_detected}, {@code
       * invalid_url_website_business_information_mismatch}, {@code invalid_url_website_empty},
       * {@code invalid_url_website_inaccessible}, {@code
       * invalid_url_website_inaccessible_geoblocked}, {@code
       * invalid_url_website_inaccessible_password_protected}, {@code
       * invalid_url_website_incomplete}, {@code
       * invalid_url_website_incomplete_cancellation_policy}, {@code
       * invalid_url_website_incomplete_customer_service_details}, {@code
       * invalid_url_website_incomplete_legal_restrictions}, {@code
       * invalid_url_website_incomplete_refund_policy}, {@code
       * invalid_url_website_incomplete_return_policy}, {@code
       * invalid_url_website_incomplete_terms_and_conditions}, {@code
       * invalid_url_website_incomplete_under_construction}, {@code invalid_url_website_other},
       * {@code invalid_value_other}, {@code verification_directors_mismatch}, {@code
       * verification_document_address_mismatch}, {@code verification_document_address_missing},
       * {@code verification_document_corrupt}, {@code verification_document_country_not_supported},
       * {@code verification_document_directors_mismatch}, {@code
       * verification_document_dob_mismatch}, {@code verification_document_duplicate_type}, {@code
       * verification_document_expired}, {@code verification_document_failed_copy}, {@code
       * verification_document_failed_greyscale}, {@code verification_document_failed_other}, {@code
       * verification_document_failed_test_mode}, {@code verification_document_fraudulent}, {@code
       * verification_document_id_number_mismatch}, {@code verification_document_id_number_missing},
       * {@code verification_document_incomplete}, {@code verification_document_invalid}, {@code
       * verification_document_issue_or_expiry_date_missing}, {@code
       * verification_document_manipulated}, {@code verification_document_missing_back}, {@code
       * verification_document_missing_front}, {@code verification_document_name_mismatch}, {@code
       * verification_document_name_missing}, {@code verification_document_nationality_mismatch},
       * {@code verification_document_not_readable}, {@code verification_document_not_signed},
       * {@code verification_document_not_uploaded}, {@code verification_document_photo_mismatch},
       * {@code verification_document_too_large}, {@code verification_document_type_not_supported},
       * {@code verification_extraneous_directors}, {@code verification_failed_address_match},
       * {@code verification_failed_business_iec_number}, {@code
       * verification_failed_document_match}, {@code verification_failed_id_number_match}, {@code
       * verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_representative_authority}, {@code
       * verification_failed_residential_address}, {@code verification_failed_tax_id_match}, {@code
       * verification_failed_tax_id_not_issued}, {@code verification_missing_directors}, {@code
       * verification_missing_executives}, {@code verification_missing_owners}, {@code
       * verification_requires_additional_memorandum_of_associations}, or {@code
       * verification_requires_additional_proof_of_registration}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Requirements extends StripeObject {
    /**
     * Fields that are due and can be satisfied by providing the corresponding alternative fields
     * instead.
     */
    @SerializedName("alternatives")
    List<Capability.Requirements.Alternative> alternatives;

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
     * Description of why the capability is disabled. <a
     * href="https://stripe.com/docs/connect/handling-api-verification">Learn more about handling
     * verification issues</a>.
     *
     * <p>One of {@code other}, {@code paused.inactivity}, {@code pending.onboarding}, {@code
     * pending.review}, {@code platform_disabled}, {@code platform_paused}, {@code
     * rejected.inactivity}, {@code rejected.other}, {@code rejected.unsupported_business}, or
     * {@code requirements.fields_needed}.
     */
    @SerializedName("disabled_reason")
    String disabledReason;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<Capability.Requirements.Errors> errors;

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
     * Fields that might become required depending on the results of verification or review. It's an
     * empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}. Fields
     * might appear in {@code eventually_due}, {@code currently_due}, or {@code past_due} and in
     * {@code pending_verification} if verification fails but another verification is still pending.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Alternative extends StripeObject {
      /** Fields that can be provided to satisfy all fields in {@code original_fields_due}. */
      @SerializedName("alternative_fields_due")
      List<String> alternativeFieldsDue;

      /**
       * Fields that are due and can be satisfied by providing all fields in {@code
       * alternative_fields_due}.
       */
      @SerializedName("original_fields_due")
      List<String> originalFieldsDue;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code
       * invalid_address_highway_contract_box}, {@code invalid_address_private_mailbox}, {@code
       * invalid_business_profile_name}, {@code invalid_business_profile_name_denylisted}, {@code
       * invalid_company_name_denylisted}, {@code invalid_dob_age_over_maximum}, {@code
       * invalid_dob_age_under_18}, {@code invalid_dob_age_under_minimum}, {@code
       * invalid_product_description_length}, {@code invalid_product_description_url_match}, {@code
       * invalid_representative_country}, {@code invalid_statement_descriptor_business_mismatch},
       * {@code invalid_statement_descriptor_denylisted}, {@code
       * invalid_statement_descriptor_length}, {@code
       * invalid_statement_descriptor_prefix_denylisted}, {@code
       * invalid_statement_descriptor_prefix_mismatch}, {@code invalid_street_address}, {@code
       * invalid_tax_id}, {@code invalid_tax_id_format}, {@code invalid_tos_acceptance}, {@code
       * invalid_url_denylisted}, {@code invalid_url_format}, {@code invalid_url_length}, {@code
       * invalid_url_web_presence_detected}, {@code
       * invalid_url_website_business_information_mismatch}, {@code invalid_url_website_empty},
       * {@code invalid_url_website_inaccessible}, {@code
       * invalid_url_website_inaccessible_geoblocked}, {@code
       * invalid_url_website_inaccessible_password_protected}, {@code
       * invalid_url_website_incomplete}, {@code
       * invalid_url_website_incomplete_cancellation_policy}, {@code
       * invalid_url_website_incomplete_customer_service_details}, {@code
       * invalid_url_website_incomplete_legal_restrictions}, {@code
       * invalid_url_website_incomplete_refund_policy}, {@code
       * invalid_url_website_incomplete_return_policy}, {@code
       * invalid_url_website_incomplete_terms_and_conditions}, {@code
       * invalid_url_website_incomplete_under_construction}, {@code invalid_url_website_other},
       * {@code invalid_value_other}, {@code verification_directors_mismatch}, {@code
       * verification_document_address_mismatch}, {@code verification_document_address_missing},
       * {@code verification_document_corrupt}, {@code verification_document_country_not_supported},
       * {@code verification_document_directors_mismatch}, {@code
       * verification_document_dob_mismatch}, {@code verification_document_duplicate_type}, {@code
       * verification_document_expired}, {@code verification_document_failed_copy}, {@code
       * verification_document_failed_greyscale}, {@code verification_document_failed_other}, {@code
       * verification_document_failed_test_mode}, {@code verification_document_fraudulent}, {@code
       * verification_document_id_number_mismatch}, {@code verification_document_id_number_missing},
       * {@code verification_document_incomplete}, {@code verification_document_invalid}, {@code
       * verification_document_issue_or_expiry_date_missing}, {@code
       * verification_document_manipulated}, {@code verification_document_missing_back}, {@code
       * verification_document_missing_front}, {@code verification_document_name_mismatch}, {@code
       * verification_document_name_missing}, {@code verification_document_nationality_mismatch},
       * {@code verification_document_not_readable}, {@code verification_document_not_signed},
       * {@code verification_document_not_uploaded}, {@code verification_document_photo_mismatch},
       * {@code verification_document_too_large}, {@code verification_document_type_not_supported},
       * {@code verification_extraneous_directors}, {@code verification_failed_address_match},
       * {@code verification_failed_business_iec_number}, {@code
       * verification_failed_document_match}, {@code verification_failed_id_number_match}, {@code
       * verification_failed_keyed_identity}, {@code verification_failed_keyed_match}, {@code
       * verification_failed_name_match}, {@code verification_failed_other}, {@code
       * verification_failed_representative_authority}, {@code
       * verification_failed_residential_address}, {@code verification_failed_tax_id_match}, {@code
       * verification_failed_tax_id_not_issued}, {@code verification_missing_directors}, {@code
       * verification_missing_executives}, {@code verification_missing_owners}, {@code
       * verification_requires_additional_memorandum_of_associations}, or {@code
       * verification_requires_additional_proof_of_registration}.
       */
      @SerializedName("code")
      String code;

      /**
       * An informative message that indicates the error type and provides additional details about
       * the error.
       */
      @SerializedName("reason")
      String reason;

      /**
       * The specific user onboarding requirement field (in the requirements hash) that needs to be
       * resolved.
       */
      @SerializedName("requirement")
      String requirement;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(account, responseGetter);
    trySetResponseGetter(futureRequirements, responseGetter);
    trySetResponseGetter(requirements, responseGetter);
  }
}
