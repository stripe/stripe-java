// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * The {@code ProviderServiceDetail} resource represents a service offered by a provider in the
 * catalog.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProviderServiceDetail extends StripeObject implements HasId {
  /** Updates allowed for resources using this service. */
  @SerializedName("allowed_updates")
  List<ProviderServiceDetail.AllowedUpdate> allowedUpdates;

  /**
   * Availability of the service.
   *
   * <p>One of {@code available}, {@code not_in_country}, or {@code unavailable}.
   */
  @SerializedName("availability")
  String availability;

  /** Categories the service belongs to. */
  @SerializedName("categories")
  List<String> categories;

  /** Schema describing the configuration accepted by this service. */
  @SerializedName("configuration_schema")
  Map<String, Object> configurationSchema;

  /** Constraints on resources using this service. */
  @SerializedName("constraints")
  List<ProviderServiceDetail.Constraint> constraints;

  /** Time at which the service was created. */
  @SerializedName("created")
  Instant created;

  /** Description of the service. */
  @SerializedName("description")
  String description;

  /**
   * Denormalized from the parent Provider. If a Provider's partition changes, re-sync its services.
   * proto3 scalar defaults apply: if unset, this value is {@code false}.
   */
  @SerializedName("development")
  Boolean development;

  /** Group the service belongs to, used to organize related services. */
  @SerializedName("group")
  String group;

  /** Unique identifier for the provider service. */
  @Getter(onMethod_ = {@Override})
  @SerializedName("id")
  String id;

  /**
   * Kind of the service.
   *
   * <p>One of {@code deployable}, or {@code plan}.
   */
  @SerializedName("kind")
  String kind;

  /**
   * Has the value {@code true} if the object exists in live mode or the value {@code false} if the
   * object exists in test mode.
   */
  @SerializedName("livemode")
  Boolean livemode;

  /** URL of additional context about the service intended for LLM consumption. */
  @SerializedName("llm_context")
  String llmContext;

  /**
   * String representing the object's type. Objects of the same type share the same value of the
   * object field.
   *
   * <p>Equal to {@code v2.provisioning.provider_service_detail}.
   */
  @SerializedName("object")
  String object;

  /** Pricing details for the service. */
  @SerializedName("pricing")
  Pricing pricing;

  /** Identifier of the provider that offers this service. */
  @SerializedName("provider")
  String provider;

  /** Human-readable name of the provider that offers this service. */
  @SerializedName("provider_name")
  String providerName;

  /**
   * Scope of the service.
   *
   * <p>One of {@code account}, or {@code project}.
   */
  @SerializedName("scope")
  String scope;

  /** Identifier of the service, unique within its provider. */
  @SerializedName("service_id")
  String serviceId;

  /** Deprecated: use allowed_updates instead. */
  @SerializedName("updateable_to")
  List<String> updateableTo;

  /**
   * For more details about AllowedUpdate, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AllowedUpdate extends StripeObject {
    @SerializedName("direction")
    String direction;

    @SerializedName("service")
    String service;
  }

  /**
   * For more details about Constraint, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Constraint extends StripeObject {
    @SerializedName("count")
    Count count;

    @SerializedName("mutual_exclusion_allowed_updates")
    Boolean mutualExclusionAllowedUpdates;

    @SerializedName("type")
    String type;

    /**
     * For more details about Count, please refer to the <a href="https://docs.stripe.com/api">API
     * Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Count extends StripeObject {
      @SerializedName("at_most")
      Long atMost;
    }
  }

  /** Pricing details for the service. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class Pricing extends StripeObject {
    @SerializedName("component")
    Component component;

    /**
     * Legacy compatibility field for top-level paid pricing. Mirrors the single paid pricing entry
     * when only one exists, or the entry marked {@code is_default}. If multiple paid pricing
     * entries exist and none is default, this field is unset.
     */
    @SerializedName("paid")
    Paid paid;

    /**
     * Canonical top-level paid pricing entries for this service. When multiple entries are present,
     * callers should read this field instead of {@code paid}.
     */
    @SerializedName("paid_pricing")
    List<ProviderServiceDetail.Pricing.PaidPricing> paidPricing;

    @SerializedName("type")
    String type;

    /**
     * For more details about Component, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Component extends StripeObject {
      @SerializedName("options")
      List<ProviderServiceDetail.Pricing.Component.Option> options;

      /**
       * For more details about Option, please refer to the <a
       * href="https://docs.stripe.com/api">API Reference.</a>
       */
      @Getter
      @Setter
      @EqualsAndHashCode(callSuper = false)
      public static class Option extends StripeObject {
        @SerializedName("is_default")
        Boolean isDefault;

        @SerializedName("paid")
        Paid paid;

        @SerializedName("parent_services")
        List<String> parentServices;

        @SerializedName("type")
        String type;

        /**
         * For more details about Paid, please refer to the <a
         * href="https://docs.stripe.com/api">API Reference.</a>
         */
        @Getter
        @Setter
        @EqualsAndHashCode(callSuper = false)
        public static class Paid extends StripeObject {
          @SerializedName("description")
          String description;

          @SerializedName("freeform")
          String freeform;

          @SerializedName("type")
          String type;
        }
      }
    }

    /**
     * Legacy compatibility field for top-level paid pricing. Mirrors the single paid pricing entry
     * when only one exists, or the entry marked {@code is_default}. If multiple paid pricing
     * entries exist and none is default, this field is unset.
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class Paid extends StripeObject {
      @SerializedName("description")
      String description;

      @SerializedName("freeform")
      String freeform;

      @SerializedName("type")
      String type;
    }

    /**
     * For more details about PaidPricing, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class PaidPricing extends StripeObject {
      @SerializedName("configuration")
      Map<String, Object> configuration;

      @SerializedName("description")
      String description;

      @SerializedName("freeform")
      String freeform;

      @SerializedName("is_default")
      Boolean isDefault;

      @SerializedName("type")
      String type;
    }
  }
}
