package procedural.loops_iterators;

import java.util.Arrays;

public class InsertionSort {
    public static void main(String[] args) {
        int[] data = {2, 3, 12, 1, 8, 9 }; // 1
        sort(data);
        System.out.println(Arrays.toString(data));
    }
    // оптимизация добавить бинарный поиск
    public static void sort(int[] arr) {
        for (int barrier = 1; barrier < arr.length; barrier++) {
            int newElement = arr[barrier];
            int location = barrier - 1;
            while (location >= 0 && arr[location] > newElement) {
                arr[location + 1] = arr[location];
                location--;
            }
            arr[location + 1] = newElement;
        }
    }
}
