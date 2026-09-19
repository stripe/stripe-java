// File generated from our OpenAPI spec
package com.stripe.model.v2.provisioning;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.time.Instant;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A ProviderConnection represents a link between a project and a provider account that resources
 * can be created against; unlinking it prevents further resource creation.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class ProviderConnection extends StripeObject implements HasId {
  /** Time at which the provider connection was created. */
  @SerializedName("created")
  Instant created;

  /** Unique identifier for the provider connection. */
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
   * <p>Equal to {@code v2.provisioning.provider_connection}.
   */
  @SerializedName("object")
  String object;

  /** Identifier of the provider this connection is linked to. */
  @SerializedName("provider")
  String provider;

  /** Identifier of the connected account at the provider, if one has been established. */
  @SerializedName("provider_account")
  String providerAccount;

  /** Details about the connected provider account. */
  @SerializedName("provider_account_details")
  ProviderAccountDetails providerAccountDetails;

  /**
   * Current status of the provider connection.
   *
   * <p>One of {@code active}, {@code expired}, or {@code unknown}.
   */
  @SerializedName("status")
  String status;

  /** Details about the connected provider account. */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ProviderAccountDetails extends StripeObject implements HasId {
    /** Services active for the connected account. */
    @SerializedName("active_services")
    List<ProviderConnection.ProviderAccountDetails.ActiveService> activeServices;

    /** True when the provider explicitly supplied active_services, including an empty array. */
    @SerializedName("active_services_provided")
    Boolean activeServicesProvided;

    /** Display name of the connected account. */
    @SerializedName("display_name")
    String displayName;

    /** Identifier of the connected account at the provider. */
    @Getter(onMethod_ = {@Override})
    @SerializedName("id")
    String id;

    /**
     * Action taken when the account was linked.
     *
     * <p>One of {@code created}, or {@code linked_existing}.
     */
    @SerializedName("link_action")
    String linkAction;

    /** Primary email address of the connected account. */
    @SerializedName("primary_email")
    String primaryEmail;

    /**
     * For more details about ActiveService, please refer to the <a
     * href="https://docs.stripe.com/api">API Reference.</a>
     */
    @Getter
    @Setter
    @EqualsAndHashCode(callSuper = false)
    public static class ActiveService extends StripeObject {
      /** Display name of the service. */
      @SerializedName("display_name")
      String displayName;

      /** Identifier of the resource at the provider that backs this service, if any. */
      @SerializedName("provider_resource_id")
      String providerResourceId;

      /** Identifier of the service at the provider. */
      @SerializedName("service_id")
      String serviceId;

      /**
       * Current status of the service.
       *
       * <p>One of {@code active}, {@code inactive}, or {@code pending}.
       */
      @SerializedName("status")
      String status;
    }
  }
}
