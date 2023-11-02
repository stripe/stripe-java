// File generated from our OpenAPI spec
package com.stripe.model.issuing;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.BalanceTransaction;
import com.stripe.model.BalanceTransactionSource;
import com.stripe.model.ExpandableField;
import com.stripe.model.MetadataStore;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiMode;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.issuing.TransactionCreateForceCaptureParams;
import com.stripe.param.issuing.TransactionCreateUnlinkedRefundParams;
import com.stripe.param.issuing.TransactionListParams;
import com.stripe.param.issuing.TransactionRefundParams;
import com.stripe.param.issuing.TransactionRetrieveParams;
import com.stripe.param.issuing.TransactionUpdateParams;
import java.math.BigDecimal;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * Any use of an <a href="https://stripe.com/docs/issuing">issued card</a> that results in funds
 * entering or leaving your Stripe account, such as a completed purchase or refund, is represented
 * by an Issuing {@code Transaction} object.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/issuing/purchases/transactions">Issued card
 * transactions</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Transaction extends ApiResource
    implements MetadataStore<Transaction>, BalanceTransactionSource {
  /**
   * The transaction amount, which will be reflected in your balance. This amount is in your
   * currency and in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency
   * unit</a>.
   */
  @SerializedName("amount")
  Long amount;

  /**
   * Detailed breakdown of amount components. These amounts are denominated in {@code currency} and
   * in the <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
   */
  @SerializedName("amount_details")
  AmountDetails amountDetails;

  /** The {@code Authorization} object that led to this transaction. */
  @SerializedName("authorization")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Authorization> authorization;

  /**
   * ID of the <a href="https://stripe.com/docs/api/balance_transactions">balance transaction</a>
   * associated with this transaction.
   */
  @SerializedName("balance_transaction")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<BalanceTransaction> balanceTransaction;

  /** The card used to make this transaction. */
  @SerializedName("card")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Card> card;

  /** The cardholder to whom this transaction belongs. */
  @SerializedName("cardholder")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Cardholder> cardholder;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency code</a>,
   * in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported currency</a>.
   */
  @SerializedName("currency")
  String currency;

  /** If you've disputed the transaction, the ID of the dispute. */
  @SerializedName("dispute")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Dispute> dispute;

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
   * The amount that the merchant will receive, denominated in {@code merchant_currency} and in the
   * <a href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>. It will
   * be different from {@code amount} if the merchant is taking payment in a different currency.
   */
  @SerializedName("merchant_amount")
  Long merchantAmount;

  /** The currency with which the merchant is taking payment. */
  @SerializedName("merchant_currency")
  String merchantCurrency;

  @SerializedName("merchant_data")
  MerchantData merchantData;

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
   * <p>Equal to {@code issuing.transaction}.
   */
  @SerializedName("object")
  String object;

  /** Additional purchase information that is optionally provided by the merchant. */
  @SerializedName("purchase_details")
  PurchaseDetails purchaseDetails;

  /**
   * <a href="https://stripe.com/docs/api/issuing/tokens/object">Token</a> object used for this
   * transaction. If a network token was not used for this transaction, this field will be null.
   */
  @SerializedName("token")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Token> token;

  /**
   * <a href="https://stripe.com/docs/api/treasury">Treasury</a> details related to this transaction
   * if it was created on a [FinancialAccount](/docs/api/treasury/financial_accounts
   */
  @SerializedName("treasury")
  Treasury treasury;

  /**
   * The nature of the transaction.
   *
   * <p>One of {@code capture}, or {@code refund}.
   */
  @SerializedName("type")
  String type;

  /**
   * The digital wallet used for this transaction. One of {@code apple_pay}, {@code google_pay}, or
   * {@code samsung_pay}.
   */
  @SerializedName("wallet")
  String wallet;

  /** Get ID of expandable {@code authorization} object. */
  public String getAuthorization() {
    return (this.authorization != null) ? this.authorization.getId() : null;
  }

  public void setAuthorization(String id) {
    this.authorization = ApiResource.setExpandableFieldId(id, this.authorization);
  }

  /** Get expanded {@code authorization}. */
  public Authorization getAuthorizationObject() {
    return (this.authorization != null) ? this.authorization.getExpanded() : null;
  }

  public void setAuthorizationObject(Authorization expandableObject) {
    this.authorization =
        new ExpandableField<Authorization>(expandableObject.getId(), expandableObject);
  }

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

  /** Get ID of expandable {@code card} object. */
  public String getCard() {
    return (this.card != null) ? this.card.getId() : null;
  }

  public void setCard(String id) {
    this.card = ApiResource.setExpandableFieldId(id, this.card);
  }

  /** Get expanded {@code card}. */
  public Card getCardObject() {
    return (this.card != null) ? this.card.getExpanded() : null;
  }

  public void setCardObject(Card expandableObject) {
    this.card = new ExpandableField<Card>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code cardholder} object. */
  public String getCardholder() {
    return (this.cardholder != null) ? this.cardholder.getId() : null;
  }

  public void setCardholder(String id) {
    this.cardholder = ApiResource.setExpandableFieldId(id, this.cardholder);
  }

  /** Get expanded {@code cardholder}. */
  public Cardholder getCardholderObject() {
    return (this.cardholder != null) ? this.cardholder.getExpanded() : null;
  }

  public void setCardholderObject(Cardholder expandableObject) {
    this.cardholder = new ExpandableField<Cardholder>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code dispute} object. */
  public String getDispute() {
    return (this.dispute != null) ? this.dispute.getId() : null;
  }

  public void setDispute(String id) {
    this.dispute = ApiResource.setExpandableFieldId(id, this.dispute);
  }

  /** Get expanded {@code dispute}. */
  public Dispute getDisputeObject() {
    return (this.dispute != null) ? this.dispute.getExpanded() : null;
  }

  public void setDisputeObject(Dispute expandableObject) {
    this.dispute = new ExpandableField<Dispute>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code token} object. */
  public String getToken() {
    return (this.token != null) ? this.token.getId() : null;
  }

  public void setToken(String id) {
    this.token = ApiResource.setExpandableFieldId(id, this.token);
  }

  /** Get expanded {@code token}. */
  public Token getTokenObject() {
    return (this.token != null) ? this.token.getExpanded() : null;
  }

  public void setTokenObject(Token expandableObject) {
    this.token = new ExpandableField<Token>(expandableObject.getId(), expandableObject);
  }

  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/transactions";
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of Issuing {@code Transaction} objects. The objects are sorted in descending
   * order by creation date, with the most recently created object appearing first.
   */
  public static TransactionCollection list(TransactionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/issuing/transactions";
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            TransactionCollection.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an Issuing {@code Transaction} object. */
  public static Transaction retrieve(String transaction) throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves an Issuing {@code Transaction} object. */
  public static Transaction retrieve(String transaction, RequestOptions options)
      throws StripeException {
    return retrieve(transaction, (Map<String, Object>) null, options);
  }

  /** Retrieves an Issuing {@code Transaction} object. */
  public static Transaction retrieve(
      String transaction, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction));
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /** Retrieves an Issuing {@code Transaction} object. */
  public static Transaction retrieve(
      String transaction, TransactionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(transaction));
    ApiResource.checkNullTypedParams(path, params);
    return getGlobalResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  @Override
  public Transaction update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId()));
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            params,
            Transaction.class,
            options,
            ApiMode.V1);
  }

  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates the specified Issuing {@code Transaction} object by setting the values of the
   * parameters passed. Any parameters not provided will be left unchanged.
   */
  public Transaction update(TransactionUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/issuing/transactions/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    return getResponseGetter()
        .request(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            Transaction.class,
            options,
            ApiMode.V1);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmountDetails extends StripeObject {
    /** The fee charged by the ATM for the cash withdrawal. */
    @SerializedName("atm_fee")
    Long atmFee;

    /** The amount of cash requested by the cardholder. */
    @SerializedName("cashback_amount")
    Long cashbackAmount;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class MerchantData extends StripeObject {
    /**
     * A categorization of the seller's type of business. See our <a
     * href="https://stripe.com/docs/issuing/merchant-categories">merchant categories guide</a> for
     * a list of possible values.
     */
    @SerializedName("category")
    String category;

    /** The merchant category code for the seller’s business. */
    @SerializedName("category_code")
    String categoryCode;

    /** City where the seller is located. */
    @SerializedName("city")
    String city;

    /** Country where the seller is located. */
    @SerializedName("country")
    String country;

    /** Name of the seller. */
    @SerializedName("name")
    String name;

    /**
     * Identifier assigned to the seller by the card network. Different card networks may assign
     * different network_id fields to the same merchant.
     */
    @SerializedName("network_id")
    String networkId;

    /** Postal code where the seller is located. */
    @SerializedName("postal_code")
    String postalCode;

    /** State where the seller is located. */
    @SerializedName("state")
    String state;

    /** An ID assigned by the seller to the location of the sale. */
    @SerializedName("terminal_id")
    String terminalId;

    /** URL provided by the merchant on a 3DS request. */
    @SerializedName("url")
    String url;
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PurchaseDetails extends StripeObject {
    /** Information about the flight that was purchased with this transaction. */
    @SerializedName("flight")
    Flight flight;

    /** Information about fuel that was purchased with this transaction. */
    @SerializedName("fuel")
    Fuel fuel;

    /** Information about lodging that was purchased with this transaction. */
    @SerializedName("lodging")
    Lodging lodging;

    /** The line items in the purchase. */
    @SerializedName("receipt")
    List<Transaction.PurchaseDetails.Receipt> receipt;

    /** A merchant-specific order number. */
    @SerializedName("reference")
    String reference;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Flight extends StripeObject {
      /** The time that the flight departed. */
      @SerializedName("departure_at")
      Long departureAt;

      /** The name of the passenger. */
      @SerializedName("passenger_name")
      String passengerName;

      /** Whether the ticket is refundable. */
      @SerializedName("refundable")
      Boolean refundable;

      /** The legs of the trip. */
      @SerializedName("segments")
      List<Transaction.PurchaseDetails.Flight.Segment> segments;

      /** The travel agency that issued the ticket. */
      @SerializedName("travel_agency")
      String travelAgency;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Segment extends StripeObject {
        /** The three-letter IATA airport code of the flight's destination. */
        @SerializedName("arrival_airport_code")
        String arrivalAirportCode;

        /** The airline carrier code. */
        @SerializedName("carrier")
        String carrier;

        /** The three-letter IATA airport code that the flight departed from. */
        @SerializedName("departure_airport_code")
        String departureAirportCode;

        /** The flight number. */
        @SerializedName("flight_number")
        String flightNumber;

        /** The flight's service class. */
        @SerializedName("service_class")
        String serviceClass;

        /** Whether a stopover is allowed on this flight. */
        @SerializedName("stopover_allowed")
        Boolean stopoverAllowed;
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Fuel extends StripeObject {
      /**
       * The type of fuel that was purchased. One of {@code diesel}, {@code unleaded_plus}, {@code
       * unleaded_regular}, {@code unleaded_super}, or {@code other}.
       */
      @SerializedName("type")
      String type;

      /** The units for {@code volume_decimal}. One of {@code us_gallon} or {@code liter}. */
      @SerializedName("unit")
      String unit;

      /**
       * The cost in cents per each unit of fuel, represented as a decimal string with at most 12
       * decimal places.
       */
      @SerializedName("unit_cost_decimal")
      BigDecimal unitCostDecimal;

      /**
       * The volume of the fuel that was pumped, represented as a decimal string with at most 12
       * decimal places.
       */
      @SerializedName("volume_decimal")
      BigDecimal volumeDecimal;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Lodging extends StripeObject {
      /** The time of checking into the lodging. */
      @SerializedName("check_in_at")
      Long checkInAt;

      /** The number of nights stayed at the lodging. */
      @SerializedName("nights")
      Long nights;
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Receipt extends StripeObject {
      /** The description of the item. The maximum length of this field is 26 characters. */
      @SerializedName("description")
      String description;

      /** The quantity of the item. */
      @SerializedName("quantity")
      BigDecimal quantity;

      /** The total for this line item in cents. */
      @SerializedName("total")
      Long total;

      /** The unit cost of the item in cents. */
      @SerializedName("unit_cost")
      Long unitCost;
    }
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Treasury extends StripeObject {
    /**
     * The Treasury <a
     * href="https://stripe.com/docs/api/treasury/received_credits">ReceivedCredit</a> representing
     * this Issuing transaction if it is a refund
     */
    @SerializedName("received_credit")
    String receivedCredit;

    /**
     * The Treasury <a href="https://stripe.com/docs/api/treasury/received_debits">ReceivedDebit</a>
     * representing this Issuing transaction if it is a capture
     */
    @SerializedName("received_debit")
    String receivedDebit;
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final Transaction resource;

    private TestHelpers(Transaction resource) {
      this.resource = resource;
    }

    /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
    public static Transaction createForceCapture(Map<String, Object> params)
        throws StripeException {
      return createForceCapture(params, (RequestOptions) null);
    }

    /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
    public static Transaction createForceCapture(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/issuing/transactions/create_force_capture";
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              params,
              Transaction.class,
              options,
              ApiMode.V1);
    }

    /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
    public static Transaction createForceCapture(TransactionCreateForceCaptureParams params)
        throws StripeException {
      return createForceCapture(params, (RequestOptions) null);
    }

    /** Allows the user to capture an arbitrary amount, also known as a forced capture. */
    public static Transaction createForceCapture(
        TransactionCreateForceCaptureParams params, RequestOptions options) throws StripeException {
      String path = "/v1/test_helpers/issuing/transactions/create_force_capture";
      ApiResource.checkNullTypedParams(path, params);
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              Transaction.class,
              options,
              ApiMode.V1);
    }

    /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
    public static Transaction createUnlinkedRefund(Map<String, Object> params)
        throws StripeException {
      return createUnlinkedRefund(params, (RequestOptions) null);
    }

    /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
    public static Transaction createUnlinkedRefund(
        Map<String, Object> params, RequestOptions options) throws StripeException {
      String path = "/v1/test_helpers/issuing/transactions/create_unlinked_refund";
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              params,
              Transaction.class,
              options,
              ApiMode.V1);
    }

    /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
    public static Transaction createUnlinkedRefund(TransactionCreateUnlinkedRefundParams params)
        throws StripeException {
      return createUnlinkedRefund(params, (RequestOptions) null);
    }

    /** Allows the user to refund an arbitrary amount, also known as a unlinked refund. */
    public static Transaction createUnlinkedRefund(
        TransactionCreateUnlinkedRefundParams params, RequestOptions options)
        throws StripeException {
      String path = "/v1/test_helpers/issuing/transactions/create_unlinked_refund";
      ApiResource.checkNullTypedParams(path, params);
      return getGlobalResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              Transaction.class,
              options,
              ApiMode.V1);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund() throws StripeException {
      return refund((Map<String, Object>) null, (RequestOptions) null);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund(RequestOptions options) throws StripeException {
      return refund((Map<String, Object>) null, options);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund(Map<String, Object> params) throws StripeException {
      return refund(params, (RequestOptions) null);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/transactions/%s/refund",
              ApiResource.urlEncodeId(this.resource.getId()));
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              params,
              Transaction.class,
              options,
              ApiMode.V1);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund(TransactionRefundParams params) throws StripeException {
      return refund(params, (RequestOptions) null);
    }

    /** Refund a test-mode Transaction. */
    public Transaction refund(TransactionRefundParams params, RequestOptions options)
        throws StripeException {
      String path =
          String.format(
              "/v1/test_helpers/issuing/transactions/%s/refund",
              ApiResource.urlEncodeId(this.resource.getId()));
      ApiResource.checkNullTypedParams(path, params);
      return resource
          .getResponseGetter()
          .request(
              BaseAddress.API,
              ApiResource.RequestMethod.POST,
              path,
              ApiRequestParams.paramsToMap(params),
              Transaction.class,
              options,
              ApiMode.V1);
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amountDetails, responseGetter);
    trySetResponseGetter(authorization, responseGetter);
    trySetResponseGetter(balanceTransaction, responseGetter);
    trySetResponseGetter(card, responseGetter);
    trySetResponseGetter(cardholder, responseGetter);
    trySetResponseGetter(dispute, responseGetter);
    trySetResponseGetter(merchantData, responseGetter);
    trySetResponseGetter(purchaseDetails, responseGetter);
    trySetResponseGetter(token, responseGetter);
    trySetResponseGetter(treasury, responseGetter);
  }
}
