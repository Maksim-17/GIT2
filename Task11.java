import java.util.Scanner;

/**Необходимо произвести ввод строки с клавиатуры и записать в строковую переменную. Результат вывести на экран
 * Created by ADMIN on 17.11.2019.
 */
public class Task11 {
    public static void main (String[]args){
        Scanner sc = new Scanner(System.in);
        System.out.println("Введите текст");
        String word = sc.nextLine();
        System.out.println(word);
    }
}
