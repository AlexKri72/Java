package Seminar5.Task02;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.List;

public class ChoiceBusinessPrint {
    public static void ChoiceBusinessPrint(String a, Integer option, List<SongClass> songList) {
        List<SongClass> printSongList = new ArrayList<SongClass>();
        switch (a) {
            case "Бег":
                Integer count = 0;
                for (SongClass item : songList) {
                    if (item.mood == "Активное" && count <= 5) {
                        printSongList.add(item);
                        count++;
                    }
                }
                for (SongClass i : songList) {
                    if (i.mood == "Радостное" && count <= 10) {
                        printSongList.add(i);
                        count++;
                    }
                }
                break;
            case "Заснуть":
                Integer count1 = 0;
                for (SongClass item : songList) {
                    if (item.mood == "Расслабленное" && count1 <= 5) {
                        printSongList.add(item);
                        count1++;
                    }
                }
                for (SongClass i : songList) {
                    if (i.mood == "Грустное" && count1 <= 10) {
                        printSongList.add(i);
                        count1++;
                    }
                }
                break;
            case "За рулем":
                Integer count2 = 0;
                for (SongClass item : songList) {
                    if (item.genre == "Поп" && count2 <= 5) {
                        printSongList.add(item);
                        count2++;
                    }
                }
                for (SongClass i : songList) {
                    if (i.genre == "Рок" && count2 <= 10) {
                        printSongList.add(i);
                        count2++;
                    }
                }
                break;
            case "Вечеринка":
                Integer count3 = 0;
                for (SongClass item : songList) {
                    if (item.genre == "Поп" && count3 <= 5) {
                        printSongList.add(item);
                        count3++;
                    }
                }
                for (SongClass i : songList) {
                    if (i.genre == "Джаз" && count3 <= 10) {
                        printSongList.add(i);
                        count3++;
                    }
                }
                break;
            default:
                break;
        }
        if (option == 2) {
            Collections.shuffle(printSongList);
        }
        for (SongClass item : printSongList) {
            System.out.println("Рейтинг: " + item.rating + ", Сингл: " + item.songName + ", Исполнитель: "
                    + item.executor + ", Жанр: " + item.genre + ", Настроение: " + item.mood);
        }
    }
}
