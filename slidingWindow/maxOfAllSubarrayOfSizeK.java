import java.util.*;

public class maxOfAllSubarrayOfSizeK {
  public static void main (String args[]){
    int arr[] = {1, 3, -1,-3, 5, 3, 6, 7};
    int k = 3;
    int i=0, j=0;

    ArrayList<Integer>ans = new ArrayList<>();
    Deque<Integer>dq = new ArrayDeque<>();

    while(j<arr.length){
      while(!dq.isEmpty() && dq.peekLast() < arr[j]){
        dq.removeLast();
      }

      dq.add(arr[j]);

      if(j-i+1 < k)j++;

      else if(j-i+1 == k){
        ans.add(dq.peekFirst());

        if(arr[i] == dq.peekFirst()){
          dq.removeFirst();
        }
        i++;j++;
      }

    }
 System.out.println(ans);
  

  }
}
