import java.util.Arrays;

public class selectionSort {
    /*
     * ### 🧠 Selection Sort Logic Explanation (Java)
     * 
     * This implementation of **Selection Sort** sorts an array in ascending order
     * by repeatedly placing the largest unsorted element at the end of the unsorted
     * portion.
     * 
     * #### 🔄 How it works:
     * 
     * 1. Loop from the end of the array toward the start.
     * 2. In each iteration:
     * - Find the **index of the maximum element** in the unsorted part of the array
     * (`0` to `last`).
     * - Swap that maximum element with the element at the `last` index.
     * 3. Repeat this until the array is fully sorted.
     * 
     * #### 🔧 Functions Used:
     * 
     * - **`max(arr, start, last)`**
     * Finds the index of the largest element
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 4, 5, 1, 2, 3 };
        boolean isSorted = true;
        for (int i = 0; i < arr.length; i++) {
            int last = arr.length - i - 1;
            int maxIndex = max(arr, 0, last);
            if (maxIndex != last) {

                swap(arr, maxIndex, last);
                isSorted = false;
            }
        }

        if (isSorted) {
            System.out.println("aLready sorted");
        }

        System.out.println(Arrays.toString(arr));
    }

    static int max(int[] arr, int start, int last) {
        int max = start;
        for (int i = start; i <= last; i++) {
            if (arr[max] < arr[i])
                max = i;
        }
        return max;
    }

    static void swap(int[] arr, int first, int second) {
        int temp = arr[first];
        arr[first] = arr[second];
        arr[second] = temp;
    }
}
