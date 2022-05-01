package procedural.loops_iterators;

import java.util.Arrays;

public class App01 {
    public static void main(String[] args) {
        int[] array = new int[] {20, 30, 10, 50, 40};
        for (int bar = array.length - 1; bar >= 0; bar--) {
            for (int index = 0; index < array.length - 1; index++) {
                if (array[index] > array[index + 1]) {
                    int tmp = array[index];
                    array[index] = array[index + 1];
                    array[index + 1] = tmp;
                }
            }
        }

        System.out.println(Arrays.toString(array));
    }
}
