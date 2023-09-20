package org.acme;

import static io.restassured.RestAssured.given;

import org.junit.jupiter.api.Test;

import io.quarkus.test.junit.QuarkusTest;

@QuarkusTest
public class PersonResourceTest {

    @Test
    public void testAdd() {
        given()
                .when()
                .header("Content-Type", "application/json")
                .body("{\"name\": \"John Doe\"}").post("/person")
                .then()
                .statusCode(403);
    }

}