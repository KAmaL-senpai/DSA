class Solution {
    public int[] smallerNumbersThanCurrent(int[] nums) {
        int[] res=new int[nums.length];

        int[] buckArr=new int[101];
        for(int num:nums){
            buckArr[num]++;
        }

        for(int i=1;i<buckArr.length;i++){
            buckArr[i]+=buckArr[i-1];
        }

        for(int i=0;i<res.length;i++){
            if(nums[i]==0){
                res[i]=0;
            }else{
                res[i]=buckArr[nums[i]-1];
            }
        }
        return res;
    }
}