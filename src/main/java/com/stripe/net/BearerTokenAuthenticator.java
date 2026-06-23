package com.stripe.net;

import com.stripe.exception.ApiKeyMissingException;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.StripeException;
import com.stripe.util.StringUtils;
import lombok.EqualsAndHashCode;

@EqualsAndHashCode
public final class BearerTokenAuthenticator implements Authenticator {
  private final String apiKey;

  public BearerTokenAuthenticator(String apiKey) {
    if (apiKey == null) {
      throw new ApiKeyMissingException("API key cannot be null. Set Stripe.apiKey");
    }
    this.apiKey = apiKey;
  }

  public String getApiKey() {
    return this.apiKey;
  }

  @Override
  public StripeRequest authenticate(StripeRequest request) throws StripeException {
    if (apiKey.isEmpty()) {
      throw new AuthenticationException(
          "Your API key is invalid, as it is an empty string. You can double-check your API key "
              + "from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    } else if (StringUtils.containsWhitespace(apiKey)) {
      throw new AuthenticationException(
          "Your API key is invalid, as it contains whitespace. You can double-check your API key "
              + "from the Stripe Dashboard. See "
              + "https://stripe.com/docs/api/authentication for details or contact support at "
              + "https://support.stripe.com/email if you have any questions.",
          null,
          null,
          0);
    }
    return request.withAdditionalHeader("Authorization", String.format("Bearer %s", apiKey));
  }
}
