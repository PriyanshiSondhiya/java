import java.util.*;

public class firstNegInWindowSizeK {
  public static void main (String args[]){


    int arr[] = {12, -1, -7, -8, -15, 30, 16, 28};
    int k =3;

    ArrayList<Integer> list = new ArrayList<>();

    int i=0, j=0;

    while(j< arr.length){
      if(arr[j] < 0){
        list.add(j);
      }

      if(j-i+1 < k)j++;

      else if (j-i+1 == k){
         if(list.size() > 0){
          System.out.println(arr[list.get(0)]);
         }
         else{
          System.out.println(0);
         }

         if(list.size() > 0 && list.get(0) == i) list.remove(0);
         i++;
         j++;

      }
    }
  }
}
