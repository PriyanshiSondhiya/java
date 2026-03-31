import java.util.ArrayList;
import java.util.List;

public class printAnysubsequenceEqualToK {
  public static boolean print (int ind, int arr[], List<Integer> ds,int n, int target, int sum){
   
    if(ind == n){
      if(sum == target ){
        System.out.println(ds);
        return true;
      }
      return false;
    } 
    

    
      ds.add(arr[ind]);
      sum += arr[ind];
      if(print(ind+1, arr, ds,n, target, sum ) == true) return true;

      ds.remove(ds.size()-1);
      sum -= arr[ind];
      if(print(ind+1, arr, ds, n, target, sum) == true) return true;

      return false;

    
  }
  public static void main (String args[]){
    int arr[]= {1, 2, 1};
    int n = arr.length;
    int target = 2;
    List<Integer> ds = new  ArrayList <>();
    print(0, arr,ds, n, target, 0);
    
  }
}
