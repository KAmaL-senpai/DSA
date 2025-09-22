class Solution {
    public int[] relativeSortArray(int[] arr1, int[] arr2) {
         //find the max of the arr1
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < arr1.length; i++) {
            if (max < arr1[i])
                max = arr1[i];
        }
        
        //count the frequency of the arr2[i] in arr1
        int[] countArr = new int[max + 1];
        for (int i = 0; i < arr1.length; i++) {
            int ele = arr1[i];
            countArr[ele]++;
        }

        //add the ele according to frequency
        int[] res = new int[arr1.length];
        int j = 0;
        for (int i = 0; i < arr2.length; i++) {
            int ele = arr2[i];
            while (countArr[ele] > 0) {
                res[j] = ele;
                j++;
                countArr[ele]--;
            }
        }
        
        //fill the remaining sorted order
        for (int i = 0; i < countArr.length; i++) {
            while (countArr[i] > 0) {
                res[j] = i;
                j++;
                countArr[i]--;
            }
        }
        return res;
    }
}