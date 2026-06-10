import java.util.*;

public class posNegElements {

    public static ArrayList<Integer> arranged(ArrayList<Integer> arr) {

        ArrayList<Integer> pos = new ArrayList<>();
        ArrayList<Integer> neg = new ArrayList<>();
        ArrayList<Integer> ans = new ArrayList<>();

        for (int x : arr) {
            if (x >= 0) {
                pos.add(x);
            } else {
                neg.add(x);
            }
        }

        int i = 0, j = 0;

        while (i < pos.size() && j < neg.size()) {
            ans.add(pos.get(i++));
            ans.add(neg.get(j++));
        }

        while (i < pos.size()) {
            ans.add(pos.get(i++));
        }

        while (j < neg.size()) {
            ans.add(neg.get(j++));
        }

        return ans;
    }

    public static void main(String[] args) {

        ArrayList<Integer> arr = new ArrayList<>(
                Arrays.asList(1, 2, 3, -4, -1, 4));

        ArrayList<Integer> result = arranged(arr);

        System.out.println(result);
    }
}