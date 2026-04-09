public class searchInNearlySortedArray {
  public static int print (int st, int end, int target, int arr[]){
    int mid = -1;
    while(st <= end){
      mid = st + (end - st)/ 2;
      if(arr[mid] == target)return mid;
      if(mid-1 >= st && arr[mid-1]== target)return mid-1;
      if(mid+1 <= end && arr[mid+1] == target)return mid+1;

      if(target > arr[mid]){
        st = mid+2;
      }else{
        end = mid-2;
      }
    }
    return -1;
  }
  public static void main (String args[]){
    int arr[] = {2, 5, 6, 8, 11, 15, 12, 18};
    System.out.println(print(0, arr.length-1,15, arr));

  }
}
