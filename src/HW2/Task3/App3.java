package HW2.Task3;

import java.util.Scanner;

public class App3 {
    public static void main(String[] args) {
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n > 0) {
            n = n + 1;
        }
        System.out.println(n);
    }
}
