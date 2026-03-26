import java.util.*;
public class singleNum {
  //brute force
  public static int num (int nums[]){
     for(int i=0; i<nums.length; i++){
      int count = 0;
      for(int j=0; j<nums.length; j++){
         if(nums[j] == nums[i]){
          count ++;
         }
      }
      if(count == 1){
        return nums[i];
      }
     }
     return -1;
  }

  //better
 public static int num2 (int nums[]){
   HashMap <Integer, Integer> map = new HashMap<>();
  for(int i =0; i<nums.length; i++){
    map.put(nums[i], map.getOrDefault(nums[i], 0)+ 1);
  }

  
  for(int key: map.keySet()){
     if(map.get(key) == 1){
      return key;
     }
  }
  return -1;
 }

 //optimal
 public static int num3(int nums[]){
  int res =0;
  for(int num: nums){
    res ^= num;
  }
  return res;
 }


  public static void main (String args[]){
  int nums[]= {1, 2, 3, 2, 3};
  System.out.println(num3(nums));
  }
}
