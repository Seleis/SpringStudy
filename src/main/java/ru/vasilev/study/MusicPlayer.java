package ru.vasilev.study;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.Random;


@Component
public class MusicPlayer {
    private Music music1, music2;

    @Autowired
    public MusicPlayer(@Qualifier("classicalMusic") Music music1, @Qualifier("rockMusic") Music music2) {
        this.music1 = music1;
        this.music2 = music2;
    }

    public String playMusic(MusicGenre genre) {
        Random random = new Random();
        switch (genre) {
            case CLASSICAL: {
                return music1.getSongsList().get(random.nextInt(music1.getSongsList().size()));
            }
            case ROCK: {
                return music2.getSongsList().get(random.nextInt(music2.getSongsList().size()));
            }
        }
        return "";
    }
}
