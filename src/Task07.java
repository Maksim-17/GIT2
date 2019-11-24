import java.util.Scanner;

/**
 * Created by ADMIN on 16.11.2019.
 */
public class Task07 {
    public static void main (String [] args) {
        Scanner sc = new Scanner(System.in);
        int X = 1;
        int Y = 2;
        int Z = 3;
        int number = sc.nextInt();
        if ((X == number) || (Y == number) || (Z == number))
        {
            System.out.println("Данное значение имеется в константах");
        }
        else
        {
            System.out.println("Такой константы нет");
        }
    }
}
