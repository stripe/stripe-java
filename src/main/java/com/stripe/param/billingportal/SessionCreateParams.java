// File generated from our OpenAPI spec
package com.stripe.param.billingportal;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.Getter;

@Getter
public class SessionCreateParams extends ApiRequestParams {
  /**
   * The <a href="https://stripe.com/docs/api/customer_portal/configuration">configuration</a> to
   * use for this session, describing its functionality and features. If not specified, the session
   * uses the default configuration.
   */
  @SerializedName("configuration")
  String configuration;

  /** The ID of an existing customer. */
  @SerializedName("customer")
  String customer;

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
   * The {@code on_behalf_of} account to use for this session. When specified, only subscriptions
   * and invoices with this {@code on_behalf_of} account appear in the portal. For more information,
   * see the <a href="https://stripe.com/docs/connect/charges-transfers#on-behalf-of">docs</a>. Use
   * the <a
   * href="https://stripe.com/docs/api/accounts/object#account_object-settings-branding">Accounts
   * API</a> to modify the {@code on_behalf_of} account's branding settings, which the portal
   * displays.
   */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /**
   * The default URL to redirect customers to when they click on the portal's link to return to your
   * website.
   */
  @SerializedName("return_url")
  String returnUrl;

  private SessionCreateParams(
      String configuration,
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String onBehalfOf,
      String returnUrl) {
    this.configuration = configuration;
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.onBehalfOf = onBehalfOf;
    this.returnUrl = returnUrl;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String configuration;

    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String onBehalfOf;

    private String returnUrl;

    /** Finalize and obtain parameter instance from this builder. */
    public SessionCreateParams build() {
      return new SessionCreateParams(
          this.configuration,
          this.customer,
          this.expand,
          this.extraParams,
          this.onBehalfOf,
          this.returnUrl);
    }

    /**
     * The <a href="https://stripe.com/docs/api/customer_portal/configuration">configuration</a> to
     * use for this session, describing its functionality and features. If not specified, the
     * session uses the default configuration.
     */
    public Builder setConfiguration(String configuration) {
      this.configuration = configuration;
      return this;
    }

    /** The ID of an existing customer. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#expand} for the field documentation.
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
     * SessionCreateParams#extraParams} for the field documentation.
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
     * See {@link SessionCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /**
     * The {@code on_behalf_of} account to use for this session. When specified, only subscriptions
     * and invoices with this {@code on_behalf_of} account appear in the portal. For more
     * information, see the <a
     * href="https://stripe.com/docs/connect/charges-transfers#on-behalf-of">docs</a>. Use the <a
     * href="https://stripe.com/docs/api/accounts/object#account_object-settings-branding">Accounts
     * API</a> to modify the {@code on_behalf_of} account's branding settings, which the portal
     * displays.
     */
    public Builder setOnBehalfOf(String onBehalfOf) {
      this.onBehalfOf = onBehalfOf;
      return this;
    }

    /**
     * The default URL to redirect customers to when they click on the portal's link to return to
     * your website.
     */
    public Builder setReturnUrl(String returnUrl) {
      this.returnUrl = returnUrl;
      return this;
    }
  }
}
