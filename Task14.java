import java.util.Scanner;

/**
 * Created by ADMIN on 25.11.2019.
 */
public class Task14 {
    public static void main (String[]args)
    {
        System.out.println("Введите целое число");
        Scanner sc = new Scanner(System.in);
        String s = sc.nextLine();
        int x = Integer.parseInt(s);
        double y = x;
        System.out.println(s);
        System.out.println(x);
        System.out.println(y);
    }
}
