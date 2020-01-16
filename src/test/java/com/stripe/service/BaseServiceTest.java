package com.stripe.service;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.exception.StripeException;
import com.stripe.net.ApiRequestParams;
import com.stripe.net.ApiResource;
import com.stripe.net.HttpClient;
import com.stripe.net.HttpURLConnectionClient;
import com.stripe.net.StripeClient;
import com.stripe.net.StripeRequest;
import org.junit.jupiter.api.BeforeEach;
import org.mockito.ArgumentCaptor;
import org.mockito.Mockito;

public class BaseServiceTest {
  protected StripeClient client;

  @BeforeEach
  public void setUpClient() {
    HttpClient httpClient = Mockito.spy(new HttpURLConnectionClient());
    this.client =
        new StripeClient(
            "sk_test_123",
            null,
            httpClient,
            "http://localhost:12111",
            "http://localhost:12111",
            "http://localhost:12111");
  }

  public void verifyRequest(ApiResource.RequestMethod method, String path) throws StripeException {
    verifyRequest(method, path, null);
  }

  public void verifyRequest(ApiResource.RequestMethod method, String path, ApiRequestParams params)
      throws StripeException {
    ArgumentCaptor<StripeRequest> argument = ArgumentCaptor.forClass(StripeRequest.class);
    Mockito.verify(this.client.getHttpClient()).request(argument.capture());
    StripeRequest request = argument.getValue();

    assertEquals(method, request.method());
    assertEquals(path, request.url().getPath());
    // TODO check params
  }
}
