package com.happytown.integration.bigbang;

import org.hamcrest.Matchers;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.springframework.http.HttpStatus;


public class HabitantControllerIntegrationTest extends RestAssuredTest{

    @Test
    public void retourneLesHabitants() {
        //WhenThen
        this.givenCommon().get("/api/habitants").then().statusCode(HttpStatus.OK.value())
                .body("[0].id", Matchers.is("5e18367a-1eb3-4b91-b87a-44cd210ef7ba"))
                .body("[1].id", Matchers.is("939c0a28-c407-4ce3-b661-d96a412a3d29"))
                .body("[2].id", Matchers.is("aebb21fa-b981-4baa-9668-52be5ea3ce90"));
    }
}
