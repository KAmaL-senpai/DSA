// User function Template for Java
class Solution {
    public int findCeil(int[] arr, int x) {
        // code here
        int start = 0;
        int end = arr.length - 1;
        int res = -1;
        while (start <= end) {
            int mid = start + (end - start) / 2;
            if(arr[mid]>=x){
                res=mid;
                end=mid-1;
            }else{
                start=mid+1;
            }
        }
        return res;
    }
}
