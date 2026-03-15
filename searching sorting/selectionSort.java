// public class selectionSort {
//   public static void selectionSort (int nums[]){

//     for(int i=0; i<nums.length-1; i++){
//       int max = i;
//       int j=i+1;
//       for( j=i+1; j<nums.length; j++){
//         if(nums[max] < nums[j]){
//           max = j;
//         }
//       }

//       int temp = nums[max];
//         nums[max] = nums[i];
//         nums[i] = temp;
//     }

//     for(int i=0; i<nums.length; i++){
//       System.out.print(nums[i] + " ");
//     }
//   }

//   public static void main (String args[]){
//     int nums[] ={5, 4, 3, 2, 1};
//     selectionSort(nums);
//   }
// }


public class selectionSort{
  public static void selectionSort(int arr[]){

    for(int i=0; i<arr.length-1; i++){
      int minPos = i;

      for(int j=i+1; j<arr.length; j++){
        if(arr[minPos] > arr[j]){
          minPos = j;
        }
      }

      //swap
      int temp = arr[minPos];
      arr[minPos] = arr[i];
      arr[i] = temp;

      
    }
    
    for(int i=0; i<arr.length; i++){
      System.out.print(arr[i] + " ");
     }
    
  }

  public static void main(String args[]){
    int arr[] ={5, 4, 3, 2, 1};

    selectionSort(arr);
  }
}
