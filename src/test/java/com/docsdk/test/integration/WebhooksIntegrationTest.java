package com.docsdk.test.integration;

import com.docsdk.client.DocSDKClient;
import com.docsdk.dto.Event;
import com.docsdk.dto.request.WebhookRequest;
import com.docsdk.dto.response.Pageable;
import com.docsdk.dto.response.UserResponse;
import com.docsdk.dto.response.WebhookResponse;
import com.docsdk.dto.result.Result;
import com.docsdk.test.framework.AbstractTest;
import com.docsdk.test.framework.IntegrationTest;
import com.google.common.collect.ImmutableList;
import org.apache.http.HttpStatus;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.experimental.categories.Category;
import org.junit.runner.RunWith;
import org.junit.runners.JUnit4;

import static org.assertj.core.api.Assertions.assertThat;

@Category(IntegrationTest.class)
@RunWith(JUnit4.class)
public class WebhooksIntegrationTest extends AbstractTest {

    private static final String WEBHOOK_PAYLOAD = "docsdk";
    private static final String WEBHOOK_SIGNATURE = "5c4c0691bce8a1a2af738b7073fe0627e792734813358c5f88a658819dd0a6d2";

    private DocSDKClient docSDKClient;

    @Before
    public void before() throws Exception {
        docSDKClient = new DocSDKClient();
    }

    @Test(timeout = TIMEOUT)
    public void userLifecycle() throws Exception {
        final Result<UserResponse> userResponseResult = docSDKClient.users().me();
        assertThat(userResponseResult.getStatus()).isEqualTo(HttpStatus.SC_OK);
        assertThat(userResponseResult.getBody()).isNotNull();
    }

    @Test(timeout = TIMEOUT)
    public void webhooksLifecycle() throws Exception {
        // Create
        final WebhookRequest webhookRequest = new WebhookRequest().setUrl("http://some-url.com")
            .setEvents(ImmutableList.of(Event.JOB_CREATED, Event.JOB_FAILED, Event.JOB_FINISHED));
        final Result<WebhookResponse> createWebhookResponseResult = docSDKClient.webhooks().create(webhookRequest);
        assertThat(createWebhookResponseResult.getStatus()).isEqualTo(HttpStatus.SC_CREATED);
        assertThat(createWebhookResponseResult.getBody()).isNotNull();

        final WebhookResponse createWebhookResponse = createWebhookResponseResult.getBody();
        assertThat(createWebhookResponse.getSigningSecret()).isNotNull();

        // List
        final Result<Pageable<WebhookResponse>> webhookResponsePageable = docSDKClient.webhooks().list();
        assertThat(webhookResponsePageable.getStatus()).isEqualTo(HttpStatus.SC_OK);

        // Delete
        final Result<Void> deleteWebhookResponseResult = docSDKClient.webhooks().delete(createWebhookResponse.getId());
        assertThat(deleteWebhookResponseResult.getStatus()).isEqualTo(HttpStatus.SC_NO_CONTENT);

        // Verify
        assertThat(docSDKClient.webhooks().verify(WEBHOOK_PAYLOAD, WEBHOOK_SIGNATURE)).isTrue();
    }

    @After
    public void after() throws Exception {
        docSDKClient.close();
    }
}
