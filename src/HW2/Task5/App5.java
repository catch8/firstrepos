package HW2.Task5;

import java.util.Scanner;
import java.util.Arrays;

public class App5 {
    public static void main(String[] args) {
        System.out.println("Введите 3 числа");
        Scanner scan = new Scanner(System.in);
        int[] n = new int[3];
        for (int i = 0; i < n.length; i++) {
            n[i] = scan.nextInt();
        }
        Arrays.sort(n);
        System.out.println(n[0]);
    }
}
