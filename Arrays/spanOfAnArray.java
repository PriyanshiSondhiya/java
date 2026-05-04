import java.util.*;

public class spanOfAnArray {
  public static void main (String args[]){
    int arr[] = {3, 4, 3, 5, 1};
    int max = arr[0], min = arr[0];

    for(int i=0; i<arr.length; i++){
      max = Math.max(arr[i], max);
      min = Math.min(arr[i], min);
    }

    int span = max - min;
    System.out.println(span);
  }
}
