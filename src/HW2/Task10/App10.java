package HW2.Task10;

public class App10 {
    public static void findZeroArrAndOutput(int[] arr) {
        int i = 0;
        for (int j = 0; j < arr.length; j++) {
            if (arr[j] != 0) {
                arr[i++] = arr[j];
            }
        }
        while (i < arr.length) {
            arr[i++] = 0;
        }
        System.out.println("Массив с нулями в конце: ");
        for (int j = 0; j < arr.length; j++) {
            System.out.print(arr[j] + " ");
        }
    }
}