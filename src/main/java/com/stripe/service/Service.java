package com.stripe.service;

import com.stripe.exception.StripeException;
import com.stripe.model.StripeObjectInterface;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.RequestOptions;
import com.stripe.net.StripeClient;
import java.lang.reflect.Type;

public abstract class Service<TObjectReturned extends StripeObjectInterface> {
  private StripeClient client;

  protected Service(StripeClient client) {
    this.client = client;
  }

  public String getBaseUrl() {
    return this.getClient().getApiBase();
  }

  public StripeClient getClient() {
    return this.client;
  }

  public void setClient(StripeClient client) {
    this.client = client;
  }

  public <T extends StripeObjectInterface> T request(
      Type typeOfT,
      ApiResource.RequestMethod method,
      String path,
      ApiRequestParams params,
      RequestOptions options)
      throws StripeException {
    options = this.setupRequestOptions(options);
    return this.getClient().request(typeOfT, method, path, params, options);
  }

  protected RequestOptions setupRequestOptions(RequestOptions options) {
    if (options == null) {
      options =
          RequestOptions.builder()
              .setApiKey(this.getClient().getApiKey())
              .setClientId(this.getClient().getClientId())
              .build();
    }

    if (options.getBaseUrl() == null) {
      options = options.withBaseUrl(this.getBaseUrl());
    }

    return options;
  }
}
