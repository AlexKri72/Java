package Seminar4.Task01;

public class TroubleLine {

    public static Integer GoTroubleLine(Teams command) {
        int count = 0;
        int temp = 0;
        for (int i = 0; i < command.players.length; i++) {
            System.out.print("Игрок " + command.players[i].name + " : ");
            temp = Float(command.players[i]);
            System.out.print("заплыв - " + Converter(temp));
            count += temp;
            temp = Run(command.players[i]);
            System.out.print(", бег - " + Converter(temp));
            count += temp;
            temp = Spring(command.players[i]);
            System.out.println(", прыжки - " + Converter(temp));
            count += temp;
        }
        System.out.println("_________________________________________________________________");
        return count;
    }

    public static String Converter(Integer a) {
        if (a == 0) {
            return "НЕ прошел";
        } else {
            return "прошел";
        }

    }

    public static Integer Float(Peoples man) {
        if (Math.random() * 10 < man.float_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Run(Peoples man) {
        if (Math.random() * 10 < man.running_skill) {
            return 1;
        } else {
            return 0;
        }
    }

    public static Integer Spring(Peoples man) {
        if (Math.random() * 10 < man.spring_skiil) {
            return 1;
        } else {
            return 0;
        }
    }
}
