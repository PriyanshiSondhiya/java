import java.util.*;

public class minDifferenceEleInASortedArray {
  public static int print(int st, int end, int target, int arr[]){
    int mid = -1;
    while(st <= end){
      mid = st + (end - st)/ 2;
      if(arr[mid] == target)return arr[mid];
      else if (arr[mid] < target)st = mid + 1;
      else end = mid - 1;
    }
    int floor =Math.abs(arr[st] - target);
    int ceil = Math.abs(arr[end] - target);

   if(floor < ceil)return arr[st];
   else return arr[end];
  }
  public static void main (String args[]){
    int arr[] = {1, 3, 8, 10, 15, 18};
    System.out.println(print(0, arr.length-1, 12, arr));

  }
}
