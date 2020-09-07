package HW2;

import java.util.Scanner;


public class App1 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int value = scan.nextInt();
        int a = value %10;
        System.out.println(a);
    }
}
