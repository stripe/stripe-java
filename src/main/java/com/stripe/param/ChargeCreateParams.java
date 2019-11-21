package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class ChargeCreateParams extends ApiRequestParams {
  /**
   * Amount intended to be collected by this PaymentIntent. A positive integer representing how much
   * to charge in the [smallest currency unit](https://stripe.com/docs/currencies#zero-decimal)
   * (e.g., 100 cents to charge $1.00 or 100 to charge ¥100, a zero-decimal currency). The minimum
   * amount is $0.50 US or [equivalent in charge
   * currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts). The amount
   * value supports up to eight digits (e.g., a value of 99999999 for a USD charge of $999,999.99).
   */
  @SerializedName("amount")
  Long amount;

  @SerializedName("application_fee")
  Long applicationFee;

  /**
   * A fee in %s that will be applied to the charge and transferred to the application owner's
   * Stripe account. The request must be made with an OAuth key or the `Stripe-Account` header in
   * order to take an application fee. For more information, see the application fees
   * [documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees).
   */
  @SerializedName("application_fee_amount")
  Long applicationFeeAmount;

  /**
   * Whether to immediately capture the charge. Defaults to `true`. When `false`, the charge issues
   * an authorization (or pre-authorization), and will need to be [captured](#capture_charge) later.
   * Uncaptured charges expire in _seven days_. For more information, see the [authorizing charges
   * and settling later](https://stripe.com/docs/charges/placing-a-hold) documentation.
   */
  @SerializedName("capture")
  Boolean capture;

  /**
   * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
   * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
   */
  @SerializedName("currency")
  String currency;

  /** The ID of an existing customer that will be charged in this request. */
  @SerializedName("customer")
  String customer;

  /**
   * An arbitrary string which you can attach to a `Charge` object. It is displayed when in the web
   * interface alongside the charge. Note that if you use Stripe to send automatic email receipts to
   * your customers, your receipt emails will include the `description` of the charge(s) that they
   * are describing.
   */
  @SerializedName("description")
  String description;

  @SerializedName("destination")
  Destination destination;

  /** Specifies which fields in the response should be expanded. */
  @SerializedName("expand")
  List<String> expand;

  /**
   * Map of extra parameters for custom features not available in this client library. The content
   * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
   * key/value pair is serialized as if the key is a root-level field (serialized) name in this
   * param object. Effectively, this map is flattened to its parent instance.
   */
  @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
  Map<String, Object> extraParams;

  /**
   * Set of key-value pairs that you can attach to an object. This can be useful for storing
   * additional information about the object in a structured format.
   */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * The Stripe account ID for which these funds are intended. Automatically set if you use the
   * `destination` parameter. For details, see [Creating Separate Charges and
   * Transfers](https://stripe.com/docs/connect/charges-transfers#on-behalf-of).
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * The email address to which this charge's [receipt](https://stripe.com/docs/dashboard/receipts)
   * will be sent. The receipt will not be sent until the charge is paid, and no receipts will be
   * sent for test mode charges. If this charge is for a
   * [Customer](https://stripe.com/docs/api/customers/object), the email address specified here will
   * override the customer's email address. If `receipt_email` is specified for a charge in live
   * mode, a receipt will be sent regardless of your [email
   * settings](https://dashboard.stripe.com/account/emails).
   */
  @SerializedName("receipt_email")
  String receiptEmail;

  /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
  @SerializedName("shipping")
  Shipping shipping;

  /**
   * A payment source to be charged. This can be the ID of a
   * [card](https://stripe.com/docs/api#cards) (i.e., credit or debit card), a [bank
   * account](https://stripe.com/docs/api#bank_accounts), a
   * [source](https://stripe.com/docs/api#sources), a [token](https://stripe.com/docs/api#tokens),
   * or a [connected
   * account](https://stripe.com/docs/connect/account-debits#charging-a-connected-account). For
   * certain sources---namely, [cards](https://stripe.com/docs/api#cards), [bank
   * accounts](https://stripe.com/docs/api#bank_accounts), and attached
   * [sources](https://stripe.com/docs/api#sources)---you must also pass the ID of the associated
   * customer.
   */
  @SerializedName("source")
  String source;

  /**
   * For card charges, use `statement_descriptor_suffix` instead. Otherwise, you can use this value
   * as the complete description of a charge on your customers’ statements. Must contain at least
   * one letter, maximum 22 characters.
   */
  @SerializedName("statement_descriptor")
  String statementDescriptor;

  /**
   * Provides information about the charge that customers see on their statements. Concatenated with
   * the prefix (shortened descriptor) or statement descriptor that’s set on the account to form the
   * complete statement descriptor. Maximum 22 characters for the concatenated descriptor.
   */
  @SerializedName("statement_descriptor_suffix")
  String statementDescriptorSuffix;

  /**
   * An optional dictionary including the account to automatically transfer to as part of a
   * destination charge. [See the Connect
   * documentation](https://stripe.com/docs/connect/destination-charges) for details.
   */
  @SerializedName("transfer_data")
  TransferData transferData;

  /**
   * A string that identifies this transaction as part of a group. For details, see [Grouping
   * transactions](https://stripe.com/docs/connect/charges-transfers#grouping-transactions).
   */
  @SerializedName("transfer_group")
  String transferGroup;

  private ChargeCreateParams(
      Long amount,
      Long applicationFee,
      Long applicationFeeAmount,
      Boolean capture,
      String currency,
      String customer,
      String description,
      Destination destination,
      List<String> expand,
      Map<String, Object> extraParams,
      Map<String, String> metadata,
      String onBehalfOf,
      String receiptEmail,
      Shipping shipping,
      String source,
      String statementDescriptor,
      String statementDescriptorSuffix,
      TransferData transferData,
      String transferGroup) {
    this.amount = amount;
    this.applicationFee = applicationFee;
    this.applicationFeeAmount = applicationFeeAmount;
    this.capture = capture;
    this.currency = currency;
    this.customer = customer;
    this.description = description;
    this.destination = destination;
    this.expand = expand;
    this.extraParams = extraParams;
    this.metadata = metadata;
    this.onBehalfOf = onBehalfOf;
    this.receiptEmail = receiptEmail;
    this.shipping = shipping;
    this.source = source;
    this.statementDescriptor = statementDescriptor;
    this.statementDescriptorSuffix = statementDescriptorSuffix;
    this.transferData = transferData;
    this.transferGroup = transferGroup;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private Long amount;

    private Long applicationFee;

    private Long applicationFeeAmount;

    private Boolean capture;

    private String currency;

    private String customer;

    private String description;

    private Destination destination;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private Map<String, String> metadata;

    private String onBehalfOf;

    private String receiptEmail;

    private Shipping shipping;

    private String source;

    private String statementDescriptor;

    private String statementDescriptorSuffix;

    private TransferData transferData;

    private String transferGroup;

    /** Finalize and obtain parameter instance from this builder. */
    public ChargeCreateParams build() {
      return new ChargeCreateParams(
          this.amount,
          this.applicationFee,
          this.applicationFeeAmount,
          this.capture,
          this.currency,
          this.customer,
          this.description,
          this.destination,
          this.expand,
          this.extraParams,
          this.metadata,
          this.onBehalfOf,
          this.receiptEmail,
          this.shipping,
          this.source,
          this.statementDescriptor,
          this.statementDescriptorSuffix,
          this.transferData,
          this.transferGroup);
    }

    /**
     * Amount intended to be collected by this PaymentIntent. A positive integer representing how
     * much to charge in the [smallest currency
     * unit](https://stripe.com/docs/currencies#zero-decimal) (e.g., 100 cents to charge $1.00 or
     * 100 to charge ¥100, a zero-decimal currency). The minimum amount is $0.50 US or [equivalent
     * in charge currency](https://stripe.com/docs/currencies#minimum-and-maximum-charge-amounts).
     * The amount value supports up to eight digits (e.g., a value of 99999999 for a USD charge of
     * $999,999.99).
     */
    public Builder setAmount(Long amount) {
      this.amount = amount;
      return this;
    }

    public Builder setApplicationFee(Long applicationFee) {
      this.applicationFee = applicationFee;
      return this;
    }

    /**
     * A fee in %s that will be applied to the charge and transferred to the application owner's
     * Stripe account. The request must be made with an OAuth key or the `Stripe-Account` header in
     * order to take an application fee. For more information, see the application fees
     * [documentation](https://stripe.com/docs/connect/direct-charges#collecting-fees).
     */
    public Builder setApplicationFeeAmount(Long applicationFeeAmount) {
      this.applicationFeeAmount = applicationFeeAmount;
      return this;
    }

    /**
     * Whether to immediately capture the charge. Defaults to `true`. When `false`, the charge
     * issues an authorization (or pre-authorization), and will need to be
     * [captured](#capture_charge) later. Uncaptured charges expire in _seven days_. For more
     * information, see the [authorizing charges and settling
     * later](https://stripe.com/docs/charges/placing-a-hold) documentation.
     */
    public Builder setCapture(Boolean capture) {
      this.capture = capture;
      return this;
    }

    /**
     * Three-letter [ISO currency code](https://www.iso.org/iso-4217-currency-codes.html), in
     * lowercase. Must be a [supported currency](https://stripe.com/docs/currencies).
     */
    public Builder setCurrency(String currency) {
      this.currency = currency;
      return this;
    }

    /** The ID of an existing customer that will be charged in this request. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * An arbitrary string which you can attach to a `Charge` object. It is displayed when in the
     * web interface alongside the charge. Note that if you use Stripe to send automatic email
     * receipts to your customers, your receipt emails will include the `description` of the
     * charge(s) that they are describing.
     */
    public Builder setDescription(String description) {
      this.description = description;
      return this;
    }

    public Builder setDestination(Destination destination) {
      this.destination = destination;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeCreateParams#expand} for the field documentation.
     */
    public Builder addExpand(String element) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.add(element);
      return this;
    }

    /**
     * Add all elements to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * ChargeCreateParams#expand} for the field documentation.
     */
    public Builder addAllExpand(List<String> elements) {
      if (this.expand == null) {
        this.expand = new ArrayList<>();
      }
      this.expand.addAll(elements);
      return this;
    }

    /**
     * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
     * call, and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeCreateParams#extraParams} for the field documentation.
     */
    public Builder putExtraParam(String key, Object value) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ChargeCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * Add a key/value pair to `metadata` map. A map is initialized for the first `put/putAll` call,
     * and subsequent calls add additional key/value pairs to the original map. See {@link
     * ChargeCreateParams#metadata} for the field documentation.
     */
    public Builder putMetadata(String key, String value) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.put(key, value);
      return this;
    }

    /**
     * Add all map key/value pairs to `metadata` map. A map is initialized for the first
     * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
     * See {@link ChargeCreateParams#metadata} for the field documentation.
     */
    public Builder putAllMetadata(Map<String, String> map) {
      if (this.metadata == null) {
        this.metadata = new HashMap<>();
      }
      this.metadata.putAll(map);
      return this;
    }

    /**
     * The Stripe account ID for which these funds are intended. Automatically set if you use the
     * `destination` parameter. For details, see [Creating Separate Charges and
     * Transfers](https://stripe.com/docs/connect/charges-transfers#on-behalf-of).
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * The email address to which this charge's
     * [receipt](https://stripe.com/docs/dashboard/receipts) will be sent. The receipt will not be
     * sent until the charge is paid, and no receipts will be sent for test mode charges. If this
     * charge is for a [Customer](https://stripe.com/docs/api/customers/object), the email address
     * specified here will override the customer's email address. If `receipt_email` is specified
     * for a charge in live mode, a receipt will be sent regardless of your [email
     * settings](https://dashboard.stripe.com/account/emails).
     */
    public Builder setReceiptEmail(String receiptEmail) {
      this.receiptEmail = receiptEmail;
      return this;
    }

    /** Shipping information for the charge. Helps prevent fraud on charges for physical goods. */
    public Builder setShipping(Shipping shipping) {
      this.shipping = shipping;
      return this;
    }

    /**
     * A payment source to be charged. This can be the ID of a
     * [card](https://stripe.com/docs/api#cards) (i.e., credit or debit card), a [bank
     * account](https://stripe.com/docs/api#bank_accounts), a
     * [source](https://stripe.com/docs/api#sources), a [token](https://stripe.com/docs/api#tokens),
     * or a [connected
     * account](https://stripe.com/docs/connect/account-debits#charging-a-connected-account). For
     * certain sources---namely, [cards](https://stripe.com/docs/api#cards), [bank
     * accounts](https://stripe.com/docs/api#bank_accounts), and attached
     * [sources](https://stripe.com/docs/api#sources)---you must also pass the ID of the associated
     * customer.
     */
    public Builder setSource(String source) {
      this.source = source;
      return this;
    }

    /**
     * For card charges, use `statement_descriptor_suffix` instead. Otherwise, you can use this
     * value as the complete description of a charge on your customers’ statements. Must contain at
     * least one letter, maximum 22 characters.
     */
    public Builder setStatementDescriptor(String statementDescriptor) {
      this.statementDescriptor = statementDescriptor;
      return this;
    }

    /**
     * Provides information about the charge that customers see on their statements. Concatenated
     * with the prefix (shortened descriptor) or statement descriptor that’s set on the account to
     * form the complete statement descriptor. Maximum 22 characters for the concatenated
     * descriptor.
     */
    public Builder setStatementDescriptorSuffix(String statementDescriptorSuffix) {
      this.statementDescriptorSuffix = statementDescriptorSuffix;
      return this;
    }

    /**
     * An optional dictionary including the account to automatically transfer to as part of a
     * destination charge. [See the Connect
     * documentation](https://stripe.com/docs/connect/destination-charges) for details.
     */
    public Builder setTransferData(TransferData transferData) {
      this.transferData = transferData;
      return this;
    }

    /**
     * A string that identifies this transaction as part of a group. For details, see [Grouping
     * transactions](https://stripe.com/docs/connect/charges-transfers#grouping-transactions).
     */
    public Builder setTransferGroup(String transferGroup) {
      this.transferGroup = transferGroup;
      return this;
    }
  }

  @Getter
  public static class Destination {
    /** ID of an existing, connected Stripe account. */
    @SerializedName("account")
    String account;

    /**
     * The amount to transfer to the destination account without creating an `Application Fee`
     * object. Cannot be combined with the `application_fee` parameter. Must be less than or equal
     * to the charge amount.
     */
    @SerializedName("amount")
    Long amount;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private Destination(String account, Long amount, Map<String, Object> extraParams) {
      this.account = account;
      this.amount = amount;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private String account;

      private Long amount;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public Destination build() {
        return new Destination(this.account, this.amount, this.extraParams);
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setAccount(String account) {
        this.account = account;
        return this;
      }

      /**
       * The amount to transfer to the destination account without creating an `Application Fee`
       * object. Cannot be combined with the `application_fee` parameter. Must be less than or equal
       * to the charge amount.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeCreateParams.Destination#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ChargeCreateParams.Destination#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }

  @Getter
  public static class Shipping {
    /** Shipping address. */
    @SerializedName("address")
    Address address;

    /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
    @SerializedName("carrier")
    String carrier;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    /** Recipient name. */
    @SerializedName("name")
    String name;

    /** Recipient phone (including extension). */
    @SerializedName("phone")
    String phone;

    /**
     * The tracking number for a physical product, obtained from the delivery service. If multiple
     * tracking numbers were generated for this purchase, please separate them with commas.
     */
    @SerializedName("tracking_number")
    String trackingNumber;

    private Shipping(
        Address address,
        String carrier,
        Map<String, Object> extraParams,
        String name,
        String phone,
        String trackingNumber) {
      this.address = address;
      this.carrier = carrier;
      this.extraParams = extraParams;
      this.name = name;
      this.phone = phone;
      this.trackingNumber = trackingNumber;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Address address;

      private String carrier;

      private Map<String, Object> extraParams;

      private String name;

      private String phone;

      private String trackingNumber;

      /** Finalize and obtain parameter instance from this builder. */
      public Shipping build() {
        return new Shipping(
            this.address,
            this.carrier,
            this.extraParams,
            this.name,
            this.phone,
            this.trackingNumber);
      }

      /** Shipping address. */
      public Builder setAddress(Address address) {
        this.address = address;
        return this;
      }

      /** The delivery service that shipped a physical product, such as Fedex, UPS, USPS, etc. */
      public Builder setCarrier(String carrier) {
        this.carrier = carrier;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeCreateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ChargeCreateParams.Shipping#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /** Recipient name. */
      public Builder setName(String name) {
        this.name = name;
        return this;
      }

      /** Recipient phone (including extension). */
      public Builder setPhone(String phone) {
        this.phone = phone;
        return this;
      }

      /**
       * The tracking number for a physical product, obtained from the delivery service. If multiple
       * tracking numbers were generated for this purchase, please separate them with commas.
       */
      public Builder setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
        return this;
      }
    }

    @Getter
    public static class Address {
      @SerializedName("city")
      String city;

      @SerializedName("country")
      String country;

      /**
       * Map of extra parameters for custom features not available in this client library. The
       * content in this map is not serialized under this field's {@code @SerializedName} value.
       * Instead, each key/value pair is serialized as if the key is a root-level field (serialized)
       * name in this param object. Effectively, this map is flattened to its parent instance.
       */
      @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
      Map<String, Object> extraParams;

      @SerializedName("line1")
      String line1;

      @SerializedName("line2")
      String line2;

      @SerializedName("postal_code")
      String postalCode;

      @SerializedName("state")
      String state;

      private Address(
          String city,
          String country,
          Map<String, Object> extraParams,
          String line1,
          String line2,
          String postalCode,
          String state) {
        this.city = city;
        this.country = country;
        this.extraParams = extraParams;
        this.line1 = line1;
        this.line2 = line2;
        this.postalCode = postalCode;
        this.state = state;
      }

      public static Builder builder() {
        return new Builder();
      }

      public static class Builder {
        private String city;

        private String country;

        private Map<String, Object> extraParams;

        private String line1;

        private String line2;

        private String postalCode;

        private String state;

        /** Finalize and obtain parameter instance from this builder. */
        public Address build() {
          return new Address(
              this.city,
              this.country,
              this.extraParams,
              this.line1,
              this.line2,
              this.postalCode,
              this.state);
        }

        public Builder setCity(String city) {
          this.city = city;
          return this;
        }

        public Builder setCountry(String country) {
          this.country = country;
          return this;
        }

        /**
         * Add a key/value pair to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putExtraParam(String key, Object value) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.put(key, value);
          return this;
        }

        /**
         * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
         * `put/putAll` call, and subsequent calls add additional key/value pairs to the original
         * map. See {@link ChargeCreateParams.Shipping.Address#extraParams} for the field
         * documentation.
         */
        public Builder putAllExtraParam(Map<String, Object> map) {
          if (this.extraParams == null) {
            this.extraParams = new HashMap<>();
          }
          this.extraParams.putAll(map);
          return this;
        }

        public Builder setLine1(String line1) {
          this.line1 = line1;
          return this;
        }

        public Builder setLine2(String line2) {
          this.line2 = line2;
          return this;
        }

        public Builder setPostalCode(String postalCode) {
          this.postalCode = postalCode;
          return this;
        }

        public Builder setState(String state) {
          this.state = state;
          return this;
        }
      }
    }
  }

  @Getter
  public static class TransferData {
    /**
     * The amount transferred to the destination account, if specified. By default, the entire
     * charge amount is transferred to the destination account.
     */
    @SerializedName("amount")
    Long amount;

    /** ID of an existing, connected Stripe account. */
    @SerializedName("destination")
    String destination;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    private TransferData(Long amount, String destination, Map<String, Object> extraParams) {
      this.amount = amount;
      this.destination = destination;
      this.extraParams = extraParams;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private Long amount;

      private String destination;

      private Map<String, Object> extraParams;

      /** Finalize and obtain parameter instance from this builder. */
      public TransferData build() {
        return new TransferData(this.amount, this.destination, this.extraParams);
      }

      /**
       * The amount transferred to the destination account, if specified. By default, the entire
       * charge amount is transferred to the destination account.
       */
      public Builder setAmount(Long amount) {
        this.amount = amount;
        return this;
      }

      /** ID of an existing, connected Stripe account. */
      public Builder setDestination(String destination) {
        this.destination = destination;
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * ChargeCreateParams.TransferData#extraParams} for the field documentation.
       */
      public Builder putExtraParam(String key, Object value) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.put(key, value);
        return this;
      }

      /**
       * Add all map key/value pairs to `extraParams` map. A map is initialized for the first
       * `put/putAll` call, and subsequent calls add additional key/value pairs to the original map.
       * See {@link ChargeCreateParams.TransferData#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }
    }
  }
}
