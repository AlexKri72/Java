package Seminar4.Task02;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Random;

public abstract class Tasks {

    public static void PeopleInWork(Map<Integer, Tasks> waitingQueue) throws InterruptedException {
        if (!waitingQueue.isEmpty()) {
            Integer[] aKeys = waitingQueue.keySet().toArray(new Integer[waitingQueue.size()]);
            Integer firstKey = aKeys[0];
            System.out.print("В работе клиент с номером очереди " + firstKey + ". Задача - ");
            waitingQueue.get(firstKey).nameTask();
            Thread.sleep(waitingQueue.get(firstKey).time());
            waitingQueue.remove(firstKey);
        }

    }

    public static Integer num = 0;

    public static Integer number(Map<Integer, Tasks> waitingQueue) { // метод не абстрактный, наследуется напрямую
        num += 1;
        return num;
    }

    public static void closeWindow() {
        if (0.8 > Math.random()) {
            Long time = (long) (Math.random() * 8001) + 4000;
            System.out.println("Извините, технический перерыв на " + time / 1000 + " секунд");
            try {
                Thread.sleep(time);
            } catch (InterruptedException e) {
                // TODO Auto-generated catch block
                return;
            }
        }
    }

    public static void PeopleInWaitLine(List<Tasks> tasks, Map<Integer, Tasks> waitingQueue)
            throws InterruptedException {
        Integer a = Tasks.number(waitingQueue);
        Tasks b = tasks.get((int) Math.round(Math.random() * 5));
        System.out.print("В очередь встал человек. Номер очереди " + a + ". Задача - ");
        waitingQueue.put(a, b);
        waitingQueue.get(a).nameTask();
        Thread.sleep(b.time());
    }

    public static void PeopleOutWaitLine(Map<Integer, Tasks> waitingQueue) {
        if (0.8 > Math.random() && !waitingQueue.isEmpty()) {
            List<Integer> keyList = new ArrayList<>(waitingQueue.keySet());
            Random random = new Random();
            int number = random.nextInt(waitingQueue.size());
            Integer key = keyList.get(number);
            System.out.print("Очередь покинул номер " + key + ". Задача ");
            waitingQueue.get(key).nameTask();
            waitingQueue.remove(key);
        }
    }

    public abstract int prioritet(); // метод абстрактный, требует реализации в классе наследнике

    public abstract long time(); // метод абстрактный, требует реализации в классе наследнике

    public abstract void nameTask();

}