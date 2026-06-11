import java.util.ArrayList;
import java.util.HashMap;



public class DuplicateInLimitedRange {

    public static ArrayList<Integer> findDuplicates(int[] arr) {

        HashMap<Integer, Integer> ans = new HashMap<>();
        ArrayList<Integer> list = new ArrayList<>();

        for(int i = 0; i < arr.length; i++) {
            ans.put(arr[i], ans.getOrDefault(arr[i], 0) + 1);
        }

        for(int key : ans.keySet()) {
            if(ans.get(key) > 1) {
                list.add(key);
            }
        }

        return list;
    }

    public static void main(String[] args) {

        int[] arr = {1, 2, 3, 1, 3, 6, 6};

        ArrayList<Integer> result = findDuplicates(arr);

        System.out.println(result);
    }
}
  

