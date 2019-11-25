import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

/**
 * Created by ADMIN on 25.11.2019.
 */
public class Task16 {
    public static void main (String[]args)
    {
        String s;
        try (BufferedReader br = new BufferedReader(new FileReader("G:\\проги\\Java\\text.txt")))
        {
            while ((s = br.readLine()) !=null) {
                System.out.println(s);
            }
        }catch (IOException ext){
            System.out.println("Ошибка ввода-вывода: " + ext);
        }

    }
}
