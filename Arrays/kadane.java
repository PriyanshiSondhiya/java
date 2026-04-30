// public class kadane {
//   public static void main (String args[]){
//     int arr[] = {1, 2, 3, 4};
   
    
//     for(int i=0; i<arr.length; i++){
//       for(int j=i; j<arr.length; j++){
//         for(int k=i; k<=j; k++){
//           System.out.print(arr[k]);
//         }
//         System.out.print(" ");
//       }
//       System.out.println();
//     }
//   }
// }

// import java.util.*;
// public class kadane {
//   public static void main (String args[]){
//     int arr[] = {3, -4, 5, 4, -1, 7, -8};
//     int max = Integer.MIN_VALUE;
   
    
//     for(int i=0; i<arr.length; i++){
//       for(int j=i; j<arr.length; j++){
//         int sum =0;
//         for(int k=i; k<=j; k++){
//           sum += arr[k];
//           
//         }
       // max = Math.max(sum, max);
//         //System.out.print(" ");
//       }
//       //System.out.println();
//     }
//     System.out.println(max);
//   }
// }


import java.util.*;
public class kadane {
  public static void main (String args[]){
     int arr[] = {3, -4, 5, 4, -1, 7, -8};
    int max = Integer.MIN_VALUE;
   
    
    for(int i=0; i<arr.length; i++){
       int sum =0;
      for(int j=i; j<arr.length; j++){
        sum += arr[j];
         max = Math.max(sum, max);
         
       
      }
     
      
      //System.out.println();
    }
    System.out.println(max);
  }
}