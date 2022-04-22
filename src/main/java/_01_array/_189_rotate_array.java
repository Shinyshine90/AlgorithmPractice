package _01_array;

import java.util.Arrays;

public class _189_rotate_array {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(rotate(new int[]{1,2,3,4,5,6,7}, 3)));
    }

    private static int[] rotate(int[] arr, int k) {
        int[] ret = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            if (i < arr.length - k) {
                ret[i + k] = arr[i];
            } else {
                ret[i - arr.length - k] = arr[i];
            }
        }
        return ret;
    }
}
