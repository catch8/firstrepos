package HW2.Task6;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args) {
        System.out.println("Введите целое число");
        Scanner scan = new Scanner(System.in);

        int n = scan.nextInt();
        if (n == 0) {
            System.out.println("Нулевое число");
        } else if (n % 2 == 0) {
            System.out.println("Четное число");
        } else {
            System.out.println("Нечетное число");
        }
        if (n < 0) {
            System.out.println("Отрицательное число");
        } else {
            System.out.println("Положительное число");
        }
    }
}
