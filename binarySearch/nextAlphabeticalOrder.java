public class nextAlphabeticalOrder {
  public static char find (char arr[], char target, int st, int end){
        char result = '#';
        int mid = -1;

        while(st <= end){
           mid = st + (end - st) / 2;

           if(arr[mid] == target){
            st = mid + 1;
           }
           else if (arr[mid] < target) st = mid + 1;
           else{
            result = arr[mid];
            end = mid-1;
           }

        }
        return result;
  }
  public static void main (String args[]){
  char arr[] = {'a', 'c', 'd', 'f', 'h'};
  System.out.println(find(arr, 'f', 0, arr.length-1));
  }
}
