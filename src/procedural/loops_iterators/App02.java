package procedural.loops_iterators;

/**
* @author dmitriy tverdokhlibov
 */

public class App02 {
    public static void main(String[] args) {
        String str = "qwerty";
        char[] chars = str.toCharArray();

        // inversion of the string
        for (int k = 0; k < chars.length / 2; k++) {
            swap(chars, k, chars.length - 1 - k);

        }
        String inversedString = new String(chars);
        System.out.println(inversedString);
    }
    private static void swap(char[] array, int first, int second) {
        char tmp = array[first];
        array[first] = array[second];
        array[second] = tmp;
    }
}
