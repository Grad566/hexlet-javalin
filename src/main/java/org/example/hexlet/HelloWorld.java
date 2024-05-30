package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.model.Course;

public class HelloWorld {
    public static void main (String[] args) {

        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get(NamedRoutes.rootsPath(), UsersController::showCookie);

        app.get(NamedRoutes.buildUserPath(), UsersController::build);

        app.post(NamedRoutes.usersPath(), UsersController::create);

        app.get(NamedRoutes.usersSearchPath(), UsersController::index);

        app.start(7070);
    }
}
