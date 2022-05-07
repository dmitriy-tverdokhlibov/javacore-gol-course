package procedural.loops_iterators;

import java.util.Arrays;

public class Merger {
    public static void main(String[] args) {
        int[] firstData = {1, 1, 3, 4};
        int[] secondData = {2, 5, 8, 11};

        int[] mergedData = merge(firstData, secondData);
        System.out.println(Arrays.toString(mergedData));
    }

    private static int[] merge(int[] firstArray, int[] secondArray) {
        int[] result = new int[firstArray.length + secondArray.length];
        int frsIndex = 0;
        int secIndex = 0;
        while (frsIndex + secIndex != result.length - 1) {
            if (secIndex == secondArray.length) {
                while (frsIndex != firstArray.length) {
                    result[frsIndex + secIndex] = firstArray[frsIndex++];
                }
                break;
            } else if (frsIndex == firstArray.length) {
                while (secIndex != secondArray.length) {
                    result[frsIndex + secIndex] = secondArray[secIndex++];
                }
                break;
            }

            if (firstArray[frsIndex] < secondArray[secIndex]) {
                result[frsIndex + secIndex] = firstArray[frsIndex++];
            } else {
                result[frsIndex + secIndex] = secondArray[secIndex++];
            }
        }
        return result;
    }
}
