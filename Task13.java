import java.util.Scanner;

/**
 * Created by ADMIN on 25.11.2019.
 */
public class Task13 {
    public static void main (String[]args)
    {
        System.out.println("Введите текст с пробелами");
        Scanner sc = new Scanner(System.in);
        String s1 = sc.nextLine();
        String s2 = sc.nextLine();
        if (s1.length() > s2.length()) {
            System.out.print("Строка с наибольшей длиной: ");
            System.out.println(s1);
        }
        if (s2.length() > s1.length()) {
            System.out.print("Строка с наибольшей длиной: ");
            System.out.println(s2);
        }
        else{
            System.out.println("Стороки равны");
        }
    }
}
