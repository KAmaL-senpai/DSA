import java.util.Arrays;

public class cyclicSort {
    /*
     * ### 🧠 Logic Explanation for Cyclic Sort (1 to n)
     * 
     * This implementation uses the **cyclic sort** algorithm to sort an array
     * containing `n` unique elements in the range `[1, n]`.
     * 
     * The core idea is that in a correctly sorted array, each number `x` should be
     * at index `x - 1`. For example, `1` should be at index `0`, `2` at index `1`,
     * and so on. We iterate through the array using a loop, and for each index `i`,
     * we check whether the current element `arr[i]` is at its correct position. If
     * not — i.e., `arr[i] != arr[arr[i] - 1]` — we swap it with the element at its
     * correct index (`arr[i] - 1`).
     * 
     * We continue this process until every element is in its correct position. This
     * algorithm guarantees that each number is moved directly to its rightful place
     * in at most one swap per element.
     * 
     * Finally, we print the sorted array. This sorting algorithm works in **O(n)**
     * time and **O(1)** space, making it very efficient for arrays where elements
     * are within the range `1` to `n`.
     * 
     * ### ✅ Example
     ** Input:** `[3, 5, 2, 1, 4]`
     ** Output:** `[1, 2, 3, 4, 5]`
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 3, 5, 2, 1, 4 };

        for (int i = 0; i < arr.length;) {
            int correctIndex = arr[i] - 1;
            if (arr[i] != arr[correctIndex]) {
                int temp = arr[i];
                arr[i] = arr[correctIndex];
                arr[correctIndex] = temp;
            } else {
                i++;
            }
        }
        System.out.println(Arrays.toString(arr));
    }
}
