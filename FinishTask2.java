import java.util.Arrays;
import java.util.Scanner;

/**
 * Created by ADMIN on 26.11.2019.
 */
public class FinishTask2 {
    public static void main (String[]args){
        Scanner input = new Scanner(System.in);
        System.out.print("Введите размер массива - ");
        int n = input.nextInt();
        int arr[] = new int[n];
        System.out.println("Заполняем массив - ");
        for (int i = 0; i < n; i++) {
            arr[i] = input.nextInt();

        }
        System.out.print("\nSorted: \n");
        Arrays.sort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.out.print(arr[i] + "  ");
        }
    }
}
