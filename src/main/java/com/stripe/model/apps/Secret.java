// File generated from our OpenAPI spec
package com.stripe.model.apps;

import com.google.gson.annotations.SerializedName;
import com.stripe.Stripe;
import com.stripe.exception.StripeException;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.param.apps.SecretCreateParams;
import com.stripe.param.apps.SecretDeleteWhereParams;
import com.stripe.param.apps.SecretFindParams;
import com.stripe.param.apps.SecretListParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Secret extends ApiResource implements HasId {
  /**
   * Time at which the object was created. Measured in seconds since the Unix epoch.
   */
  @SerializedName("created")
  Long created;

  /**
   * If true, indicates that this secret has been deleted.
   */
  @SerializedName("deleted")
  Boolean deleted;

  /**
   * Unique identifier for the object.
   */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * A name for the secret that's unique within the scope.
   */
  @SerializedName("name")
  String name;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code apps.secret}.
   */
  @SerializedName("object")
  String object;

  /**
   * The plaintext secret value to be stored.
   */
  @SerializedName("payload")
  String payload;

  @SerializedName("scope")
  Scope scope;

  /**
   * <p>Finds a secret in the secret store by name and scope.</p>
   */
  public static Secret find(Map<String, Object> params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /**
   * <p>Finds a secret in the secret store by name and scope.</p>
   */
  public static Secret find(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets/find");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Secret.class, options);
  }

  /**
   * <p>Finds a secret in the secret store by name and scope.</p>
   */
  public static Secret find(SecretFindParams params) throws StripeException {
    return find(params, (RequestOptions) null);
  }

  /**
   * <p>Finds a secret in the secret store by name and scope.</p>
   */
  public static Secret find(
      SecretFindParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets/find");
    return ApiResource.request(ApiResource.RequestMethod.GET, url, params, Secret.class, options);
  }

  /**
   * <p>Create or replace a secret in the secret store.</p>
   */
  public static Secret create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Create or replace a secret in the secret store.</p>
   */
  public static Secret create(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Secret.class, options);
  }

  /**
   * <p>Create or replace a secret in the secret store.</p>
   */
  public static Secret create(SecretCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * <p>Create or replace a secret in the secret store.</p>
   */
  public static Secret create(
      SecretCreateParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Secret.class, options);
  }

  /**
   * <p>Deletes a secret from the secret store by name and scope.</p>
   */
  public static Secret deleteWhere(Map<String, Object> params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }

  /**
   * <p>Deletes a secret from the secret store by name and scope.</p>
   */
  public static Secret deleteWhere(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets/delete");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Secret.class, options);
  }

  /**
   * <p>Deletes a secret from the secret store by name and scope.</p>
   */
  public static Secret deleteWhere(SecretDeleteWhereParams params) throws StripeException {
    return deleteWhere(params, (RequestOptions) null);
  }

  /**
   * <p>Deletes a secret from the secret store by name and scope.</p>
   */
  public static Secret deleteWhere(
      SecretDeleteWhereParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets/delete");
    return ApiResource.request(ApiResource.RequestMethod.POST, url, params, Secret.class, options);
  }

  /**
   * <p>List all secrets stored on the given scope.</p>
   */
  public static SecretCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List all secrets stored on the given scope.</p>
   */
  public static SecretCollection list(
      Map<String, Object> params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets");
    return ApiResource.requestCollection(url, params, SecretCollection.class, options);
  }

  /**
   * <p>List all secrets stored on the given scope.</p>
   */
  public static SecretCollection list(SecretListParams params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * <p>List all secrets stored on the given scope.</p>
   */
  public static SecretCollection list(
      SecretListParams params,
      RequestOptions options) throws StripeException {
    String url = String.format("%s%s", Stripe.getApiBase(), "/v1/apps/secrets");
    return ApiResource.requestCollection(url, params, SecretCollection.class, options);
  }

  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Scope extends StripeObject {
    /**
     * The secret scope type.
     *
     * <p>One of {@code account}, or {@code user}.
     */
    @SerializedName("type")
    String type;

    /**
     * The user ID, if type is set to &quot;user&quot;.
     */
    @SerializedName("user")
    String user;
  }
}