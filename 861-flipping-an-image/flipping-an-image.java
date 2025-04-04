class Solution {
    public int[][] flipAndInvertImage(int[][] arr) {
         for (int i = 0; i < arr.length; i++) {
            swap(arr[i]);
        }
        for (int[] x : arr) {
            for(int i=0;i<x.length;i++){
                if(x[i]==0){
                    x[i]=1;
                }else{
                    x[i]=0;
                }
            }
        }
        return arr;
    }
    static void swap(int[] arr) {
        int mid = arr.length / 2;
        for (int i = 0; i < mid; i++) {
            int temp = arr[i];
            arr[i] = arr[arr.length - i - 1];
            arr[arr.length - i - 1] = temp;
        }
    }
}