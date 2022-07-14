package Seminar4.Task02;

public class Namechange extends Tasks {

    @Override
    public void nameTask() {
        System.out.println("Смена имени.");
    }

    @Override
    public int prioritet() {
        // назначаем приоритет конкретной задачи
        return 3;
    }

    @Override
    public long time() {
        // назначаем время выполнения конкретной задачи
        return 3000;
    }

}
