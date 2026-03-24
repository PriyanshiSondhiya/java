import java.util.Arrays;

public class sortZeroOneTwo {

  public static int[] better1 (int arr[]){
    int count0 =0, count1 = 0, count2 = 0;

    for(int i=0; i<arr.length; i++){
      if(arr[i] == 0)count0++;
      else if (arr[i] == 1)count1++;
      else count2++;
    }

    int idx = 0;
    for(int i=0; i<count0; i++){
      arr[idx++] = 0;
    }
    for(int i=0; i<count1; i++){
      arr[idx++] = 1;
    }
    for(int i=0; i<count2; i++){
      arr[idx++] = 2;
    }
     return arr;
  }

  public static int[] better2 (int arr[]){
     int count0 =0, count1 = 0, count2 = 0;

    for(int i=0; i<arr.length; i++){
      if(arr[i] == 0)count0++;
      else if (arr[i] == 1)count1++;
      else count2++;
    }

    for(int i=0; i<count0; i++){
      arr[i] = 0;
    }
    for(int i=count0; i<count0 + count1; i++){
      arr[i] = 1;
    }
    for(int i=count0+count1; i<arr.length; i++){
      arr[i] = 2;
    }

  return arr;
  }


  public static int[] optimal(int arr[]){
    int l = 0, m = 0, h = arr.length-1;

    while(m != h){
      if(arr[m] == 0){
        int temp = arr[m];
        arr[m] = arr[l];
        arr[l]  = temp;

        m++;
        l++;
      }
      else if(arr[m] == 1){
        m++;
      }
      else{
        int temp = arr[m];
        arr[m] = arr[h];
        arr[h] = temp;
      }
    
    }
    return arr;
  }
  public static void main (String args[]){
    int arr[] = {2, 0, 2, 1, 1, 0, 1, 2, 0, 0};
    System.out.println(Arrays.toString(optimal(arr)));
  }
}
