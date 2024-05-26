package org.example.hexlet.repository;

import lombok.Getter;
import lombok.Setter;
import org.example.hexlet.model.User;

import java.util.ArrayList;
import java.util.List;

@Setter
@Getter
public class UserRepository {
    @Getter
    private static final List<User> users = new ArrayList<>();

    public static void save(User user) {
        user.setId((long) users.size() + 1);
        users.add(user);
    }

}
