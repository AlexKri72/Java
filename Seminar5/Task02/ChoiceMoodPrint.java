package Seminar5.Task02;

import java.util.List;

public class ChoiceMoodPrint {
    public static void ChoiceMoodPrint(String a, List<SongClass> songList) {
        for (SongClass item : songList) {
            if (item.mood == a) {
                System.out.println("Рейтинг: " + item.rating + ", Сингл: " + item.songName + ", Исполнитель: "
                        + item.executor + ", Жанр: " + item.genre + ", Настроение: " + item.mood);
            }
        }
    }
}
