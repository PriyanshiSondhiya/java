public class bookAllocation {
  public static boolean isValid (int arr[], int n, int k, int maxPg){
    int student = 1;
    int sum = 0;

    for(int i=0; i<n; i++){
      if(arr[i] > maxPg)return false;

      sum += arr[i];

      if(sum > maxPg){
        student++;
        sum = arr[i];
      }

      if(student > k)return false;
    }
    return true;
  }

  public static int allocateBooks (int arr[], int n, int k){
    if(k > n)return -1;

    int st = 0, end = 0, res = -1;

    for(int i=0; i<n; i++){
      st = Math.max(arr[i], st);
      end += arr[i];
    }

    while(st <= end){
      int mid = st + (end - st)/2;

      if(isValid(arr, n, k, mid)){
        res = mid;
        end = mid -1;
      }else{
        st = mid +1;
      }
    }
    return res;

  }


  public static void main (String args[]){
    int arr[] = {10, 20, 30 , 40};
    int n = arr.length;
    int k = 2;

    int result = allocateBooks(arr, n, k);
    System.out.println(result);
  }
}
