package HW2.Task2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int res = 0;
        while (n != 0) {
            res += n % 10;
            n /= 10;
        }
        System.out.println(res);
    }
}
