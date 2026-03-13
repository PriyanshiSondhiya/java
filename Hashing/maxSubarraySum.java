import java.util.*;

public class maxSubarraySum {
  public static void main (String args[]){
   HashMap <String, String> map = new HashMap<>();
 int arr[] = {15, -2, 2, 3, };
 int sum = 0;
 int length = 0;
   for(int i=0; i<arr.length; i++){
       sum += arr[i];

       if(map.containsKey(sum)){
         length = Math.max(length, i - map.get());
       }
   }
  }
}
