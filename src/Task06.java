import java.util.Scanner;

/**
 * Created by ADMIN on 16.11.2019.
 */
public class Task06 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int x = sc.nextInt();
        int y = sc.nextInt();
        int z = sc.nextInt();
        int srednee = (( x + y + z) / 3);
        System.out.println (srednee);
        int bez = srednee / 2;
        if (bez > 3){
            System.out.println("Программа выполнена корректно");
        }
    }
}
