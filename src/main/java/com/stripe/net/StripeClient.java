package com.stripe.net;

import com.google.gson.JsonSyntaxException;
import com.stripe.exception.StripeException;
import com.stripe.exception.oauth.InvalidRequestException;
import com.stripe.model.StripeObjectInterface;
import com.stripe.service.ChargeService;
import com.stripe.service.CouponService;
import com.stripe.service.FileService;
import com.stripe.service.RootServices;
import com.stripe.service.issuing.IssuingServices;
import java.lang.reflect.Type;
import java.util.Collections;
import java.util.Map;
import lombok.Getter;

public class StripeClient {
  /** Default base URL for Stripe's API. */
  public static final String DEFAULT_API_BASE = "https://api.stripe.com";

  /** Default base URL for Stripe's OAuth API. */
  public static final String DEFAULT_CONNECT_BASE = "https://connect.stripe.com";

  /** Default base URL for Stripe's Files API. */
  public static final String DEFAULT_FILES_BASE = "https://files.stripe.com";

  @Getter private final String apiBase;

  @Getter private final String apiKey;

  @Getter private final String clientId;

  @Getter private final String connectBase;

  @Getter private final String filesBase;

  @Getter private final HttpClient httpClient;

  // --- GENERATED CODE STARTS HERE ---
  // Also imports for services need to be generated too.

  private final RootServices rootServices = new RootServices(this);

  private final IssuingServices issuingServices = new IssuingServices(this);

  public ChargeService charges() {
    return this.rootServices.charges();
  }

  public CouponService coupons() {
    return this.rootServices.coupons();
  }

  public FileService files() {
    return this.rootServices.files();
  }

  public IssuingServices issuing() {
    return this.issuingServices;
  }

  // --- GENERATED CODE ENDS HERE ---

  public StripeClient(String apiKey) {
    this(apiKey, null, null);
  }

  public StripeClient(String apiKey, String clientId, HttpClient client) {
    this(apiKey, clientId, client, DEFAULT_API_BASE, DEFAULT_CONNECT_BASE, DEFAULT_FILES_BASE);
  }

  public StripeClient(
      String apiKey,
      String clientId,
      HttpClient client,
      String apiBase,
      String connectBase,
      String filesBase) {
    this.apiKey = apiKey;
    this.clientId = clientId;
    this.httpClient = (client != null) ? client : buildDefaultHttpClient();
    this.apiBase = apiBase;
    this.connectBase = connectBase;
    this.filesBase = filesBase;
  }

  public <T extends StripeObjectInterface> T request(
      Type typeOfT,
      ApiResource.RequestMethod method,
      String path,
      ApiRequestParams params,
      RequestOptions options)
      throws StripeException {
    Map<String, Object> paramMap = (params != null) ? params.toMap() : Collections.emptyMap();
    StripeRequest request = new StripeRequest(this, method, path, paramMap, options);

    StripeResponse response = this.httpClient.request(request);

    return processResponse(typeOfT, response);
  }

  private static HttpClient buildDefaultHttpClient() {
    return new HttpURLConnectionClient();
  }

  private static <T extends StripeObjectInterface> T processResponse(
      Type typeOfT, StripeResponse response) throws StripeException {
    if (response.code() != 200) {
      throw buildStripeException(response);
    }

    T resource = null;
    try {
      resource = ApiResource.GSON.fromJson(response.body(), typeOfT);
    } catch (JsonSyntaxException e) {
      throw buildInvalidResponseException(response);
    }

    return resource;
  }

  private static StripeException buildStripeException(StripeResponse response) {
    return new InvalidRequestException(
        "foo", response.body(), response.requestId(), response.code(), null);
  }

  private static StripeException buildInvalidResponseException(StripeResponse response) {
    return new InvalidRequestException(
        "foo", response.body(), response.requestId(), response.code(), null);
  }
}
