// import java.util.*;

// public class maxSubArrSumEqualToK {
//   public static void main (String args[]){
//     int arr[]= {2, 5, 1, 8, 2, 9, 1};
//     int k = 3;
   
//     int max = Integer.MIN_VALUE;

//     for (int i=0; i<arr.length-k; i++){
//        int sum = 0 ;
//        for(int j=i; j<i+k; j++){
//         sum += arr[j];
//         max = Math.max(sum,max);
//        }
//     }
//     System.out.println(max);
//   }
// }


import java.util.*;
public class maxSubArrSumEqualToK{
  public static void main (String args[]){
    int arr[]= {2, 5, 1, 8, 2, 9, 1};
    int k = 3;
    int max = Integer.MIN_VALUE;
    int i=0,j=0;

    while(j<arr.length){
       int sum =0;
       if(j-i+1 < k){
          sum += arr[j];
       }
       else if(j-i+1 == k){
        max = Math.max(max, sum);
        i++;
        j++;
       }
    }
    System.out.println(max);
  }
}