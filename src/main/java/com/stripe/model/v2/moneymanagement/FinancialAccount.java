// File generated from our OpenAPI spec
package com.stripe.model.v2.moneymanagement;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import com.stripe.v2.Amount;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class FinancialAccount extends StripeObject implements HasId {
  /**
   * Multi-currency balance of this FinancialAccount, split by availability state. Each balance is
   * represented as a hash where the key is the three-letter ISO currency code, in lowercase, and
   * the value is the amount for that currency.
   */
  @SerializedName("balance")
  Balance balance;

  /**
   * Open Enum. Two-letter country code that represents the country where the LegalEntity associated
   * with the FinancialAccount is based in.
   *
   * <p>One of {@code ad}, {@code ae}, {@code af}, {@code ag}, {@code ai}, {@code al}, {@code am},
   * {@code ao}, {@code aq}, {@code ar}, {@code as}, {@code at}, {@code au}, {@code aw}, {@code ax},
   * {@code az}, {@code ba}, {@code bb}, {@code bd}, {@code be}, {@code bf}, {@code bg}, {@code bh},
   * {@code bi}, {@code bj}, {@code bl}, {@code bm}, {@code bn}, {@code bo}, {@code bq}, {@code br},
   * {@code bs}, {@code bt}, {@code bv}, {@code bw}, {@code by}, {@code bz}, {@code ca}, {@code cc},
   * {@code cd}, {@code cf}, {@code cg}, {@code ch}, {@code ci}, {@code ck}, {@code cl}, {@code cm},
   * {@code cn}, {@code co}, {@code cr}, {@code cu}, {@code cv}, {@code cw}, {@code cx}, {@code cy},
   * {@code cz}, {@code de}, {@code dj}, {@code dk}, {@code dm}, {@code do}, {@code dz}, {@code ec},
   * {@code ee}, {@code eg}, {@code eh}, {@code er}, {@code es}, {@code et}, {@code fi}, {@code fj},
   * {@code fk}, {@code fm}, {@code fo}, {@code fr}, {@code ga}, {@code gb}, {@code gd}, {@code ge},
   * {@code gf}, {@code gg}, {@code gh}, {@code gi}, {@code gl}, {@code gm}, {@code gn}, {@code gp},
   * {@code gq}, {@code gr}, {@code gs}, {@code gt}, {@code gu}, {@code gw}, {@code gy}, {@code hk},
   * {@code hm}, {@code hn}, {@code hr}, {@code ht}, {@code hu}, {@code id}, {@code ie}, {@code il},
   * {@code im}, {@code in}, {@code io}, {@code iq}, {@code ir}, {@code is}, {@code it}, {@code je},
   * {@code jm}, {@code jo}, {@code jp}, {@code ke}, {@code kg}, {@code kh}, {@code ki}, {@code km},
   * {@code kn}, {@code kp}, {@code kr}, {@code kw}, {@code ky}, {@code kz}, {@code la}, {@code lb},
   * {@code lc}, {@code li}, {@code lk}, {@code lr}, {@code ls}, {@code lt}, {@code lu}, {@code lv},
   * {@code ly}, {@code ma}, {@code mc}, {@code md}, {@code me}, {@code mf}, {@code mg}, {@code mh},
   * {@code mk}, {@code ml}, {@code mm}, {@code mn}, {@code mo}, {@code mp}, {@code mq}, {@code mr},
   * {@code ms}, {@code mt}, {@code mu}, {@code mv}, {@code mw}, {@code mx}, {@code my}, {@code mz},
   * {@code na}, {@code nc}, {@code ne}, {@code nf}, {@code ng}, {@code ni}, {@code nl}, {@code no},
   * {@code np}, {@code nr}, {@code nu}, {@code nz}, {@code om}, {@code pa}, {@code pe}, {@code pf},
   * {@code pg}, {@code ph}, {@code pk}, {@code pl}, {@code pm}, {@code pn}, {@code pr}, {@code ps},
   * {@code pt}, {@code pw}, {@code py}, {@code qa}, {@code qz}, {@code re}, {@code ro}, {@code rs},
   * {@code ru}, {@code rw}, {@code sa}, {@code sb}, {@code sc}, {@code sd}, {@code se}, {@code sg},
   * {@code sh}, {@code si}, {@code sj}, {@code sk}, {@code sl}, {@code sm}, {@code sn}, {@code so},
   * {@code sr}, {@code ss}, {@code st}, {@code sv}, {@code sx}, {@code sy}, {@code sz}, {@code tc},
   * {@code td}, {@code tf}, {@code tg}, {@code th}, {@code tj}, {@code tk}, {@code tl}, {@code tm},
   * {@code tn}, {@code to}, {@code tr}, {@code tt}, {@code tv}, {@code tw}, {@code tz}, {@code ua},
   * {@code ug}, {@code um}, {@code us}, {@code uy}, {@code uz}, {@code va}, {@code vc}, {@code ve},
   * {@code vg}, {@code vi}, {@code vn}, {@code vu}, {@code wf}, {@code ws}, {@code xx}, {@code ye},
   * {@code yt}, {@code za}, {@code zm}, or {@code zw}.
   */
  @SerializedName("country")
  String country;

  /** Time at which the object was created. */
  @SerializedName("created")
  Instant created;

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

  /** Metadata associated with the FinancialAccount. */
  @SerializedName("metadata")
  Map<String, String> metadata;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.money_management.financial_account}.
   */
  @SerializedName("object")
  String object;

  /**
   * If this is a {@code other} FinancialAccount, this hash indicates what the actual type is.
   * Upgrade your API version to see it reflected in {@code type}.
   */
  @SerializedName("other")
  Other other;

  /**
   * Closed Enum. An enum representing the status of the FinancialAccount. This indicates whether or
   * not the FinancialAccount can be used for any money movement flows.
   *
   * <p>One of {@code closed}, {@code open}, or {@code pending}.
   */
  @SerializedName("status")
  String status;

  /**
   * If this is a {@code storage} FinancialAccount, this hash includes details specific to {@code
   * storage} FinancialAccounts.
   */
  @SerializedName("storage")
  Storage storage;

  /**
   * Type of the FinancialAccount. An additional hash is included on the FinancialAccount with a
   * name matching this value. It contains additional information specific to the FinancialAccount
   * type.
   *
   * <p>One of {@code other}, or {@code storage}.
   */
  @SerializedName("type")
  String type;

  /**
   * For more details about Balance, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Balance extends StripeObject {
    /** Balance that can be used for money movement. */
    @SerializedName("available")
    Map<String, Amount> available;

    /** Balance of inbound funds that will later transition to the {@code available} balance. */
    @SerializedName("inbound_pending")
    Map<String, Amount> inboundPending;

    /** Balance of funds that are being used for a pending outbound money movement. */
    @SerializedName("outbound_pending")
    Map<String, Amount> outboundPending;
  }

  /**
   * For more details about Other, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Other extends StripeObject {
    /**
     * The type of the FinancialAccount, represented as a string. Upgrade your API version to see
     * the type reflected in {@code financial_account.type}.
     */
    @SerializedName("type")
    String type;
  }

  /**
   * For more details about Storage, please refer to the <a href="https://docs.stripe.com/api">API
   * Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Storage extends StripeObject {
    /** The currencies that this FinancialAccount can hold. */
    @SerializedName("holds_currencies")
    List<String> holdsCurrencies;
  }
}
