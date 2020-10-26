package HW2.Task4;

import java.util.Scanner;

public class App4 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            n = n + 1;
        } else if (n < 0) {
            n = n - 2;
        } else if (n == 0) {
            n = 10;
        }
        System.out.println(n);
    }
}
