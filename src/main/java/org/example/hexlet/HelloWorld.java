package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main (String[] args) {
        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        app.get("/users", ctx -> ctx.result("GET /users"));
        app.get("/hello", ctx -> {
            var name = ctx.queryParam("name");
            ctx.result("Hello " + name);
        });
        app.post("/users", ctx -> ctx.result("Post /users"));
        app.start(7070);
    }
}
