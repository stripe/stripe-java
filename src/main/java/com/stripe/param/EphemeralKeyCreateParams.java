// File generated from our OpenAPI spec
package com.stripe.param;

import com.google.gson.annotations.SerializedName;
import com.stripe.net.ApiRequestParams;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;

@Getter
@EqualsAndHashCode(callSuper = false)
public class EphemeralKeyCreateParams extends ApiRequestParams {
  /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
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

  /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
  @SerializedName("issuing_card")
  String issuingCard;

  /**
   * A single-use token, created by Stripe.js, used for creating ephemeral keys for Issuing Cards
   * without exchanging sensitive information.
   */
  @SerializedName("nonce")
  String nonce;

  /**
   * <strong>Required.</strong> Determines the value of the Stripe-Version header. Set this to the
   * API Version of your mobile client.
   */
  @SerializedName("stripe-version")
  String stripeVersion;

  /**
   * The ID of the Identity VerificationSession you'd like to access using the resulting ephemeral
   * key.
   */
  @SerializedName("verification_session")
  String verificationSession;

  private EphemeralKeyCreateParams(
      String customer,
      List<String> expand,
      Map<String, Object> extraParams,
      String issuingCard,
      String nonce,
      String stripeVersion,
      String verificationSession) {
    this.customer = customer;
    this.expand = expand;
    this.extraParams = extraParams;
    this.issuingCard = issuingCard;
    this.nonce = nonce;
    this.stripeVersion = stripeVersion;
    this.verificationSession = verificationSession;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private String customer;

    private List<String> expand;

    private Map<String, Object> extraParams;

    private String issuingCard;

    private String nonce;

    private String stripeVersion;

    private String verificationSession;

    /** Finalize and obtain parameter instance from this builder. */
    public EphemeralKeyCreateParams build() {
      return new EphemeralKeyCreateParams(
          this.customer,
          this.expand,
          this.extraParams,
          this.issuingCard,
          this.nonce,
          this.stripeVersion,
          this.verificationSession);
    }

    /** The ID of the Customer you'd like to modify using the resulting ephemeral key. */
    public Builder setCustomer(String customer) {
      this.customer = customer;
      return this;
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * EphemeralKeyCreateParams#expand} for the field documentation.
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
     * EphemeralKeyCreateParams#expand} for the field documentation.
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
     * EphemeralKeyCreateParams#extraParams} for the field documentation.
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
     * See {@link EphemeralKeyCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** The ID of the Issuing Card you'd like to access using the resulting ephemeral key. */
    public Builder setIssuingCard(String issuingCard) {
      this.issuingCard = issuingCard;
      return this;
    }

    /**
     * A single-use token, created by Stripe.js, used for creating ephemeral keys for Issuing Cards
     * without exchanging sensitive information.
     */
    public Builder setNonce(String nonce) {
      this.nonce = nonce;
      return this;
    }

    /**
     * <strong>Required.</strong> Determines the value of the Stripe-Version header. Set this to the
     * API Version of your mobile client.
     */
    public Builder setStripeVersion(String stripeVersion) {
      this.stripeVersion = stripeVersion;
      return this;
    }

    /**
     * The ID of the Identity VerificationSession you'd like to access using the resulting ephemeral
     * key.
     */
    public Builder setVerificationSession(String verificationSession) {
      this.verificationSession = verificationSession;
      return this;
    }
  }
}
