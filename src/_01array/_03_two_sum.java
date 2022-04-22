package _01array;

import java.util.*;

public class _03_two_sum {

    public static void main(String[] args) {
        System.out.println(Arrays.toString(twoSum(new int[]{2, 7, 11, 15}, 123)));
    }

    private static int[] twoSum(int[] arr, int sum) {
        int[] ret = new int[2];
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    ret[0] = i;
                    ret[1] = j;
                    return ret;
                }
            }
        }
        return ret;
    }

    private static List<Integer> findTwoSum(int[] arr, int sum) {
        List<Integer> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();
        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], i);
        }

        for (int i = 0; i < arr.length; i++) {
            int value = sum - arr[i];
            Integer p = map.get(value);
            if (p != null && p != i) {
                result.add(i);
                result.add(p);
                break;
            }
        }
        return result;
    }
}
