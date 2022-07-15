package procedural.loops_iterators;

import java.util.Arrays;

public class Merger {
    public static void main(String[] args) {
        int[] firstData = {1, 1, 3, 4};
        int[] secondData = {2, 5, 8, 11};

        int[] mergedData = merge(firstData, secondData);
        System.out.println(Arrays.toString(mergedData));
    }

    private static int[] merge(int[] first, int[] second) {
        int[] result = new int[first.length + second.length];
        int frsIndex = 0;
        int secIndex = 0;
        while (frsIndex + secIndex != result.length) {
            if (secIndex == second.length) {
                System.arraycopy(first, frsIndex, result, frsIndex + secIndex,
                        first.length - frsIndex);
                break;
            } else if (frsIndex == first.length) {
               System.arraycopy(second, secIndex, result, frsIndex + secIndex,
                       second.length - secIndex);
                break;
            }
            if (first[frsIndex] < second[secIndex]) {
                result[frsIndex + secIndex] = first[frsIndex++];
            } else {
                result[frsIndex + secIndex] = second[secIndex++];
            }
        }
        return result;
    }
}
