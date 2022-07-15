package procedural.loops_iterators;

import java.util.Arrays;

public class SelectionSort {
    public static void main(String[] args) {
        int[] data = {20, 30, 10, 50, 40};
        sort(data);
        System.out.println(Arrays.toString(data));
    }

    public static void sort(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            for (int index = barrier + 1; index < arr.length; index++) {
                if (arr[barrier] > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }
    // sort optimized
    public static void sortOptimized(int[] arr) {
        for (int barrier = 0; barrier < arr.length - 1; barrier++) {
            int element = arr[barrier];
            for (int index = barrier + 1; index < arr.length; index++) {
                if (element > arr[index]) {
                    int tmp = arr[index];
                    arr[index] = arr[barrier];
                    arr[barrier] = tmp;
                }
            }
        }
    }
}
