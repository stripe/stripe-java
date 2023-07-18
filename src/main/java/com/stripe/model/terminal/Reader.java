// File generated from our OpenAPI spec
package com.stripe.model.terminal;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.Charge;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.model.MetadataStore;
import com.stripe.model.PaymentIntent;
import com.stripe.model.PaymentMethod;
import com.stripe.model.Refund;
import com.stripe.model.SetupIntent;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.terminal.ReaderCancelActionParams;
import com.stripe.param.terminal.ReaderCollectInputsParams;
import com.stripe.param.terminal.ReaderCollectPaymentMethodParams;
import com.stripe.param.terminal.ReaderConfirmPaymentIntentParams;
import com.stripe.param.terminal.ReaderCreateParams;
import com.stripe.param.terminal.ReaderListParams;
import com.stripe.param.terminal.ReaderPresentPaymentMethodParams;
import com.stripe.param.terminal.ReaderProcessPaymentIntentParams;
import com.stripe.param.terminal.ReaderProcessSetupIntentParams;
import com.stripe.param.terminal.ReaderRefundPaymentParams;
import com.stripe.param.terminal.ReaderRetrieveParams;
import com.stripe.param.terminal.ReaderSetReaderDisplayParams;
import com.stripe.param.terminal.ReaderUpdateParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A Reader represents a physical device for accepting payment details.
 *
 * <p>Related guide: <a href="https://stripe.com/docs/terminal/payments/connect-reader">Connecting
 * to a reader</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Reader extends ApiResource implements HasId, MetadataStore<Reader> {
  /** The most recent action performed by the reader. */
  @SerializedName("action")
  Action action;

  /** Always true for a deleted object. */
  @SerializedName("deleted")
  Boolean deleted;

  /** The current software version of the reader. */
  @SerializedName("device_sw_version")
  String deviceSwVersion;

  /**
   * Type of reader, one of {@code bbpos_wisepad3}, {@code stripe_m2}, {@code bbpos_chipper2x},
   * {@code bbpos_wisepos_e}, {@code verifone_P400}, or {@code simulated_wisepos_e}.
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
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
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
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/cancel_action", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates an input collection flow on a Reader. */
  public Reader collectInputs(Map<String, Object> params) throws StripeException {
    return collectInputs(params, (RequestOptions) null);
  }

  /** Initiates an input collection flow on a Reader. */
  public Reader collectInputs(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/collect_inputs", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates an input collection flow on a Reader. */
  public Reader collectInputs(ReaderCollectInputsParams params) throws StripeException {
    return collectInputs(params, (RequestOptions) null);
  }

  /** Initiates an input collection flow on a Reader. */
  public Reader collectInputs(ReaderCollectInputsParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/collect_inputs", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation.
   */
  public Reader collectPaymentMethod(Map<String, Object> params) throws StripeException {
    return collectPaymentMethod(params, (RequestOptions) null);
  }

  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation.
   */
  public Reader collectPaymentMethod(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/collect_payment_method",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation.
   */
  public Reader collectPaymentMethod(ReaderCollectPaymentMethodParams params)
      throws StripeException {
    return collectPaymentMethod(params, (RequestOptions) null);
  }

  /**
   * Initiates a payment flow on a Reader and updates the PaymentIntent with card details before
   * manual confirmation.
   */
  public Reader collectPaymentMethod(
      ReaderCollectPaymentMethodParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/collect_payment_method",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Finalizes a payment on a Reader. */
  public Reader confirmPaymentIntent(Map<String, Object> params) throws StripeException {
    return confirmPaymentIntent(params, (RequestOptions) null);
  }

  /** Finalizes a payment on a Reader. */
  public Reader confirmPaymentIntent(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/confirm_payment_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Finalizes a payment on a Reader. */
  public Reader confirmPaymentIntent(ReaderConfirmPaymentIntentParams params)
      throws StripeException {
    return confirmPaymentIntent(params, (RequestOptions) null);
  }

  /** Finalizes a payment on a Reader. */
  public Reader confirmPaymentIntent(
      ReaderConfirmPaymentIntentParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/confirm_payment_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Creates a new {@code Reader} object. */
  public static Reader create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code Reader} object. */
  public static Reader create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/readers");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Creates a new {@code Reader} object. */
  public static Reader create(ReaderCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a new {@code Reader} object. */
  public static Reader create(ReaderCreateParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/readers");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete() throws StripeException {
    return delete((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete(RequestOptions options) throws StripeException {
    return delete((Map<String, Object>) null, options);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete(Map<String, Object> params) throws StripeException {
    return delete(params, (RequestOptions) null);
  }

  /** Deletes a {@code Reader} object. */
  public Reader delete(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(
        ApiResource.RequestMethod.DELETE, url, params, Reader.class, options);
  }

  /** Returns a list of {@code Reader} objects. */
  public static ReaderCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Reader} objects. */
  public static ReaderCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/readers");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReaderCollection.class, options);
  }

  /** Returns a list of {@code Reader} objects. */
  public static ReaderCollection list(ReaderListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of {@code Reader} objects. */
  public static ReaderCollection list(ReaderListParams params, RequestOptions options)
      throws StripeException {
    String url = ApiResource.fullUrl(Stripe.getApiBase(), options, "/v1/terminal/readers");
    return ApiResource.request(
        ApiResource.RequestMethod.GET, url, params, ReaderCollection.class, options);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(Map<String, Object> params) throws StripeException {
    return processPaymentIntent(params, (RequestOptions) null);
  }

  /** Initiates a payment flow on a Reader. */
  public Reader processPaymentIntent(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
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
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
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
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
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
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/process_setup_intent",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment() throws StripeException {
    return refundPayment((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment(RequestOptions options) throws StripeException {
    return refundPayment((Map<String, Object>) null, options);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment(Map<String, Object> params) throws StripeException {
    return refundPayment(params, (RequestOptions) null);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/refund_payment", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment(ReaderRefundPaymentParams params) throws StripeException {
    return refundPayment(params, (RequestOptions) null);
  }

  /** Initiates a refund on a Reader. */
  public Reader refundPayment(ReaderRefundPaymentParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/refund_payment", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Retrieves a {@code Reader} object. */
  public static Reader retrieve(String reader) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a {@code Reader} object. */
  public static Reader retrieve(String reader, RequestOptions options) throws StripeException {
    return retrieve(reader, (Map<String, Object>) null, options);
  }

  /** Retrieves a {@code Reader} object. */
  public static Reader retrieve(String reader, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /** Retrieves a {@code Reader} object. */
  public static Reader retrieve(String reader, ReaderRetrieveParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(reader)));
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Reader.class, options);
  }

  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(Map<String, Object> params) throws StripeException {
    return setReaderDisplay(params, (RequestOptions) null);
  }

  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/set_reader_display",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(ReaderSetReaderDisplayParams params) throws StripeException {
    return setReaderDisplay(params, (RequestOptions) null);
  }

  /** Sets reader display to show cart details. */
  public Reader setReaderDisplay(ReaderSetReaderDisplayParams params, RequestOptions options)
      throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format(
                "/v1/terminal/readers/%s/set_reader_display",
                ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  @Override
  public Reader update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  @Override
  public Reader update(Map<String, Object> params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(ReaderUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /**
   * Updates a {@code Reader} object by setting the values of the parameters passed. Any parameters
   * not provided will be left unchanged.
   */
  public Reader update(ReaderUpdateParams params, RequestOptions options) throws StripeException {
    String url =
        ApiResource.fullUrl(
            Stripe.getApiBase(),
            options,
            String.format("/v1/terminal/readers/%s", ApiResource.urlEncodeId(this.getId())));
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Reader.class, options);
  }

  /** Represents an action performed by the reader. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Action extends StripeObject {
    /** Represents a reader action to collect customer inputs. */
    @SerializedName("collect_inputs")
    CollectInputs collectInputs;

    /** Represents a reader action to collect a payment method. */
    @SerializedName("collect_payment_method")
    CollectPaymentMethod collectPaymentMethod;

    /** Represents a reader action to confirm a payment. */
    @SerializedName("confirm_payment_intent")
    ConfirmPaymentIntent confirmPaymentIntent;

    /** Failure code, only set if status is {@code failed}. */
    @SerializedName("failure_code")
    String failureCode;

    /** Detailed failure message, only set if status is {@code failed}. */
    @SerializedName("failure_message")
    String failureMessage;

    /** Represents a reader action to process a payment intent. */
    @SerializedName("process_payment_intent")
    ProcessPaymentIntent processPaymentIntent;

    /** Represents a reader action to process a setup intent. */
    @SerializedName("process_setup_intent")
    ProcessSetupIntent processSetupIntent;

    /** Represents a reader action to refund a payment. */
    @SerializedName("refund_payment")
    RefundPayment refundPayment;

    /** Represents a reader action to set the reader display. */
    @SerializedName("set_reader_display")
    SetReaderDisplay setReaderDisplay;

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
     * <p>One of {@code collect_inputs}, {@code collect_payment_method}, {@code
     * confirm_payment_intent}, {@code process_payment_intent}, {@code process_setup_intent}, {@code
     * refund_payment}, or {@code set_reader_display}.
     */
    @SerializedName("type")
    String type;

    /** Represents a reader action to collect customer inputs. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CollectInputs extends StripeObject {
      /** List of inputs to be collected. */
      @SerializedName("inputs")
      List<Reader.Action.CollectInputs.Input> inputs;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** Represents an input to be collected using the reader. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Input extends StripeObject {
        @SerializedName("custom_text")
        CustomText customText;

        @SerializedName("required")
        Boolean required;

        /** Information about a selection being collected using a reader. */
        @SerializedName("selection")
        Selection selection;

        /** Information about a signature being collected using a reader. */
        @SerializedName("signature")
        Signature signature;

        @SerializedName("skipped")
        Boolean skipped;

        /**
         * Which supported input type will be collected.
         *
         * <p>One of {@code email}, {@code numeric}, {@code phone}, {@code selection}, {@code
         * signature}, or {@code text}.
         */
        @SerializedName("type")
        String type;

        /** Represents custom text to be displayed when collecting the input using a reader. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class CustomText extends StripeObject {
          /** Customize the default description for this input. */
          @SerializedName("description")
          String description;

          /** Customize the default label for this input's skip button. */
          @SerializedName("skip_button")
          String skipButton;

          /** Customize the default label for this input's submit button. */
          @SerializedName("submit_button")
          String submitButton;

          /** Customize the default title for this input. */
          @SerializedName("title")
          String title;
        }

        /** Information about a selection being collected using a reader. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Selection extends StripeObject {
          /** List of possible choices to be selected. */
          @SerializedName("choices")
          List<Reader.Action.CollectInputs.Input.Selection.Choice> choices;

          /** The value of the selected choice. */
          @SerializedName("value")
          String value;

          /** Choice to be selected on a Reader. */
          @Getter
          @Setter
          @EqualsAndHashCode(callSuper = false)
          public static class Choice extends StripeObject {
            /**
             * The button style for the choice
             *
             * <p>One of {@code primary}, or {@code secondary}.
             */
            @SerializedName("style")
            String style;

            /** A value to be selected. */
            @SerializedName("value")
            String value;
          }
        }

        /** Information about a signature being collected using a reader. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Signature extends StripeObject {
          /** The File ID of a collected signature image. */
          @SerializedName("value")
          String value;
        }
      }
    }

    /** Represents a reader action to collect a payment method. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CollectPaymentMethod extends StripeObject {
      /** Represents a per-transaction override of a reader configuration. */
      @SerializedName("collect_config")
      CollectConfig collectConfig;

      /** Most recent PaymentIntent processed by the reader. */
      @SerializedName("payment_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentIntent> paymentIntent;

      /**
       * PaymentMethod objects represent your customer's payment instruments. You can use them with
       * <a href="https://stripe.com/docs/payments/payment-intents">PaymentIntents</a> to collect
       * payments or save them to Customer objects to store instrument details for future payments.
       *
       * <p>Related guides: <a href="https://stripe.com/docs/payments/payment-methods">Payment
       * Methods</a> and <a href="https://stripe.com/docs/payments/more-payment-scenarios">More
       * Payment Scenarios</a>.
       */
      @SerializedName("payment_method")
      PaymentMethod paymentMethod;

      @SerializedName("stripe_account")
      String stripeAccount;

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

      /** Represents a per-transaction override of a reader configuration. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class CollectConfig extends StripeObject {
        /** Override showing a tipping selection screen on this transaction. */
        @SerializedName("skip_tipping")
        Boolean skipTipping;

        /** Represents a per-transaction tipping configuration. */
        @SerializedName("tipping")
        Tipping tipping;

        /** Represents a per-transaction tipping configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Tipping extends StripeObject {
          /**
           * Amount used to calculate tip suggestions on tipping selection screen for this
           * transaction. Must be a positive integer in the smallest currency unit (e.g., 100 cents
           * to represent $1.00 or 100 to represent ¥100, a zero-decimal currency).
           */
          @SerializedName("amount_eligible")
          Long amountEligible;
        }
      }
    }

    /** Represents a reader action to confirm a payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ConfirmPaymentIntent extends StripeObject {
      /** Most recent PaymentIntent processed by the reader. */
      @SerializedName("payment_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentIntent> paymentIntent;

      @SerializedName("stripe_account")
      String stripeAccount;

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

    /** Represents a reader action to process a payment intent. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProcessPaymentIntent extends StripeObject {
      /** Most recent PaymentIntent processed by the reader. */
      @SerializedName("payment_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentIntent> paymentIntent;

      /** Represents a per-transaction override of a reader configuration. */
      @SerializedName("process_config")
      ProcessConfig processConfig;

      @SerializedName("stripe_account")
      String stripeAccount;

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

      /** Represents a per-transaction override of a reader configuration. */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class ProcessConfig extends StripeObject {
        /** Override showing a tipping selection screen on this transaction. */
        @SerializedName("skip_tipping")
        Boolean skipTipping;

        /** Represents a per-transaction tipping configuration. */
        @SerializedName("tipping")
        Tipping tipping;

        /** Represents a per-transaction tipping configuration. */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Tipping extends StripeObject {
          /**
           * Amount used to calculate tip suggestions on tipping selection screen for this
           * transaction. Must be a positive integer in the smallest currency unit (e.g., 100 cents
           * to represent $1.00 or 100 to represent ¥100, a zero-decimal currency).
           */
          @SerializedName("amount_eligible")
          Long amountEligible;
        }
      }
    }

    /** Represents a reader action to process a setup intent. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ProcessSetupIntent extends StripeObject {
      /**
       * ID of a card PaymentMethod generated from the card_present PaymentMethod that may be
       * attached to a Customer for future transactions. Only present if it was possible to generate
       * a card PaymentMethod.
       */
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

    /** Represents a reader action to refund a payment. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RefundPayment extends StripeObject {
      /** The amount being refunded. */
      @SerializedName("amount")
      Long amount;

      /** Charge that is being refunded. */
      @SerializedName("charge")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Charge> charge;

      /**
       * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can
       * attach to an object. This can be useful for storing additional information about the object
       * in a structured format.
       */
      @SerializedName("metadata")
      Map<String, String> metadata;

      /** Payment intent that is being refunded. */
      @SerializedName("payment_intent")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<PaymentIntent> paymentIntent;

      /**
       * The reason for the refund.
       *
       * <p>One of {@code duplicate}, {@code fraudulent}, or {@code requested_by_customer}.
       */
      @SerializedName("reason")
      String reason;

      /** Unique identifier for the refund object. */
      @SerializedName("refund")
      @Getter(lombok.AccessLevel.NONE)
      @Setter(lombok.AccessLevel.NONE)
      ExpandableField<Refund> refund;

      /**
       * Boolean indicating whether the application fee should be refunded when refunding this
       * charge. If a full charge refund is given, the full application fee will be refunded.
       * Otherwise, the application fee will be refunded in an amount proportional to the amount of
       * the charge refunded. An application fee can be refunded only by the application that
       * created the charge.
       */
      @SerializedName("refund_application_fee")
      Boolean refundApplicationFee;

      /**
       * Boolean indicating whether the transfer should be reversed when refunding this charge. The
       * transfer will be reversed proportionally to the amount being refunded (either the entire or
       * partial amount). A transfer can be reversed only by the application that created the
       * charge.
       */
      @SerializedName("reverse_transfer")
      Boolean reverseTransfer;

      @SerializedName("stripe_account")
      String stripeAccount;

      /** Get ID of expandable {@code charge} object. */
      public String getCharge() {
        return (this.charge != null) ? this.charge.getId() : null;
      }

      public void setCharge(String id) {
        this.charge = ApiResource.setExpandableFieldId(id, this.charge);
      }

      /** Get expanded {@code charge}. */
      public Charge getChargeObject() {
        return (this.charge != null) ? this.charge.getExpanded() : null;
      }

      public void setChargeObject(Charge expandableObject) {
        this.charge = new ExpandableField<Charge>(expandableObject.getId(), expandableObject);
      }

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

      /** Get ID of expandable {@code refund} object. */
      public String getRefund() {
        return (this.refund != null) ? this.refund.getId() : null;
      }

      public void setRefund(String id) {
        this.refund = ApiResource.setExpandableFieldId(id, this.refund);
      }

      /** Get expanded {@code refund}. */
      public Refund getRefundObject() {
        return (this.refund != null) ? this.refund.getExpanded() : null;
      }

      public void setRefundObject(Refund expandableObject) {
        this.refund = new ExpandableField<Refund>(expandableObject.getId(), expandableObject);
      }
    }

    /** Represents a reader action to set the reader display. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SetReaderDisplay extends StripeObject {
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

      /** Represents a cart to be displayed on the reader. */
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
        List<Reader.Action.SetReaderDisplay.Cart.LineItem> lineItems;

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

        /** Represents a line item to be displayed on the reader. */
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
    return new TestHelpers(this);
  }

  public static class TestHelpers {
    private final Reader resource;

    private TestHelpers(Reader resource) {
      this.resource = resource;
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod() throws StripeException {
      return presentPaymentMethod((Map<String, Object>) null, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod(RequestOptions options) throws StripeException {
      return presentPaymentMethod((Map<String, Object>) null, options);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod(Map<String, Object> params) throws StripeException {
      return presentPaymentMethod(params, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod(Map<String, Object> params, RequestOptions options)
        throws StripeException {
      String url =
          ApiResource.fullUrl(
              Stripe.getApiBase(),
              options,
              String.format(
                  "/v1/test_helpers/terminal/readers/%s/present_payment_method",
                  ApiResource.urlEncodeId(this.resource.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Reader.class, options);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod(ReaderPresentPaymentMethodParams params)
        throws StripeException {
      return presentPaymentMethod(params, (RequestOptions) null);
    }

    /**
     * Presents a payment method on a simulated reader. Can be used to simulate accepting a payment,
     * saving a card or refunding a transaction.
     */
    public Reader presentPaymentMethod(
        ReaderPresentPaymentMethodParams params, RequestOptions options) throws StripeException {
      String url =
          ApiResource.fullUrl(
              Stripe.getApiBase(),
              options,
              String.format(
                  "/v1/test_helpers/terminal/readers/%s/present_payment_method",
                  ApiResource.urlEncodeId(this.resource.getId())));
      return ApiResource.request(
          ApiResource.RequestMethod.POST, url, params, Reader.class, options);
    }
  }
}
