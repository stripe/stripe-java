// File generated from our OpenAPI spec
package com.stripe.model.treasury;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.treasury.FinancialAccountCreateParams;
import com.stripe.param.treasury.FinancialAccountListParams;
import com.stripe.param.treasury.FinancialAccountRetrieveFeaturesParams;
import com.stripe.param.treasury.FinancialAccountRetrieveParams;
import com.stripe.param.treasury.FinancialAccountUpdateFeaturesParams;
import com.stripe.param.treasury.FinancialAccountUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccount extends ApiResource
    implements HasId, MetadataStore<FinancialAccount> {
  /** The array of paths to active Features in the Features hash. */
  @SerializedName("active_features")
  List<String> activeFeatures;

  /** Balance information for the FinancialAccount. */
  @SerializedName("balance")
  Balance balance;

  /**
   * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO 3166-1
   * alpha-2</a>).
   */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Encodes whether a FinancialAccount has access to a particular Feature, with a {@code status}
   * enum and associated {@code status_details}. Stripe or the platform can control Features via the
   * requested field.
   */
  @SerializedName("features")
  FinancialAccountFeatures features;

  /** The set of credentials that resolve to a FinancialAccount. */
  @SerializedName("financial_addresses")
  List<FinancialAccount.FinancialAddresses> financialAddresses;

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
   * <p>Equal to {@code treasury.financial_account}.
   */
  @SerializedName("object")
  String object;

  /** The array of paths to pending Features in the Features hash. */
  @SerializedName("pending_features")
  List<String> pendingFeatures;

  /** The set of functionalities that the platform can restrict on the FinancialAccount. */
  @SerializedName("platform_restrictions")
  FinancialAccountFeatures.PlatformRestriction platformRestrictions;

  /** The array of paths to restricted Features in the Features hash. */
  @SerializedName("restricted_features")
  List<String> restrictedFeatures;

  /**
   * The enum specifying what state the account is in.
   *
   * <p>One of {@code closed}, or {@code open}.
   */
  @SerializedName("status")
  String status;

  @SerializedName("status_details")
  StatusDetails statusDetails;

  /**
   * The currencies the FinancialAccount can hold a balance in. Three-letter <a
   * href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>, in lowercase.
   */
  @SerializedName("supported_currencies")
  List<String> supportedCurrencies;

  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public static FinancialAccount create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public static FinancialAccount create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/financial_accounts");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccount.class, options);
  }

  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public static FinancialAccount create(FinancialAccountCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a new FinancialAccount. For now, each connected account can only have one
   * FinancialAccount.
   */
  public static FinancialAccount create(FinancialAccountCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/financial_accounts");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccount.class, options);
  }

  /** Updates the details of a FinancialAccount. */
  @Override
  public FinancialAccount update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the details of a FinancialAccount. */
  @Override
  public FinancialAccount update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccount.class, options);
  }

  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(FinancialAccountUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates the details of a FinancialAccount. */
  public FinancialAccount update(FinancialAccountUpdateParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccount.class, options);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures() throws StripeException {
    return updateFeatures((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(RequestOptions options) throws StripeException {
    return updateFeatures((Map<String, Object>) null, options);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(Map<String, Object> params)
      throws StripeException {
    return updateFeatures(params, (RequestOptions) null);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s/features",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccountFeatures.class, options);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(FinancialAccountUpdateFeaturesParams params)
      throws StripeException {
    return updateFeatures(params, (RequestOptions) null);
  }

  /** Updates the Features associated with a FinancialAccount. */
  public FinancialAccountFeatures updateFeatures(
      FinancialAccountUpdateFeaturesParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s/features",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, FinancialAccountFeatures.class, options);
  }

  /** Returns a list of FinancialAccounts. */
  public static FinancialAccountCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of FinancialAccounts. */
  public static FinancialAccountCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/financial_accounts");
    return ApiResource.requestCollection(url, params, FinancialAccountCollection.class, options);
  }

  /** Returns a list of FinancialAccounts. */
  public static FinancialAccountCollection list(FinancialAccountListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of FinancialAccounts. */
  public static FinancialAccountCollection list(
      FinancialAccountListParams params, RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/treasury/financial_accounts");
    return ApiResource.requestCollection(url, params, FinancialAccountCollection.class, options);
  }

  /** Retrieves the details of a FinancialAccount. */
  public static FinancialAccount retrieve(String financialAccount) throws StripeException {
    return retrieve(financialAccount, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a FinancialAccount. */
  public static FinancialAccount retrieve(String financialAccount, RequestOptions options)
      throws StripeException {
    return retrieve(financialAccount, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a FinancialAccount. */
  public static FinancialAccount retrieve(
      String financialAccount, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, FinancialAccount.class, options);
  }

  /** Retrieves the details of a FinancialAccount. */
  public static FinancialAccount retrieve(
      String financialAccount, FinancialAccountRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s", ApiResource.urlEncodeId(financialAccount)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, FinancialAccount.class, options);
  }

  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures() throws StripeException {
    return retrieveFeatures((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(Map<String, Object> params)
      throws StripeException {
    return retrieveFeatures(params, (RequestOptions) null);
  }

  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s/features",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, FinancialAccountFeatures.class, options);
  }

  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(FinancialAccountRetrieveFeaturesParams params)
      throws StripeException {
    return retrieveFeatures(params, (RequestOptions) null);
  }

  /** Retrieves Features information associated with the FinancialAccount. */
  public FinancialAccountFeatures retrieveFeatures(
      FinancialAccountRetrieveFeaturesParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/treasury/financial_accounts/%s/features",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, FinancialAccountFeatures.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    /** Funds the user can spend right now. */
    @SerializedName("cash")
    Map<String, Long> cash;

    /** Funds not spendable yet, but will become available at a later time. */
    @SerializedName("inbound_pending")
    Map<String, Long> inboundPending;

    /**
     * Funds in the account, but not spendable because they are being held for pending outbound
     * flows.
     */
    @SerializedName("outbound_pending")
    Map<String, Long> outboundPending;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class FinancialAddresses extends StripeObject {
    /** ABA Records contain U.S. bank account details per the ABA format. */
    @SerializedName("aba")
    ABARecord aba;

    /** The list of networks that the address supports. */
    @SerializedName("supported_networks")
    List<String> supportedNetworks;

    /**
     * The type of financial address
     *
     * <p>Equal to {@code aba}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ABARecord extends StripeObject {
      /** The name of the person or business that owns the bank account. */
      @SerializedName("account_holder_name")
      String accountHolderName;

      /** The account number. */
      @SerializedName("account_number")
      String accountNumber;

      /** The last four characters of the account number. */
      @SerializedName("account_number_last4")
      String accountNumberLast4;

      /** Name of the bank. */
      @SerializedName("bank_name")
      String bankName;

      /** Routing number for the account. */
      @SerializedName("routing_number")
      String routingNumber;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class StatusDetails extends StripeObject {
    /** Details related to the closure of this FinancialAccount. */
    @SerializedName("closed")
    ClosedStatusDetails closed;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ClosedStatusDetails extends StripeObject {
      /** The array that contains reasons for a FinancialAccount closure. */
      @SerializedName("reasons")
      List<String> reasons;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ToggleSettings extends StripeObject {
    /** Whether the FinancialAccount should have the Feature. */
    @SerializedName("requested")
    Boolean requested;

    /**
     * Whether the Feature is operational.
     *
     * <p>One of {@code active}, {@code pending}, or {@code restricted}.
     */
    @SerializedName("status")
    String status;

    /** Additional details; includes at least one entry when the status is not {@code active}. */
    @SerializedName("status_details")
    List<FinancialAccount.ToggleSettings.StatusDetails> statusDetails;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /**
       * Represents the reason why the status is {@code pending} or {@code restricted}.
       *
       * <p>One of {@code activating}, {@code capability_not_requested}, {@code
       * financial_account_closed}, {@code rejected_other}, {@code rejected_unsupported_business},
       * {@code requirements_past_due}, {@code requirements_pending_verification}, {@code
       * restricted_by_platform}, or {@code restricted_other}.
       */
      @SerializedName("code")
      String code;

      /**
       * Represents what the user should do, if anything, to activate the Feature.
       *
       * <p>One of {@code contact_stripe}, {@code provide_information}, or {@code
       * remove_restriction}.
       */
      @SerializedName("resolution")
      String resolution;

      /**
       * The {@code platform_restrictions} that are restricting this Feature.
       *
       * <p>One of {@code inbound_flows}, or {@code outbound_flows}.
       */
      @SerializedName("restriction")
      String restriction;
    }
  }
}
