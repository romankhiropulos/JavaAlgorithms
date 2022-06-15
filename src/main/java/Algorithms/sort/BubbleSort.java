package Algorithms.sort;

import java.util.Arrays;

public class BubbleSort {

    public static void sort(int[] array) {
        for (int i = array.length - 1; i > 0; i--) {
            for (int j = 0; j < i; j++) {
                if (array[j] > array[j + 1]) {
                    int dummy = array[j];
                    array[j] = array[j + 1];
                    array[j + 1] = dummy;
                }
            }
        }
    }

    public static void main(String[] args) {
        int[] arr = {3, 4, 1, 5, 3, 2};
        BubbleSort.sort(arr);
        System.out.println(Arrays.toString(arr));
    }
}
