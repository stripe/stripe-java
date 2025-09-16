// File generated from our OpenAPI spec
package com.stripe.model.v2.core;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ClaimableSandbox extends StripeObject implements HasId {
  /**
   * URL for user to claim sandbox into their existing Stripe account. The value will be null if the
   * sandbox status is {@code claimed} or {@code expired}.
   */
  @SerializedName("claim_url")
  String claimUrl;

  /**
   * The timestamp the sandbox was claimed. The value will be null if the sandbox status is not
   * {@code claimed}.
   */
  @SerializedName("claimed_at")
  Instant claimedAt;

  /** When the sandbox is created. */
  @SerializedName("created")
  Instant created;

  /**
   * The timestamp the sandbox will expire. The value will be null if the sandbox is {@code
   * claimed}.
   */
  @SerializedName("expires_at")
  Instant expiresAt;

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

  /** Data about the Stripe sandbox object. */
  @SerializedName("sandbox_details")
  SandboxDetails sandboxDetails;

  /** Status of the sandbox. One of {@code unclaimed}, {@code expired}, {@code claimed}. */
  @SerializedName("status")
  String status;

  /**
   * For more details about Prefill, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Prefill extends StripeObject {
    /**
     * Country in which the account holder resides, or in which the business is legally established.
     * Use two-letter country code (<a href="https://en.wikipedia.org/wiki/ISO_3166-1_alpha-2">ISO
     * 3166-1 alpha-2</a>).
     *
     * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code am},
     * {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw}, {@code
     * ax}, {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code bg},
     * {@code bh}, {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo}, {@code
     * bq}, {@code br}, {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code bz},
     * {@code ca}, {@code cc}, {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci}, {@code
     * ck}, {@code cl}, {@code cm}, {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code cv},
     * {@code cw}, {@code cx}, {@code cy}, {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code
     * dm}, {@code do}, {@code dz}, {@code ec}, {@code ee}, {@code eg}, {@code eh}, {@code er},
     * {@code es}, {@code et}, {@code fi}, {@code fj}, {@code fk}, {@code fm}, {@code fo}, {@code
     * fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge}, {@code gf}, {@code gg}, {@code gh},
     * {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp}, {@code gq}, {@code gr}, {@code
     * gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk}, {@code hm}, {@code hn},
     * {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il}, {@code im}, {@code
     * in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je}, {@code jm},
     * {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km}, {@code
     * kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code lb},
     * {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu}, {@code
     * lv}, {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code mg},
     * {@code mh}, {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp}, {@code
     * mq}, {@code mr}, {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code mx},
     * {@code my}, {@code mz}, {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code
     * ni}, {@code nl}, {@code no}, {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om},
     * {@code pa}, {@code pe}, {@code pf}, {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code
     * pm}, {@code pn}, {@code pr}, {@code ps}, {@code pt}, {@code pw}, {@code py}, {@code qa},
     * {@code qz}, {@code re}, {@code ro}, {@code rs}, {@code ru}, {@code rw}, {@code sa}, {@code
     * sb}, {@code sc}, {@code sd}, {@code se}, {@code sg}, {@code sh}, {@code si}, {@code sj},
     * {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so}, {@code sr}, {@code ss}, {@code
     * st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc}, {@code td}, {@code tf},
     * {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm}, {@code tn}, {@code
     * to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua}, {@code ug},
     * {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve}, {@code
     * vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code ye},
     * {@code yt}, {@code za}, {@code zm}, or {@code zw}.
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

  /**
   * For more details about SandboxDetails, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class SandboxDetails extends StripeObject {
    /** The sandbox's Stripe account ID. */
    @SerializedName("account")
    String account;

    /**
     * Keys that can be used to set up an integration for this sandbox and operate on the account.
     */
    @SerializedName("api_keys")
    ApiKeys apiKeys;

    /**
     * The livemode sandbox Stripe account ID. This field is only set if the user activates their
     * sandbox and chooses to install your platform's Stripe App in their live account.
     */
    @SerializedName("owner_account")
    String ownerAccount;

    /**
     * For more details about ApiKeys, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ApiKeys extends StripeObject {
      /**
       * Used to communicate with <a href="https://docs.stripe.com/mcp">Stripe's MCP server</a>.
       * This allows LLM agents to securely operate on a Stripe account.
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
  }
}
