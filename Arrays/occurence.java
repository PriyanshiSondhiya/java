//Q1-  Given an array of integers print true if an element occurs 2 times in an array else print false  


                //*************************Brute force*****************************/
public class occurence{
  public static void main(String args[]) {
    int arr[] = { 0, 1, 3, 4, 2 };
    int count = 0;
    for (int i = 0; i < arr.length - 1; i++) {
      count = 0;
      for (int j = i; j < arr.length; j++) {
        if (arr[i] == arr[j]) {
          count++;
        }
      }
      if (count == 2) {
        System.out.println("True");
        return;
      } 
    }
     System.out.println("false"); 
  }
}
                //*************************Better approach using hashmap*****************************/
// import java.util.*;
// public class occurence{
//   public static void main (String args[]){
//   HashMap<Integer, Integer> hm = new HashMap<>();
//   int arr[] = {2, 1, 2, 3, 4};

//   for(int i=0; i<arr.length; i++){
//     if(hm.containsKey(arr[i])){
//       hm.put(arr[i], hm.get(arr[i]) +1);
//     }
//     else{
//       hm.put(arr[i], 1);
//     }
//   }
//  boolean found = false;
//   Set <Integer> keySet = hm.keySet();
//   for(Integer key : keySet){
//     if(hm.get(key) == 2){
//        found = true;
//     }
//   }

//   if(found == true){
//     System.out.println("true");
//   }else{
//     System.out.println("false");
//   }
//   }
// }