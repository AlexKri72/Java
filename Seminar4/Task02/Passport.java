package Seminar4.Task02;

public class Passport extends Tasks {
    String name = "Получение паспорта";

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 5;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 5000;
    }

}
