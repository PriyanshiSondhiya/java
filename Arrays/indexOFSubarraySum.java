import java.util.*;

class indexOFSubarraySum {
    static ArrayList<Integer> subarraySum(int[] arr, int target) {
        
        ArrayList<Integer> ans = new ArrayList<>();
        
        int i = 0, sum = 0;
        
        for(int j = 0; j < arr.length; j++) {
            
            sum += arr[j];
            
            while(sum > target) {
                sum -= arr[i];
                i++;
            }
            
            if(sum == target) {
                ans.add(i + 1); // 1-based indexing
                ans.add(j + 1);
                return ans;
            }
        }
        
        ans.add(-1);
        return ans;
    }


     public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);

        int n = sc.nextInt();

        int[] arr = new int[n];

        for(int i = 0; i < n; i++) {
            arr[i] = sc.nextInt();
        }

        int target = sc.nextInt();

        ArrayList<Integer> result = subarraySum(arr, target);

        System.out.println(result);
    }
    
}
