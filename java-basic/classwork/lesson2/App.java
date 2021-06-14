package lesson2;

import java.util.Arrays;

public class App {
    public static void main(String[] args) {
        int[] arr = {1, 2, 3, 4, 5};
//        invert(arr);
        invertFromMiddle(arr);
        System.out.println(Arrays.toString(arr));
    }

    private static void invert(int[] arr) {
        for (int i = 0; i < arr.length / 2; i++) {
            int buffer = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = buffer;
        }
    }

    private static void invertFromMiddle(int[] arr){
        //implement me
    }
}
