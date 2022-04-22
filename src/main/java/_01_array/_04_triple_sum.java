package _01_array;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class _04_triple_sum {

    public static void main(String[] args) {
        System.out.println(findTripleSumQuick(new int[]{-1,0,1,2,-1,-4}));
    }

    private static List<List<Integer>> findTripleSumQuick(int[] arr) {
        List<List<Integer>> tripleSumList = new ArrayList<>();
        Arrays.sort(arr);
        for (int i = 0; i < arr.length - 2; i++) {
            int l = i + 1;
            int r = arr.length - 1;
            if (0 < i && arr[i - 1] == arr[i]) continue;
            while (l < r) {
                int sum = arr[i] + arr[l] + arr[r];
                if (sum == 0) {
                    tripleSumList.add(Arrays.asList(arr[i], arr[l], arr[r]));
                    while (l < r && arr[l] == arr[++l]);
                    while (l < r && arr[r] == arr[--r]);
                } else if (sum < 0) {
                    while (l < r && arr[l] == arr[++l]);
                } else {
                    while (l < r && arr[r] == arr[--r]);
                }
            }
        }
        return tripleSumList;
    }

    private static List<List<Integer>> findTripleSum(int[] arr) {
        List<List<Integer>> tripleSumList = new ArrayList<>();
        for (int i = 0; i < arr.length - 2; i++) {
            List<List<Integer>> twoSumList = findTwoSum(arr, i + 1, -arr[i]);
            if (twoSumList.isEmpty()) continue;

            for (int j = 0; j < twoSumList.size(); j++) {
                List<Integer> tripleOne = new ArrayList<>();
                tripleOne.add(arr[i]);
                tripleOne.addAll(1, twoSumList.get(j));
                tripleSumList.add(tripleOne);
            }
        }
        return tripleSumList;
    }

    private static List<List<Integer>> findTwoSum(int[] arr, int start, int sum) {
        List<List<Integer>> ret = new ArrayList<>();
        for (int i = start; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                if (arr[i] + arr[j] == sum) {
                    List<Integer> pair = new ArrayList<>();
                    pair.add(arr[i]);
                    pair.add(arr[j]);
                    ret.add(pair);
                }
            }
        }
        return ret;
    }
}
