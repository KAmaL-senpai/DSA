class Solution {
    public int[][] flipAndInvertImage(int[][] image) {
         for (int i = 0; i < image.length; i++) {
            swap(image[i], 0, image[i].length - 1);
        }

        for (int i = 0; i < image.length; i++) {
            for (int j = 0; j < image[i].length; j++) {
                if (image[i][j] == 1) {
                    image[i][j] = 0;
                } else {
                    image[i][j] = 1;
                }
            }
        }

        return image;
    }
     public int[] swap(int[] arr, int start, int end) {
     
        while (start < end) {
            int temp = arr[end];
            arr[end] = arr[start];
            arr[start] = temp;
            start++;
            end--;
        }
        return arr;

    }

}