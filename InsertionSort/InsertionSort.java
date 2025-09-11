import java.util.Arrays;

public class insertionSort {
    /*
     * - The program sorts an integer array using the **insertion sort algorithm**.
     * - The first part of the array is considered **sorted**, while the remaining
     * part is **unsorted**.
     * - For each element in the unsorted part:
     * - Compare it with elements on its left.
     * - Shift it backwards until it reaches its **correct position** in the sorted
     * portion.
     * - Swapping is used to place the element in order.
     * - This process repeats until all elements are sorted.
     * - Finally, the array is printed in **ascending order**.
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 5, 3, 4, 1, 2 };
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j > 0; j--) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j - 1];
                    arr[j - 1] = temp;

                } else {
                    break;
                }
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
