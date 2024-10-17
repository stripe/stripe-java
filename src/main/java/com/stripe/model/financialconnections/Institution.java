// File generated from our OpenAPI spec
package com.stripe.model.financialconnections;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.financialconnections.InstitutionListParams;
import com.stripe.param.financialconnections.InstitutionRetrieveParams;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An institution represents a financial institution to which an end user can connect using the
 * Financial Connections authentication flow.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Institution extends ApiResource implements HasId {
  @SerializedName("features")
  Features features;

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

  /** The name of this institution. */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code financial_connections.institution}.
   */
  @SerializedName("object")
  String object;

  /**
   * A list of routing numbers which are known to correspond to this institution. Due to the many to
   * many relationship between institutions and routing numbers, this list may not be comprehensive
   * and routing numbers may also be shared between institutions.
   */
  @SerializedName("routing_numbers")
  List<String> routingNumbers;

  /**
   * The status of this institution in the Financial Connections authentication flow.
   *
   * <p>One of {@code active}, {@code degraded}, or {@code inactive}.
   */
  @SerializedName("status")
  String status;

  /**
   * A URL corresponding to this institution. This URL is also displayed in the authentication flow
   * to help end users confirm that they are authenticating with the right institution.
   */
  @SerializedName("url")
  String url;

  /** Returns a list of Financial Connections {@code Institution} objects. */
  public static InstitutionCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Institution} objects. */
  public static InstitutionCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/institutions";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, InstitutionCollection.class);
  }

  /** Returns a list of Financial Connections {@code Institution} objects. */
  public static InstitutionCollection list(InstitutionListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /** Returns a list of Financial Connections {@code Institution} objects. */
  public static InstitutionCollection list(InstitutionListParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/financial_connections/institutions";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, InstitutionCollection.class);
  }

  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public static Institution retrieve(String institution) throws StripeException {
    return retrieve(institution, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public static Institution retrieve(String institution, RequestOptions options)
      throws StripeException {
    return retrieve(institution, (Map<String, Object>) null, options);
  }

  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public static Institution retrieve(
      String institution, Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/institutions/%s", ApiResource.urlEncodeId(institution));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, Institution.class);
  }

  /** Retrieves the details of a Financial Connections {@code Institution}. */
  public static Institution retrieve(
      String institution, InstitutionRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/financial_connections/institutions/%s", ApiResource.urlEncodeId(institution));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, Institution.class);
  }

  /**
   * For more details about Features, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Features extends StripeObject {
    @SerializedName("balances")
    Balances balances;

    @SerializedName("ownership")
    Ownership ownership;

    @SerializedName("payment_method")
    PaymentMethod paymentMethod;

    @SerializedName("transactions")
    Transactions transactions;

    /**
     * For more details about Balances, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balances extends StripeObject {
      /** Whether the given feature is supported by this institution. */
      @SerializedName("supported")
      Boolean supported;
    }

    /**
     * For more details about Ownership, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Ownership extends StripeObject {
      /** Whether the given feature is supported by this institution. */
      @SerializedName("supported")
      Boolean supported;
    }

    /**
     * For more details about PaymentMethod, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaymentMethod extends StripeObject {
      /** Whether the given feature is supported by this institution. */
      @SerializedName("supported")
      Boolean supported;
    }

    /**
     * For more details about Transactions, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Transactions extends StripeObject {
      /** Whether the given feature is supported by this institution. */
      @SerializedName("supported")
      Boolean supported;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(features, responseGetter);
  }
}
