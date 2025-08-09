/**
 * // This is MountainArray's API interface.
 * // You should not implement it, or speculate about its implementation
 * interface MountainArray {
 *     public int get(int index) {}
 *     public int length() {}
 * }
 */
 
class Solution {
    public int findInMountainArray(int target, MountainArray mountainArr) {
        int n=mountainArr.length();
        int peak=peak(mountainArr);
        int minimumIndex=binarySearch(mountainArr,0,peak,target,true);
        if(minimumIndex != -1) return minimumIndex;
        
        int maxIndex=binarySearch(mountainArr,peak+1,n-1,target,false);
        return maxIndex;
    }
      static int peak(MountainArray mountainArr) {
        int start = 0;
        int end = mountainArr.length()-1;
        while (start < end) {
            int mid = start + (end - start) / 2;
            if (mountainArr.get(mid) < mountainArr.get(mid + 1)) {
                start = mid + 1;
            } else {
                end = mid;
            }
        }
        return start;
    }
    static int binarySearch(MountainArray arr, int start, int end, int target, boolean ascending){
        while (start <= end) {
            int mid = start + (end - start) / 2;
            int value = arr.get(mid);
            
            if (value == target) return mid;
            
            if (ascending) {
                if (value < target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            } else {
                if (value > target) {
                    start = mid + 1;
                } else {
                    end = mid - 1;
                }
            }
        }
        return -1;
    }
}