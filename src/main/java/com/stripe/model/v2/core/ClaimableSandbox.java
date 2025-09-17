// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A claimable sandbox represents a Stripe sandbox that is anonymous. When it is created, it can be
 * prefilled with specific metadata, such as email, name, or country. Claimable sandboxes can be
 * claimed through a URL. When a user claims a sandbox through this URL, it will prompt them to
 * create a new Stripe account. Or, it will allow them to claim this sandbox in their existing
 * Stripe account. Claimable sandboxes have 60 days to be claimed. After this expiration time has
 * passed, if the sandbox is not claimed, it will be deleted.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandbox extends StripeObject implements HasId {
  /** Keys that can be used to set up an integration for this sandbox and operate on the account. */
  @SerializedName("api_keys")
  ApiKeys apiKeys;

  /** URL for user to claim sandbox into their existing Stripe account. */
  @SerializedName("claim_url")
  String claimUrl;

  /** When the sandbox is created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the Claimable sandbox. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.core.claimable_sandbox}.
   */
  @SerializedName("object")
  String object;

  /** Values prefilled during the creation of the sandbox. */
  @SerializedName("prefill")
  Prefill prefill;

  /** Keys that can be used to set up an integration for this sandbox and operate on the account. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ApiKeys extends StripeObject {
    /**
     * Used to communicate with <a href="https://docs.stripe.com/mcp">Stripe's MCP server</a>. This
     * allows LLM agents to securely operate on a Stripe account.
     */
    @SerializedName("mcp")
    String mcp;

    /** Publicly accessible in a web or mobile app client-side code. */
    @SerializedName("publishable")
    String publishable;

    /** Should be stored securely in server-side code (such as an environment variable). */
    @SerializedName("secret")
    String secret;
  }

  /** Values prefilled during the creation of the sandbox. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Prefill extends StripeObject {
    /**
     * Country in which the account holder resides, or in which the business is legally established.
     * Use two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     */
    @SerializedName("country")
    String country;

    /**
     * Email that this sandbox is meant to be claimed by. Stripe will send an email to this email
     * address before the sandbox expires.
     */
    @SerializedName("email")
    String email;

    /** Name for the sandbox. */
    @SerializedName("name")
    String name;
  }
}
