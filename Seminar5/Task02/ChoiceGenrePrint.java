package Seminar5.Task02;

import java.util.List;

public class ChoiceGenrePrint {

    public static void ChoiceGenrePrint(String a, List<SongClass> songList) {
        for (SongClass item : songList) {
            if (item.genre == a) {
                System.out.println("Рейтинг: " + item.rating + ", Сингл: " + item.songName + ", Исполнитель: "
                        + item.executor + ", Жанр: " + item.genre + ", Настроение: " + item.mood);
            }
        }
    }
}
