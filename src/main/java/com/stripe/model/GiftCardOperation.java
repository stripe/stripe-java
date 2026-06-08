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
import com.stripe.param.GiftCardOperationRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A GiftCardOperation represents an operation performed on a third-party gift card, such as
 * activation, deactivation, reload, cashout, balance check, or void.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class GiftCardOperation extends ApiResource implements HasId {
  /** Details about a gift card activation operation. */
  @SerializedName("activation")
  Activation activation;

  /** Details about a gift card activation void operation. */
  @SerializedName("activation_void")
  ActivationVoid activationVoid;

  /** Details about a gift card balance check operation. */
  @SerializedName("balance_check")
  BalanceCheck balanceCheck;

  /** Details about a gift card cashout operation. */
  @SerializedName("cashout")
  Cashout cashout;

  /** Details about a gift card cashout void operation. */
  @SerializedName("cashout_void")
  CashoutVoid cashoutVoid;

  /** The timestamp of when this operation was completed. */
  @SerializedName("completed_at")
  Long completedAt;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Details about a gift card deactivation operation. */
  @SerializedName("deactivation")
  Deactivation deactivation;

  /**
   * The failure code of the operation. Only present if the status is failed.
   *
   * <p>One of {@code action_not_supported}, {@code card_already_activated}, {@code card_expired},
   * {@code card_not_activated}, {@code do_not_honor}, {@code generic_failure}, {@code
   * insufficient_balance}, {@code invalid_amount}, {@code invalid_currency}, {@code
   * invalid_number}, {@code invalid_pin}, {@code invalid_track_data}, {@code lost_card}, {@code
   * lost_or_stolen_card}, {@code pin_required}, {@code pin_tries_exceeded}, {@code
   * processing_error}, {@code provider_unavailable}, {@code stolen_card}, {@code suspected_fraud},
   * or {@code timeout}.
   */
  @SerializedName("failure_code")
  String failureCode;

  /** The gift card this operation was performed on. */
  @SerializedName("gift_card")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<GiftCard> giftCard;

  /** Unique identifier for the object. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * If the object exists in live mode, the value is {@code true}. If the object exists in test
   * mode, the value is {@code false}.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code gift_card_operation}.
   */
  @SerializedName("object")
  String object;

  /** The connected account whose credentials were used to perform this operation. */
  @SerializedName("on_behalf_of")
  String onBehalfOf;

  /** Details about a gift card reload operation. */
  @SerializedName("reload")
  Reload reload;

  /** Details about a gift card reload void operation. */
  @SerializedName("reload_void")
  ReloadVoid reloadVoid;

  /**
   * The status of the operation.
   *
   * <p>One of {@code failed}, or {@code succeeded}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of operation performed.
   *
   * <p>One of {@code activation}, {@code activation_void}, {@code balance_check}, {@code cashout},
   * {@code cashout_void}, {@code deactivation}, {@code reload}, or {@code reload_void}.
   */
  @SerializedName("type")
  String type;

  /** Get ID of expandable {@code giftCard} object. */
  public String getGiftCard() {
    return (this.giftCard != null) ? this.giftCard.getId() : null;
  }

  public void setGiftCard(String id) {
    this.giftCard = ApiResource.setExpandableFieldId(id, this.giftCard);
  }

  /** Get expanded {@code giftCard}. */
  public GiftCard getGiftCardObject() {
    return (this.giftCard != null) ? this.giftCard.getExpanded() : null;
  }

  public void setGiftCardObject(GiftCard expandableObject) {
    this.giftCard = new ExpandableField<GiftCard>(expandableObject.getId(), expandableObject);
  }

  /** Retrieves a third-party gift card operation object. */
  public static GiftCardOperation retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /** Retrieves a third-party gift card operation object. */
  public static GiftCardOperation retrieve(String id, RequestOptions options)
      throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /** Retrieves a third-party gift card operation object. */
  public static GiftCardOperation retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/gift_card_operations/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Retrieves a third-party gift card operation object. */
  public static GiftCardOperation retrieve(
      String id, GiftCardOperationRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/gift_card_operations/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, GiftCardOperation.class);
  }

  /** Details about a gift card activation operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Activation extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  /** Details about a gift card activation void operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ActivationVoid extends StripeObject {
    /** The operation that was voided. */
    @SerializedName("voided_operation")
    String voidedOperation;
  }

  /** Details about a gift card balance check operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class BalanceCheck extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  /** Details about a gift card cashout operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Cashout extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The balance before the operation. */
    @SerializedName("previous_balance")
    PreviousBalance previousBalance;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PreviousBalance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  /** Details about a gift card cashout void operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class CashoutVoid extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The operation that was voided. */
    @SerializedName("voided_operation")
    String voidedOperation;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  /** Details about a gift card deactivation operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Deactivation extends StripeObject {}

  /** Details about a gift card reload operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Reload extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The balance before the operation. */
    @SerializedName("previous_balance")
    PreviousBalance previousBalance;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PreviousBalance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  /** Details about a gift card reload void operation. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ReloadVoid extends StripeObject {
    /** The balance amount of a gift card, including currency and amount. */
    @SerializedName("balance")
    Balance balance;

    /** The operation that was voided. */
    @SerializedName("voided_operation")
    String voidedOperation;

    /** The balance amount of a gift card, including currency and amount. */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Balance extends StripeObject {
      /** The balance amount. */
      @SerializedName("amount")
      Long amount;

      /** The currency of the balance. */
      @SerializedName("currency")
      String currency;
    }
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(activation, responseGetter);
    trySetResponseGetter(activationVoid, responseGetter);
    trySetResponseGetter(balanceCheck, responseGetter);
    trySetResponseGetter(cashout, responseGetter);
    trySetResponseGetter(cashoutVoid, responseGetter);
    trySetResponseGetter(deactivation, responseGetter);
    trySetResponseGetter(giftCard, responseGetter);
    trySetResponseGetter(reload, responseGetter);
    trySetResponseGetter(reloadVoid, responseGetter);
  }
}
