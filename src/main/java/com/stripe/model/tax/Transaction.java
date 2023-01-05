// File generated from our OpenAPI spec
package com.stripe.model.tax;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.LineItemCollection;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.tax.TransactionCreateParams;
import com.stripe.param.tax.TransactionCreateReversalParams;
import com.stripe.param.tax.TransactionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** A Tax {@code Transaction} records the tax collected from or refunded to your customer. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /**
   * The ID of an existing <a href="https://stripe.com/docs/api/customers/object">Customer</a> used
   * for the resource.
   */
  @SerializedName("customer")
  String customer;

  @SerializedName("customer_details")
  CustomerDetails customerDetails;

  /** Unique identifier for the transaction. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The tax collected or refunded, by line item. */
  @SerializedName("line_items")
  LineItemCollection lineItems;

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
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code tax.transaction}.
   */
  @SerializedName("object")
  String object;

  /** A custom unique identifier, such as 'myOrder_123'. */
  @SerializedName("reference")
  String reference;

  /** If {@code type=reversal}, contains information about what was reversed. */
  @SerializedName("reversal")
  Reversal reversal;

  /** Timestamp of date at which the tax rules and rates in effect applies for the calculation. */
  @SerializedName("tax_date")
  Long taxDate;

  /**
   * If {@code reversal}, this transaction reverses an earlier transaction.
   *
   * <p>One of {@code reversal}, or {@code transaction}.
   */
  @SerializedName("type")
  String type;

  /** Creates a Tax <code>Transaction</code> from a calculation. */
  public static Transaction create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Tax <code>Transaction</code> from a calculation. */
  public static Transaction create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/transactions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /** Creates a Tax <code>Transaction</code> from a calculation. */
  public static Transaction create(TransactionCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a Tax <code>Transaction</code> from a calculation. */
  public static Transaction create(TransactionCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/transactions");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /** Partially or fully reverses a previously created <code>Transaction</code>. */
  public static Transaction createReversal(Map<String, Object> params) throws StripeException {
    return createReversal(params, (RequestOptions) null);
  }

  /** Partially or fully reverses a previously created <code>Transaction</code>. */
  public static Transaction createReversal(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/transactions/create_reversal");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /** Partially or fully reverses a previously created <code>Transaction</code>. */
  public static Transaction createReversal(TransactionCreateReversalParams params)
      throws StripeException {
    return createReversal(params, (RequestOptions) null);
  }

  /** Partially or fully reverses a previously created <code>Transaction</code>. */
  public static Transaction createReversal(
      TransactionCreateReversalParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/tax/transactions/create_reversal");
    return ApiResource.request(
        ApiResource.RequestMethod.POST, url, params, Transaction.class, options);
  }

  /** Retrieves a Tax <code>Transaction</code> object. */
  public static Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a Tax <code>Transaction</code> object. */
  public static Transaction retrieve(String transaction, RequestOptions options)
      throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, options);
  }

  /** Retrieves a Tax <code>Transaction</code> object. */
  public static Transaction retrieve(
      String transaction, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tax/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  /** Retrieves a Tax <code>Transaction</code> object. */
  public static Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/tax/transactions/%s", ApiResource.urlEncodeId(transaction)));
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, Transaction.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CustomerDetails extends StripeObject {
    /** The customer's postal address (e.g., home or business location). */
    @SerializedName("address")
    Address address;

    /**
     * The type of customer address provided.
     *
     * <p>One of {@code billing}, or {@code shipping}.
     */
    @SerializedName("address_source")
    String addressSource;

    /** The customer's IP address (IPv4 or IPv6). */
    @SerializedName("ip_address")
    String ipAddress;

    /** The customer's tax IDs (e.g., EU VAT numbers). */
    @SerializedName("tax_ids")
    List<Transaction.CustomerDetails.TaxId> taxIds;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Address extends StripeObject {
      /** City, district, suburb, town, or village. */
      @SerializedName("city")
      String city;

      /**
       * Two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
       * 3166-1 alpha-2</a>).
       */
      @SerializedName("country")
      String country;

      /** Address line 1 (e.g., street, PO Box, or company name). */
      @SerializedName("line1")
      String line1;

      /** Address line 2 (e.g., apartment, suite, unit, or building). */
      @SerializedName("line2")
      String line2;

      /** ZIP or postal code. */
      @SerializedName("postal_code")
      String postalCode;

      /**
       * State/province as an <a href="https://en.wikipedia.org/wiki/ISO_3166-2">ISO 3166-2</a>
       * subdivision code, without country prefix. Example: &quot;NY&quot; or &quot;TX&quot;.
       */
      @SerializedName("state")
      String state;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class TaxId extends StripeObject {
      /**
       * The type of the tax ID, one of {@code eu_vat}, {@code br_cnpj}, {@code br_cpf}, {@code
       * eu_oss_vat}, {@code gb_vat}, {@code nz_gst}, {@code au_abn}, {@code au_arn}, {@code
       * in_gst}, {@code no_vat}, {@code za_vat}, {@code ch_vat}, {@code mx_rfc}, {@code sg_uen},
       * {@code ru_inn}, {@code ru_kpp}, {@code ca_bn}, {@code hk_br}, {@code es_cif}, {@code
       * tw_vat}, {@code th_vat}, {@code jp_cn}, {@code jp_rn}, {@code jp_trn}, {@code li_uid},
       * {@code my_itn}, {@code us_ein}, {@code kr_brn}, {@code ca_qst}, {@code ca_gst_hst}, {@code
       * ca_pst_bc}, {@code ca_pst_mb}, {@code ca_pst_sk}, {@code my_sst}, {@code sg_gst}, {@code
       * ae_trn}, {@code cl_tin}, {@code sa_vat}, {@code id_npwp}, {@code my_frp}, {@code il_vat},
       * {@code ge_vat}, {@code ua_vat}, {@code is_vat}, {@code bg_uic}, {@code hu_tin}, {@code
       * si_tin}, {@code ke_pin}, {@code tr_tin}, {@code eg_tin}, {@code ph_tin}, or {@code
       * unknown}.
       */
      @SerializedName("type")
      String type;

      /** The value of the tax ID. */
      @SerializedName("value")
      String value;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reversal extends StripeObject {
    /** The {@code id} of the reversed {@code Transaction} object. */
    @SerializedName("original_transaction")
    String originalTransaction;
  }
}
