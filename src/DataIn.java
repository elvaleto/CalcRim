
import java.util.Scanner;

public class DataIn {
    public static String input(){
        Scanner scun = new Scanner(System.in);
        System.out.println("введите комбинацию a + b");
        String arr = scun.nextLine();
        return arr;
    }
}
