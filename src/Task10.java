import java.util.Scanner;

/**Произведите ввод данных с клавиатуры в матрицу, а после этого произведите вывод первой строки матрицы на экран, где каждый элемент умножается на 3.
 * Размерность матрицы задается пользователем
 * Created by ADMIN on 17.11.2019.
 */
public class Task10 {
    public static void main (String []args){
        Scanner sc = new Scanner(System.in);
        int size = sc.nextInt();
        int size2 = sc.nextInt();
        int[][] array = new int[size][size2];
        for (int i = 0; i < size; i++)
        {
            for (int j = 0; j < size2; ++j)
            {
                array[i][j] = sc.nextInt();
            }
        }
        for (int k = 0; k < size2; k++)
        {
            System.out.print(array[0][k] * 3  + " ");
        }
    }
}
