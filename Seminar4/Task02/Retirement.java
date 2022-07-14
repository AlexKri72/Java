package Seminar4.Task02;

public class Retirement extends Tasks {

    @Override
    public void nameTask() {
        System.out.println("Выход на пенсию.");
    }

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 0;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 0;
    }

}
