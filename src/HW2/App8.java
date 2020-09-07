package HW2;

import java.util.Arrays;
import java.util.Scanner;

public class App8 {
    public static void main(String[] args){
        int[] a = { -1 ,-10 ,5,6,45,23,-45,-34,0,32,56,-1,2,-2};
        //максимальное значение
        int max = getMax(a);
        System.out.println("Максимальное значение массива= "+max);
        //сумма положительных эл.
        int sum = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                sum = sum + a[i];
                count++;// количество положительных эл-в
            }
        }
        System.out.println("Сумма положительных элементов массива = "+sum);
        System.out.println("Количество положительных элементов массива = "+count);
        //сумма четных отриц эл.
        int sum1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]%2==0 && a[i]< 0) {
                sum1 = sum1 + a[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива = "+sum1);
        // среднее арифметическое отрицательных эл
        int sum2 = 0;
        int count1 = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i]< 0) {
                count1++;
                sum2 = (sum2 + a[i]);

            }
        }
        System.out.println("Отрицательных элементов массива = "+count1);
        System.out.println("Среднее арифметическое отрицательных элементов массива = "+sum2/count1);
    }

    public static int getMax(int[] inputArray){
        int maxValue = inputArray[0];
        for(int i=1;i < inputArray.length;i++)
        { if(inputArray[i] > maxValue){
            maxValue = inputArray[i];
        }
        }
        return maxValue;
    }
}