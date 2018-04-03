package com.stripe.credential;

public class SysPropsCredentialsProvider implements StripeCredentialsProvider {

    @Override
    public StripeCredentials getCredentials() {

        String apiKey = System.getenv("stripe.apiKey");

        if (apiKey.isEmpty() || apiKey.equals("")) {
            throw new IllegalArgumentException("Unable to set apiKey from System Properties!");
        }

        return new StripeCredentials(apiKey);

    }

}
