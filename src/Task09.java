import java.util.Scanner;

/**Произведите ввод данных с клавиатуры в массив, а после этого произведите вывод массива на экран, где каждый элемент массива умножается на 2.
 * Размер массива задается пользователем
 * Created by ADMIN on 16.11.2019.
 */
public class Task09 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int[] array = new int[size];
        for (int i = 0; i < array.length; i++)
        {
            array[i] = sc.nextInt();
        }
        for (int i =0; i < array.length; i++)
        {
            array[i] *= 2;
            System.out.println(array[i]);// * 2);
        }
    }
}
