package Seminar5.Task02;

import java.util.Comparator;

public class SongClass {
    String songName;
    String executor;
    String genre;
    String mood;
    Integer rating;

    public SongClass(String songName, String executor, String genre, String mood, Integer rating) {
        this.songName = songName;
        this.executor = executor;
        this.genre = genre;
        this.mood = mood;
        this.rating = rating;
    }
}
