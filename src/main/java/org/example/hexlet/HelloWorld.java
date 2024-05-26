package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import org.example.hexlet.dto.courses.CoursesPage;
import org.example.hexlet.dto.courses.UserPage;
import org.example.hexlet.model.Course;
import org.apache.commons.text.StringEscapeUtils;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class HelloWorld {
    public static void main (String[] args) {
        List<Course> courses = new ArrayList<>();
        var course1 = new Course("Lol", "Example1", 1L);
        var course2 = new Course("Lol2", "Example2", 2L);
        courses.add(course1);
        courses.add(course2);

        //create app
        var app = Javalin.create(config -> {
            config.bundledPlugins.enableDevLogging();
            config.fileRenderer(new JavalinJte());
        });

        app.get("/users/build", ctx -> {
            ctx.render("users/build.jte");
        });

        app.post("/users", ctx -> {
            var name = ctx.formParam("name");
            var email = ctx.formParam("email");
            var password = ctx.formParam("password");

            User user = new User(name, email, password);
            UserRepository.save(user);
            ctx.redirect("/users/search");
        });

        app.get("/users/search", ctx -> {
            var term = ctx.queryParam("term");
            List<User> requiredUsers = new ArrayList<>();
            var currentUsers = UserRepository.getUsers();
            if (term != null) {
                requiredUsers = currentUsers.stream()
                        .filter(c -> c.getName().equals(term))
                        .toList();
            }
            var page = new UserPage(requiredUsers, term);
            ctx.render("users/index.jte", model("page", page));
        });

        app.get("/users/{id}", ctx -> {
            var id = ctx.pathParam("id");
            var escapedId = StringEscapeUtils.escapeHtml4(id);
            ctx.contentType("text/html");
            ctx.result(escapedId);
        });

        app.get("/courses/{courseId}", ctx -> {
            var courseId = ctx.pathParamAsClass("courseId", Long.class).get();
            var course = courses.stream()
                    .filter(c -> c.getId().equals(courseId))
                    .findFirst();
            if (course.isPresent()) {
                ctx.result(course.get().getDescription());
            } else {
                ctx.result("Курс не найден");
            }
        });

        app.get("/courses", ctx -> {
            var term = ctx.queryParam("term");
            List<Course> requiredCurses = new ArrayList<>();
            if (term != null) {
                requiredCurses = courses.stream()
                        .filter(c -> c.getName().equals(term))
                        .toList();
            }
            var page = new CoursesPage(requiredCurses, term);
            ctx.render("courses/index2.jte", model("page", page));
        });

        app.get("/courses/{courseId}/lessons/{id}", ctx -> {
            var courseId = ctx.pathParam("courseId");
            var lessonId =  ctx.pathParam("id");
            ctx.result("Course ID: " + courseId + " Lesson ID: " + lessonId);
        });

        app.get("/hello", ctx -> {
            var name = ctx.queryParam("name");
            ctx.result("Hello " + name);
        });

        app.start(7070);
    }
}
