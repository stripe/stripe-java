package com.stripe.credential;

public class EnvVarCredentialsProvider implements StripeCredentialsProvider {

    @Override
    public StripeCredentials getCredentials() {

        String apiKey = System.getenv("STRIPE_API_KEY");

        if(apiKey.isEmpty() || apiKey == null) {
            throw new IllegalArgumentException("Unable to set Credentials from environment variable STRIPE_API_KEY");
        }

        return new StripeCredentials(apiKey);
    }

}
