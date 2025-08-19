class Solution {
    public int findKRotation(int arr[]) {
        // Code here
        int start = 0;
        int end = arr.length - 1;
        if (arr[start] > arr[end]) {

            while (start < end) {
                int mid = start + (end - start) / 2;
                if (arr[mid] > arr[end]) {
                    start = mid + 1;
                } else {
                    end = mid;
                }
            }

            return start;
        }
        return 0;
    }
}