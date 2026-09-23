// File generated from our OpenAPI spec
package com.stripe.model.apps;

import com.google.gson.annotations.SerializedName;
import com.stripe.model.HasId;
import com.stripe.model.StripeObject;
import java.util.List;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * An app install represents a Stripe App that is installed on an account. It reports the
 * permissions, content security policy entries, and endpoints that the installing account has
 * authorized, along with any that the app's latest version requests but the account has not
 * authorized yet. Use the Install API to install, reauthorize, and uninstall apps, and to check the
 * state of existing installs.
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class Install extends StripeObject implements HasId {
  /** The ID of the account that the app install belongs to. */
  @SerializedName("account")
  String account;

  /** The ID of the app installed. */
  @SerializedName("app")
  String app;

  /**
   * Whether the installer must authorize pending permissions, content security policy entries, or
   * endpoints. For private apps, {@code approval_required} stays {@code false}. Install a new
   * version from the Dashboard to grant its permissions.
   */
  @SerializedName("approval_required")
  Boolean approvalRequired;

  /** The authorization code for an oauth app install. */
  @SerializedName("auth_code")
  String authCode;

  @SerializedName("authorized_content_security_policy")
  AuthorizedContentSecurityPolicy authorizedContentSecurityPolicy;

  /** The endpoint URLs authorized by the installer. */
  @SerializedName("authorized_endpoints")
  List<String> authorizedEndpoints;

  /** The permissions authorized by the installer. */
  @SerializedName("authorized_permissions")
  List<String> authorizedPermissions;

  /** The distribution channel associated with the app install. */
  @SerializedName("channel")
  String channel;

  /** The content security policy entries authorized by the installer. */
  @SerializedName("content_security_policy_granted")
  ContentSecurityPolicyGranted contentSecurityPolicyGranted;

  @SerializedName("content_security_policy_pending")
  ContentSecurityPolicyPending contentSecurityPolicyPending;

  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** The ID of the embedding platform that created the install, if applicable. */
  @SerializedName("created_by")
  String createdBy;

  /** The endpoint URLs authorized by the installer. */
  @SerializedName("endpoints_granted")
  List<String> endpointsGranted;

  /**
   * The endpoint URLs requested by the latest app version that the installer has not authorized.
   */
  @SerializedName("endpoints_pending")
  List<String> endpointsPending;

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
   * <p>Equal to {@code apps.install}.
   */
  @SerializedName("object")
  String object;

  /** The permissions authorized by the installer. */
  @SerializedName("permissions_granted")
  List<String> permissionsGranted;

  /** The permissions requested by the latest app version that the installer has not authorized. */
  @SerializedName("permissions_pending")
  List<String> permissionsPending;

  /** The status of the app install. */
  @SerializedName("state")
  String state;

  /**
   * The status of the app install.
   *
   * <p>One of {@code install_failed}, {@code installed}, {@code installing}, {@code
   * uninstall_failed}, or {@code uninstalling}.
   */
  @SerializedName("status")
  String status;

  /**
   * For more details about AuthorizedContentSecurityPolicy, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class AuthorizedContentSecurityPolicy extends StripeObject {
    @SerializedName("connect_src")
    List<String> connectSrc;

    @SerializedName("image_src")
    List<String> imageSrc;

    @SerializedName("purpose")
    String purpose;
  }

  /**
   * For more details about ContentSecurityPolicyGranted, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContentSecurityPolicyGranted extends StripeObject {
    /** The URLs that the app can make network requests to. */
    @SerializedName("connect_src")
    List<String> connectSrc;

    /** The URLs that the app can load images from. */
    @SerializedName("image_src")
    List<String> imageSrc;
  }

  /**
   * For more details about ContentSecurityPolicyPending, please refer to the <a
   * href="https://docs.stripe.com/api">API Reference.</a>
   */
  @Getter
  @Setter
  @EqualsAndHashCode(callSuper = false)
  public static class ContentSecurityPolicyPending extends StripeObject {
    /** The URLs that the app can make network requests to. */
    @SerializedName("connect_src")
    List<String> connectSrc;

    /** The URLs that the app can load images from. */
    @SerializedName("image_src")
    List<String> imageSrc;
  }
}
