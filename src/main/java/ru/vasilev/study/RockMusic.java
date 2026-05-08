package ru.vasilev.study;

import org.springframework.stereotype.Component;

import java.util.List;

@Component
public class RockMusic implements Music{

    private List<String> songsList = List.of("Highway to Hell", "Ace of Spades", "Stairway to Heaven");

    @Override
    public String getSong() {
        return "Highway to Hell";
    }

    @Override
    public List<String> getSongsList() {
        return songsList;
    }
}
