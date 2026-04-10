public class findPosOfEleInInfiniteSortedArray {
  public static int print(int st, int end, int target, int arr[]){
    int mid = -1;
    while(arr[end] < target){
     
        st = end;
        end = 2*end;
      
    }
   
    while(st <= end){
      mid = st + (end - st)/2;
      if(arr[mid] == target)return mid;
      else if (arr[mid] > target)end = mid-1;
      else st = mid +1;
    }
    return mid;
  }
  public static void main (String args[]){
    int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9, 10};
    System.out.println(print(0, 1, 7, arr));

  }
}
