import java.util.*;

public class removeDuplicates {

    public static ArrayList<Integer> removeDuplicate(int arr[]) {

        HashSet<Integer> set = new HashSet<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : arr) {
            if (set.add(x)) {   // true only if x is not already present
                ans.add(x);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int arr[] = {1, 2, 1, 3, 2, 4, 4, 5};

        ArrayList<Integer> result = removeDuplicate(arr);

        System.out.println("Array after removing duplicates:");
        System.out.println(result);
    }
}