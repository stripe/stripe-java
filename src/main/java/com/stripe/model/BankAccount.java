package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.BankAccountUpdateOnAccountParams;
import com.stripe.param.BankAccountUpdateOnCustomerParams;
import com.stripe.param.BankAccountVerifyParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BankAccount extends ApiResource
    implements MetadataStore<BankAccount>, ExternalAccount, PaymentSource {
  @SerializedName("account")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> account;

  /** The name of the person or business that owns the bank account. */
  @SerializedName("account_holder_name")
  String accountHolderName;

  /** The type of entity that holds the account. This can be either `individual` or `company`. */
  @SerializedName("account_holder_type")
  String accountHolderType;

  /** Name of the bank associated with the routing number (e.g., `WELLS FARGO`). */
  @SerializedName("bank_name")
  String bankName;

  /** Two-letter ISO code representing the country the bank account is located in. */
  @SerializedName("country")
  String country;

  /**
   * Three-letter [ISO code for the currency](https://stripe.com/docs/payouts) paid out to the bank
   * account.
   */
  @SerializedName("currency")
  String currency;

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

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  @SerializedName("last4")
  String last4;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to `bank_account`.
   */
  @SerializedName("object")
  String object;

  /** The routing transit number for the bank account. */
  @SerializedName("routing_number")
  String routingNumber;

  /**
   * For bank accounts, possible values are `new`, `validated`, `verified`, `verification_failed`,
   * or `errored`. A bank account that hasn't had any activity or validation performed is `new`. If
   * Stripe can determine that the bank account exists, its status will be `validated`. Note that
   * there often isn’t enough information to know (e.g., for smaller credit unions), and the
   * validation is not always run. If customer bank account verification has succeeded, the bank
   * account status will be `verified`. If the verification failed for any reason, such as
   * microdeposit failure, the status will be `verification_failed`. If a transfer sent to this bank
   * account fails, we'll set the status to `errored` and will not continue to send transfers until
   * the bank details are updated.
   *
   * <p>For external accounts, possible values are `new` and `errored`. Validations aren't run
   * against external accounts because they're only used for payouts. This means the other statuses
   * don't apply. If a transfer fails, the status is set to `errored` and transfers are stopped
   * until account details are updated.
   */
  @SerializedName("status")
  String status;

  /** Get id of expandable `account` object. */
  public String getAccount() {
    return (this.account != null) ? this.account.getId() : null;
  }

  public void setAccount(String id) {
    this.account = ApiResource.setExpandableFieldId(id, this.account);
  }

  /** Get expanded `account`. */
  public Account getAccountObject() {
    return (this.account != null) ? this.account.getExpanded() : null;
  }

  public void setAccountObject(Account expandableObject) {
    this.account = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get id of expandable `customer` object. */
  public String getCustomer() {
    return (this.customer != null) ? this.customer.getId() : null;
  }

  public void setCustomer(String id) {
    this.customer = ApiResource.setExpandableFieldId(id, this.customer);
  }

  /** Get expanded `customer`. */
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
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/sources/%s/verify",
                ApiResource.urlEncodeId(this.getCustomer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(BankAccountVerifyParams params) throws StripeException {
    return verify(params, (RequestOptions) null);
  }

  /** Verify a specified bank account for a given customer. */
  public BankAccount verify(BankAccountVerifyParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/customers/%s/sources/%s/verify",
                ApiResource.urlEncodeId(this.getCustomer()),
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/accounts/%s/external_accounts/%s",
                  ApiResource.urlEncodeId(this.getAccount()),
                  ApiResource.urlEncodeId(this.getId())));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/customers/%s/sources/%s",
                  ApiResource.urlEncodeId(this.getCustomer()),
                  ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/accounts/%s/external_accounts/%s",
                  ApiResource.urlEncodeId(this.getAccount()),
                  ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
  }

  /**
   * Updates the metadata, account holder name, and account holder type of a bank account belonging
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
   * to a <a href="/docs/connect/custom-accounts">Custom account</a>, and optionally sets it as the
   * default for its currency. Other bank account details are not editable by design.
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
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/customers/%s/sources/%s",
                  ApiResource.urlEncodeId(this.getCustomer()),
                  ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.POST, url, params, BankAccount.class, options);
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
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/accounts/%s/external_accounts/%s",
                  ApiResource.urlEncodeId(this.getAccount()),
                  ApiResource.urlEncodeId(this.getId())));
    } else if (this.getCustomer() != null) {
      url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/customers/%s/sources/%s",
                  ApiResource.urlEncodeId(this.getCustomer()),
                  ApiResource.urlEncodeId(this.getId())));
    } else {
      throw new InvalidRequestException(
          "Unable to construct url because [account, customer] field(s) are all null",
          null,
          null,
          null,
          0,
          null);
    }
    return request(ApiResource.RequestMethod.DELETE, url, params, BankAccount.class, options);
  }
}
