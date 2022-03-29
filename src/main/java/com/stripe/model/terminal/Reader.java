// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.PaymentIntent;
import com.stripe.model.SetupIntent;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.ReaderCancelActionParams;
import com.stripe.param.terminal.ReaderCreateParams;
import com.stripe.param.terminal.ReaderListParams;
import com.stripe.param.terminal.ReaderPresentPaymentMethodParams;
import com.stripe.param.terminal.ReaderProcessPaymentIntentParams;
import com.stripe.param.terminal.ReaderProcessSetupIntentParams;
import com.stripe.param.terminal.ReaderRetrieveParams;
import com.stripe.param.terminal.ReaderSetReaderDisplayParams;
import com.stripe.param.terminal.ReaderUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Reader extends ApiResource implements HasId, MetadataStore<Reader> {
  /** The most recent action performed by the reader. */
  @SerializedName("action")
  ReaderAction action;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** The current software version of the reader. */
  @SerializedName("device_sw_version")
  String deviceSwVersion;

  /**
   * Type of reader, one of {@code bbpos_wisepad3}, {@code stripe_m2}, {@code bbpos_chipper2x},
   * {@code bbpos_wisepos_e}, or {@code verifone_P400}.
   */
  @SerializedName("device_type")
  String deviceType;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The local IP address of the reader. */
  @SerializedName("ip_address")
  String ipAddress;

  /** Custom label given to the reader for easier identification. */
  @SerializedName("label")
  String label;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** The location identifier of the reader. */
  @SerializedName("location")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Location> location;

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
   * <p>Equal to {@code terminal.reader}.
   */
  @SerializedName("object")
  String object;

  /** Serial number of the reader. */
  @SerializedName("serial_number")
  String serialNumber;

  /** The networking status of the reader. */
  @SerializedName("status")
  String status;

  /** Get ID of expandable {@code location} object. */
  public String getLocation() {
    return (this.location != null) ? this.location.getId() : null;
  }

  public void setLocation(String id) {
    this.location = ApiResource.setExpandableFieldId(id, this.location);
  }

  /** Get expanded {@code location}. */
  public Location getLocationObject() {
    return (this.location != null) ? this.location.getExpanded() : null;
  }

  public void setLocationObject(Location expandableObject) {
    this.location = new ExpandableField<Location>(expandableObject.getId(), expandableObject);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  @Override
  public Reader update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  @Override
  public Reader update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(ReaderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a <code>Reader</code> object by setting the values of the parameters passed. Any
   * parameters not provided will be left unchanged.
   */
  public Reader update(ReaderUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader, RequestOptions options) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /** Retrieves a <code>Reader</code> object. */
  public static Reader retrieve(String reader, ReaderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(ReaderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new <code>Reader</code> object. */
  public static Reader create(ReaderCreateParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return ApiResource.requestCollection(url, params, ReaderCollection.class, options);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(ReaderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of <code>Reader</code> objects. */
  public static ReaderCollection list(ReaderListParams params, RequestOptions options)
      throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/terminal/readers");
    return ApiResource.requestCollection(url, params, ReaderCollection.class, options);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a <code>Reader</code> object. */
  public Reader delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Reader.class, options);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(Map<String, Object> params) throws StripeException {
    return processPaymentIntent(params, (RequestOptions) null);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/process_payment_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(ReaderProcessPaymentIntentParams params)
      throws StripeException {
    return processPaymentIntent(params, (RequestOptions) null);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(
      ReaderProcessPaymentIntentParams params, RequestOptions options) throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/process_payment_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(Map<String, Object> params) throws StripeException {
    return processSetupIntent(params, (RequestOptions) null);
  }

  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/process_setup_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(ReaderProcessSetupIntentParams params) throws StripeException {
    return processSetupIntent(params, (RequestOptions) null);
  }

  /** Initiates a setup intent flow on a Reader. */
  public Reader processSetupIntent(ReaderProcessSetupIntentParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/process_setup_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction() throws StripeException {
    return cancelAction((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction(RequestOptions options) throws StripeException {
    return cancelAction((Map<String, Object>) null, options);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction(Map<String, Object> params) throws StripeException {
    return cancelAction(params, (RequestOptions) null);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/cancel_action", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction(ReaderCancelActionParams params) throws StripeException {
    return cancelAction(params, (RequestOptions) null);
  }

  /** Cancels the current reader action. */
  public Reader cancelAction(ReaderCancelActionParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/cancel_action", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Sets reader display. */
  public Reader setReaderDisplay(Map<String, Object> params) throws StripeException {
    return setReaderDisplay(params, (RequestOptions) null);
  }

  /** Sets reader display. */
  public Reader setReaderDisplay(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/set_reader_display",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Sets reader display. */
  public Reader setReaderDisplay(ReaderSetReaderDisplayParams params) throws StripeException {
    return setReaderDisplay(params, (RequestOptions) null);
  }

  /** Sets reader display. */
  public Reader setReaderDisplay(ReaderSetReaderDisplayParams params, RequestOptions options)
      throws StripeException {
    String url =
        String.format(
            "%s%s",
            Stripe.getApiBase(),
            String.format(
                "/v1/terminal/readers/%s/set_reader_display",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReaderAction extends StripeObject {
    /** Failure code, only set if status is {@code failed}. */
    @SerializedName("failure_code")
    String failureCode;

    /** Detailed failure message, only set if status is {@code failed}. */
    @SerializedName("failure_message")
    String failureMessage;

    /** Represents a reader action to process a payment intent. */
    @SerializedName("process_payment_intent")
    ProcessPaymentIntentAction processPaymentIntent;

    /** Represents a reader action to process a setup intent. */
    @SerializedName("process_setup_intent")
    ProcessSetupIntentAction processSetupIntent;

    /** Represents a reader action to set the reader display. */
    @SerializedName("set_reader_display")
    SetReaderDisplayAction setReaderDisplay;

    /**
     * Status of the action performed by the reader.
     *
     * <p>One of {@code failed}, {@code in_progress}, or {@code succeeded}.
     */
    @SerializedName("status")
    String status;

    /**
     * Type of action performed by the reader.
     *
     * <p>One of {@code process_payment_intent}, {@code process_setup_intent}, or {@code
     * set_reader_display}.
     */
    @SerializedName("type")
    String type;

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProcessPaymentIntentAction extends StripeObject {
      /** Most recent PaymentIntent processed by the reader. */
      @SerializedName("payment_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentIntent> paymentIntent;

      /** Get ID of expandable {@code paymentIntent} object. */
      public String getPaymentIntent() {
        return (this.paymentIntent != null) ? this.paymentIntent.getId() : null;
      }

      public void setPaymentIntent(String id) {
        this.paymentIntent = ApiResource.setExpandableFieldId(id, this.paymentIntent);
      }

      /** Get expanded {@code paymentIntent}. */
      public PaymentIntent getPaymentIntentObject() {
        return (this.paymentIntent != null) ? this.paymentIntent.getExpanded() : null;
      }

      public void setPaymentIntentObject(PaymentIntent expandableObject) {
        this.paymentIntent =
            new ExpandableField<PaymentIntent>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProcessSetupIntentAction extends StripeObject {
      @SerializedName("generated_card")
      String generatedCard;

      /** Most recent SetupIntent processed by the reader. */
      @SerializedName("setup_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<SetupIntent> setupIntent;

      /** Get ID of expandable {@code setupIntent} object. */
      public String getSetupIntent() {
        return (this.setupIntent != null) ? this.setupIntent.getId() : null;
      }

      public void setSetupIntent(String id) {
        this.setupIntent = ApiResource.setExpandableFieldId(id, this.setupIntent);
      }

      /** Get expanded {@code setupIntent}. */
      public SetupIntent getSetupIntentObject() {
        return (this.setupIntent != null) ? this.setupIntent.getExpanded() : null;
      }

      public void setSetupIntentObject(SetupIntent expandableObject) {
        this.setupIntent =
            new ExpandableField<SetupIntent>(expandableObject.getId(), expandableObject);
      }
    }

    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SetReaderDisplayAction extends StripeObject {
      /** Cart object to be displayed by the reader. */
      @SerializedName("cart")
      Cart cart;

      /**
       * Type of information to be displayed by the reader.
       *
       * <p>Equal to {@code cart}.
       */
      @SerializedName("type")
      String type;

      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Cart extends StripeObject {
        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /** List of line items in the cart. */
        @SerializedName("line_items")
        List<Reader.ReaderAction.SetReaderDisplayAction.Cart.LineItem> lineItems;

        /**
         * Tax amount for the entire cart. A positive integer in the <a
         * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
         */
        @SerializedName("tax")
        Long tax;

        /**
         * Total amount for the entire cart, including tax. A positive integer in the <a
         * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
         */
        @SerializedName("total")
        Long total;

        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class LineItem extends StripeObject {
          /**
           * The amount of the line item. A positive integer in the <a
           * href="https://stripe.com/docs/currencies#zero-decimal">smallest currency unit</a>.
           */
          @SerializedName("amount")
          Long amount;

          /** Description of the line item. */
          @SerializedName("description")
          String description;

          /** The quantity of the line item. */
          @SerializedName("quantity")
          Long quantity;
        }
      }
    }
  }

  public TestHelpers getTestHelpers() {
    return new TestHelpers();
  }

  public class TestHelpers {
    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod() throws StripeException {
      return presentPaymentMethod((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod(RequestOptions options) throws StripeException {
      return presentPaymentMethod((Map<String, Object>) null, options);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod(Map<String, Object> params) throws StripeException {
      return presentPaymentMethod(params, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/terminal/readers/%s/present_payment_method",
                  ApiResource.urlEncodeId(Reader.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Reader.class, options);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod(ReaderPresentPaymentMethodParams params)
        throws StripeException {
      return presentPaymentMethod(params, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction
     */
    public Reader presentPaymentMethod(
        ReaderPresentPaymentMethodParams params, RequestOptions options) throws StripeException {
      String url =
          String.format(
              "%s%s",
              Stripe.getApiBase(),
              String.format(
                  "/v1/test_helpers/terminal/readers/%s/present_payment_method",
                  ApiResource.urlEncodeId(Reader.this.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Reader.class, options);
    }
  }
}
