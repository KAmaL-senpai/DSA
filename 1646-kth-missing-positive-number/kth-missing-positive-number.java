class Solution {
    public int findKthPositive(int[] arr, int k) {
      int start=0;
      int end=arr.length-1;
      while(start<=end){
        int mid=start+(end-start)/2;
        int missingNum=arr[mid]-(mid+1);
        if(missingNum<k){
            start=mid+1;
        }else{
            end=mid-1;
        }
      }
      return start+k;
    }
}