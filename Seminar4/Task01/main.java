package Seminar4.Task01;

public class main {
    public static void main(String[] args) {

        Teams.commandInformation(Teams.command_1);
        Teams.commandInformation(Teams.command_2);
        System.out.println("Команда 'Tiger' по результатам трех испытаний набрала "
                + TroubleLine.GoTroubleLine(Teams.command_1) + " баллов.\n");
        System.out.println("Команда 'Wolf' по результатам трех испытаний набрала "
                + TroubleLine.GoTroubleLine(Teams.command_1) + " баллов.\n");

    }
}
