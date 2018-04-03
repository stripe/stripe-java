package com.stripe.credential;

/**
 * <h1>EnvVarCredentialsProvider</h1>
 *
 * <p>Implements CredentialsProvider from STRIPE_API_KEY environment variable.
 *
 * @author  Jasper Culong
 * @since   2018-04-03
 *
 */
public class EnvVarCredentialsProvider implements StripeCredentialsProvider {

    @Override
    public StripeCredentials getCredentials(){

        String apiKey = System.getenv("STRIPE_API_KEY");

        if (apiKey.isEmpty() || apiKey == null){
            throw new IllegalArgumentException("Unable to set Credentials from environment variable STRIPE_API_KEY");
        }

        return new StripeCredentials(apiKey);
    }
}
