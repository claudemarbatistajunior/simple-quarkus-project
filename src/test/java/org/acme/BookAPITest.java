package org.acme;

import io.quarkus.test.junit.QuarkusTest;
import org.acme.entity.Book;
import org.junit.jupiter.api.Test;

import static io.restassured.RestAssured.given;
import static org.hamcrest.CoreMatchers.any;
import static org.hamcrest.CoreMatchers.is;

@QuarkusTest
public class BookAPITest {

    @Test
    public void testGet() {
        given()
          .when().get("/books")
          .then()
             .statusCode(200)
             .body(is(any(Book.class)));
    }

}