package com.stripe.net;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.exception.AuthenticationException;
import com.stripe.exception.InvalidRequestException;
import com.stripe.exception.StripeException;
import com.stripe.model.oauth.DeauthorizedAccount;
import com.stripe.model.oauth.TokenResponse;
import com.stripe.net.OAuth;

import java.io.IOException;
import java.io.UnsupportedEncodingException;
import java.net.MalformedURLException;
import java.net.URL;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

import org.junit.Test;

public class OAuthTest extends BaseStripeTest {
  private static Map<String, String> splitQuery(String query) throws UnsupportedEncodingException {
    final Map<String, String> queryPairs = new HashMap<String, String>();
    final String[] pairs = query.split("&", -1);
    for (final String pair : pairs) {
      final int idx = pair.indexOf("=");
      queryPairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF8"),
          URLDecoder.decode(pair.substring(idx + 1), "UTF8"));
    }
    return queryPairs;
  }

  @Test
  public void testAuthorizeUrl() throws AuthenticationException, InvalidRequestException,
      MalformedURLException, UnsupportedEncodingException {
    final Map<String, Object> urlParams = new HashMap<String, Object>();
    urlParams.put("scope", "read_write");
    urlParams.put("state", "csrf_token");
    final Map<String, Object> stripeUserParams = new HashMap<String, Object>();
    stripeUserParams.put("email", "test@example.com");
    stripeUserParams.put("url", "https://example.com/profile/test");
    stripeUserParams.put("country", "US");
    urlParams.put("stripe_user", stripeUserParams);

    RequestOptions requestOptions = RequestOptions.builder().setClientId("ca_456").build();

    final String urlStr = OAuth.authorizeUrl(urlParams, requestOptions);

    final URL url = new URL(urlStr);
    final Map<String, String> queryPairs = splitQuery(url.getQuery());

    assertEquals("https", url.getProtocol());
    assertEquals("connect.stripe.com", url.getHost());
    assertEquals("/oauth/authorize", url.getPath());

    assertEquals("ca_456", queryPairs.get("client_id"));
    assertEquals("read_write", queryPairs.get("scope"));
    assertEquals("test@example.com", queryPairs.get("stripe_user[email]"));
    assertEquals("https://example.com/profile/test", queryPairs.get("stripe_user[url]"));
    assertEquals("US", queryPairs.get("stripe_user[country]"));
  }

  @Test
  public void testToken() throws StripeException, IOException {
    stubOAuthRequest(
        TokenResponse.class,
        getResourceAsString("/oauth_fixtures/token_response.json")
    );

    final Map<String, Object> tokenParams = new HashMap<String, Object>();
    tokenParams.put("grant_type", "authorization_code");
    tokenParams.put("code", "this_is_an_authorization_code");

    final TokenResponse resp = OAuth.token(tokenParams, null);

    assertEquals(false, resp.getLivemode());
    assertEquals("acct_test_token", resp.getStripeUserId());
    assertEquals("read_only", resp.getScope());
  }

  @Test
  public void testDeauthorize() throws StripeException {
    stubOAuthRequest(
        DeauthorizedAccount.class,
        "{stripe_user_id: \"acct_test_deauth\"}"
    );

    final Map<String, Object> deauthParams = new HashMap<String, Object>();
    deauthParams.put("stripe_user_id", "acct_test_deauth");

    final DeauthorizedAccount account = OAuth.deauthorize(deauthParams, null);

    assertEquals("acct_test_deauth", account.getStripeUserId());
  }
}
