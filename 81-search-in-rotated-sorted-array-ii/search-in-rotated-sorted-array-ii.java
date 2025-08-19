class Solution {
    public boolean search(int[] nums, int target) {
        boolean ans=false;
        for(int i:nums){
          if(i==target){
               ans=true;
             
               break;
          }
        }
return ans;
       
    }
}