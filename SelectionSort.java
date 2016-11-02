package selectionsort;

import java.util.*;

public class SelectionSort {

    public static void main(String[] args) {
        final int[] arrays = {4, 8, 1, 5, 3};
        int min;
        for (int i = 0; i < arrays.length; i++) {

            min = i;
            for (int j = i + 1; j < arrays.length; j++) {
                if (arrays[j] < arrays[min]) {
                    min = j;

                }
            }
            if (min != i) {
                final int temp = arrays[i];
                arrays[i] = arrays[min];
                arrays[min] = temp;
            }
            System.out.println(arrays[i]);
        }
    }

}
