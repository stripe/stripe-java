package com.stripe.credential;

/**
 * <h1>CredentialsProvider</h1>
 *
 * <p>Interface for implementing different credentials providers.
 *
 * @author  Jasper Culong
 * @since   2018-04-03
 *
 */
public interface StripeCredentialsProvider {

  public StripeCredentials getCredentials();

}
