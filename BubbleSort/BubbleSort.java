import java.util.Arrays;

public class bubbleSort {
    /*
     * ### 🧠 Bubble Sort Logic Explanation (Java)
     * 
     * This implementation of **Bubble Sort** sorts an array in **ascending order**
     * by repeatedly swapping adjacent elements that are out of order. It includes
     * an **optimization** to stop early if the array becomes sorted before all
     * passes are complete.
     * 
     * ---
     * 
     * #### 🔄 How it works:
     * 
     * 1. Loop through the array multiple times.
     * 2. In each pass:
     * - Compare adjacent elements (`arr[j - 1]` and `arr[j]`).
     * - Swap them if they are in the wrong order (i.e., `arr[j] < arr[j - 1]`).
     * - Track if **any swap** occurred during the pass.
     * 3. If **no swaps** occur in a full pass, the array is already sorted, and the
     * loop exits early.
     * 
     * ---
     * 
     * #### 🔧 Key Variable:
     * 
     * - **`swap` (boolean flag)**:
     * - Starts as `false` at the beginning of each outer loop.
     * - Set to `true` if any two elements are swapped.
     * - If it remains `false`, the array is sorted — the algorithm breaks early to
     * improve efficiency.
     * 
     * ---
     * 
     * #### 📌 Example Input:
     * ```java
     * int[] arr = { 4, 2, 1, 5, 3 };
     * 
     */
    public static void main(String[] args) {
        int[] arr = { 4, 2, 1, 5, 3 };

        for (int i = 0; i < arr.length; i++) {
            boolean swap = false;
            for (int j = 1; j < arr.length - i; j++) {
                if (arr[j] < arr[j - 1]) {
                    int temp = arr[j - 1];
                    arr[j - 1] = arr[j];
                    arr[j] = temp;
                    swap = true;
                }
            }
            if (!swap) {
                break;
            }
        }

        System.out.println(Arrays.toString(arr));
    }
}
