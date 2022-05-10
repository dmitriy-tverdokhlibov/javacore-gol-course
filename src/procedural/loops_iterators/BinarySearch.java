package procedural.loops_iterators;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numArray = {5,10,15,20,25,30,35};
        int key = 35;
        int first = 0;
        int last = numArray.length - 1;

        searchIterative(numArray, key, first, last);
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
}
