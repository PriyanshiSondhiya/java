public class indexOfFirstOneInBInarySortedInfiniteArray {
  public static int print (int st, int end, int target, int arr[]){
    int result = -1;
    while(arr[end]  < target){
      st = end;
      end = end *2;
    }
    
   
    while(st<= end){
       int mid = st + (end - st)/2;
      if(arr[mid] == target){
        result = mid;
        end = mid -1;
      }
      else if (arr[mid] < target)st = mid+ 1;
      else end = mid -1;

    }
    return result;
  }
  public static void main (String args[]){
    int arr[] = {0,0,0,0,0,1,1,1,1,1,1,1,};
    System.out.println(print(0, 1, 1, arr));

  }
}
