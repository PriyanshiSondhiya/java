import java.util.*;

public class reverseArray {
public static void print(int arr[], int l, int r){

int temp = arr[l];
arr[l] = arr[r];
arr[r] = temp;

if(l >= r){

  return ;
}else{
   print(arr, l+1, r-1);
  }
} 

public static void main(String args[]){
  int arr[] = {1, 2, 3, 4, 5};
  print(arr, 0, arr.length-1);
  System.out.println(Arrays.toString(arr));
  }
}
