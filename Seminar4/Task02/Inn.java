package Seminar4.Task02;

public class Inn extends Tasks {
    String name = "Получение ИНН";

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 4;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 6000;
    }

}
