// File generated from our OpenAPI spec
package com.stripe.model;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.SetupIntentCancelParams;
import com.stripe.param.SetupIntentConfirmParams;
import com.stripe.param.SetupIntentCreateParams;
import com.stripe.param.SetupIntentListParams;
import com.stripe.param.SetupIntentRetrieveParams;
import com.stripe.param.SetupIntentUpdateParams;
import com.stripe.param.SetupIntentVerifyMicrodepositsParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A SetupIntent guides you through the process of setting up and saving a customer's payment
 * credentials for future payments. For example, you can use a SetupIntent to set up and save your
 * customer's card without immediately collecting a payment. Later, you can use <a
 * href="https://stripe.com/docs/api#payment_intents">PaymentIntents</a> to drive the payment flow.
 *
 * <p>Create a SetupIntent when you're ready to collect your customer's payment credentials. Don't
 * maintain long-lived, unconfirmed SetupIntents because they might not be valid. The SetupIntent
 * transitions through multiple <a
 * href="https://docs.stripe.com/payments/intents#intent-statuses">statuses</a> as it guides you
 * through the setup process.
 *
 * <p>Successful SetupIntents result in payment credentials that are optimized for future payments.
 * For example, cardholders in <a
 * href="https://stripe.com/guides/strong-customer-authentication">certain regions</a> might need to
 * be run through <a href="https://docs.stripe.com/strong-customer-authentication">Strong Customer
 * Authentication</a> during payment method collection to streamline later <a
 * href="https://docs.stripe.com/payments/setup-intents">off-session payments</a>. If you use the
 * SetupIntent with a <a
 * href="https://stripe.com/docs/api#setup_intent_object-customer">Customer</a>, it automatically
 * attaches the resulting payment method to that Customer after successful setup. We recommend using
 * SetupIntents or <a
 * href="https://stripe.com/docs/api#payment_intent_object-setup_future_usage">setup_future_usage</a>
 * on PaymentIntents to save payment methods to prevent saving invalid or unoptimized payment
 * methods.
 *
 * <p>By using SetupIntents, you can reduce friction for your customers, even as regulations change
 * over time.
 *
 * <p>Related guide: <a href="https://docs.stripe.com/payments/setup-intents">Setup Intents API</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class SetupIntent extends ApiResource implements HasId, MetadataStore<SetupIntent> {
  /** ID of the Connect application that created the SetupIntent. */
  @SerializedName("application")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Application> application;

  /**
   * If present, the SetupIntent's payment method will be attached to the in-context Stripe Account.
   *
   * <p>It can only be used for this Stripe Account’s own money movement flows like InboundTransfer
   * and OutboundTransfers. It cannot be set to true when setting up a PaymentMethod for a Customer,
   * and defaults to false when attaching a PaymentMethod to a Customer.
   */
  @SerializedName("attach_to_self")
  Boolean attachToSelf;

  /** Settings for dynamic payment methods compatible with this Setup Intent. */
  @SerializedName("automatic_payment_methods")
  AutomaticPaymentMethods automaticPaymentMethods;

  /**
   * Reason for cancellation of this SetupIntent, one of {@code abandoned}, {@code
   * requested_by_customer}, or {@code duplicate}.
   */
  @SerializedName("cancellation_reason")
  String cancellationReason;

  /**
   * The client secret of this SetupIntent. Used for client-side retrieval using a publishable key.
   *
   * <p>The client secret can be used to complete payment setup from your frontend. It should not be
   * stored, logged, or exposed to anyone other than the customer. Make sure that you have TLS
   * enabled on any page that includes the client secret.
   */
  @SerializedName("client_secret")
  String clientSecret;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /**
   * ID of the Customer this SetupIntent belongs to, if one exists.
   *
   * <p>If present, the SetupIntent's payment method will be attached to the Customer on successful
   * setup. Payment methods attached to other Customers cannot be used with this SetupIntent.
   */
  @SerializedName("customer")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Customer> customer;

  /** An arbitrary string attached to the object. Often useful for displaying to users. */
  @SerializedName("description")
  String description;

  /**
   * Indicates the directions of money movement for which this payment method is intended to be
   * used.
   *
   * <p>Include {@code inbound} if you intend to use the payment method as the origin to pull funds
   * from. Include {@code outbound} if you intend to use the payment method as the destination to
   * send funds to. You can include both if you intend to use the payment method for both purposes.
   */
  @SerializedName("flow_directions")
  List<String> flowDirections;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** The error encountered in the previous SetupIntent confirmation. */
  @SerializedName("last_setup_error")
  StripeError lastSetupError;

  /** The most recent SetupAttempt for this SetupIntent. */
  @SerializedName("latest_attempt")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<SetupAttempt> latestAttempt;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** ID of the multi use Mandate generated by the SetupIntent. */
  @SerializedName("mandate")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Mandate> mandate;

  /**
   * Set of <a href="https://stripe.com/docs/api/metadata">key-value pairs</a> that you can attach
   * to an object. This can be useful for storing additional information about the object in a
   * structured format.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * If present, this property tells you what actions you need to take in order for your customer to
   * continue payment setup.
   */
  @SerializedName("next_action")
  NextAction nextAction;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code setup_intent}.
   */
  @SerializedName("object")
  String object;

  /** The account (if any) for which the setup is intended. */
  @SerializedName("on_behalf_of")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Account> onBehalfOf;

  /**
   * ID of the payment method used with this SetupIntent. If the payment method is {@code
   * card_present} and isn't a digital wallet, then the <a
   * href="https://docs.stripe.com/api/setup_attempts/object#setup_attempt_object-payment_method_details-card_present-generated_card">generated_card</a>
   * associated with the {@code latest_attempt} is attached to the Customer instead.
   */
  @SerializedName("payment_method")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<PaymentMethod> paymentMethod;

  /** Information about the payment method configuration used for this Setup Intent. */
  @SerializedName("payment_method_configuration_details")
  PaymentMethodConfigurationDetails paymentMethodConfigurationDetails;

  /** Payment method-specific configuration for this SetupIntent. */
  @SerializedName("payment_method_options")
  PaymentMethodOptions paymentMethodOptions;

  /** The list of payment method types (e.g. card) that this SetupIntent is allowed to set up. */
  @SerializedName("payment_method_types")
  List<String> paymentMethodTypes;

  /** ID of the single_use Mandate generated by the SetupIntent. */
  @SerializedName("single_use_mandate")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<Mandate> singleUseMandate;

  /**
   * <a href="https://stripe.com/docs/payments/intents#intent-statuses">Status</a> of this
   * SetupIntent, one of {@code requires_payment_method}, {@code requires_confirmation}, {@code
   * requires_action}, {@code processing}, {@code canceled}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * Indicates how the payment method is intended to be used in the future.
   *
   * <p>Use {@code on_session} if you intend to only reuse the payment method when the customer is
   * in your checkout flow. Use {@code off_session} if your customer may or may not be in your
   * checkout flow. If not provided, this value defaults to {@code off_session}.
   */
  @SerializedName("usage")
  String usage;

  /** Get ID of expandable {@code application} object. */
  public String getApplication() {
    return (this.application != null) ? this.application.getId() : null;
  }

  public void setApplication(String id) {
    this.application = ApiResource.setExpandableFieldId(id, this.application);
  }

  /** Get expanded {@code application}. */
  public Application getApplicationObject() {
    return (this.application != null) ? this.application.getExpanded() : null;
  }

  public void setApplicationObject(Application expandableObject) {
    this.application = new ExpandableField<Application>(expandableObject.getId(), expandableObject);
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

  /** Get ID of expandable {@code latestAttempt} object. */
  public String getLatestAttempt() {
    return (this.latestAttempt != null) ? this.latestAttempt.getId() : null;
  }

  public void setLatestAttempt(String id) {
    this.latestAttempt = ApiResource.setExpandableFieldId(id, this.latestAttempt);
  }

  /** Get expanded {@code latestAttempt}. */
  public SetupAttempt getLatestAttemptObject() {
    return (this.latestAttempt != null) ? this.latestAttempt.getExpanded() : null;
  }

  public void setLatestAttemptObject(SetupAttempt expandableObject) {
    this.latestAttempt =
        new ExpandableField<SetupAttempt>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code mandate} object. */
  public String getMandate() {
    return (this.mandate != null) ? this.mandate.getId() : null;
  }

  public void setMandate(String id) {
    this.mandate = ApiResource.setExpandableFieldId(id, this.mandate);
  }

  /** Get expanded {@code mandate}. */
  public Mandate getMandateObject() {
    return (this.mandate != null) ? this.mandate.getExpanded() : null;
  }

  public void setMandateObject(Mandate expandableObject) {
    this.mandate = new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code onBehalfOf} object. */
  public String getOnBehalfOf() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getId() : null;
  }

  public void setOnBehalfOf(String id) {
    this.onBehalfOf = ApiResource.setExpandableFieldId(id, this.onBehalfOf);
  }

  /** Get expanded {@code onBehalfOf}. */
  public Account getOnBehalfOfObject() {
    return (this.onBehalfOf != null) ? this.onBehalfOf.getExpanded() : null;
  }

  public void setOnBehalfOfObject(Account expandableObject) {
    this.onBehalfOf = new ExpandableField<Account>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code paymentMethod} object. */
  public String getPaymentMethod() {
    return (this.paymentMethod != null) ? this.paymentMethod.getId() : null;
  }

  public void setPaymentMethod(String id) {
    this.paymentMethod = ApiResource.setExpandableFieldId(id, this.paymentMethod);
  }

  /** Get expanded {@code paymentMethod}. */
  public PaymentMethod getPaymentMethodObject() {
    return (this.paymentMethod != null) ? this.paymentMethod.getExpanded() : null;
  }

  public void setPaymentMethodObject(PaymentMethod expandableObject) {
    this.paymentMethod =
        new ExpandableField<PaymentMethod>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code singleUseMandate} object. */
  public String getSingleUseMandate() {
    return (this.singleUseMandate != null) ? this.singleUseMandate.getId() : null;
  }

  public void setSingleUseMandate(String id) {
    this.singleUseMandate = ApiResource.setExpandableFieldId(id, this.singleUseMandate);
  }

  /** Get expanded {@code singleUseMandate}. */
  public Mandate getSingleUseMandateObject() {
    return (this.singleUseMandate != null) ? this.singleUseMandate.getExpanded() : null;
  }

  public void setSingleUseMandateObject(Mandate expandableObject) {
    this.singleUseMandate =
        new ExpandableField<Mandate>(expandableObject.getId(), expandableObject);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel() throws StripeException {
    return cancel((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel(RequestOptions options) throws StripeException {
    return cancel((Map<String, Object>) null, options);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel(Map<String, Object> params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/setup_intents/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel(SetupIntentCancelParams params) throws StripeException {
    return cancel(params, (RequestOptions) null);
  }

  /**
   * You can cancel a SetupIntent object when it’s in one of these statuses: {@code
   * requires_payment_method}, {@code requires_confirmation}, or {@code requires_action}.
   *
   * <p>After you cancel it, setup is abandoned and any operations on the SetupIntent fail with an
   * error. You can’t cancel the SetupIntent for a Checkout Session. <a
   * href="https://stripe.com/docs/api/checkout/sessions/expire">Expire the Checkout Session</a>
   * instead.
   */
  public SetupIntent cancel(SetupIntentCancelParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/setup_intents/%s/cancel", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm() throws StripeException {
    return confirm((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(RequestOptions options) throws StripeException {
    return confirm((Map<String, Object>) null, options);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(Map<String, Object> params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/setup_intents/%s/confirm", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(SetupIntentConfirmParams params) throws StripeException {
    return confirm(params, (RequestOptions) null);
  }

  /**
   * Confirm that your customer intends to set up the current or provided payment method. For
   * example, you would confirm a SetupIntent when a customer hits the “Save” button on a payment
   * method management page on your website.
   *
   * <p>If the selected payment method does not require any additional steps from the customer, the
   * SetupIntent will transition to the {@code succeeded} status.
   *
   * <p>Otherwise, it will transition to the {@code requires_action} status and suggest additional
   * actions via {@code next_action}. If setup fails, the SetupIntent will transition to the {@code
   * requires_payment_method} status or the {@code canceled} status if the confirmation limit is
   * reached.
   */
  public SetupIntent confirm(SetupIntentConfirmParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/setup_intents/%s/confirm", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public static SetupIntent create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public static SetupIntent create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public static SetupIntent create(SetupIntentCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a SetupIntent object.
   *
   * <p>After you create the SetupIntent, attach a payment method and <a
   * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> it to collect any required
   * permissions to charge the payment method later.
   */
  public static SetupIntent create(SetupIntentCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SetupIntent.class);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SetupIntentCollection.class);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(SetupIntentListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of SetupIntents. */
  public static SetupIntentCollection list(SetupIntentListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/setup_intents";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SetupIntentCollection.class);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public static SetupIntent retrieve(String intent) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public static SetupIntent retrieve(String intent, RequestOptions options) throws StripeException {
    return retrieve(intent, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public static SetupIntent retrieve(
      String intent, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * Retrieves the details of a SetupIntent that has previously been created.
   *
   * <p>Client-side retrieval using a publishable key is allowed when the {@code client_secret} is
   * provided in the query string.
   *
   * <p>When retrieved with a publishable key, only a subset of properties will be returned. Please
   * refer to the <a href="https://stripe.com/docs/api#setup_intent_object">SetupIntent</a> object
   * reference for more details.
   */
  public static SetupIntent retrieve(
      String intent, SetupIntentRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(intent));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, SetupIntent.class);
  }

  /** Updates a SetupIntent object. */
  @Override
  public SetupIntent update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a SetupIntent object. */
  @Override
  public SetupIntent update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /** Updates a SetupIntent object. */
  public SetupIntent update(SetupIntentUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates a SetupIntent object. */
  public SetupIntent update(SetupIntentUpdateParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/setup_intents/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits() throws StripeException {
    return verifyMicrodeposits((Map<String, Object>) null, (RequestOptions) null);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(RequestOptions options) throws StripeException {
    return verifyMicrodeposits((Map<String, Object>) null, options);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(Map<String, Object> params) throws StripeException {
    return verifyMicrodeposits(params, (RequestOptions) null);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/setup_intents/%s/verify_microdeposits", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(SetupIntentVerifyMicrodepositsParams params)
      throws StripeException {
    return verifyMicrodeposits(params, (RequestOptions) null);
  }

  /** Verifies microdeposits on a SetupIntent object. */
  public SetupIntent verifyMicrodeposits(
      SetupIntentVerifyMicrodepositsParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/setup_intents/%s/verify_microdeposits", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, SetupIntent.class);
  }

  /**
   * For more details about AutomaticPaymentMethods, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AutomaticPaymentMethods extends StripeObject {
    /**
     * Controls whether this SetupIntent will accept redirect-based payment methods.
     *
     * <p>Redirect-based payment methods may require your customer to be redirected to a payment
     * method's app or site for authentication or additional steps. To <a
     * href="https://stripe.com/docs/api/setup_intents/confirm">confirm</a> this SetupIntent, you
     * may be required to provide a {@code return_url} to redirect customers back to your site after
     * they authenticate or complete the setup.
     *
     * <p>One of {@code always}, or {@code never}.
     */
    @SerializedName("allow_redirects")
    String allowRedirects;

    /** Automatically calculates compatible payment methods. */
    @SerializedName("enabled")
    Boolean enabled;
  }

  /**
   * For more details about NextAction, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class NextAction extends StripeObject {
    @SerializedName("cashapp_handle_redirect_or_display_qr_code")
    CashappHandleRedirectOrDisplayQrCode cashappHandleRedirectOrDisplayQrCode;

    @SerializedName("redirect_to_url")
    RedirectToUrl redirectToUrl;

    /**
     * Type of the next action to perform, one of {@code redirect_to_url}, {@code use_stripe_sdk},
     * {@code alipay_handle_redirect}, {@code oxxo_display_details}, or {@code
     * verify_with_microdeposits}.
     */
    @SerializedName("type")
    String type;

    /**
     * When confirming a SetupIntent with Stripe.js, Stripe.js depends on the contents of this
     * dictionary to invoke authentication flows. The shape of the contents is subject to change and
     * is only intended to be used by Stripe.js.
     */
    @SerializedName("use_stripe_sdk")
    Map<String, Object> useStripeSdk;

    @SerializedName("verify_with_microdeposits")
    VerifyWithMicrodeposits verifyWithMicrodeposits;

    /**
     * For more details about CashappHandleRedirectOrDisplayQrCode, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CashappHandleRedirectOrDisplayQrCode extends StripeObject {
      /**
       * The URL to the hosted Cash App Pay instructions page, which allows customers to view the QR
       * code, and supports QR code refreshing on expiration.
       */
      @SerializedName("hosted_instructions_url")
      String hostedInstructionsUrl;

      /** The url for mobile redirect based auth. */
      @SerializedName("mobile_auth_url")
      String mobileAuthUrl;

      @SerializedName("qr_code")
      QrCode qrCode;

      /**
       * For more details about QrCode, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class QrCode extends StripeObject {
        /** The date (unix timestamp) when the QR code expires. */
        @SerializedName("expires_at")
        Long expiresAt;

        /** The image_url_png string used to render QR code. */
        @SerializedName("image_url_png")
        String imageUrlPng;

        /** The image_url_svg string used to render QR code. */
        @SerializedName("image_url_svg")
        String imageUrlSvg;
      }
    }

    /**
     * For more details about RedirectToUrl, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class RedirectToUrl extends StripeObject {
      /**
       * If the customer does not exit their browser while authenticating, they will be redirected
       * to this specified URL after completion.
       */
      @SerializedName("return_url")
      String returnUrl;

      /** The URL you must redirect your customer to in order to authenticate. */
      @SerializedName("url")
      String url;
    }

    /**
     * For more details about VerifyWithMicrodeposits, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class VerifyWithMicrodeposits extends StripeObject {
      /** The timestamp when the microdeposits are expected to land. */
      @SerializedName("arrival_date")
      Long arrivalDate;

      /**
       * The URL for the hosted verification page, which allows customers to verify their bank
       * account.
       */
      @SerializedName("hosted_verification_url")
      String hostedVerificationUrl;

      /**
       * The type of the microdeposit sent to the customer. Used to distinguish between different
       * verification methods.
       *
       * <p>One of {@code amounts}, or {@code descriptor_code}.
       */
      @SerializedName("microdeposit_type")
      String microdepositType;
    }
  }

  /**
   * For more details about PaymentMethodConfigurationDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodConfigurationDetails extends StripeObject implements HasId {
    /** ID of the payment method configuration used. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /** ID of the parent payment method configuration used. */
    @SerializedName("parent")
    String parent;
  }

  /**
   * For more details about PaymentMethodOptions, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PaymentMethodOptions extends StripeObject {
    @SerializedName("acss_debit")
    AcssDebit acssDebit;

    @SerializedName("amazon_pay")
    AmazonPay amazonPay;

    @SerializedName("bacs_debit")
    BacsDebit bacsDebit;

    @SerializedName("card")
    Card card;

    @SerializedName("card_present")
    CardPresent cardPresent;

    @SerializedName("link")
    Link link;

    @SerializedName("paypal")
    Paypal paypal;

    @SerializedName("payto")
    Payto payto;

    @SerializedName("sepa_debit")
    SepaDebit sepaDebit;

    @SerializedName("us_bank_account")
    UsBankAccount usBankAccount;

    /**
     * For more details about AcssDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AcssDebit extends StripeObject {
      /**
       * Currency supported by the bank account
       *
       * <p>One of {@code cad}, or {@code usd}.
       */
      @SerializedName("currency")
      String currency;

      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /** A URL for custom mandate text. */
        @SerializedName("custom_mandate_url")
        String customMandateUrl;

        /** List of Stripe products where this mandate can be selected automatically. */
        @SerializedName("default_for")
        List<String> defaultFor;

        /**
         * Description of the interval. Only required if the 'payment_schedule' parameter is
         * 'interval' or 'combined'.
         */
        @SerializedName("interval_description")
        String intervalDescription;

        /**
         * Payment schedule for the mandate.
         *
         * <p>One of {@code combined}, {@code interval}, or {@code sporadic}.
         */
        @SerializedName("payment_schedule")
        String paymentSchedule;

        /**
         * Transaction type of the mandate.
         *
         * <p>One of {@code business}, or {@code personal}.
         */
        @SerializedName("transaction_type")
        String transactionType;
      }
    }

    /**
     * For more details about AmazonPay, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class AmazonPay extends StripeObject {}

    /**
     * For more details about BacsDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class BacsDebit extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {}
    }

    /**
     * For more details about Card, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Card extends StripeObject {
      /** Configuration options for setting up an eMandate for cards issued in India. */
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Selected network to process this SetupIntent on. Depends on the available networks of the
       * card attached to the setup intent. Can be only set confirm-time.
       */
      @SerializedName("network")
      String network;

      /**
       * We strongly recommend that you rely on our SCA Engine to automatically prompt your
       * customers for authentication based on risk level and <a
       * href="https://stripe.com/docs/strong-customer-authentication">other requirements</a>.
       * However, if you wish to request 3D Secure based on logic from your own fraud engine,
       * provide this option. If not provided, this value defaults to {@code automatic}. Read our
       * guide on <a
       * href="https://stripe.com/docs/payments/3d-secure/authentication-flow#manual-three-ds">manually
       * requesting 3D Secure</a> for more information on how this configuration interacts with
       * Radar and our SCA Engine.
       *
       * <p>One of {@code any}, {@code automatic}, or {@code challenge}.
       */
      @SerializedName("request_three_d_secure")
      String requestThreeDSecure;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /** Amount to be charged for future payments. */
        @SerializedName("amount")
        Long amount;

        /**
         * One of {@code fixed} or {@code maximum}. If {@code fixed}, the {@code amount} param
         * refers to the exact amount to be charged in future payments. If {@code maximum}, the
         * amount charged can be up to the value passed for the {@code amount} param.
         */
        @SerializedName("amount_type")
        String amountType;

        /**
         * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
         * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
         * currency</a>.
         */
        @SerializedName("currency")
        String currency;

        /**
         * A description of the mandate or subscription that is meant to be displayed to the
         * customer.
         */
        @SerializedName("description")
        String description;

        /**
         * End date of the mandate or subscription. If not provided, the mandate will be active
         * until canceled. If provided, end date should be after start date.
         */
        @SerializedName("end_date")
        Long endDate;

        /**
         * Specifies payment frequency. One of {@code day}, {@code week}, {@code month}, {@code
         * year}, or {@code sporadic}.
         */
        @SerializedName("interval")
        String interval;

        /**
         * The number of intervals between payments. For example, {@code interval=month} and {@code
         * interval_count=3} indicates one payment every three months. Maximum of one year interval
         * allowed (1 year, 12 months, or 52 weeks). This parameter is optional when {@code
         * interval=sporadic}.
         */
        @SerializedName("interval_count")
        Long intervalCount;

        /** Unique identifier for the mandate or subscription. */
        @SerializedName("reference")
        String reference;

        /**
         * Start date of the mandate or subscription. Start date should not be lesser than
         * yesterday.
         */
        @SerializedName("start_date")
        Long startDate;

        /** Specifies the type of mandates supported. Possible values are {@code india}. */
        @SerializedName("supported_types")
        List<String> supportedTypes;
      }
    }

    /**
     * For more details about CardPresent, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class CardPresent extends StripeObject {}

    /**
     * For more details about Link, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Link extends StripeObject {
      /** [Deprecated] This is a legacy parameter that no longer has any function. */
      @SerializedName("persistent_token")
      @Deprecated
      String persistentToken;
    }

    /**
     * For more details about Paypal, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paypal extends StripeObject {
      /**
       * The PayPal Billing Agreement ID (BAID). This is an ID generated by PayPal which represents
       * the mandate between the merchant and the customer.
       */
      @SerializedName("billing_agreement_id")
      String billingAgreementId;

      /**
       * Three-letter <a href="https://www.iso.org/iso-4217-currency-codes.html">ISO currency
       * code</a>, in lowercase. Must be a <a href="https://stripe.com/docs/currencies">supported
       * currency</a>.
       */
      @SerializedName("currency")
      String currency;

      /**
       * The Stripe connected account IDs of the sellers on the platform for this transaction
       * (optional). Only allowed when <a
       * href="https://stripe.com/docs/connect/separate-charges-and-transfers">separate charges and
       * transfers</a> are used.
       */
      @SerializedName("subsellers")
      List<String> subsellers;
    }

    /**
     * For more details about Payto, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Payto extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Amount that will be collected. It is required when {@code amount_type} is {@code fixed}.
         */
        @SerializedName("amount")
        Long amount;

        /**
         * The type of amount that will be collected. The amount charged must be exact or up to the
         * value of {@code amount} param for {@code fixed} or {@code maximum} type respectively.
         *
         * <p>One of {@code fixed}, or {@code maximum}.
         */
        @SerializedName("amount_type")
        String amountType;

        /**
         * Date, in YYYY-MM-DD format, after which payments will not be collected. Defaults to no
         * end date.
         */
        @SerializedName("end_date")
        String endDate;

        /**
         * The periodicity at which payments will be collected.
         *
         * <p>One of {@code adhoc}, {@code annual}, {@code daily}, {@code fortnightly}, {@code
         * monthly}, {@code quarterly}, {@code semi_annual}, or {@code weekly}.
         */
        @SerializedName("payment_schedule")
        String paymentSchedule;

        /**
         * The number of payments that will be made during a payment period. Defaults to 1 except
         * for when {@code payment_schedule} is {@code adhoc}. In that case, it defaults to no
         * limit.
         */
        @SerializedName("payments_per_period")
        Long paymentsPerPeriod;

        /**
         * The purpose for which payments are made. Defaults to retail.
         *
         * <p>One of {@code dependant_support}, {@code government}, {@code loan}, {@code mortgage},
         * {@code other}, {@code pension}, {@code personal}, {@code retail}, {@code salary}, {@code
         * tax}, or {@code utility}.
         */
        @SerializedName("purpose")
        String purpose;

        /**
         * Date, in YYYY-MM-DD format, from which payments will be collected. Defaults to
         * confirmation time.
         */
        @SerializedName("start_date")
        String startDate;
      }
    }

    /**
     * For more details about SepaDebit, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class SepaDebit extends StripeObject {
      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {}
    }

    /**
     * For more details about UsBankAccount, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class UsBankAccount extends StripeObject {
      @SerializedName("financial_connections")
      FinancialConnections financialConnections;

      @SerializedName("mandate_options")
      MandateOptions mandateOptions;

      /**
       * Bank account verification method.
       *
       * <p>One of {@code automatic}, {@code instant}, or {@code microdeposits}.
       */
      @SerializedName("verification_method")
      String verificationMethod;

      /**
       * For more details about FinancialConnections, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class FinancialConnections extends StripeObject {
        @SerializedName("filters")
        Filters filters;

        @SerializedName("manual_entry")
        ManualEntry manualEntry;

        /**
         * The list of permissions to request. The {@code payment_method} permission must be
         * included.
         */
        @SerializedName("permissions")
        List<String> permissions;

        /** Data features requested to be retrieved upon account creation. */
        @SerializedName("prefetch")
        List<String> prefetch;

        /**
         * For webview integrations only. Upon completing OAuth login in the native browser, the
         * user will be redirected to this URL to return to your app.
         */
        @SerializedName("return_url")
        String returnUrl;

        /**
         * For more details about Filters, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Filters extends StripeObject {
          /**
           * The account subcategories to use to filter for possible accounts to link. Valid
           * subcategories are {@code checking} and {@code savings}.
           */
          @SerializedName("account_subcategories")
          List<String> accountSubcategories;

          /** The institution to use to filter for possible accounts to link. */
          @SerializedName("institution")
          String institution;
        }

        /**
         * For more details about ManualEntry, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class ManualEntry extends StripeObject {
          /**
           * Settings for configuring manual entry of account details.
           *
           * <p>One of {@code automatic}, or {@code custom}.
           */
          @SerializedName("mode")
          String mode;
        }
      }

      /**
       * For more details about MandateOptions, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class MandateOptions extends StripeObject {
        /**
         * Mandate collection method
         *
         * <p>Equal to {@code paper}.
         */
        @SerializedName("collection_method")
        String collectionMethod;
      }
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(application, responseGetter);
    trySetResponseGetter(automaticPaymentMethods, responseGetter);
    trySetResponseGetter(customer, responseGetter);
    trySetResponseGetter(lastSetupError, responseGetter);
    trySetResponseGetter(latestAttempt, responseGetter);
    trySetResponseGetter(mandate, responseGetter);
    trySetResponseGetter(nextAction, responseGetter);
    trySetResponseGetter(onBehalfOf, responseGetter);
    trySetResponseGetter(paymentMethod, responseGetter);
    trySetResponseGetter(paymentMethodConfigurationDetails, responseGetter);
    trySetResponseGetter(paymentMethodOptions, responseGetter);
    trySetResponseGetter(singleUseMandate, responseGetter);
  }
}
