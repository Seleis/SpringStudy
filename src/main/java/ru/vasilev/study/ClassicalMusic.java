package ru.vasilev.study;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class ClassicalMusic implements Music {

    private List<String> songsList = List.of("Hungarian Rhapsody", "Times of the Year", "The Mendelssohn Waltz");

    @Override
    public String getSong() {
        return "Hungarian Rhapsody";
    }

    @Override
    public List<String> getSongsList() {
        return songsList;
    }
}
