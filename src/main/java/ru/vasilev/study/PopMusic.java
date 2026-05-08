package ru.vasilev.study;

import org.springframework.stereotype.Component;

import java.util.List;

public class PopMusic implements Music{

    @Override
    public String getSong() {
        return "Michael Jackson - What about us";
    }

    @Override
    public List<String> getSongsList() {
        return List.of();
    }
}
