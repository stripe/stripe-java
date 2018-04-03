package com.stripe.credential;

import org.apache.commons.configuration2.INIConfiguration;
import org.apache.commons.configuration2.SubnodeConfiguration;

import java.io.FileReader;

public class SharedCredentialsProvider implements StripeCredentialsProvider {

    String configurationFile;
    String section;

    public SharedCredentialsProvider() {

        this.configurationFile = System.getProperty("user.home") + "/.stripe/credentials";
        this.section = "default";

    }

    public SharedCredentialsProvider(String configurationFile, String section ) {

        this.configurationFile = configurationFile;
        this.section = section;

    }

    @Override
    public StripeCredentials getCredentials() {

        String apiKey = "";

        try {
            INIConfiguration configuration = new INIConfiguration();
            configuration.read(new FileReader(validateFilePath(this.configurationFile)));
            SubnodeConfiguration section = configuration.getSection(this.section);

            apiKey = section.getString("accountSid");

        } catch (Exception e) {
            e.printStackTrace();
        }

        if (apiKey.isEmpty() || apiKey.equals("")) {
            throw new IllegalArgumentException("Unable to set Credentials from " + this.configurationFile);
        }

        return new StripeCredentials(apiKey);
    }

    private static String validateFilePath(String filePath) {
        if (filePath == null || filePath.equals("")) {
            throw new IllegalArgumentException(
                    "Unable to load profiles: specified file path " + filePath + " is null or empty.");
        }
        return filePath;
    }

}
