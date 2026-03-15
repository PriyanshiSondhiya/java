public class insertionSort {
  public static void sort(int arr[]){

    

  for(int i=1; i<arr.length; i++){
    int curr = arr[i];
    int prev = i-1;
    //fingin out the correct pos. to insert
    while(prev >= 0 && arr[prev]>curr){
      arr[prev + 1] = arr[prev];
      prev--; 
    }
     //insertion
    arr[prev+1] = curr;
  }

 for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
     }
  }
  public static void main (String args[]){
    int arr[] ={5, 4, 3, 2, 1};
    sort(arr);
  }
}
