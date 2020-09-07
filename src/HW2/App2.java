package HW2;

import java.util.Scanner;

public class App2 {
    public static void main(String[] args){
        System.out.println("Введите число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        int a = n %10;
        int b =  n % 100 / 10;
        int c = n /100;
        int res = a+b+c;
        System.out.println(res);
    }
}
