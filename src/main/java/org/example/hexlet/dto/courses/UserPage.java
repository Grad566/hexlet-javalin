package org.example.hexlet.dto.courses;

import lombok.AllArgsConstructor;
import lombok.Getter;
import org.example.hexlet.model.User;

import java.util.List;
import java.util.Optional;

@AllArgsConstructor
@Getter
public class UserPage {
    private List<User> users;
    public String term;
}
