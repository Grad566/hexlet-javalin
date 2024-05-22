package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main (String[] args) {
        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        app.get("/", ctx -> ctx.result("Hello world"));
        app.start(7070);
    }
}
