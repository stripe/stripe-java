// File generated from our OpenAPI spec
package com.stripe.model.identity;

import com.google.gson.annotations.SerializedName;
import com.stripe.exception.StripeException;
import com.stripe.model.ExpandableField;
import com.stripe.model.HasId;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.identity.BlocklistEntryCreateParams;
import com.stripe.param.identity.BlocklistEntryDisableParams;
import com.stripe.param.identity.BlocklistEntryListParams;
import com.stripe.param.identity.BlocklistEntryRetrieveParams;
import java.util.Map;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;

/**
 * A BlocklistEntry represents an entry in our identity verification blocklist. It helps prevent
 * fraudulent users from repeatedly attempting verification with similar information. When you
 * create a BlocklistEntry, we store data from a specified VerificationReport, such as document
 * details or facial biometrics. This allows us to compare future verification attempts against
 * these entries. If a match is found, we categorize the new verification as unverified.
 *
 * <p>To learn more, see <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
 * Verification Blocklist</a>
 */
@Getter
@Setter
@EqualsAndHashCode(callSuper = false)
public class BlocklistEntry extends ApiResource implements HasId {
  /** Time at which the object was created. Measured in seconds since the Unix epoch. */
  @SerializedName("created")
  Long created;

  /** Time at which you disabled the BlocklistEntry. Measured in seconds since the Unix epoch. */
  @SerializedName("disabled_at")
  Long disabledAt;

  /** Time at which the BlocklistEntry expires. Measured in seconds since the Unix epoch. */
  @SerializedName("expires_at")
  Long expiresAt;

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

  /**
   * String representing the object's type. Objects of the same type share the same value.
   *
   * <p>Equal to {@code identity.blocklist_entry}.
   */
  @SerializedName("object")
  String object;

  /**
   * The current status of the BlocklistEntry.
   *
   * <p>One of {@code active}, {@code disabled}, or {@code redacted}.
   */
  @SerializedName("status")
  String status;

  /**
   * The type of BlocklistEntry.
   *
   * <p>One of {@code document}, or {@code selfie}.
   */
  @SerializedName("type")
  String type;

  /** The verification report the BlocklistEntry was created from. */
  @SerializedName("verification_report")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<VerificationReport> verificationReport;

  /** The verification session the BlocklistEntry was created from. */
  @SerializedName("verification_session")
  @Getter(lombok.AccessLevel.NONE)
  @Setter(lombok.AccessLevel.NONE)
  ExpandableField<VerificationSession> verificationSession;

  /** Get ID of expandable {@code verificationReport} object. */
  public String getVerificationReport() {
    return (this.verificationReport != null) ? this.verificationReport.getId() : null;
  }

  public void setVerificationReport(String id) {
    this.verificationReport = ApiResource.setExpandableFieldId(id, this.verificationReport);
  }

  /** Get expanded {@code verificationReport}. */
  public VerificationReport getVerificationReportObject() {
    return (this.verificationReport != null) ? this.verificationReport.getExpanded() : null;
  }

  public void setVerificationReportObject(VerificationReport expandableObject) {
    this.verificationReport =
        new ExpandableField<VerificationReport>(expandableObject.getId(), expandableObject);
  }

  /** Get ID of expandable {@code verificationSession} object. */
  public String getVerificationSession() {
    return (this.verificationSession != null) ? this.verificationSession.getId() : null;
  }

  public void setVerificationSession(String id) {
    this.verificationSession = ApiResource.setExpandableFieldId(id, this.verificationSession);
  }

  /** Get expanded {@code verificationSession}. */
  public VerificationSession getVerificationSessionObject() {
    return (this.verificationSession != null) ? this.verificationSession.getExpanded() : null;
  }

  public void setVerificationSessionObject(VerificationSession expandableObject) {
    this.verificationSession =
        new ExpandableField<VerificationSession>(expandableObject.getId(), expandableObject);
  }

  /**
   * Creates a BlocklistEntry object from a verification report.
   *
   * <p>A blocklist entry prevents future identity verifications that match the same identity
   * information. You can create blocklist entries from verification reports that contain document
   * extracted data or a selfie.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#add-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public static BlocklistEntry create(Map<String, Object> params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a BlocklistEntry object from a verification report.
   *
   * <p>A blocklist entry prevents future identity verifications that match the same identity
   * information. You can create blocklist entries from verification reports that contain document
   * extracted data or a selfie.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#add-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public static BlocklistEntry create(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getGlobalResponseGetter().request(request, BlocklistEntry.class);
  }

  /**
   * Creates a BlocklistEntry object from a verification report.
   *
   * <p>A blocklist entry prevents future identity verifications that match the same identity
   * information. You can create blocklist entries from verification reports that contain document
   * extracted data or a selfie.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#add-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public static BlocklistEntry create(BlocklistEntryCreateParams params) throws StripeException {
    return create(params, (RequestOptions) null);
  }

  /**
   * Creates a BlocklistEntry object from a verification report.
   *
   * <p>A blocklist entry prevents future identity verifications that match the same identity
   * information. You can create blocklist entries from verification reports that contain document
   * extracted data or a selfie.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#add-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public static BlocklistEntry create(BlocklistEntryCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BlocklistEntry.class);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable() throws StripeException {
    return disable((Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable(RequestOptions options) throws StripeException {
    return disable((Map<String, Object>) null, options);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable(Map<String, Object> params) throws StripeException {
    return disable(params, (RequestOptions) null);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/blocklist_entries/%s/disable", ApiResource.urlEncodeId(this.getId()));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.POST, path, params, options);
    return getResponseGetter().request(request, BlocklistEntry.class);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable(BlocklistEntryDisableParams params) throws StripeException {
    return disable(params, (RequestOptions) null);
  }

  /**
   * Disables a BlocklistEntry object.
   *
   * <p>After a BlocklistEntry is disabled, it will no longer block future verifications that match
   * the same information. This action is irreversible. To re-enable it, a new BlocklistEntry must
   * be created using the same verification report.
   *
   * <p>Related guide: <a
   * href="https://stripe.com/docs/identity/review-tools#disable-a-blocklist-entry">Identity
   * Verification Blocklist</a>
   */
  public BlocklistEntry disable(BlocklistEntryDisableParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v1/identity/blocklist_entries/%s/disable", ApiResource.urlEncodeId(this.getId()));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getResponseGetter().request(request, BlocklistEntry.class);
  }

  /**
   * Returns a list of BlocklistEntry objects associated with your account.
   *
   * <p>The blocklist entries are returned sorted by creation date, with the most recently created
   * entries appearing first.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntryCollection list(Map<String, Object> params) throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of BlocklistEntry objects associated with your account.
   *
   * <p>The blocklist entries are returned sorted by creation date, with the most recently created
   * entries appearing first.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntryCollection list(Map<String, Object> params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, BlocklistEntryCollection.class);
  }

  /**
   * Returns a list of BlocklistEntry objects associated with your account.
   *
   * <p>The blocklist entries are returned sorted by creation date, with the most recently created
   * entries appearing first.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntryCollection list(BlocklistEntryListParams params)
      throws StripeException {
    return list(params, (RequestOptions) null);
  }

  /**
   * Returns a list of BlocklistEntry objects associated with your account.
   *
   * <p>The blocklist entries are returned sorted by creation date, with the most recently created
   * entries appearing first.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntryCollection list(
      BlocklistEntryListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BlocklistEntryCollection.class);
  }

  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntry retrieve(String id) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, (RequestOptions) null);
  }

  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntry retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (Map<String, Object>) null, options);
  }

  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntry retrieve(
      String id, Map<String, Object> params, RequestOptions options) throws StripeException {
    String path = String.format("/v1/identity/blocklist_entries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, params, options);
    return getGlobalResponseGetter().request(request, BlocklistEntry.class);
  }

  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public static BlocklistEntry retrieve(
      String id, BlocklistEntryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/identity/blocklist_entries/%s", ApiResource.urlEncodeId(id));
    ApiResource.checkNullTypedParams(path, params);
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return getGlobalResponseGetter().request(request, BlocklistEntry.class);
  }

  @Override
  public void setResponseGetter(StripeResponseGetter responseGetter) {
    super.setResponseGetter(responseGetter);
    trySetResponseGetter(verificationReport, responseGetter);
    trySetResponseGetter(verificationSession, responseGetter);
  }
}
