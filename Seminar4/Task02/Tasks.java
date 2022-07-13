package Seminar4.Task02;

import java.util.ArrayList;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Tasks {

    public static Integer number(Map<Integer, Tasks> waitingQueue) { // метод не абстрактный, наследуется напрямую
        if (waitingQueue.isEmpty()) {
            return 1; // возврат сгенерированного значения
        } else {
            return waitingQueue.size() + 1;
        }

    }

    public static void closeWindow() {
        if (0.8 > Math.random()) {
            Long time = (long) (Math.random() * 8001) + 4000;
            System.out.println("Извините, технический перерыв на " + time / 1000 + " секунд");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                e.printStackTrace();
            }
        }
    }

    public static void PeopleInWaitLine(List<Tasks> tasks, Map<Integer, Tasks> waitingQueue) {
        Integer a = Tasks.number(waitingQueue);
        Tasks b = tasks.get((int) Math.round(Math.random() * 5));
        System.out.println("В очередь встал человек. Номер очереди " + a + ". Задача - " + b);
        waitingQueue.put(a, b);
        Long time = (long) (Math.random() * 3001) + 1000;
        try {
            Thread.sleep(time);
        } catch (InterruptedException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
        }
        if (0.5 > Math.random()) {
            Integer c = Tasks.number(waitingQueue);
            Tasks d = tasks.get((int) Math.round(Math.random() * 5));
            System.out.println("В очередь встал человек. Номер очереди " + a + ". Задача - " + b);
            waitingQueue.put(c, d);
        }
    }

    public static void PeopleOutWaitLine(Map<Integer, Tasks> waitingQueue) {
        if (0.8 > Math.random()) {
            List<Integer> keyList = new ArrayList<>(waitingQueue.keySet());
            Random random = new Random();
            int number = random.nextInt(waitingQueue.size());
            Integer key = keyList.get(number);
            Tasks value = waitingQueue.get(key);
            waitingQueue.remove(key);
            System.out.println("Очередь покинул номер " + key + ". Задача " + value);
        }
    }

    public abstract int prioritet(); // метод абстрактный, требует реализации в классе наследнике

    public abstract long time(); // метод абстрактный, требует реализации в классе наследнике
}