// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.BankAccountUpdateOnAccountParams;
import com.stripe.param.BankAccountUpdateOnCustomerParams;
import com.stripe.param.BankAccountVerifyParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * These bank accounts are payment methods on {@code Customer} objects.
 *
 * <p>On the other hand <a href="https://stripe.com/docs/api#external_accounts">External
 * Accounts</a> are transfer destinations on {@code Account} objects for <a
 * href="https://stripe.com/docs/connect/custom-accounts">Custom accounts</a>. They can be bank
 * accounts or debit cards as well, and are documented in the links above.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/payments/bank-debits-transfers">Bank debits
 * and transfers</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BankAccount extends ApiResource
    implements MetadataStore<BankAccount>, ExternalAccount, PaymentSource {
  /** The ID of the account that the bank account is associated with. */
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  String accountHolderName;

  /**
   * The type of entity that holds the account. This can be either {@code individual} or {@code
   * company}.
   */
  @SerializedName("account_holder_type")
  String accountHolderType;

  /**
   * The bank account type. This can only be {@code checking} or {@code savings} in most countries.
   * In Japan, this can only be {@code futsu} or {@code toza}.
   */
  @SerializedName("account_type")
  String accountType;

  /**
   * A set of available payout methods for this bank account. Only values from this set should be
   * passed as the {@code method} when creating a payout.
   */
  @SerializedName("available_payout_methods")
  List<String> availablePayoutMethods;

  /** Name of the bank associated with the routing number (e.g., {@code WELLS FARGO}). */
  @SerializedName("bank_name")
  String bankName;

  /** Two-letter ISO code representing the country the bank account is located in. */
  @SerializedName("country")
  String country;

  /**
   * Three-letter <a href="https://stripe.com/docs/payouts">ISO code for the currency</a> paid out
   * to the bank account.
   */
  @SerializedName("currency")
  String currency;

  /** The ID of the customer that the bank account is associated with. */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** Whether this bank account is the default external account for its currency. */
  @SerializedName("default_for_currency")
  Boolean defaultForCurrency;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Uniquely identifies this particular bank account. You can use this attribute to check whether
   * two bank accounts are the same.
   */
  @SerializedName("fingerprint")
  String fingerprint;

  /**
   * Information about upcoming new requirements for the bank account, including what information
   * needs to be collected.
   */
  @SerializedName("future_requirements")
  FutureRequirements futureRequirements;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The last four digits of the bank account number. */
  @SerializedName("last4")
  String last4;

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
   * <p>Equal to {@code bank_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * Information about the requirements for the bank account, including what information needs to be
   * collected.
   */
  @SerializedName("requirements")
  Requirements requirements;

  /** The routing transit number for the bank account. */
  @SerializedName("routing_number")
  String routingNumber;

  /**
   * For bank accounts, possible values are {@code new}, {@code validated}, {@code verified}, {@code
   * verification_failed}, or {@code errored}. A bank account that hasn't had any activity or
   * validation performed is {@code new}. If Stripe can determine that the bank account exists, its
   * status will be {@code validated}. Note that there often isn’t enough information to know (e.g.,
   * for smaller credit unions), and the validation is not always run. If customer bank account
   * verification has succeeded, the bank account status will be {@code verified}. If the
   * verification failed for any reason, such as microdeposit failure, the status will be {@code
   * verification_failed}. If a transfer sent to this bank account fails, we'll set the status to
   * {@code errored} and will not continue to send transfers until the bank details are updated.
   *
   * <p>For external accounts, possible values are {@code new}, {@code errored} and {@code
   * verification_failed}. If a transfer fails, the status is set to {@code errored} and transfers
   * are stopped until account details are updated. In India, if we can't <a
   * href="https://support.stripe.com/questions/bank-account-ownership-verification">verify the
   * owner of the bank account</a>, we'll set the status to {@code verification_failed}. Other
   * validations aren't run against external accounts because they're only used for payouts. This
   * means the other statuses don't apply.
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

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify() throws StripeException {
    return verify((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(RequestOptions options) throws StripeException {
    return verify((Map<String, Object>) null, options);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(Map<String, Object> params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s/verify",
            ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(BankAccountVerifyParams params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(BankAccountVerifyParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/customers/%s/sources/%s/verify",
            ApiResource.urlEncodeId(this.getCustomer()), ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  @Override
  public BankAccount update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  @Override
  public BankAccount update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            params,
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(BankAccountUpdateOnAccountParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(BankAccountUpdateOnAccountParams params, RequestOptions options)
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(BankAccountUpdateOnCustomerParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="https://stripe.com/docs/connect/custom-accounts">Custom account</a>, and
   * optionally sets it as the default for its currency. Other bank account details are not editable
   * by design.
   *
   * <p>You can re-enable a disabled bank account by performing an update call without providing any
   * arguments or changes.
   *
   * <p>Updates the <code>account_holder_name</code>, <code>account_holder_type</code>, and <code>
   * metadata</code> of a bank account belonging to a customer. Other bank account details are not
   * editable, by design.
   */
  public BankAccount update(BankAccountUpdateOnCustomerParams params, RequestOptions options)
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            url,
            ApiRequestParams.paramsToMap(params),
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public BankAccount delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public BankAccount delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public BankAccount delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /**
   * Delete a specified external account for a given account.
   *
   * <p>Delete a specified source for a given customer.
   */
  @Override
  public BankAccount delete(Map<String, Object> params, RequestOptions options)
      throws StripeException {
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
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.DELETE,
            url,
            params,
            BankAccount.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FutureRequirements extends StripeObject {
    /**
     * Fields that need to be collected to keep the external account enabled. If not collected by
     * {@code current_deadline}, these fields appear in {@code past_due} as well, and the account is
     * disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<BankAccount.FutureRequirements.Errors> errors;

    /**
     * Fields that weren't collected by {@code current_deadline}. These fields need to be collected
     * to enable the external account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code invalid_dob_age_under_18},
       * {@code invalid_representative_country}, {@code invalid_street_address}, {@code
       * invalid_tos_acceptance}, {@code invalid_value_other}, {@code
       * verification_directors_mismatch}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code
       * verification_document_directors_mismatch}, {@code verification_document_dob_mismatch},
       * {@code verification_document_duplicate_type}, {@code verification_document_expired}, {@code
       * verification_document_failed_copy}, {@code verification_document_failed_greyscale}, {@code
       * verification_document_failed_other}, {@code verification_document_failed_test_mode}, {@code
       * verification_document_fraudulent}, {@code verification_document_id_number_mismatch}, {@code
       * verification_document_id_number_missing}, {@code verification_document_incomplete}, {@code
       * verification_document_invalid}, {@code verification_document_issue_or_expiry_date_missing},
       * {@code verification_document_manipulated}, {@code verification_document_missing_back},
       * {@code verification_document_missing_front}, {@code verification_document_name_mismatch},
       * {@code verification_document_name_missing}, {@code
       * verification_document_nationality_mismatch}, {@code verification_document_not_readable},
       * {@code verification_document_not_signed}, {@code verification_document_not_uploaded},
       * {@code verification_document_photo_mismatch}, {@code verification_document_too_large},
       * {@code verification_document_type_not_supported}, {@code
       * verification_extraneous_directors}, {@code verification_failed_address_match}, {@code
       * verification_failed_business_iec_number}, {@code verification_failed_document_match},
       * {@code verification_failed_id_number_match}, {@code verification_failed_keyed_identity},
       * {@code verification_failed_keyed_match}, {@code verification_failed_name_match}, {@code
       * verification_failed_other}, {@code verification_failed_residential_address}, {@code
       * verification_failed_tax_id_match}, {@code verification_failed_tax_id_not_issued}, {@code
       * verification_missing_directors}, {@code verification_missing_executives}, {@code
       * verification_missing_owners}, or {@code
       * verification_requires_additional_memorandum_of_associations}.
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
     * Fields that need to be collected to keep the external account enabled. If not collected by
     * {@code current_deadline}, these fields appear in {@code past_due} as well, and the account is
     * disabled.
     */
    @SerializedName("currently_due")
    List<String> currentlyDue;

    /**
     * Fields that are {@code currently_due} and need to be collected again because validation or
     * verification failed.
     */
    @SerializedName("errors")
    List<BankAccount.Requirements.Errors> errors;

    /**
     * Fields that weren't collected by {@code current_deadline}. These fields need to be collected
     * to enable the external account.
     */
    @SerializedName("past_due")
    List<String> pastDue;

    /**
     * Fields that may become required depending on the results of verification or review. Will be
     * an empty array unless an asynchronous verification is pending. If verification fails, these
     * fields move to {@code eventually_due}, {@code currently_due}, or {@code past_due}.
     */
    @SerializedName("pending_verification")
    List<String> pendingVerification;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Errors extends StripeObject {
      /**
       * The code for the type of error.
       *
       * <p>One of {@code invalid_address_city_state_postal_code}, {@code invalid_dob_age_under_18},
       * {@code invalid_representative_country}, {@code invalid_street_address}, {@code
       * invalid_tos_acceptance}, {@code invalid_value_other}, {@code
       * verification_directors_mismatch}, {@code verification_document_address_mismatch}, {@code
       * verification_document_address_missing}, {@code verification_document_corrupt}, {@code
       * verification_document_country_not_supported}, {@code
       * verification_document_directors_mismatch}, {@code verification_document_dob_mismatch},
       * {@code verification_document_duplicate_type}, {@code verification_document_expired}, {@code
       * verification_document_failed_copy}, {@code verification_document_failed_greyscale}, {@code
       * verification_document_failed_other}, {@code verification_document_failed_test_mode}, {@code
       * verification_document_fraudulent}, {@code verification_document_id_number_mismatch}, {@code
       * verification_document_id_number_missing}, {@code verification_document_incomplete}, {@code
       * verification_document_invalid}, {@code verification_document_issue_or_expiry_date_missing},
       * {@code verification_document_manipulated}, {@code verification_document_missing_back},
       * {@code verification_document_missing_front}, {@code verification_document_name_mismatch},
       * {@code verification_document_name_missing}, {@code
       * verification_document_nationality_mismatch}, {@code verification_document_not_readable},
       * {@code verification_document_not_signed}, {@code verification_document_not_uploaded},
       * {@code verification_document_photo_mismatch}, {@code verification_document_too_large},
       * {@code verification_document_type_not_supported}, {@code
       * verification_extraneous_directors}, {@code verification_failed_address_match}, {@code
       * verification_failed_business_iec_number}, {@code verification_failed_document_match},
       * {@code verification_failed_id_number_match}, {@code verification_failed_keyed_identity},
       * {@code verification_failed_keyed_match}, {@code verification_failed_name_match}, {@code
       * verification_failed_other}, {@code verification_failed_residential_address}, {@code
       * verification_failed_tax_id_match}, {@code verification_failed_tax_id_not_issued}, {@code
       * verification_missing_directors}, {@code verification_missing_executives}, {@code
       * verification_missing_owners}, or {@code
       * verification_requires_additional_memorandum_of_associations}.
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
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(futureRequirements, responseGetter);
    trySetResponseGetter(requirements, responseGetter);
  }
}
