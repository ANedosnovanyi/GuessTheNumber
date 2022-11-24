import java.util.Random;
import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        System.out.println("Введите число: ");
        int value = new Random().nextInt(100);
        int attempt = new Scanner(System.in).nextInt();

        while (value != attempt){
            if (value == attempt){
                System.out.println("Позравляем! Вы угадали!");
                break;
            }
            else if (value < attempt){
                System.out.println("Заданное число больше");
                System.out.println("Введите число: ");
                attempt = new Scanner(System.in).nextInt();

            }
            else if (value > attempt){
                System.out.println("Заданное число меньше");
                System.out.println("Введите число: ");
                attempt = new Scanner(System.in).nextInt();
            }

        }
        System.out.println("Позравляем! Вы угадали!");
    }
}
