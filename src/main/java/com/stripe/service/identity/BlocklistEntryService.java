// File generated from our OpenAPI spec
package com.stripe.service.identity;

import com.google.gson.reflect.TypeToken;
import com.stripe.exception.StripeException;
import com.stripe.model.StripeCollection;
import com.stripe.model.identity.BlocklistEntry;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.identity.BlocklistEntryCreateParams;
import com.stripe.param.identity.BlocklistEntryDisableParams;
import com.stripe.param.identity.BlocklistEntryListParams;
import com.stripe.param.identity.BlocklistEntryRetrieveParams;

public final class BlocklistEntryService extends ApiService {
  public BlocklistEntryService(StripeResponseGetter responseGetter) {
    super(responseGetter);
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
  public StripeCollection<BlocklistEntry> list(BlocklistEntryListParams params)
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
  public StripeCollection<BlocklistEntry> list(RequestOptions options) throws StripeException {
    return list((BlocklistEntryListParams) null, options);
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
  public StripeCollection<BlocklistEntry> list() throws StripeException {
    return list((BlocklistEntryListParams) null, (RequestOptions) null);
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
  public StripeCollection<BlocklistEntry> list(
      BlocklistEntryListParams params, RequestOptions options) throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, new TypeToken<StripeCollection<BlocklistEntry>>() {}.getType());
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
  public BlocklistEntry create(BlocklistEntryCreateParams params) throws StripeException {
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
  public BlocklistEntry create(BlocklistEntryCreateParams params, RequestOptions options)
      throws StripeException {
    String path = "/v1/identity/blocklist_entries";
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BlocklistEntry.class);
  }
  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public BlocklistEntry retrieve(String id, BlocklistEntryRetrieveParams params)
      throws StripeException {
    return retrieve(id, params, (RequestOptions) null);
  }
  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public BlocklistEntry retrieve(String id, RequestOptions options) throws StripeException {
    return retrieve(id, (BlocklistEntryRetrieveParams) null, options);
  }
  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public BlocklistEntry retrieve(String id) throws StripeException {
    return retrieve(id, (BlocklistEntryRetrieveParams) null, (RequestOptions) null);
  }
  /**
   * Retrieves a BlocklistEntry object by its identifier.
   *
   * <p>Related guide: <a href="https://stripe.com/docs/identity/review-tools#block-list">Identity
   * Verification Blocklist</a>.
   */
  public BlocklistEntry retrieve(
      String id, BlocklistEntryRetrieveParams params, RequestOptions options)
      throws StripeException {
    String path = String.format("/v1/identity/blocklist_entries/%s", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.GET,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BlocklistEntry.class);
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
  public BlocklistEntry disable(String id, BlocklistEntryDisableParams params)
      throws StripeException {
    return disable(id, params, (RequestOptions) null);
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
  public BlocklistEntry disable(String id, RequestOptions options) throws StripeException {
    return disable(id, (BlocklistEntryDisableParams) null, options);
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
  public BlocklistEntry disable(String id) throws StripeException {
    return disable(id, (BlocklistEntryDisableParams) null, (RequestOptions) null);
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
  public BlocklistEntry disable(
      String id, BlocklistEntryDisableParams params, RequestOptions options)
      throws StripeException {
    String path =
        String.format("/v1/identity/blocklist_entries/%s/disable", ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, BlocklistEntry.class);
  }
}
