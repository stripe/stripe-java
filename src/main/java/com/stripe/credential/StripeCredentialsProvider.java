package com.stripe.credential;

public interface StripeCredentialsProvider {

    /**
     *
     * @return object StripeCredentials
     * */
    public StripeCredentials getCredentials();

}
