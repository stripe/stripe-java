package com.stripe.net;

import static org.junit.jupiter.api.Assertions.assertEquals;

import com.stripe.Stripe;
import java.net.InetSocketAddress;
import java.net.PasswordAuthentication;
import java.net.Proxy;
import org.junit.jupiter.api.Test;

public class ClientOptionsTest {
  @Test
  public void GlobalClientOptionsReflectsGlobalConfiguration() {
    Proxy origConnectionProxy = Stripe.getConnectionProxy();
    PasswordAuthentication origProxyCredential = Stripe.getProxyCredential();
    String origApiKey = Stripe.apiKey;
    int origConnectTimeout = Stripe.getConnectTimeout();
    int origMaxNetworkRetries = Stripe.getMaxNetworkRetries();
    int origReadTimeout = Stripe.getReadTimeout();
    String origClientId = Stripe.clientId;
    String origApiBase = Stripe.getApiBase();
    String origUploadBase = Stripe.getUploadBase();
    String origConnectBase = Stripe.getConnectBase();
    String origMeterEventsBase = Stripe.getMeterEventsBase();

    GlobalStripeResponseGetterOptions global = GlobalStripeResponseGetterOptions.INSTANCE;

    try {
      Proxy clientProxy = new Proxy(Proxy.Type.HTTP, new InetSocketAddress("localhost", 8080));
      PasswordAuthentication clientProxyCred =
          new PasswordAuthentication("username", "password".toCharArray());

      Stripe.apiKey = "key1";
      Stripe.clientId = "1";
      Stripe.setConnectTimeout(1);
      Stripe.setMaxNetworkRetries(1);
      Stripe.setReadTimeout(1);
      Stripe.setConnectionProxy(clientProxy);
      Stripe.setProxyCredential(clientProxyCred);
      Stripe.overrideApiBase("http://api.base");
      Stripe.overrideConnectBase("http://connect.base");
      Stripe.overrideUploadBase("http://upload.base");
      Stripe.overrideMeterEventsBase("http://meter-events.base");

      assertEquals(1, global.getConnectTimeout());
      assertEquals(1, global.getMaxNetworkRetries());
      assertEquals(1, global.getReadTimeout());
      assertEquals("1", global.getClientId());
      assertEquals(clientProxy, global.getConnectionProxy());
      assertEquals(clientProxyCred, global.getProxyCredential());
      assertEquals("http://api.base", global.getApiBase());
      assertEquals("http://connect.base", global.getConnectBase());
      assertEquals("http://upload.base", global.getFilesBase());
      assertEquals("http://meter-events.base", global.getMeterEventsBase());
    } finally {
      Stripe.apiKey = origApiKey;
      Stripe.setConnectTimeout(origConnectTimeout);
      Stripe.setMaxNetworkRetries(origMaxNetworkRetries);
      Stripe.setReadTimeout(origReadTimeout);
      Stripe.clientId = origClientId;
      Stripe.setConnectionProxy(origConnectionProxy);
      Stripe.setProxyCredential(origProxyCredential);
      Stripe.overrideApiBase(origApiBase);
      Stripe.overrideConnectBase(origConnectBase);
      Stripe.overrideUploadBase(origUploadBase);
      Stripe.overrideMeterEventsBase(origMeterEventsBase);
    }
  }
}
