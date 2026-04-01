import java.util.*;

public class combinationSum {

    private void findCombinations(int ind, int target, int[] arr, List<List<Integer>> ans, List<Integer> ds) {

        if (ind == arr.length) {
            if (target == 0) {
                ans.add(new ArrayList<>(ds));
            }
            return;
        }

        // pick element
        if (arr[ind] <= target) {
            ds.add(arr[ind]);
            findCombinations(ind, target - arr[ind], arr, ans, ds);
            ds.remove(ds.size() - 1); // backtrack
        }

        // not pick element
        findCombinations(ind + 1, target, arr, ans, ds);
    }

    public List<List<Integer>> combinationSum(int[] candidates, int target) {
        List<List<Integer>> ans = new ArrayList<>();
        findCombinations(0, target, candidates, ans, new ArrayList<>());
        return ans;
    }

    public static void main(String[] args) {

        combinationSum obj = new combinationSum();

        int[] candidates = {2, 3, 6, 7};
        int target = 7;

        List<List<Integer>> result = obj.combinationSum(candidates, target);

        System.out.println("Combinations are:");
        for (List<Integer> list : result) {
            System.out.println(list);
        }
    }
}