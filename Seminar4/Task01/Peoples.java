package Seminar4.Task01;

public class Peoples {
    String name;
    Integer number;
    Integer float_skill;
    Integer running_skill;
    Integer spring_skiil;

    public Peoples(String name, Integer number, Integer float_skill, Integer running_skill, Integer spring_skill) {
        this.name = name;
        this.number = number;
        this.float_skill = float_skill;
        this.running_skill = running_skill;
        this.spring_skiil = spring_skill;
    }

    static Peoples people1 = new Peoples("Сергей", 1, 6, 4, 7);
    static Peoples people2 = new Peoples("Аленксандр", 2, 7, 9, 8);
    static Peoples people3 = new Peoples("Юрий", 3, 4, 6, 5);
    static Peoples people4 = new Peoples("Артур", 4, 7, 7, 8);
    static Peoples people5 = new Peoples("Михаил", 5, 4, 7, 5);
    static Peoples people6 = new Peoples("Данил", 6, 5, 5, 9);
}
