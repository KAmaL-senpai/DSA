class Solution {
    public int search(int[] arr, int target) {
        return binSearch(arr, target, 0, arr.length - 1);
    }
    static int binSearch(int[] arr, int target, int start, int end) {
        if (start > end) {
            return -1;
        }
        int mid = start + (end - start) / 2;
        if (arr[mid] == target)
            return mid;
        if (arr[mid] < target) {
            return binSearch(arr, target, mid + 1, end);
        }
        return binSearch(arr, target, start, mid - 1);
    } 
}