package org.example.hexlet;

public class NamedRoutes {

    public static String sessionsPath() {
        return "/sessions";
    }

    public static String buildSessionPath() {
        return "/sessions/build";
    }
    public static String usersPath() {
        return "/users";
    }

    public static String rootsPath() {
        return "/";
    }

    public static String buildUserPath() {
        return "/users/build";
    }


    public static String usersSearchPath() {
        return "/users/search";
    }
    public static String userPath(Long id) {
        return userPath(String.valueOf(id));
    }

    public static String userPath(String id) {
        return "/users/" + id;
    }

}
