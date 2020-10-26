package HW2.Task8;

public class App8 {

    public static int getMax(int[] a) {
        //максимальное значение
        int res = a[0];
        for (int i = 1; i < a.length; i++) {
            if (a[i] > res) {
                res = a[i];
            }
        }
        System.out.println("Максимальное значение массива= " + res);
        return res;
    }

    public static int sumPositiveElem(int[] a) {
        //сумма положительных эл.
        int res = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] > 0) {
                res = res + a[i];
                count++;// количество положительных эл-в
            }
        }
        System.out.println("Сумма положительных элементов массива = " + res);
        System.out.println("Количество положительных элементов массива = " + count);
        return res;
    }

    public static int sumEvenNegativeElem(int[] a) {
        //сумма четных отриц эл.
        int res = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] % 2 == 0 && a[i] < 0) {
                res = res + a[i];
            }
        }
        System.out.println("Сумма четных отрицательных элементов массива = " + res);
        return res;
    }

    public static int arithmeticMeanNegativeNumb(int[] a) {
        // среднее арифметическое отрицательных эл
        int res = 0;
        int count = 0;
        for (int i = 0; i < a.length; i++) {
            if (a[i] < 0) {
                count++;
                res = (res + a[i]);

            }
            res = res / count;
        }
        System.out.println("Отрицательных элементов массива = " + count);
        System.out.println("Среднее арифметическое отрицательных элементов массива = " + res);
        return res;
    }
}