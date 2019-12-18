package com.happytown.entrypoints.jobs;

import com.happytown.core.use_cases.AttribuerCadeaux;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.junit.jupiter.MockitoExtension;

import javax.mail.MessagingException;
import java.io.IOException;
import java.time.LocalDate;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;
import static org.mockito.Mockito.verify;

@ExtendWith(MockitoExtension.class)
class AttributionCadeauxJobTest {

    @InjectMocks
    AttributionCadeauxJob attributionCadeauxJob;

    @Mock
    AttribuerCadeaux attribuerCadeaux;

    @Test
    void execute_shouldTriggerAttribuerCadeauxUseCase() throws IOException, MessagingException {
        // Given
        String fileName = "src/main/resources/cadeaux.txt";
        String smtpHost = "localhost";
        int smtpPort = 2525;

        // When
        attributionCadeauxJob.execute();

        // Then
        verify(attribuerCadeaux)
                .execute(
                        eq(fileName),
                        any(LocalDate.class),
                        eq(smtpHost),
                        eq(smtpPort)
                );
    }
}
