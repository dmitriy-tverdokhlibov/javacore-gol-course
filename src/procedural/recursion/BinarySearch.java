package procedural.recursion;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray = {5, 10, 15, 20, 25, 30, 35};
        int key = 35;
        int low = 0;
        int high = numArray.length - 1;
        int result = searchRecursion(numArray, 0, numArray.length - 1, key);
        if (result == -1)
            System.out.println("\nKey not found in given list!");
        else
            System.out.println("\nKey is found at location: " + result + " in the list");
    }

    private static int searchRecursion(int[] array, int low, int high, int key) {
        if (high >= low){
            int mid = low + (high - low) / 2;
            if (array[mid] == key){
                return mid;
            }
            if (array[mid] > key){
                return searchRecursion(array, low, mid - 1, key);
            } else {
                return searchRecursion(array,mid + 1, high, key);
            }
        }
        return -1;
    }
}
