package webService;

import spark.Spark;
import webService.controller.HelloController;

import java.util.Optional;

public class Application {
    public static void main(String[] args) {
        String port = System.getenv("PORT");
        Spark.port(Optional.ofNullable(port).map(Integer::valueOf).orElse(4567));
        new HelloController();
    }

}
