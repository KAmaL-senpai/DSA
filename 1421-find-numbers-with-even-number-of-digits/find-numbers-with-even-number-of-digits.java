class Solution {
    public int findNumbers(int[] nums) {
        int sum=0;
        for(int i=0;i<nums.length;i++){
            String s=String.valueOf(nums[i]);
            if(s.length()%2==0){
                sum++;
            }
        }
        return sum;
    }
}