import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        System.out.println("Автор: Иван Балкин");
        System.out.println("Введите число:");
        int nothing = 0;
        int value = new Scanner(System.in).nextInt();
        int factorial = 1;
        for ( int i = 1; i <= value ; i = i + 1) {
            factorial = factorial * i;
                    }
        System.out.println("Факториал числа равен: " + factorial );
        System.out.println("Приятно с вами работать");

    }
}
