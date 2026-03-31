import java.util.ArrayList;
import java.util.List;

public class countsubsequenceEqualToK {
  public static int print (int ind, int arr[], List<Integer> ds,int n, int target, int sum){
   
    if(ind == n){
      if(sum == target ){
        //System.out.println(ds);
        return 1;
      }
      return 0;
    } 
    

    
      ds.add(arr[ind]);
      sum += arr[ind];
      int l = print(ind+1, arr, ds,n, target, sum );

      ds.remove(ds.size()-1);
      sum -= arr[ind];
      int r =print(ind+1, arr, ds, n, target, sum);

      return l+r;

    
  }
  public static void main (String args[]){
    int arr[]= {1, 2, 1};
    int n = arr.length;
    int target = 2;
    List<Integer> ds = new  ArrayList <>();
    System.out.println(print(0, arr,ds, n, target, 0));
    
  }
}
