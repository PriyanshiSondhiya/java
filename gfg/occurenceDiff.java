import java.util.*;

public class occurenceDiff {

    public static int findDiff(int[] arr) {

        HashMap<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            map.put(arr[i], map.getOrDefault(arr[i], 0) + 1);
        }

        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;

        for (Integer key : map.keySet()) {
            max = Math.max(max, map.get(key));
            min = Math.min(min, map.get(key));
        }

        return max - min;
    }

    public static void main(String[] args) {

        int[] arr = {1, 1, 1, 2, 2, 3};

        System.out.println(findDiff(arr));
    }
}