package com.docsdk.client.setttings;

/**
 * DocSDK specific settings provider
 */
public interface SettingsProvider {

    String getApiKey();

    String getApiUrl();

    String getWebhookSigningSecret();
}
