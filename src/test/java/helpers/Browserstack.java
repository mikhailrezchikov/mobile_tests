package helpers;

import static io.restassured.RestAssured.given;
import static java.lang.String.format;


public class Browserstack {

    public static String videoUrl(String sessionId) {
        String url = format("https://api.browserstack.com/app-automate/sessions/%s.json", sessionId);

        return given()
                .auth().basic("mikhailrezchikov_td7S4b", "ohGQgUeXoCesCtPeoi7K")
                .when()
                .get(url)
                .then()
                .statusCode(200)
                .extract().path("automation_session.video_url");
    }
}