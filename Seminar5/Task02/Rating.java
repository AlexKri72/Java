package Seminar5.Task02;

import java.util.Comparator;

public class Rating implements Comparator<SongClass> {

    @Override
    public int compare(SongClass o1, SongClass o2) {
        return o2.rating - o1.rating;
    }
}
