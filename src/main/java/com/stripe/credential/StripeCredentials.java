package com.stripe.credential;

public class StripeCredentials {

    private String apiKey;

    public StripeCredentials(String apiKey) {
        this.apiKey = apiKey;
    }

    public String getApiKey(String apiKey) {
        return this.apiKey;
    }

    public void setApiKey(String apiKey) {
        this.apiKey = apiKey;
    }

}
