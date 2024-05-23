package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.model.Course;

import java.util.ArrayList;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main (String[] args) {
        List<Course> courses = new ArrayList<>();
        var course1 = new Course("Lol", "Example1");
        var course2 = new Course("Lol", "Example2");
        courses.add(course1);
        courses.add(course2);

        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/courses", ctx -> {
            var header = "Курсы по программированию";
            var page = new CoursesPage(courses, header);
            ctx.render("courses/index.jte", model("page", page));
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
