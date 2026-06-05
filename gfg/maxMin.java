import java.util.*;

public class maxMin {

    public static ArrayList<Integer> getMinMax(int[] arr) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        // code Here
        int max = Integer.MIN_VALUE;
        int min = Integer.MAX_VALUE;
        
        for(int i = 0; i < arr.length; i++){
            if(arr[i] > max) max = arr[i];
            if(arr[i] < min) min = arr[i];
        }
        
        ans.add(min);
        ans.add(max);
        return ans;
    }

    public static void main(String[] args) {
        
        int[] arr = {3, 2, 1, 56, 10000, 167};
        
        System.out.println(getMinMax(arr));
    }
}
