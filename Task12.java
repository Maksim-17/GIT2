import java.util.Scanner;

/**
 * Created by ADMIN on 25.11.2019.
 */
public class Task12 {
    public static void main (String[]args)
    {
        System.out.println("Введите текст с пробелами");
        Scanner sc = new Scanner(System.in);
        String word = sc.nextLine();
        System.out.println(word.replaceAll("\\s", ""));
    }
}