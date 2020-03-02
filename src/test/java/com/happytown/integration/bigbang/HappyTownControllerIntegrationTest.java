package com.happytown.integration.bigbang;

import com.dumbster.smtp.SimpleSmtpServer;
import org.junit.jupiter.api.AfterEach;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;

public class HappyTownControllerIntegrationTest extends RestAssuredTest {

    private SimpleSmtpServer mailServer;

    private static final int SMTP_PORT = 2525;

    @BeforeEach
    private void startSmtpServer(){
        mailServer = SimpleSmtpServer.start(SMTP_PORT);
    }

    @AfterEach
    private void stopSmtpServer(){
        mailServer.stop();
    }

    @Test
    public void retourneOk(){
        this.givenCommon().post("/api/attributionCadeaux").then().statusCode(HttpStatus.OK.value());
    }


}
