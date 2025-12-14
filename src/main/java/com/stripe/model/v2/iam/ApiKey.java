// File generated from our OpenAPI spec
package com.stripe.model.v2.iam;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/** An API key. */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ApiKey extends StripeObject implements HasId {
  /** Timestamp when the API key was created. */
  @SerializedName("created")
  Instant created;

  /** Timestamp when the API key expires. */
  @SerializedName("expires_at")
  Instant expiresAt;

  /** Unique identifier of the API key. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * List of IP addresses allowed to use this API key. Addresses use IPv4 protocol, and may be a
   * CIDR range (e.g., [100.10.38.255, 100.10.38.0/24]).
   */
  @SerializedName("ip_allowlist")
  List<String> ipAllowlist;

  /** Timestamp when the API key was last used. */
  @SerializedName("last_used")
  Instant lastUsed;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** Account that manages this API key (for keys managed by platforms). */
  @SerializedName("managed_by")
  ManagedBy managedBy;

  /** Name of the API key. */
  @SerializedName("name")
  String name;

  /** Note or description for the API key. */
  @SerializedName("note")
  String note;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.iam.api_key}.
   */
  @SerializedName("object")
  String object;

  /** Token set for a publishable key. */
  @SerializedName("publishable_key")
  PublishableKey publishableKey;

  /** Token set for a secret key. */
  @SerializedName("secret_key")
  SecretKey secretKey;

  /**
   * Current status of the API key (e.g., active, expired).
   *
   * <p>One of {@code active}, or {@code expired}.
   */
  @SerializedName("status")
  String status;

  /**
   * Type of the API key.
   *
   * <p>One of {@code publishable_key}, or {@code secret_key}.
   */
  @SerializedName("type")
  String type;

  /** Account that manages this API key (for keys managed by platforms). */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ManagedBy extends StripeObject {
    /** An application. */
    @SerializedName("application")
    Application application;

    /**
     * The type of entity.
     *
     * <p>Equal to {@code application}.
     */
    @SerializedName("type")
    String type;

    /** An application. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Application extends StripeObject implements HasId {
      /** Identifier of the application. */
      @Getter(onMethod_ = {@Override})
      @SerializedName("id")
      String id;
    }
  }

  /** Token set for a publishable key. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class PublishableKey extends StripeObject {
    /** The plaintext token for the API key. */
    @SerializedName("token")
    String token;
  }

  /** Token set for a secret key. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SecretKey extends StripeObject {
    /** The encrypted secret for the API key. Only included when a key is first created. */
    @SerializedName("encrypted_secret")
    EncryptedSecret encryptedSecret;

    /** Redacted version of the secret token for display purposes. */
    @SerializedName("secret_token_redacted")
    String secretTokenRedacted;

    /** The plaintext token for the API key. Only included for testmode keys. */
    @SerializedName("token")
    String token;

    /** The encrypted secret for the API key. Only included when a key is first created. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class EncryptedSecret extends StripeObject {
      /** The encrypted secret data in base64 format. */
      @SerializedName("ciphertext")
      String ciphertext;

      /** The format of the encrypted secret (e.g., jwe_compact). */
      @SerializedName("format")
      String format;

      /** The caller's identifier of the public key provided. */
      @SerializedName("recipient_key_id")
      String recipientKeyId;
    }
  }
}
