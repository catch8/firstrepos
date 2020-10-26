package HW2.Task7;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args) {
        System.out.println("Введите трёхзначный код города");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();

        double minutes = 10;
        double costMoscow = 4.15;
        double costRostov = 1.98;
        double costKrasnodar = 2.69;
        double costKirov = 5.00;

        switch (n) {
            case 905:
                System.out.println("Москва. Стоимость разговора:" + minutes * costMoscow);
                break;
            case 194:
                System.out.println("Ростов. Стоимость разговора:" + minutes * costRostov);
                break;
            case 491:
                System.out.println("Краснодар. Стоимость разговора:" + minutes * costKrasnodar);
                break;
            case 800:
                System.out.println("Киров. Стоимость разговора:" + minutes * costKirov);
                break;
            default:
                System.out.println("Неверный код города");
        }
    }
}
