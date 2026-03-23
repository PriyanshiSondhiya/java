import java.util.*;

public class containerWithMostWater {

  public static int maxWater(int arr[]){
    int mw = 0;

    for(int i =0; i<arr.length; i++){
      for(int j=i+1; j<arr.length; j++){
        int width = j-i;
        int heigth = Math.min(arr[i], arr[j]);
        int currWater = width * heigth;
        mw = Math.max(currWater, mw);

      }
    }
    return mw;
  }
  public static void main (String args[]){
    int arr[] = {1, 8, 6, 2, 5, 4, 8, 3, 7};
    System.out.println(maxWater(arr));
    }  
}
