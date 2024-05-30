package org.example.hexlet.dto.courses;


import lombok.AllArgsConstructor;
import lombok.Getter;

@AllArgsConstructor
@Getter
public class MainPage {
    private Boolean visited;

    public Boolean isVisited() {
        return visited;
    }
}
