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
import com.stripe.param.PaymentMethodDomainCreateParams;
import com.stripe.param.PaymentMethodDomainListParams;
import com.stripe.param.PaymentMethodDomainRetrieveParams;
import com.stripe.param.PaymentMethodDomainUpdateParams;
import com.stripe.param.PaymentMethodDomainValidateParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A payment method domain represents a web domain that you have registered with Stripe. Stripe
 * Elements use registered payment method domains to control where certain payment methods are
 * shown.
 *
 * <p>Related guide: <a
 * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
 * domains</a>.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class PaymentMethodDomain extends ApiResource implements HasId {
  /** Indicates the status of a specific payment method on a payment method domain. */
  @SerializedName("amazon_pay")
  AmazonPay amazonPay;

  /** Indicates the status of a specific payment method on a payment method domain. */
  @SerializedName("apple_pay")
  ApplePay applePay;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The domain name that this payment method domain object represents. */
  @SerializedName("domain_name")
  String domainName;

  /**
   * Whether this payment method domain is enabled. If the domain is not enabled, payment methods
   * that require a payment method domain will not appear in Elements.
   */
  @SerializedName("enabled")
  Boolean enabled;

  /** Indicates the status of a specific payment method on a payment method domain. */
  @SerializedName("google_pay")
  GooglePay googlePay;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /** Indicates the status of a specific payment method on a payment method domain. */
  @SerializedName("link")
  Link link;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code payment_method_domain}.
   */
  @SerializedName("object")
  String object;

  /** Indicates the status of a specific payment method on a payment method domain. */
  @SerializedName("paypal")
  Paypal paypal;

  /** Creates a payment method domain. */
  public static PaymentMethodDomain create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method domain. */
  public static PaymentMethodDomain create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/payment_method_domains";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Creates a payment method domain. */
  public static PaymentMethodDomain create(PaymentMethodDomainCreateParams params)
      throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /** Creates a payment method domain. */
  public static PaymentMethodDomain create(
      PaymentMethodDomainCreateParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_domains";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Lists the details of existing payment method domains. */
  public static PaymentMethodDomainCollection list(Map<String, Object> params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists the details of existing payment method domains. */
  public static PaymentMethodDomainCollection list(
      Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_domains";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomainCollection.class);
  }

  /** Lists the details of existing payment method domains. */
  public static PaymentMethodDomainCollection list(PaymentMethodDomainListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Lists the details of existing payment method domains. */
  public static PaymentMethodDomainCollection list(
      PaymentMethodDomainListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/payment_method_domains";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomainCollection.class);
  }

  /** Retrieves the details of an existing payment method domain. */
  public static PaymentMethodDomain retrieve(String paymentMethodDomain) throws StripeException {
    return retrieve(paymentMethodDomain, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of an existing payment method domain. */
  public static PaymentMethodDomain retrieve(String paymentMethodDomain, RequestOptions options)
      throws StripeException {
    return retrieve(paymentMethodDomain, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of an existing payment method domain. */
  public static PaymentMethodDomain retrieve(
      String paymentMethodDomain, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s", ApiResource.urlEncodeId(paymentMethodDomain));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Retrieves the details of an existing payment method domain. */
  public static PaymentMethodDomain retrieve(
      String paymentMethodDomain, PaymentMethodDomainRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s", ApiResource.urlEncodeId(paymentMethodDomain));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(Map<String, Object> params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_method_domains/%s", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(PaymentMethodDomainUpdateParams params) throws StripeException {
    return update(params, (RequestOptions) null);
  }

  /** Updates an existing payment method domain. */
  public PaymentMethodDomain update(PaymentMethodDomainUpdateParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/payment_method_domains/%s", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate() throws StripeException {
    return validate((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(RequestOptions options) throws StripeException {
    return validate((Map<String, Object>) null, options);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(Map<String, Object> params) throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s/validate", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(PaymentMethodDomainValidateParams params)
      throws StripeException {
    return validate(params, (RequestOptions) null);
  }

  /**
   * Some payment methods such as Apple Pay require additional steps to verify a domain. If the
   * requirements weren’t satisfied when the domain was created, the payment method will be inactive
   * on the domain. The payment method doesn’t appear in Elements for this domain until it is
   * active.
   *
   * <p>To activate a payment method on an existing payment method domain, complete the required
   * validation steps specific to the payment method, and then validate the payment method domain
   * with this endpoint.
   *
   * <p>Related guides: <a
   * href="https://stripe.com/docs/payments/payment-methods/pmd-registration">Payment method
   * domains</a>.
   */
  public PaymentMethodDomain validate(
      PaymentMethodDomainValidateParams params, RequestOptions options) throws StripeException {
    String path =
        String.format(
            "/v1/payment_method_domains/%s/validate", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, PaymentMethodDomain.class);
  }

  /** Indicates the status of a specific payment method on a payment method domain. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AmazonPay extends StripeObject {
    /**
     * The status of the payment method on the domain.
     *
     * <p>One of {@code active}, or {@code inactive}.
     */
    @SerializedName("status")
    String status;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @SerializedName("status_details")
    StatusDetails statusDetails;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /** The error message associated with the status of the payment method on the domain. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  /** Indicates the status of a specific payment method on a payment method domain. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApplePay extends StripeObject {
    /**
     * The status of the payment method on the domain.
     *
     * <p>One of {@code active}, or {@code inactive}.
     */
    @SerializedName("status")
    String status;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @SerializedName("status_details")
    StatusDetails statusDetails;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /** The error message associated with the status of the payment method on the domain. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  /** Indicates the status of a specific payment method on a payment method domain. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class GooglePay extends StripeObject {
    /**
     * The status of the payment method on the domain.
     *
     * <p>One of {@code active}, or {@code inactive}.
     */
    @SerializedName("status")
    String status;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @SerializedName("status_details")
    StatusDetails statusDetails;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /** The error message associated with the status of the payment method on the domain. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  /** Indicates the status of a specific payment method on a payment method domain. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Link extends StripeObject {
    /**
     * The status of the payment method on the domain.
     *
     * <p>One of {@code active}, or {@code inactive}.
     */
    @SerializedName("status")
    String status;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @SerializedName("status_details")
    StatusDetails statusDetails;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /** The error message associated with the status of the payment method on the domain. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  /** Indicates the status of a specific payment method on a payment method domain. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Paypal extends StripeObject {
    /**
     * The status of the payment method on the domain.
     *
     * <p>One of {@code active}, or {@code inactive}.
     */
    @SerializedName("status")
    String status;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @SerializedName("status_details")
    StatusDetails statusDetails;

    /**
     * Contains additional details about the status of a payment method for a specific payment
     * method domain.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class StatusDetails extends StripeObject {
      /** The error message associated with the status of the payment method on the domain. */
      @SerializedName("error_message")
      String errorMessage;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(amazonPay, responseGetter);
    trySetResponseGetter(applePay, responseGetter);
    trySetResponseGetter(googlePay, responseGetter);
    trySetResponseGetter(link, responseGetter);
    trySetResponseGetter(paypal, responseGetter);
  }
}
