package HW2.Task9;

public class App9 {
    public static void main(String[] args) {

        int[] a = {15, 10, 51, -6, 3, -10, -34, 0, 32, 56, -12, 24, -52};
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
        System.out.println();
        int n = a.length;
        int b;
        for (int i = 0; i < n / 2; i++) {
            b = a[n - i - 1];
            a[n - i - 1] = a[i];
            a[i] = b;
        }
        for (int i = 0; i < a.length; i++) {
            System.out.print(a[i] + " ");
        }
    }
}
