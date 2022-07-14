package Seminar4.Task02;

public class Birthofachild extends Tasks {

    @Override
    public void nameTask() {
        System.out.println("Рождение ребенка.");
    }

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 2;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 7000;
    }

}
