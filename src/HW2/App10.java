package HW2;

import java.util.Arrays;

public class App10 {
    public static void main(String[] args){

        int[] arr = { 15 ,10 ,51,-6,3,-10,-34,0,32,56,-12,24,-52};
        int temp;
        for (int i = 0; i < arr.length; i++)
        {
            if (arr[i] == 0)
            {
                for (int j = i + 1; j < arr.length; j++)
                {
                    if (arr[j] != 0)
                    {
                        temp = arr[j];
                        arr[j] = arr[i];
                        arr[i] = temp;
                        break;
                    }
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
