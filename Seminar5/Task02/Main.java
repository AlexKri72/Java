package Seminar5.Task02;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;
import java.util.Scanner;

public class Main {
    public static SongClass[] songList;

    public static void main(String[] args) {

        List<SongClass> songList = new ArrayList<SongClass>();

        songList.add(new SongClass("Три дня дождя", "Отпускай", "Рок", "Активное", 896));
        songList.add(new SongClass("Я никому не верю", "Би-2", "Рок", "Грустное", 806));
        songList.add(new SongClass("Экзорцизм", "Сны Саламандры", "Рок", "Радостное", 800));
        songList.add(new SongClass("Фотографирую закат", "Fem.Love", "Рок", "Активное", 796));
        songList.add(new SongClass("Пуля", "Екатерина Яшникова", "Рок", "Расслабленное", 790));
        songList.add(new SongClass("Город слепых", "7Б", "Рок", "Расслабленное", 788));
        songList.add(new SongClass("Топай!", "Сплин", "Рок", "Радостное", 782));
        songList.add(new SongClass("Почта", "Земфира", "Рок", "Расслабленное", 779));
        songList.add(new SongClass("Я делаю шаг", "The Hetters", "Рок", "Грустное", 772));
        songList.add(new SongClass("Передвигая вещи", "Мумий Тролль", "Рок", "Активное", 770));

        songList.add(new SongClass("Songe d'automne", "Basilic Swing", "Джаз", "Активное", 983));
        songList.add(new SongClass("Sonieska", "Basilic Swing", "Джаз", "Грустное", 980));
        songList.add(new SongClass("Malcolm Part I & II", "Dutch Jazz Collective", "Джаз", "Грустное", 973));
        songList.add(new SongClass("Aboriginal Blues", "Dutch Jazz Collective", "Джаз", "Грустное", 964));
        songList.add(new SongClass("Cabaret", "Louis Armstrong", "Джаз", "Грустное", 960));
        songList.add(new SongClass("The Home Fire", "Louis Armstrong", "Джаз", "Активное", 957));
        songList.add(new SongClass("Piste Blues en Do n°1", "Roby Braun", "Джаз", "Радостное", 946));
        songList.add(new SongClass("65 Piste Blues en Do n°2", "Roby Braun", "Джаз", "Радостное", 941));
        songList.add(new SongClass("The London Suite: Piccadilly", "Fats Waller", "Джаз", "Грустное", 934));
        songList.add(new SongClass("Ain't Misbehavin'", "Fats Waller", "Джаз", "Расслабленное", 928));

        songList.add(new SongClass("Richter: Dona Nobis Pacem 2",
                "Mari Samuelsen, Konzerthausorchester Berlin, Jonathan Stockhammer", "Классика", "Активное", 903));
        songList.add(new SongClass("Richter: The Departure", "Lang Lang", "Классика", "Радостное", 845));
        songList.add(new SongClass("3 Gymnopédies: I. Lent et douloureux", "Эрик Сати, Peter van Leeuwen",
                "Классика",
                "Расслабленное", 824));
        songList.add(new SongClass(
                "Tchaikovsky: The Nutcracker, Op.71, TH.14 / Act 2 - No. 14a Pas de deux: Intrada",
                "Симфонический оркестр Мариинского театра", "Классика", "Расслабленное", 811));
        songList.add(new SongClass("Erla's Waltz", "Lavinia Meijer", "Классика", "Грустное", 803));
        songList.add(new SongClass("24 Caprices, Op.1: No. 24 in A Minor", "2000 Digital Remaster", "Классика",
                "Радостное", 858));
        songList.add(new SongClass("Gregson: Sequence (Four) for Solo Violin and String Orchestra divisi",
                "Mari Samuelsen, Konzerthausorchester Berlin, Jonathan Stockhammer", "Классика", "Активное", 849));
        songList.add(new SongClass("Tiersen: Six Pieces for Piano, Volume 2 - 4. La Valse d'Amélie",
                "Lang Lang, Карл Черни", "Классика", "Активное", 786));
        songList.add(new SongClass("Haydn: Keyboard Sonata No. 38 in F Major, Hob. XVI, 23: II. Adagio",
                " Владимир Федосеев, State Academic Large Symphony Orchestra, Георгий Васильевич Свиридов", "Классика",
                "Активное", 780));
        songList.add(new SongClass("The Snowstorm: IX. Winter road",
                " Владимир Федосеев, State Academic Large Symphony Orchestra, Георгий Васильевич Свиридов", "Классика",
                "Расслабленное", 689));

        songList.add(new SongClass("Salzburg", "Worakls", "Электроника", "Грустное", 890));
        songList.add(new SongClass("Acperience 1", "Hardfloor", "Электроника", "Грустное", 864));
        songList.add(new SongClass("5.4 Love", "Flabaire Remix—Joe Lewandows", "Электроника", "Активное", 856));
        songList.add(new SongClass("Pick Up Yaself", "Nick Catchdubs, Fire Alarm", "Электроника", "Расслабленное",
                852));
        songList.add(new SongClass("Selene", "Original Mix—Alex Cortex", "Электроника", "Активное", 845));
        songList.add(new SongClass("Walls", "Yotto", "Электроника", "Радостное", 841));
        songList.add(new SongClass("Overtone", "Jack Back", "Электроника", "Активное", 839));
        songList.add(new SongClass("Overrated", "Pretty Pink", "Электроника", "Расслабленное", 832));
        songList.add(new SongClass("Closed Eyes", "Aparde Remix—Aparde,Aukai", "Электроника", "Радостное", 826));
        songList.add(new SongClass("Harvesting", "Nora En Pure", "Электроника", "Расслабленное", 820));

        songList.add(new SongClass("Все прошло", "STRANIZA", "Поп", "Активное", 911));
        songList.add(new SongClass("Красная помада", "ISMA", "Поп", "Радостное", 896));
        songList.add(new SongClass("24/7", "Derzy", "Поп", "Радостное", 891));
        songList.add(new SongClass("Поток", "Вечно", "Поп", "Грустное", 886));
        songList.add(new SongClass("J'D", "Talia", "Поп", "Активное", 832));
        songList.add(new SongClass("Курск-Млсква", "ALLERGIA", "Поп", "Расслабленное", 821));
        songList.add(new SongClass("Слова", "DMC SHOWTIME", "Поп", "Активное", 816));
        songList.add(new SongClass("Нет равно да", "MANTULINY", "Поп", "Расслабленное", 806));
        songList.add(new SongClass("Счастье", "Марса", "Поп", "Активное", 796));
        songList.add(new SongClass("Я-не я", "Вечно", "Поп", "Расслабленное", 765));

        Comparator Rating = new Rating();
        Collections.sort(songList, Rating);

        System.out.println("\n\n\n\n\n");

        while (true) {
            System.out.println("Что будем делать?");
            System.out.println("1. Создадим плейлист по жанру");
            System.out.println("2. Создадим плейлист по настроению");
            System.out.println("3. Создадим плейлист по занятию");
            System.out.println("4. Закончим работу, выйдем из программы");
            System.out.print("Ваш выбор: ");
            Scanner sc = new Scanner(System.in);
            Integer choice = sc.nextInt();

            if (choice == 1) {
                System.out.println("Выберите жанр:");
                System.out.println("1. Рок");
                System.out.println("2. Джаз");
                System.out.println("3. Классика");
                System.out.println("4. Электроника");
                System.out.println("5. Поп");
                System.out.print("Ваш выбор: ");
                Integer choiceGenre = sc.nextInt();

                switch (choiceGenre) {
                    case 1:
                        ChoiceGenrePrint.ChoiceGenrePrint("Рок", songList);
                        break;
                    case 2:
                        ChoiceGenrePrint.ChoiceGenrePrint("Джаз", songList);
                        break;
                    case 3:
                        ChoiceGenrePrint.ChoiceGenrePrint("Классика", songList);
                        break;
                    case 4:
                        ChoiceGenrePrint.ChoiceGenrePrint("Электроника", songList);
                        break;
                    case 5:
                        ChoiceGenrePrint.ChoiceGenrePrint("Поп", songList);
                        break;
                    default:
                        break;
                }
            }
            if (choice == 2) {
                System.out.println("Выберите Настроение::");
                System.out.println("1. Активное");
                System.out.println("2. Радостное");
                System.out.println("3. Грустное");
                System.out.println("4. Расслабленное");
                System.out.print("Ваш выбор: ");
                Integer choiceMood = sc.nextInt();
                switch (choiceMood) {
                    case 1:
                        ChoiceMoodPrint.ChoiceMoodPrint("Активное", songList);
                        break;
                    case 2:
                        ChoiceMoodPrint.ChoiceMoodPrint("Радостное", songList);
                        break;
                    case 3:
                        ChoiceMoodPrint.ChoiceMoodPrint("Грустное", songList);
                        break;
                    case 4:
                        ChoiceMoodPrint.ChoiceMoodPrint("Расслабленное", songList);
                        break;
                    default:
                        break;
                }
            }
            if (choice == 3) {
                System.out.println("Выберите Занятие:");
                System.out.println("1. Бег");
                System.out.println("2. Заснуть");
                System.out.println("3. За рулем");
                System.out.println("4. Вечеринка");
                System.out.print("Ваш выбор: ");
                Integer choiceBusiness = sc.nextInt();

                System.out.println("Как будем проигрывать:");
                System.out.println("1. По порядку");
                System.out.println("2. Случайным образом");
                System.out.print("Ваш выбор: ");
                Integer option = sc.nextInt();

                switch (choiceBusiness) {
                    case 1:
                        ChoiceBusinessPrint.ChoiceBusinessPrint("Бег", option, songList);
                        break;
                    case 2:
                        ChoiceBusinessPrint.ChoiceBusinessPrint("Заснуть", option, songList);
                        break;
                    case 3:
                        ChoiceBusinessPrint.ChoiceBusinessPrint("За рулем", option, songList);
                        break;
                    case 4:
                        ChoiceBusinessPrint.ChoiceBusinessPrint("Вечеринка", option, songList);
                        break;
                    default:
                        break;
                }
            }
            if (choice == 4) {
                System.out.println("\nДо новых встреч!\n");
                break;
            }

        }
    }
}
