package com.docsdk.test.unit.settings;

import com.docsdk.client.setttings.AbstractSettingsProvider;
import com.docsdk.client.setttings.StringSettingsProvider;
import com.docsdk.test.framework.UnitTest;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.mockito.junit.MockitoJUnitRunner;

import static org.assertj.core.api.Assertions.assertThat;

@Category(UnitTest.class)
@RunWith(MockitoJUnitRunner.class)
public class StringSettingsProviderTest {

    public static final String API_KEY = "api-key";
    public static final String WEBHOOK_SIGNING_SECRET = "webhook-signing-secret";

    @Test
    public void success_useSandbox() {
        final StringSettingsProvider stringSettingsProvider = new StringSettingsProvider(API_KEY, WEBHOOK_SIGNING_SECRET, true);

        assertThat(stringSettingsProvider.getApiKey()).isEqualTo(API_KEY);
        assertThat(stringSettingsProvider.getWebhookSigningSecret()).isEqualTo(WEBHOOK_SIGNING_SECRET);
        assertThat(stringSettingsProvider.getApiUrl()).isEqualTo(AbstractSettingsProvider.API_URL_SANDBOX);
    }

    @Test
    public void success_useLive() {
        final StringSettingsProvider stringSettingsProvider = new StringSettingsProvider(API_KEY, WEBHOOK_SIGNING_SECRET, false);

        assertThat(stringSettingsProvider.getApiKey()).isEqualTo(API_KEY);
        assertThat(stringSettingsProvider.getWebhookSigningSecret()).isEqualTo(WEBHOOK_SIGNING_SECRET);
        assertThat(stringSettingsProvider.getApiUrl()).isEqualTo(AbstractSettingsProvider.API_URL_LIVE);
    }
}
