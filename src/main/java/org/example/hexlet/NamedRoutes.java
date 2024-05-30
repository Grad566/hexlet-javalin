package org.example.hexlet;

public class NamedRoutes {
    public static String usersPath() {
        return "/users";
    }

    public static String rootsPath() {
        return "/";
    }

    public static String buildUserPath() {
        return "/users/build";
    }

    public static String coursesPath() {
        return "/courses";
    }

    public static String usersSearchPath() {
        return "/users/search";
    }

    // Это нужно, чтобы не преобразовывать типы снаружи
    public static String coursePath(Long id) {
        return coursePath(String.valueOf(id));
    }

    public static String coursePath(String id) {
        return "/courses/" + id;
    }
}