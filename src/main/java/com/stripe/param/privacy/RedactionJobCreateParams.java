// File generated from our OpenAPI spec
package com.stripe.param.privacy;

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
public class RedactionJobCreateParams extends ApiRequestParams {
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

  /** <strong>Required.</strong> The objects at the root level that are subject to redaction. */
  @SerializedName("objects")
  Objects objects;

  /**
   * Default is &quot;error&quot;. If &quot;error&quot;, we will make sure all objects in the graph
   * are redactable in the 1st traversal, otherwise error. If &quot;fix&quot;, where possible, we
   * will auto-fix any validation errors (e.g. by auto-transitioning objects to a terminal state,
   * etc.) in the 2nd traversal before redacting
   */
  @SerializedName("validation_behavior")
  ValidationBehavior validationBehavior;

  private RedactionJobCreateParams(
      List<String> expand,
      Map<String, Object> extraParams,
      Objects objects,
      ValidationBehavior validationBehavior) {
    this.expand = expand;
    this.extraParams = extraParams;
    this.objects = objects;
    this.validationBehavior = validationBehavior;
  }

  public static Builder builder() {
    return new Builder();
  }

  public static class Builder {
    private List<String> expand;

    private Map<String, Object> extraParams;

    private Objects objects;

    private ValidationBehavior validationBehavior;

    /** Finalize and obtain parameter instance from this builder. */
    public RedactionJobCreateParams build() {
      return new RedactionJobCreateParams(
          this.expand, this.extraParams, this.objects, this.validationBehavior);
    }

    /**
     * Add an element to `expand` list. A list is initialized for the first `add/addAll` call, and
     * subsequent calls adds additional elements to the original list. See {@link
     * RedactionJobCreateParams#expand} for the field documentation.
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
     * RedactionJobCreateParams#expand} for the field documentation.
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
     * RedactionJobCreateParams#extraParams} for the field documentation.
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
     * See {@link RedactionJobCreateParams#extraParams} for the field documentation.
     */
    public Builder putAllExtraParam(Map<String, Object> map) {
      if (this.extraParams == null) {
        this.extraParams = new HashMap<>();
      }
      this.extraParams.putAll(map);
      return this;
    }

    /** <strong>Required.</strong> The objects at the root level that are subject to redaction. */
    public Builder setObjects(RedactionJobCreateParams.Objects objects) {
      this.objects = objects;
      return this;
    }

    /**
     * Default is &quot;error&quot;. If &quot;error&quot;, we will make sure all objects in the
     * graph are redactable in the 1st traversal, otherwise error. If &quot;fix&quot;, where
     * possible, we will auto-fix any validation errors (e.g. by auto-transitioning objects to a
     * terminal state, etc.) in the 2nd traversal before redacting
     */
    public Builder setValidationBehavior(
        RedactionJobCreateParams.ValidationBehavior validationBehavior) {
      this.validationBehavior = validationBehavior;
      return this;
    }
  }

  @Getter
  @EqualsAndHashCode(callSuper = false)
  public static class Objects {
    @SerializedName("charges")
    List<String> charges;

    @SerializedName("checkout_sessions")
    List<String> checkoutSessions;

    @SerializedName("customers")
    List<String> customers;

    /**
     * Map of extra parameters for custom features not available in this client library. The content
     * in this map is not serialized under this field's {@code @SerializedName} value. Instead, each
     * key/value pair is serialized as if the key is a root-level field (serialized) name in this
     * param object. Effectively, this map is flattened to its parent instance.
     */
    @SerializedName(ApiRequestParams.EXTRA_PARAMS_KEY)
    Map<String, Object> extraParams;

    @SerializedName("identity_verification_sessions")
    List<String> identityVerificationSessions;

    @SerializedName("invoices")
    List<String> invoices;

    @SerializedName("issuing_cardholders")
    List<String> issuingCardholders;

    @SerializedName("issuing_cards")
    List<String> issuingCards;

    @SerializedName("payment_intents")
    List<String> paymentIntents;

    @SerializedName("radar_value_list_items")
    List<String> radarValueListItems;

    @SerializedName("setup_intents")
    List<String> setupIntents;

    private Objects(
        List<String> charges,
        List<String> checkoutSessions,
        List<String> customers,
        Map<String, Object> extraParams,
        List<String> identityVerificationSessions,
        List<String> invoices,
        List<String> issuingCardholders,
        List<String> issuingCards,
        List<String> paymentIntents,
        List<String> radarValueListItems,
        List<String> setupIntents) {
      this.charges = charges;
      this.checkoutSessions = checkoutSessions;
      this.customers = customers;
      this.extraParams = extraParams;
      this.identityVerificationSessions = identityVerificationSessions;
      this.invoices = invoices;
      this.issuingCardholders = issuingCardholders;
      this.issuingCards = issuingCards;
      this.paymentIntents = paymentIntents;
      this.radarValueListItems = radarValueListItems;
      this.setupIntents = setupIntents;
    }

    public static Builder builder() {
      return new Builder();
    }

    public static class Builder {
      private List<String> charges;

      private List<String> checkoutSessions;

      private List<String> customers;

      private Map<String, Object> extraParams;

      private List<String> identityVerificationSessions;

      private List<String> invoices;

      private List<String> issuingCardholders;

      private List<String> issuingCards;

      private List<String> paymentIntents;

      private List<String> radarValueListItems;

      private List<String> setupIntents;

      /** Finalize and obtain parameter instance from this builder. */
      public RedactionJobCreateParams.Objects build() {
        return new RedactionJobCreateParams.Objects(
            this.charges,
            this.checkoutSessions,
            this.customers,
            this.extraParams,
            this.identityVerificationSessions,
            this.invoices,
            this.issuingCardholders,
            this.issuingCards,
            this.paymentIntents,
            this.radarValueListItems,
            this.setupIntents);
      }

      /**
       * Add an element to `charges` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#charges} for the field documentation.
       */
      public Builder addCharge(String element) {
        if (this.charges == null) {
          this.charges = new ArrayList<>();
        }
        this.charges.add(element);
        return this;
      }

      /**
       * Add all elements to `charges` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#charges} for the field documentation.
       */
      public Builder addAllCharge(List<String> elements) {
        if (this.charges == null) {
          this.charges = new ArrayList<>();
        }
        this.charges.addAll(elements);
        return this;
      }

      /**
       * Add an element to `checkoutSessions` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#checkoutSessions} for the field documentation.
       */
      public Builder addCheckoutSession(String element) {
        if (this.checkoutSessions == null) {
          this.checkoutSessions = new ArrayList<>();
        }
        this.checkoutSessions.add(element);
        return this;
      }

      /**
       * Add all elements to `checkoutSessions` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#checkoutSessions} for the field documentation.
       */
      public Builder addAllCheckoutSession(List<String> elements) {
        if (this.checkoutSessions == null) {
          this.checkoutSessions = new ArrayList<>();
        }
        this.checkoutSessions.addAll(elements);
        return this;
      }

      /**
       * Add an element to `customers` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#customers} for the field documentation.
       */
      public Builder addCustomer(String element) {
        if (this.customers == null) {
          this.customers = new ArrayList<>();
        }
        this.customers.add(element);
        return this;
      }

      /**
       * Add all elements to `customers` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#customers} for the field documentation.
       */
      public Builder addAllCustomer(List<String> elements) {
        if (this.customers == null) {
          this.customers = new ArrayList<>();
        }
        this.customers.addAll(elements);
        return this;
      }

      /**
       * Add a key/value pair to `extraParams` map. A map is initialized for the first `put/putAll`
       * call, and subsequent calls add additional key/value pairs to the original map. See {@link
       * RedactionJobCreateParams.Objects#extraParams} for the field documentation.
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
       * See {@link RedactionJobCreateParams.Objects#extraParams} for the field documentation.
       */
      public Builder putAllExtraParam(Map<String, Object> map) {
        if (this.extraParams == null) {
          this.extraParams = new HashMap<>();
        }
        this.extraParams.putAll(map);
        return this;
      }

      /**
       * Add an element to `identityVerificationSessions` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#identityVerificationSessions} for the field
       * documentation.
       */
      public Builder addIdentityVerificationSession(String element) {
        if (this.identityVerificationSessions == null) {
          this.identityVerificationSessions = new ArrayList<>();
        }
        this.identityVerificationSessions.add(element);
        return this;
      }

      /**
       * Add all elements to `identityVerificationSessions` list. A list is initialized for the
       * first `add/addAll` call, and subsequent calls adds additional elements to the original
       * list. See {@link RedactionJobCreateParams.Objects#identityVerificationSessions} for the
       * field documentation.
       */
      public Builder addAllIdentityVerificationSession(List<String> elements) {
        if (this.identityVerificationSessions == null) {
          this.identityVerificationSessions = new ArrayList<>();
        }
        this.identityVerificationSessions.addAll(elements);
        return this;
      }

      /**
       * Add an element to `invoices` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#invoices} for the field documentation.
       */
      public Builder addInvoice(String element) {
        if (this.invoices == null) {
          this.invoices = new ArrayList<>();
        }
        this.invoices.add(element);
        return this;
      }

      /**
       * Add all elements to `invoices` list. A list is initialized for the first `add/addAll` call,
       * and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#invoices} for the field documentation.
       */
      public Builder addAllInvoice(List<String> elements) {
        if (this.invoices == null) {
          this.invoices = new ArrayList<>();
        }
        this.invoices.addAll(elements);
        return this;
      }

      /**
       * Add an element to `issuingCardholders` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#issuingCardholders} for the field documentation.
       */
      public Builder addIssuingCardholder(String element) {
        if (this.issuingCardholders == null) {
          this.issuingCardholders = new ArrayList<>();
        }
        this.issuingCardholders.add(element);
        return this;
      }

      /**
       * Add all elements to `issuingCardholders` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#issuingCardholders} for the field documentation.
       */
      public Builder addAllIssuingCardholder(List<String> elements) {
        if (this.issuingCardholders == null) {
          this.issuingCardholders = new ArrayList<>();
        }
        this.issuingCardholders.addAll(elements);
        return this;
      }

      /**
       * Add an element to `issuingCards` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#issuingCards} for the field documentation.
       */
      public Builder addIssuingCard(String element) {
        if (this.issuingCards == null) {
          this.issuingCards = new ArrayList<>();
        }
        this.issuingCards.add(element);
        return this;
      }

      /**
       * Add all elements to `issuingCards` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#issuingCards} for the field documentation.
       */
      public Builder addAllIssuingCard(List<String> elements) {
        if (this.issuingCards == null) {
          this.issuingCards = new ArrayList<>();
        }
        this.issuingCards.addAll(elements);
        return this;
      }

      /**
       * Add an element to `paymentIntents` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#paymentIntents} for the field documentation.
       */
      public Builder addPaymentIntent(String element) {
        if (this.paymentIntents == null) {
          this.paymentIntents = new ArrayList<>();
        }
        this.paymentIntents.add(element);
        return this;
      }

      /**
       * Add all elements to `paymentIntents` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#paymentIntents} for the field documentation.
       */
      public Builder addAllPaymentIntent(List<String> elements) {
        if (this.paymentIntents == null) {
          this.paymentIntents = new ArrayList<>();
        }
        this.paymentIntents.addAll(elements);
        return this;
      }

      /**
       * Add an element to `radarValueListItems` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#radarValueListItems} for the field documentation.
       */
      public Builder addRadarValueListItem(String element) {
        if (this.radarValueListItems == null) {
          this.radarValueListItems = new ArrayList<>();
        }
        this.radarValueListItems.add(element);
        return this;
      }

      /**
       * Add all elements to `radarValueListItems` list. A list is initialized for the first
       * `add/addAll` call, and subsequent calls adds additional elements to the original list. See
       * {@link RedactionJobCreateParams.Objects#radarValueListItems} for the field documentation.
       */
      public Builder addAllRadarValueListItem(List<String> elements) {
        if (this.radarValueListItems == null) {
          this.radarValueListItems = new ArrayList<>();
        }
        this.radarValueListItems.addAll(elements);
        return this;
      }

      /**
       * Add an element to `setupIntents` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#setupIntents} for the field documentation.
       */
      public Builder addSetupIntent(String element) {
        if (this.setupIntents == null) {
          this.setupIntents = new ArrayList<>();
        }
        this.setupIntents.add(element);
        return this;
      }

      /**
       * Add all elements to `setupIntents` list. A list is initialized for the first `add/addAll`
       * call, and subsequent calls adds additional elements to the original list. See {@link
       * RedactionJobCreateParams.Objects#setupIntents} for the field documentation.
       */
      public Builder addAllSetupIntent(List<String> elements) {
        if (this.setupIntents == null) {
          this.setupIntents = new ArrayList<>();
        }
        this.setupIntents.addAll(elements);
        return this;
      }
    }
  }

  public enum ValidationBehavior implements ApiRequestParams.EnumParam {
    @SerializedName("error")
    ERROR("error"),

    @SerializedName("fix")
    FIX("fix");

    @Getter(onMethod_ = {@Override})
    private final String value;

    ValidationBehavior(String value) {
      this.value = value;
    }
  }
}
