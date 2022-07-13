package Seminar4.Task02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;
import java.util.Queue;

public class Main {
    public static void main(String[] args) {
        Tasks passport = new Passport();
        Tasks inn = new Inn();
        Tasks namechange = new Namechange();
        Tasks retirement = new Retirement();
        Tasks lossofdocument = new Lossofdocument();
        Tasks birthofachild = new Birthofachild();

        List<Tasks> tasks = new ArrayList<>();
        tasks.add(passport);
        tasks.add(inn);
        tasks.add(namechange);
        tasks.add(retirement);
        tasks.add(lossofdocument);
        tasks.add(birthofachild);

        Map<Integer, Tasks> waitingQueue = new LinkedHashMap<>();

        for (int i = 0; i < 31; i++) {
            Tasks.PeopleInWaitLine(tasks, waitingQueue);
            Tasks.closeWindow();
            Thread.sleep(waitingQueue.values());

            Tasks.PeopleOutWaitLine(waitingQueue);
            System.out.println("Очередь: " + waitingQueue);
        }

    }
}