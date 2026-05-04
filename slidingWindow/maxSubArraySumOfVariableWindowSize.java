import java.util.*;
public class maxSubArraySumOfVariableWindowSize {
  public static void main (String args[]){
    int k = 5, i= 0, j=0, sum = 0, max= Integer.MIN_VALUE;
    int arr[] = {4, 1, 1, 1, 2, 3, 5};

    while(j<arr.length){
      sum += arr[j];
    
          if(sum > k){
          while(sum > k){
            sum -= arr[i];
            i++;
          }
          
        }
        else if(sum == k){
         max = Math.max(j-i+1, max);
         
        }
        j++;
      
    }
 System.out.println(max);
  }
}
