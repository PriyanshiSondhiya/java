public class peakElement {
  public static int print (int st, int end, int arr[]){
    int mid = -1;
    if (mid > 0 && mid < arr.length-1){
      if(arr[mid] > arr[mid-1] && arr[mid] > arr[mid+1])return mid;

      else if (arr[mid- 1] > arr[mid]) end = mid -1;

      else st = mid +1;
    }
    return mid;
  }
  public static void main (String args[]){
  int arr[] = {5, 10, 20, 15};
  System.out.println(print(0, arr.length-1, arr));
  }
}
