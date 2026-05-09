/**
 * @param {number[]} nums
 * @param {number} target
 * @return {number[]}
 */
var twoSum = function(nums, target) {
    const ansArr=[];
    for(let i=0;i<nums.length;i++){
        for(let j=0;j<nums.length;j++){ 
            if( i != j && nums[i]+nums[j]==target){
                ansArr.push(i);
                ansArr.push(j);
                return ansArr;
            }
        }
    }
};