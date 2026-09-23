// File generated from our OpenAPI spec
package com.stripe.service.v2.moneymanagement.financialaccounts;

import com.stripe.exception.ServiceUnavailableException;
import com.stripe.exception.StripeException;
import com.stripe.model.v2.moneymanagement.FinancialAccountWalletExport;
import com.stripe.model.v2.moneymanagement.FinancialAccountWalletExportCredentials;
import com.stripe.net.ApiRequest;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.ApiService;
import com.stripe.net.BaseAddress;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeResponseGetter;
import com.stripe.param.v2.moneymanagement.financialaccounts.WalletExportExportCredentialsParams;

public final class WalletExportService extends ApiService {
  public WalletExportService(StripeResponseGetter responseGetter) {
    super(responseGetter);
  }

  /**
   * Retrieves the wallet export metadata for a closed FinancialAccount. Credentials are returned
   * only by the export_credentials action.
   */
  public FinancialAccountWalletExport retrieve(String id) throws StripeException {
    return retrieve(id, (RequestOptions) null);
  }
  /**
   * Retrieves the wallet export metadata for a closed FinancialAccount. Credentials are returned
   * only by the export_credentials action.
   */
  public FinancialAccountWalletExport retrieve(String id, RequestOptions options)
      throws StripeException {
    String path =
        String.format(
            "/v2/money_management/financial_accounts/%s/wallet_export",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(BaseAddress.API, ApiResource.RequestMethod.GET, path, null, options);
    return this.request(request, FinancialAccountWalletExport.class);
  }
  /**
   * Exports wallet credentials encrypted to the supplied recipient key. The first successful
   * request starts one fixed one-hour retrieval window; later requests may use a different
   * recipient key without extending it.
   */
  public FinancialAccountWalletExportCredentials exportCredentials(
      String id, WalletExportExportCredentialsParams params)
      throws StripeException, ServiceUnavailableException {
    return exportCredentials(id, params, (RequestOptions) null);
  }
  /**
   * Exports wallet credentials encrypted to the supplied recipient key. The first successful
   * request starts one fixed one-hour retrieval window; later requests may use a different
   * recipient key without extending it.
   */
  public FinancialAccountWalletExportCredentials exportCredentials(
      String id, WalletExportExportCredentialsParams params, RequestOptions options)
      throws StripeException, ServiceUnavailableException {
    String path =
        String.format(
            "/v2/money_management/financial_accounts/%s/wallet_export/export_credentials",
            ApiResource.urlEncodeId(id));
    ApiRequest request =
        new ApiRequest(
            BaseAddress.API,
            ApiResource.RequestMethod.POST,
            path,
            ApiRequestParams.paramsToMap(params),
            options);
    return this.request(request, FinancialAccountWalletExportCredentials.class);
  }
}
