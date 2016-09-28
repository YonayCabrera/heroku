package webService.controller;

import static spark.Spark.get;

/**
 * Created by yon on 28/09/2016.
 */
public class HelloController {
    public HelloController() {
        setRoute();
    }

    private void setRoute() {
        CorsFilter.apply();
        get("hello",(request, response) -> "{\"message\": \"HelloWorld!\"}");
    }
}
