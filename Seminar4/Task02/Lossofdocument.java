package Seminar4.Task02;

public class Lossofdocument extends Tasks {

    @Override
    public void nameTask() {
        System.out.println("Утеря документов.");
    }

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 5;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 8000;
    }

}
