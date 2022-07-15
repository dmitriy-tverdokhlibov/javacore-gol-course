package procedural.loops_iterators;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class SelectionSortTest {
  private static final int[] data = {20, 30, 10, 50, 40};

  @Test
  void sort_arraySortingSimple_Ok() {
    int[] expected = {10, 20, 30, 40, 50};
    SelectionSort.sort(data);
    assertArrayEquals(expected, data);
  }

  @Test
  void sortOtimized_arraySortingOptimized_Ok() {

  }

}