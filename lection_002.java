import java.io.*;

//
public class lection_002 {
    public static void main(String[] args) throws Exception {
        // считываем данные из 1 файла
        BufferedReader file = new BufferedReader(new FileReader("lection_in1.txt"));
        String str;
        while ((str = file.readLine()) != null) {
            System.out.printf("\n%s", str);
        }
        file.close();
        // считываем данные из 2 файла
        BufferedReader file1 = new BufferedReader(new FileReader("lection_in2.txt"));
        String str1;
        while ((str1 = file1.readLine()) != null) {
            System.out.printf("\n%s\n\n", str1);
        }
        file1.close();

    }
}
