// public class slidingWindow {
//   public static void main (String args[]){
//     int arr[] = {2, 1, 2, 5, 1, 3, 2};
//     int k = 3;
//     int windowSum = 0;

//     for(int i=0; i<3; i++){
//        windowSum += arr[i];
//     }

//     int maxSum = windowSum;
//     for(int j=k; j<arr.length; j++){
//       windowSum += arr[j];

//       windowSum -= arr[j-k];maxSum = Math.max(maxSum, windowSum);
//     }
//     System.out.println(maxSum);
//   }
// }


public class slidingWindow {
  public static void main (String args[]){
    int arr[] = {2, 1, 2, 2, 1, 2, 2};
    int k = 3;
    int target = 5;
    int count = 0;
    int windowSum = 0;

    for(int i=0; i<3; i++){
       windowSum += arr[i];
    }
    if(windowSum == target){
        count++;
      }

    
    for(int j=k; j<arr.length; j++){
      windowSum += arr[j];

      windowSum -= arr[j-k];
      if(windowSum == target){
        count++;
      }
      
    }
    System.out.println(count);
  }
}
