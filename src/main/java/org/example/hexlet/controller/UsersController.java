package org.example.hexlet.controller;

import io.javalin.http.Context;
import io.javalin.http.NotFoundResponse;
import org.example.hexlet.NamedRoutes;
import org.example.hexlet.dto.courses.BuildUserPage;
import org.example.hexlet.dto.courses.MainPage;
import org.example.hexlet.dto.courses.UserPage;
import org.example.hexlet.model.User;
import org.example.hexlet.repository.UserRepository;

import java.util.ArrayList;
import java.util.List;

import static io.javalin.rendering.template.TemplateUtil.model;

public class UsersController {
    public static void index(Context ctx) {
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
    }

    public static void build(Context ctx) {
        var page = new BuildUserPage();
        ctx.render("users/build.jte", model("page", page));
    }

    public static void create(Context ctx) {
        var name = ctx.formParam("name");
        var email = ctx.formParam("email");
        var password = ctx.formParam("password");

        var user = new User(name, email, password);
        UserRepository.save(user);
        ctx.redirect(NamedRoutes.usersPath());
    }

    public static void update(Context ctx) {
        var id = ctx.pathParamAsClass("id", Long.class).get();

        var name = ctx.formParam("name");
        var email = ctx.formParam("email");
        var password = ctx.formParam("password");

        var user = UserRepository.find(id)
                .orElseThrow(() -> new NotFoundResponse("Entity with id = " + id + " not found"));
        user.setName(name);
        user.setEmail(email);
        user.setPassword(password);
        UserRepository.save(user);
        ctx.redirect(NamedRoutes.usersPath());
    }

    public static void showCookie(Context ctx) {
        var visited = Boolean.valueOf(ctx.cookie("visited"));
        var page = new MainPage(visited);
        ctx.render("users/coockie.jte", model("page", page));
        ctx.cookie("visited", String.valueOf(true));
    }

}
