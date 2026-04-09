public class floorNCeil {
  public static int floor (int st, int end, int target, int arr[]){
    int mid = -1;
    int result = 0;
    while(st <= end){
      mid = st + (end- st) / 2;
      if(arr[mid] == target)return arr[mid];
      else if(arr[mid] < target) {
          result = arr[mid];
          st = mid+1;
      }
      else{
       end = mid-1; 
        
      }
      
    }
   
    return result;
  }

  public static int ceil (int st, int end, int target, int arr[]){
    int mid = -1;
    int result = 0;
    while(st <= end){
      mid = st + (end- st) / 2;
      if(arr[mid] == target)return arr[mid];
      else if(arr[mid] < target) {
         
          st = mid+1;
      }
      else{
       result = arr[mid];
       end = mid-1; 
        
      }
      
    }
   
    return result;
  }

  public static void main (String args[]){
    int arr[] = {1, 2, 3, 4 ,8, 10, 10, 12, 19};
    System.out.println(floor(0, arr.length-1, 5, arr));
    System.out.println(ceil(0, arr.length-1, 5, arr));
     
  }
}
