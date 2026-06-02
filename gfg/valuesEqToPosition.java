import java.util.*;

public class valuesEqToPosition {
    public static void main(String[] args) {

        int arr[] = {15, 2, 45, 4, 7};

        ArrayList<Integer> ans = new ArrayList<>();

        for (int i = 0; i < arr.length; i++) {
            if (arr[i] == i + 1) {
                ans.add(arr[i]);
            }
        }

        System.out.println("Values equal to their positions:");
        System.out.println(ans);
    }
}