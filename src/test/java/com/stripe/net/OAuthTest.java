package com.stripe.net;

import static org.junit.Assert.assertEquals;

import com.stripe.BaseStripeTest;
import com.stripe.Stripe;
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

import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class OAuthTest extends BaseStripeTest {
  @Before
  public void setUpMockAndClientId() {
    OAuth.setStripeResponseGetter(networkMock);
    Stripe.clientId = "ca_test";
  }

  @After
  public void tearDownMockAndClientId() {
    Stripe.clientId = null;
    OAuth.setStripeResponseGetter(new LiveStripeResponseGetter());
  }

  private static Map<String, String> splitQuery(String query) throws UnsupportedEncodingException {
    Map<String, String> queryPairs = new HashMap<String, String>();
    String[] pairs = query.split("&");
    for (String pair : pairs) {
      int idx = pair.indexOf("=");
      queryPairs.put(URLDecoder.decode(pair.substring(0, idx), "UTF8"),
          URLDecoder.decode(pair.substring(idx + 1), "UTF8"));
    }
    return queryPairs;
  }

  @Test
  public void testAuthorizeURL() throws AuthenticationException, InvalidRequestException,
      MalformedURLException, UnsupportedEncodingException {
    Map<String, Object> urlParams = new HashMap<String, Object>();
    urlParams.put("scope", "read_write");
    urlParams.put("state", "csrf_token");
    Map<String, Object> stripeUserParams = new HashMap<String, Object>();
    stripeUserParams.put("email", "test@example.com");
    stripeUserParams.put("url", "https://example.com/profile/test");
    stripeUserParams.put("country", "US");
    urlParams.put("stripe_user", stripeUserParams);

    String urlStr = OAuth.authorizeURL(urlParams, null);

    URL url = new URL(urlStr);
    Map<String, String> queryPairs = splitQuery(url.getQuery());

    assertEquals("https", url.getProtocol());
    assertEquals("connect.stripe.com", url.getHost());
    assertEquals("/oauth/authorize", url.getPath());

    assertEquals("ca_test", queryPairs.get("client_id"));
    assertEquals("read_write", queryPairs.get("scope"));
    assertEquals("test@example.com", queryPairs.get("stripe_user[email]"));
    assertEquals("https://example.com/profile/test", queryPairs.get("stripe_user[url]"));
    assertEquals("US", queryPairs.get("stripe_user[country]"));
  }

  @Test
  public void testToken() throws StripeException, IOException {
    String json = resource("../model/oauth_token_response.json");
    stubOAuth(TokenResponse.class, json);

    Map<String, Object> tokenParams = new HashMap<String, Object>();
    tokenParams.put("grant_type", "authorization_code");
    tokenParams.put("code", "this_is_an_authorization_code");

    TokenResponse resp = OAuth.token(tokenParams, null);

    assertEquals(false, resp.getLivemode());
    assertEquals("acct_test_token", resp.getStripeUserId());
    assertEquals("read_only", resp.getScope());
  }

  @Test
  public void testDeauthorize() throws StripeException {
    String json = "{stripe_user_id: \"acct_test_deauth\"}";
    stubOAuth(DeauthorizedAccount.class, json);

    Map<String, Object> deauthParams = new HashMap<String, Object>();
    deauthParams.put("stripe_user_id", "acct_test_deauth");

    DeauthorizedAccount account = OAuth.deauthorize(deauthParams, null);

    assertEquals("acct_test_deauth", account.getStripeUserId());
  }
}
