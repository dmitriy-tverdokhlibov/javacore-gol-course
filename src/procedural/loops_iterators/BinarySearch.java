package procedural.loops_iterators;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray = {5,10,15,20,25,30,35};
        int key = 35;
        int first = 0;
        int last = numArray.length - 1;

        //Using the iterative approach
        searchIterative(numArray, key, first, last);

        // Using the recursion approach
        int result = searchRecursion(numArray, 0, numArray.length - 1 , key);
        if (result == -1)
            System.out.println("\nKey not found in given list!");
        else
            System.out.println("\nKey is found at location: "+result + " in the list");
    }

    private static void searchIterative(int[] array, int key, int first, int last) {
        int mid = (first + last) / 2;
        while (first <= last) {
            if (array[mid] < key) {
                first = mid + 1;
            } else if (array[mid] == key){
                System.out.println("Element is found at index: " + mid);
                break;
            } else {
                last = mid - 1;
            }
            mid = (first + last) / 2;
        }
        if (first > last) {
            System.out.println("Element is not found!");
        }
    }

    private static int searchRecursion(int[] array, int low, int high, int key) {
        if (high >= low){
            int mid = low + (high - low) / 2;
            if (array[mid] == key){
                return mid;
            }
            if (array[mid] > key){
                return searchRecursion(array, low, mid-1, key);
            } else {
                return searchRecursion(array,mid+1, high, key);
            }
        }
        return -1;
    }
}
