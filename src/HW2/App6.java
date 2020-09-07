package HW2;

import java.util.Scanner;

public class App6 {
    public static void main(String[] args){
        System.out.println("Введите целое число");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        if (n == 0) {
            System.out.println("Нулевое число");
        }
        else if (n%2==0 && n < 0){
            System.out.println("Отрицательное четное число");
        }
        else if (n%2!=0 && n < 0){
            System.out.println("Отрицательное нечетное число");
        }
        else if (n%2==0 && n > 0){
            System.out.println("Положительное четное число");
        }
        else if (n%2!=0 && n > 0){
            System.out.println("Положительное нечетное число");
        }
    }
}
