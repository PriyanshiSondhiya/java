import java.util.*;

public class arrivalOfTheGeneral {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);

    int n = sc.nextInt();

    int arr[] = new int[n];
    for(int i=0; i<n; i++){
      arr[i] = sc.nextInt();
    }

    int max = Integer.MIN_VALUE, maxI=0, c1=0;
    int min = Integer.MAX_VALUE, minI=0, c2=0;

    for(int i=0; i<n; i++){
     

       if(arr[i]<= min){
        min = arr[i];
        minI = i;
      }
    }

    while(minI != n-1){
      int temp = arr[minI];
      arr[minI] = arr[minI+1];
      arr[minI+1] = temp;
      minI++;
      c1++;
    }

     for(int i=0; i<n; i++){
      if(arr[i]> max){
        max = arr[i];
        maxI = i;
      }

    }

    while(maxI != 0){
      int temp = arr[maxI];
      arr[maxI] = arr[maxI-1];
      arr[maxI-1] = temp;
      maxI--;
      c2++;
    }
    System.out.println(c1);
    System.out.println(c2);
    int count = c1+c2;
    if(maxI > minI){
    count--;
}

    System.out.println((count));
  }
}
