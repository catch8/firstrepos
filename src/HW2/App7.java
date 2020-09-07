package HW2;

import java.util.Scanner;

public class App7 {
    public static void main(String[] args){
        System.out.println("Введите код города");
        Scanner scan = new Scanner(System.in);
        int n = scan.nextInt();
        switch (n){
            case 905:
                double res1 = 41.5;
                System.out.println("Москва. Стоимость разговора:"+res1);
                break;
            case 194:
                double res2 = 19.8;
                System.out.println("Ростов. Стоимость разговора:"+res2);
                break;
            case 491:
                double res3 = 26.9;
                System.out.println("Краснодар. Стоимость разговора:"+res3);
                break;
            case 800:
                double res4 = 50.0;
                System.out.println("Киров. Стоимость разговора:"+res4);
                break;
            default:
                System.out.println("Неверный код города");
        }
    }
}
