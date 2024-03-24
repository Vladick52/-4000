import java.util.Random;
import java.util.Scanner;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        System.out.println("Введите загаданное число:");
    int value = new Random().nextInt(100);
    int attempt = new Scanner(System.in).nextInt();
    boolean guess = false;
    while (!guess){
        System.out.println("Ввелите число");
        int value1 = new Scanner(System.in).nextInt();
        if (value1==value){
            System.out.println("Вы угадали");
            guess = true;
        }else if (value > value1){
            System.out.println("Загаданное число больше");
        }else {
            System.out.println("Загаданное число меньше");
        }

    }

    }
}