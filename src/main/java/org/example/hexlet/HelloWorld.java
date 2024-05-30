package org.example.hexlet;

import io.javalin.Javalin;
import io.javalin.rendering.template.JavalinJte;
import io.javalin.validation.ValidationException;
import org.example.hexlet.controller.UsersController;
import org.example.hexlet.dto.courses.BuildUserPage;
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

        app.get(NamedRoutes.rootsPath(), UsersController::showCookie);

        app.get(NamedRoutes.buildUserPath(), UsersController::build);

        app.post(NamedRoutes.usersPath(), UsersController::create);

        app.get(NamedRoutes.usersSearchPath(), UsersController::index);

        app.get(NamedRoutes.coursePath("{id}"), ctx -> {
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

        app.get(NamedRoutes.coursesPath(), ctx -> {
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
            var name = ctx.queryParamAsClass("name", String.class).getOrDefault("world");
            ctx.result("Hello " + name);
        });

        app.start(7070);
    }
}
