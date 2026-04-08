public class NoOfTimesSortedArrIsRotated {

  public static int print(int st, int end, int arr[], int n){
     int mid = -1;
 while(st <= end){
     if(arr[st] <= arr[end]){
        return st;
      }
      
      mid = st + (end - st) / 2;
      int next = (mid + 1) % n;
      int prev = (mid + n - 1) % n;

      if(arr[mid] <= arr[next] && arr[mid] <= arr[prev]){
        return mid;
      }
      else if(arr[st] <= arr[mid]){
        st = mid + 1;
      }
      else{
        end = mid - 1;
      }
    }
    return -1;
  }
  public static void main (String args[]){
    int arr[] = {11, 12, 15, 18, 2, 5, 6, 8};
    int st = 0, end = arr.length-1;
    int n = arr.length;
    System.out.println(print(st, end, arr, n));
   

   
  }
}
