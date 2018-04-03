package com.stripe.credential;

/**
 * <h1>SysPropsCredentialsProvider</h1>
 *
 * <p>Implements CredentialsProvider from stripe.apiKey system properties.
 *
 * @author  Jasper Culong
 * @since   2018-04-03
 *
 */
public class SysPropsCredentialsProvider implements StripeCredentialsProvider {

    @Override
    public StripeCredentials getCredentials() {

        String apiKey = System.getenv("stripe.apiKey");

        if (apiKey.isEmpty() || apiKey == null) {
            throw new IllegalArgumentException("Unable to set apiKey from System Properties!");
        }

        return new StripeCredentials(apiKey);
    }
}
