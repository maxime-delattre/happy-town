package com.happytown.integration.bigbang;

import com.happytown.configuration.ScheduleTasks;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.mock.mockito.SpyBean;

import java.time.Duration;

import static org.awaitility.Awaitility.await;
import static org.mockito.Mockito.atLeast;
import static org.mockito.Mockito.verify;

public class AttributionCadeauxScheduledTaskIntegrationTest extends RestAssuredTest {

    @SpyBean
    private ScheduleTasks scheduleTasks;

    @Test
    public void doitAppelerPanierMinuteurTask() {
        // When Then
        await()
                .atMost(Duration.ofMinutes(2))
                .untilAsserted(() -> verify(this.scheduleTasks, atLeast(1)).attribuerCadeaux());
    }
}
