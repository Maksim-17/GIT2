import java.util.Arrays;

/**
 * Created by ADMIN on 25.11.2019.
 */
public class Task15 {
    public static void main (String[]args)
    {
        int [] arr = {13, 7, 1, 68};
        for (int i = 0; i < 2; i++) {
        }
        System.out.print("Введенный массив - ");
        for (int i = 0; i < 2; i++) {
        }
        System.out.println(Arrays.toString(arr));
        boolean f = false;
        int a;
        System.out.print("После сортировки - ");
        while (!f) {
            f = true;
            for (int i = 0; i < arr.length - 1; i++) {
                if (arr[i] > arr[i + 1]) {
                    f = false;
                    a = arr[i];
                    arr[i] = arr[i + 1];
                    arr[i + 1] = a;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
