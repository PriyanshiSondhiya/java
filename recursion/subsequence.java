import java.util.*;

public class subsequence {
  public static void print(int ind, int arr[], List<Integer> ds, int n){
      
    //base case
    if(ind == n){
      System.out.println(ds);
      return;
    }

    //pick the element
    ds.add(arr[ind]);
    print(ind+1, arr, ds, n);

    ds.remove(ds.size()-1);
    print(ind+1, arr, ds, n);
  }

  public static void main (String args[]){
    int arr[] = {3, 1, 2};
    int n = arr.length;

    List<Integer> ds = new ArrayList<>();
    print(0, arr, ds, n);
  }
}
