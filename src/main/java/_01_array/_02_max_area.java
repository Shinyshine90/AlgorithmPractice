package _01_array;

public class _02_max_area {

    public static void main(String[] args) {
        System.out.println(findMaxAreaQuick(new int[] { 1, 8 , 6, 2, 5, 4, 8, 3, 7}));
    }

    private static int findMaxAreaQuick(int[] arr) {
        int maxArea = 0;
        for (int i = 0, j = arr.length - 1; i < j;) {
            int area = (j - i) * Math.min(arr[i], arr[j]);
            maxArea = Math.max(maxArea, area);
            if (arr[i] < arr[j]) {
                i++;
            } else {
                j--;
            }
        }
        return maxArea;
    }

    private static int findMaxArea(int[] arr) {
        int maxArea = 0;
        for (int i = 0; i < arr.length - 1; i++) {
            for (int j = i + 1; j < arr.length; j++) {
                int area = (j - i) * Math.min(arr[i], arr[j]);
                maxArea = Math.max(maxArea, area);
            }
        }
        return maxArea;
    }

}
