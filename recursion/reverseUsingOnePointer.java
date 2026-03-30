import java.util.Arrays;

public class reverseUsingOnePointer {
  public static void print(int arr[], int i){
    int n = arr.length;
    int temp = arr[i];
    arr[i] = arr[n-i-1];
    arr[n-i-1] = temp;

    if(i >= arr.length/2) return ;
    else{
    print(arr,i+1);
  }
  }
  public static void main(String args[]){
  int arr[] = {1, 2, 3, 4, 5};
  print(arr, 0);
  System.out.println(Arrays.toString(arr));
  }
}
