import java.io.*;

/**
 * Created by ADMIN on 26.11.2019.
 */
public class Task18 {
    public static void main (String []args){
        int a = 0;
        int b = 0;
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("G:\\проги\\Java\\text.txt"))) {
            while ((s = br.readLine()) != null) {
                a++;
                System.out.println(s);
            }
        } catch (IOException ext) {
            System.out.println("Ошибка ввода-вывода: " + ext);

        }

        BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
        System.out.println("Введите предложения");
        try (FileWriter fw = new FileWriter("G:\\проги\\Java\\text.txt")) {
            do {
                System.out.print("Вы ввели : ");
                s = br.readLine();
                s = s + "\r\n";
                fw.write(s);
                b++;

            } while (b < a);

        } catch (IOException ext) {
            System.out.println("Ошибка ввода-вывода: " + ext);

        }

    }
}
