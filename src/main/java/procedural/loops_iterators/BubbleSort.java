package procedural.loops_iterators;

import java.util.Arrays;

/**
 * @author dmitriy tverdokhlibov
 */
public class BubbleSort {
    public static void main(String[] args) {
        int[] data = {20, 30, 10, 50, 40};

        // Bubble sorting, large elements go into the right
        for (int bar = data.length - 1; bar >= 1; bar--) {
            for (int index = 0; index < data.length - 1; index++) {
                ConditionalSwap(data, index);
            }
        }
        System.out.println(Arrays.toString(data));
    }

    private static void ConditionalSwap(int[] array, int index) {
        if (array[index] > array[index + 1]) {
            swap(array, index);
        }
    }

    private static void swap(int[] array, int index) {
        int tmp = array[index];
        array[index] = array[index + 1];
        array[index + 1] = tmp;
    }
}
