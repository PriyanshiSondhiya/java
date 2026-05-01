import java.util.*;

public class venyaAndFence {
  public static void main (String args[]){
    Scanner sc = new Scanner (System.in);

    int p = sc.nextInt();
    int h = sc.nextInt();

    int arr[] = new int[p];
    for(int i=0; i<p; i++){
      arr[i] = sc.nextInt();
    }

    int width = 0;

    for(int i=0; i<p; i++){
      if(arr[i] > h){
        width+= 2;
      }
      else{
        width+= 1;
      }
    }
    System.out.println(width);
  }
}
