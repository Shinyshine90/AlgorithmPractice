package _01_array;

public class _02_climb_stairs {

    public static void main(String[] args) {
        System.out.println(ways(4));
    }

    private static int ways(int n) {
        if (n == 1) return 1;
        if (n == 2) return 2;
        return ways(n - 1) + ways(n - 2);
    }


}
