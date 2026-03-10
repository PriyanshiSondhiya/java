//******************************BRUTE FORCE*********************

// public class countDistinctElements {
//   public static void main (String args[]){
//     int arr [] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1};
//     int n = arr.length;

//     int result[] = new int[n];
//     int k = 0;


  
//     for(int i =0; i<arr.length; i++){
//        boolean distinct = true;

//       for(int j=0; j<i; j++){
//         if(arr[i] == arr[j]){
//           distinct = false;
//           break;
//         }
//       }

//       if(distinct){
//         result[k] = arr[i];
//         k++;
//       }
//     }
//      int count =k;
    
//     System.out.println(count);
//   }
// }




//Better- using HashSet
import java.util.*;
public class countDistinctElements{
  public static void main (String args[]){
  int arr [] = {4, 3, 2, 5, 6, 7, 3, 4, 2, 1}; 

  HashSet<Integer> hs = new HashSet<> ();

  for(int i=0; i<arr.length; i++){
     hs.add(arr[i]);
  }

  System.out.println(hs.size());
  }
}
