package _01array;

import java.util.Arrays;

/**
 * 移动零
 */
public class _01_move_zero {

    public static void main(String[] args) {
        int[] arr = new int[]{1, 2, 3, 0, 4, 10, 0, 9};
        moveZeroQuick(arr);
        //moveZero(arr);
        System.out.println(Arrays.toString(arr));
    }

    public static void moveZeroQuick(int[] arr) {
        for (int i = 0, j = 0; i < arr.length; i++) {
            if (arr[i] != 0) {
                swap(arr, i, j);
                j++;
            }
        }
    }

    public static void moveZero(int[] arr) {
        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == 0) continue;
            for (int j = 0; j < i; j++) {
                if (arr[j] != 0) continue;
                swap(arr, i, j);
                break;
            }
        }
    }

    private static void swap(int[] arr, int i, int j) {
        int temp = arr[i];
        arr[i] = arr[j];
        arr[j] = temp;
    }

}
