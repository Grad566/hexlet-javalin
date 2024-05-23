package org.example.hexlet;

import io.javalin.Javalin;

public class HelloWorld {
    public static void main (String[] args) {
        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
        });

        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
            var courseId = ctx.pathParam("courseId");
            var lessonId =  ctx.pathParam("id");
            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
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
